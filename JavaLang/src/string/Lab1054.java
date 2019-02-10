package string;

import java.util.Scanner;

public class Lab1054 {
  public static void main(String args[]){
	  String s1="RAM";
	  String s2="RAM";
	  System.out.println(s1==s2);
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a String");
	  String s3=sc.nextLine();
	  System.out.println("Re enter a String");
	  String s4=sc.nextLine();
	  System.out.println(s3==s4);
  }
}
