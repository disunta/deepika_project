package string;

public class Lab1068 {
 public static void main(String args[]){
	 Student1 st=new Student1();
	 String s1=String.valueOf(st);
	 System.out.println(s1);
	 
	 Employee1 emp=new Employee1();
	 String s2=String.valueOf(emp);
	 System.out.println(s2);
	 
	 Student1 std=null;
	 String s3=String.valueOf(std);
	 System.out.println(s3);
	 
//	 String s4=String.valueOf(null); 
//	 System.out.println(s4);
	 
	 String  str="JLC";
	 String str1=str.trim();
	 System.out.println(str==str1);
	 System.out.println(str.length());
	 
	 String str2="  JLC  ";
	 String str3=str.trim();
	 System.out.println(str2==str3);
	 System.out.println(str2.length());
	 
	 String str4="JAVA JLC JAVA";
	 String str5=str4.replaceFirst("JAVA", "X");
	 System.out.println(str4.substring(3));
	 
 }
}
class Student1{}
class Employee1{
	int eid;
	public String toString(){
		return "eid:"+eid;
	}
}
