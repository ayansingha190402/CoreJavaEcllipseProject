// package
package com.student;

import java.util.Scanner;

public class StudentDetails {
	
	static void displayStudent(Student s1[]) {
    	for(Student obj:s1) {
    		System.out.println("\n\n");
    		System.out.println("Name: "+obj.getName()+"\nRoll No : "+obj.getRollNo()+"\nAge: "+ obj.getAge()+"\nMarks : "+obj.getMarks()+"\nCouse"+obj.getCourse());
    	}
    }
	
	static void displayStudent(Student s1[], double marks) {
    	for(Student obj:s1) {
    		System.out.println("\n\n");
    		if(obj.getMarks()>95.0)
    		System.out.println("Name: "+obj.getName()+"\nRoll No : "+obj.getRollNo()+"\nAge: "+ obj.getAge()+"\nMarks : "+obj.getMarks()+"\nCouse"+obj.getCourse());
    	}
    }
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s[]= new Student[5]; 
		
		// Initializing the first element
        // of the array
		s[0] = new Student(1, "Ayan", 20,92.0);
		
		 
        // Initializing the second element
        // of the array
        s[1] = new Student(2, "Subhadip", 21,94.99);
		
		// Initializing the third element
        // of the array
        s[2] = new Student(3, "Jayanta",21,95.08);
 
        // Initializing the fourth element
        // of the array
        s[3] = new Student(4, "Uday",20, 96.8);
        
     // Initializing the fourth element
        // of the array
        s[4] = new Student(4, "Amit",20, 90,"BCA");
        
        double marks=95.0;
        System.out.println("Enter 1 for display all student details: ");
        System.out.println("Enter 2 for display  student details having marks greate than 95: ");
        System.out.println("Enter your choice ");
        
        int choice =sc.nextInt();
        switch(choice){
        	case 1: displayStudent(s);
        				break;
        	case 2: displayStudent(s,marks);
						break;
			default: System.out.println("Wrong Input .........");
        }
        sc.close();
      }

}
