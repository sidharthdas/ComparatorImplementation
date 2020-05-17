package com.org;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		ArrayList<Student> al=new ArrayList<>();  
		al.add(new Student(1, "Sid", "test", 25));  
		al.add(new Student(2, "ram", "test", 26));  
		al.add(new Student(3, "sita", "test", 20));  
		al.add(new Student(4, "laxman", "test", 219)); 
		
		Collections.sort(al, new AgeComparator());
		
		for(Student st: al){  
			System.out.println(st.name+" "+st.age);  
			}  
		
	}

}
