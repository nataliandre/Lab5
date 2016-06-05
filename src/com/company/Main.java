package com.company;

import java.util.Random;

public class Main {


    //public int iSysDuration;






    public static void main(String[] args) {
        int iTasksCount = 30;
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
            Random r = new Random();
            int iRandomProcessor = r.nextInt(iProcessors);


        }



        //generator.printTasksArray(tasksArray);


    }
}
