
class Person{}
public class Student extends Person implements Cloneable{
	int sid;
	long phone;
	String name;
	Student(){}

	Student(int sid,long phone ){
		this.sid=sid;
		this.phone=phone;
	}
	Student(int sid,String name ){
		this.sid=sid;
		this.name=name;
	}
	public int hashCode(){
		return (int)(sid|phone);
	}
	public String toString(){
		return sid+","+name;
	}
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student st=(Student)obj;
			return this.sid==st.sid && this.name.equals(st.name);
		}
		return false;
	}


public static void main(String[] args) throws Exception{
	Student st1=new Student(1,"sri");
	Student st2=(Student)st1.clone();
	System.out.println(st1==st2);
	System.out.println(st1.sid);
	System.out.println(st2.sid);
}
}