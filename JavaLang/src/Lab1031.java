
public class Lab1031 {
	
public static void main(String[] args){
	showClassInfo("JLC");
	Student s=new Student();
	showClassInfo(s);
	Object o=new Object();
	showClassInfo(o);
}
static void showClassInfo(Object o){
	Class<? extends Object> cls=o.getClass();
	System.out.println("Class name: "+cls.getName());
	Class scls=cls.getSuperclass();
	if(scls!=null){
		System.out.println("Super class: "+scls.getName());
	
	}else{
		System.out.println("No super class");
	}
}

}
	
