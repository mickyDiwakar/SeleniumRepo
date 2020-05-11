package com.mavenproj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparable {
	
	public static void main(String[] args) {
	List<Student>stud=new ArrayList<Student>();
	stud.add(new Student(101,"ram",30));
	stud.add(new Student(100,"sandhya",26));
	stud.add(new Student(100,"lovely",25));
	Collections.sort(stud); //asecding order
	Collections.sort(stud,Collections.reverseOrder()); //now sorting will be descding order
	
	for(Student y:stud) {
		System.out.println(y.age+y.name+y.rollno);
	}
	}

}
//for comaparteor user comapre(classname obj, classname obj2)
//collection .sort(list,cpmaparteor)//comparator=new comparatorclass();
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	};
	public int compareTo(Student st) {
		if(rollno==st.rollno) {
			return 0;
		}else if(rollno>st.rollno) {
			return 1;
		}else {
			return -1;
		}
			
	}
	
}

			
	
	
