package com.davidvardanyan;

public class Developer extends Employee {
    private boolean isCoding;
    private int numberOfCodeLines;

    public Developer(String name, int age, int experience,boolean isCoding,int numberOfCodeLines) {
        super(name, age, experience);
        this.isCoding = isCoding;
        this.numberOfCodeLines = numberOfCodeLines;
    }


    @Override
    public void work() {
        System.out.println("Developer is now working");
    }

    @Override
    public void atBreak() {
        System.out.println("Developer is now at break");
    }
}
