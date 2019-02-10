
public class Lab1037n8n9 {
	public static void main(String args[]){
		
		String s1=new String("Deepika");
		String s2=new String("Deepika");
		String s3=new String("Leela");
		System.out.println("Using == Operator");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println("Using equals operator");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
        Student st1=new Student(99,"sri");
        Student st2=new Student(99,"sri");
        Student st3=new Student(88,"nivas");
        Student st4=st1;
        System.out.println("Using == Operator");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st2==st3);
		System.out.println("Using equals operator");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));
	}

}
