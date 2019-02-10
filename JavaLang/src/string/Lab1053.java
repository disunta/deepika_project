package string;

public class Lab1053 {
public static void main(String args[]){
	Student s=new Student("RAM");
	Employee e=new Employee("RAM");
	System.out.println(s.sName==e.eName);
	s.show(e);
	
}
}
class Student{
	String sName;
	Student(String sName){
		this.sName=sName;
	}
	void show(Employee emp){
		String msg="RAM";
		System.out.println(msg==emp.eName);
		System.out.println(sName==emp.eName);
		emp.display(this);
	}
	
}
class Employee{
	String eName;
	Employee(String eName){
		this.eName=eName;
	}
	void display(Student stu){
		String var="RAM";
		System.out.println(var==stu.sName);
		System.out.println(eName==stu.sName);
		
	}
}
