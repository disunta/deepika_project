package string;

public class Lab1050n2 {
 public static void main(String args[]){
	 String s1=new String("JAVA");
	 String s2="JAVA";
	 String s3="JAVA";
	 String s4=new String("JAVA");
	 String s5=s4.intern();
	 String s6="JAVA".intern();
	 
	 System.out.println(s1==s2);
	 System.out.println(s2==s3);
	 System.out.println(s1==s4);
	 System.out.println(s4==s5);
	 System.out.println(s3==s5);
	 System.out.println(s4==s6);
	 System.out.println(s3==s6);
	 
	 
 }
}
