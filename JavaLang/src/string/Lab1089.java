package string;

public class Lab1089 {
	public static void main(String args[]){
		String str="JAVA";
		char c1[]={'j','a','v','a'};
		String str1="";
//		char c[]=str.toCharArray();
		int len=str.length();
		char c[]=new char[len];
//	    converting String to char array	
		for(int i=0;i<len;i++){
			c[i]=str.charAt(i);
		}
//		printing char array
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
//		converting char array to string
		for(int i=0;i<c1.length;i++){
			str1+=c1[i];
		}
		System.out.println(str1);
	}

}
