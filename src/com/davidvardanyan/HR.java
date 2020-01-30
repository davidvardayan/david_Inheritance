package com.davidvardanyan;

public class HR extends Employee {
    private boolean isInterviewing;
    private int numberOfInterviews;

    public HR(String name, int age, int experience,boolean isInterviewing,int numberOfInterviews) {
        super(name, age, experience);
        this.isInterviewing = isInterviewing;
        this.numberOfInterviews = numberOfInterviews;
    }


    @Override
    public void work() {
        System.out.println("HR is now working");

    }

    @Override
    public void atBreak() {
        System.out.println("HR went to break");
    }
}
