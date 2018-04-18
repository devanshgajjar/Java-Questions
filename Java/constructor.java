class Dalwadi{
	int Dhruv;
	String Dhruvil;
	Dalwadi(int Dhruv, String Dhruvil){
		this.Dhruv=Dhruv;
		this.Dhruvil=Dhruvil;
		
	}
	void display(){
		System.out.println(Dhruv);
		System.out.println(Dhruvil);
		
	}
}

class Dal_Main_kuch_Kala_hai{
	public static void main(String args[])
	{
		Dalwadi d;
		d= new Dalwadi(2018,"DD");
		d.display();
	}
}