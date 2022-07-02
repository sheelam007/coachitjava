package thiskeyword;
  public class Student {
	int rollno;
	String name;
	int age; 
   Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;}
  
	 void display() {
		System.out.println(rollno+" "+name+" "+age);
	}
	public static void main(String[] args) {
		Student s=new Student(111,"Sandhya",25);
        s.display();
   }
  }