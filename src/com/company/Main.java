package com.company;

import java.util.Random;

public class Main {


    //public int iSysDuration;






    public static void main(String[] args) {
        int iTasksCount = 40;
        int iProcessors = 10;
        float fMaxPercentBorder = new Float("0.8");
        float fMinPercentBorder = new Float("0.5");

        float fAVProcessorsLoading = 0;
        float fAVMaxPercentBorderRejection = 0;
        int iMigrationCount = 0;
        //generate Tasks
        generateTasks generator = new generateTasks();
        Task[] tasksArray = generator.generateTasksArray(iTasksCount);
        //generate processors
        Processor[] processorArray = new Processor[iProcessors];
        for (int i=0;i<iProcessors;i++){
            processorArray[i] = new Processor(i);
        }

        //first step (initializeTasks)
        for (int i = 0; i<iTasksCount;i++){
            setTaskToProcessor(iProcessors, processorArray, tasksArray[i], fMaxPercentBorder);
        }
        for(int i = 0;i<processorArray.length;i++){
            System.out.println("Loading processor : "+processorArray[i].fProcessorLoading+", processor Num : "+i);
        }

        //second step
//        for (int i =0; i<processorArray.length;i++) {
//            if(processorArray.length < )
//        }



        //generator.printTasksArray(tasksArray);


    }

    /**
     *
     * @param iProcessors
     * @param processorArray
     * @param taskCurrent
     * @param fMaxPercentBorder
     */
    public static void setTaskToProcessor(
            int iProcessors,
            Processor[] processorArray,
            Task taskCurrent,
            float fMaxPercentBorder
    ){
        Random r = new Random();
        int iRandomProcessor = r.nextInt(iProcessors);
          if(
                processorArray[iRandomProcessor].fProcessorLoading > fMaxPercentBorder
                &&
                !allProccessorsAreLoaded(processorArray[iRandomProcessor],processorArray,fMaxPercentBorder)
            ){
            setTaskToProcessor(iProcessors, processorArray, taskCurrent, fMaxPercentBorder);
        }
        else{
            processorArray[iRandomProcessor].setfProcessorLoading(taskCurrent.fProcessorPercent);
            taskCurrent.setExecutedRpocessor(iRandomProcessor);
        }
    }

    public static boolean allProccessorsAreLoaded(Processor processorCurrent, Processor[] processorArray,float fMaxPercentBorder){
        boolean bResult = true;
        for (int i = 1; i<= processorArray.length;i++) {
            if(processorArray[i].fProcessorLoading < fMaxPercentBorder){
                bResult = false;
            }
        }
        return bResult;
    }
}
