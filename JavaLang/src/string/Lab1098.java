package string;

public class Lab1098 {
public static void main(String args){
	 String s="JLC is JAVA LEARNING CENTER NO.1 IN JAVA AS JAVA";
		String res[]=s.split("JAVA");
		System.out.println("length:"+res.length);
		for(int i=0;i<res.length;i++){
			String st=res[i];
			System.out.println("\t"+st);
		}
}
}
