package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class Parallelstreams {

	public static void main(String[] args) {
		long time1,time2;
		List<Employee> eList=new ArrayList<>();
		for(int i=0;i<100;i++) {
			
			eList.add(new Employee("Noah",2000));
			eList.add(new Employee("Adam",200));
			eList.add(new Employee("Harvey",2030));
			eList.add(new Employee("Jake",5000));
			eList.add(new Employee("Gina",1000));
		}
		//sequential
		time1=System.currentTimeMillis();
		System.out.println("Sequential Stream:"+eList.stream().filter(e->e.getSalary()>1000).count());
		time2=System.currentTimeMillis();
		System.out.println("Sequential stream time taken:"+(time2-time1)+"\n");
		//parallel
		time1=System.currentTimeMillis();
		System.out.println("Parallel Stream:"+eList.parallelStream().filter(e->e.getSalary()>1000).count());
		time2=System.currentTimeMillis();
		System.out.println("Parallel stream time:"+(time2-time1));
	}

}
