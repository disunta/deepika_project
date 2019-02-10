
public class Lab1034n5n6 {
	public static void main(String[] args){
		Student s1=new Student(1,"sri");
		Student s=new Student(2,"rue");
		int hc=s1.hashCode();
		System.out.println(s1.getClass().getName()+"@"+hc);
		
		System.out.println(s1);
		System.out.println(s);
		
		Student s2=null;
		System.out.println(s2);
		String s3=new String("JAVA");
		System.out.println(s3);
		Integer i=new Integer(123);
		System.out.println(i);
	}
}
