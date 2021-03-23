package com.company;

public class FileWorker {

    private boolean isRecursive;

    private String path;

    public void setisRecursiv(boolean recursive){ isRecursive = recursive; }

    public boolean getisRecursive(){return isRecursive;}

    FileWorker(String path){this.path = path;}

    public void execute(IExecutable executor){
        if(isRecursive)recursiveProcessing(executor);
        else simpleProcessing(executor);
    }

    private void simpleProcessing(IExecutable executor){}

    private void recursiveProcessing(IExecutable executor){}
}
