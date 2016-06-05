package com.company;

import java.util.*;
/**
 * Created by andrijmoroz on 05.06.16.
 */
public class generateTasks {

    public int iTaskFrequencyRange = 9;
    public int iTaskProcessorPercentRange = 2;
    /*public int iTaskDurationRange = 9;*/

    public  Task[] generateTasksArray(int iTasksCount){
        Task[] taskArray = new Task[iTasksCount];
        for(int i=0;i<iTasksCount;i++){
            Random r = new Random();
            int iNewTaskFrequency = r.nextInt(this.iTaskFrequencyRange)+1;
            /*int iNewTaskDuration = r.nextInt(this.iTaskDurationRange)+1;*/
            float fNewTaskProcessorPercentRange = r.nextFloat() * (Float.parseFloat(String.valueOf(this.iTaskProcessorPercentRange))/10);
            taskArray[i] = new Task(iNewTaskFrequency,fNewTaskProcessorPercentRange/*,iNewTaskDuration*/);
        }
        return taskArray;
    }

    public void printTasksArray( Task[] tasksArray){
        for(int i=0;i<tasksArray.length;i++) {
           System.out.println("Task: percent:"+tasksArray[i].fProcessorPercent+", frequency: "+tasksArray[i].iFrequency/*+", duration: "+tasksArray[i].iDuration*/);
        }
    }

}
