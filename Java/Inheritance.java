class A{
	int x;
	void display(){
		System.out.println(x);
	}
}

class B extends A{
	int y;
	int x;
	int show(int x,int b){
		super.x=x;
		this.y=y;
		return x+y;
	}
}
/*class C extends B{
	int z;
	int final2();
}*/
class Main{
	public static void main(String[] args){
		A object2= new A();
		B object = new B();
		object.y=5;
		object.x=10;
		System.out.println(object.show(object.x,object.y));
		object.display();
	}
}

class Circle{
	protected private int r;
	public Circle(){
		System.out.print("Default Constructor");
		
	}
	public Circle(int r){
		this.r=r;
		System.out.println("Parameterized");
	}
	double area(){
		return 3.14*r*r;
	}
	double circum(){
		return 2*3.14*r;
	}
}

class Sphere extends Circle{
	int r;
	public Sphere(int r){
		super.r=r;
	}
	double vol(){
		return (4*r*area())/3;
	}
	double sa(){
		return (4*area());
	}
}

class SphereMain{
	public static void main(String[] args){
		Sphere s= new Sphere(5);
		System.out.println(s.vol());
		System.out.println(s.sa());
	}
}