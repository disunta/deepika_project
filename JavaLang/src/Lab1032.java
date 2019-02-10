
public class Lab1032 {
	public static void main(String[] args){
		Student s1=new Student(1,9);
		Student s2=new Student(1,9);
		Student s3=new Student(3,9);
		Student s4=s1;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s3==s4);
	}

}

