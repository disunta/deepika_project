package string;

public class Lab1095 {
 public static void main(String args[]){
	 
	 byte[] b={40,50,60,70,80,90};
	 String st="";
	 for(int i=0;i<b.length;i++){
		byte bi=b[i];
		st+=bi;
	 }
	 System.out.println("Array:"+st);
	 String str=new String(b);
	 System.out.println("Array str:"+str);
	 
	
 }
}
