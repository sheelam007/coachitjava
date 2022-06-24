package Interfaceandabstract;

public class Student {//create a main class
	String name;//create a class attribute
	int rollno;
	int age;
	Student(String name,int rollno,int age)//create a class constructor
	{ 
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}
	public static void main(String[] args) {
	Student s=new Student("sandhya",101,26);//this is call the constructor
	System.out.println(s.name);
	System.out.println(s.rollno);
	System.out.println(s.age);

	}

}
