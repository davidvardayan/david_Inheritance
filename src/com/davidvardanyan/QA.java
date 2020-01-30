package com.davidvardanyan;

public class QA extends Employee {

    private boolean hasTested;
    private int numberOfBugs;

    public QA(String name, int age, int experience,boolean hasTested,int numberOfBugs) {
        super(name, age, experience);
        this.hasTested = hasTested;
        this.numberOfBugs = numberOfBugs;
    }

    @Override
    public void work() {
        System.out.println("QA is now working");
    }

    @Override
    public void atBreak() {
        System.out.println("QA went to break");
    }
}
