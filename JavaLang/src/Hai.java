
class Hai{
	int x;
	Hai(int x){
		this.x=x;
	}
}
class Hello implements Cloneable{
	int y;
	Hai hai;
	Hello(int y,Hai hai){
		this.y=y;
		this.hai=hai;
	}
	void show(){
		System.out.println("hai-x "+hai.x);
		System.out.println("hello-y "+y);
		
	}
	public Object clone()throws CloneNotSupportedException{
		
		if(this instanceof Cloneable){
			Hai hai=new Hai(this.hai.x);
			Hello h=new Hello(this.y,hai);
			return h;
		}
		else 
			throw new CloneNotSupportedException(getClass().getName());
	}
}