package string;

public class Lab1058n9n63 {
public static void main(String args[]){
	String s1="JAVA100";
	int var=100;
	final int var1=101;
	String s2="JAVA";
	String s3=s2+var;
	String s4="JAVA"+100;
	String str="100";
	String s5=s2.concat(str);
	
	System.out.println(s3+"\t"+s4);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s1==s5);
	System.out.println("X="+var=="X="+var);
	System.out.println("X="+var1=="X="+var1);
}
}
