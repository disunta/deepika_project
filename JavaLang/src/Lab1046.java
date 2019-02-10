
public class Lab1046 {
 public static void main(String args[]){
	new Helo().show();
	Helo h1=new Helo();
	h1=null;
	Helo h2=new Helo();
	Helo h3=new Helo();
	h2=h3;
	new Helo().m1();
	System.gc();
 }
}
 class Hi{
		public void finalize(){
			System.out.println("Hi Finalize");
		} 
	 }
 class Helo{
	 void show(){
		 System.out.println("show");
	 }
	 void m1(){
		 System.out.println("m1 start");
		 Hi h1=new Hi();
		 Hi h2=new Hi();
		 Hi h3=new Hi();
	 }
	 public void finalize(){
		 System.out.println("Hello-finalize");
	 }
 }


