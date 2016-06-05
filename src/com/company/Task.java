package com.company;

/**
 * Created by andrijmoroz on 05.06.16.
 */
public class Task {
    public int iFrequency;
    public float fProcessorPercent;
    //public int iDuration;
    public int iExecutedProcessor = 0;

    public Task(int iFrequency, float fProcessorPercent/*,int iDuration*/) {
        this.fProcessorPercent = fProcessorPercent;
        this.iFrequency = iFrequency;
        //this.iDuration = iDuration;
    }

    public void setExecutedRpocessor(int iExecutedProcessor){
        this.iExecutedProcessor = iExecutedProcessor;
    }
    public boolean isExecuted(){
        if(this.iExecutedProcessor == 0){
            return false;
        }
        return true;
    }

    public boolean isExecutedOnThisProccessor(int iProccessorNum){
        if(this.iExecutedProcessor == iProccessorNum){
            return true;
        }
        return false;
    }

}
