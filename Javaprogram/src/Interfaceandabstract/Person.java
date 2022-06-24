
public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
 class Student1 extends Person{
				int rollno;
				int markes;
	Student1(String name,int age,int rollno,int markes){
	                 super(name,age);
					this.rollno=rollno;
					this.markes=markes;
	
			public static void main(String[] args) {
		      Student1 p=new Student1("sanvika",30,5,90);
		      System.out.println(p.name);
		      System.out.println(p.age);
		}
	}
 }
