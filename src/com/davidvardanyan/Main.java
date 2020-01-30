package com.davidvardanyan;

public class Main {

    public static void main(String[] args) {
	    Employee employee = new Employee("Employee",25,3);
	    HR hr = new HR("Victoria",45,5,true,45);
	    hr.work();
	    hr.atBreak();
	    hr.salary(230000);

	    Developer developer = new Developer("Leonardo",35,5,false,2345);
	    developer.work();
	    developer.atBreak();
	    developer.salary(450000);

	    QA qa = new QA("Lolita",78,9,true,234);
	    qa.work();
	    qa.atBreak();
	    qa.salary(700000);
    }
}
