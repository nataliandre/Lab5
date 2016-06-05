package com.company;

/**
 * Created by andrijmoroz on 05.06.16.
 */
public class Processor {
    public float fProcessorLoading = new Float("0");
    public int iProcessorNum;


    public  Processor(int iProcessorNum){
        this.iProcessorNum = iProcessorNum;
    }

    public void setfProcessorLoading(float fProcessorLoading){
        this.fProcessorLoading+=fProcessorLoading;
    }

    public void removeProcessorProcess(float fProcessorLoading){
        this.fProcessorLoading-=fProcessorLoading;
    }

}
