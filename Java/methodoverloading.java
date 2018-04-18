class Method{
	int y;
	int z;
	int add(int a,int b){
		return a+b;
	}
	
	int add(int y, int z,int x){
		return y + z; 
	}

	public static void main(String[] args){
		Method m;
		m= new Method();
		m.y=10;
		m.z=20;
		System.out.print(m.add(7,11) + "\n");
		System.out.print(m.add(m.y,m.z,0));
	}	
}	

class PassObject{
	void increment(Method a){
		a.y++;
	}
	public static void main(String[] args){
		PassObject po= new PassObject();
		Method a= new Method();
		a.y=10;
		po.increment(a);
		System.out.print(a.y);
	}
}