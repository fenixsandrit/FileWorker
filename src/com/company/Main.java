package com.company;

public class Main {

    public static void main(String[] args) {
        var fw = new FileWorker("C:\\test");
        fw.execute(new RenameExecutor());
    }
}
