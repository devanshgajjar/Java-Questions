import java.io.*;
class test{
	public static void a(){
		b();
	}
	public static void b(){
		c();
	}
	public static void c(){
		DataInputStream d=new DataInputStream(System.in);
		try{
			String s=d.readLine();
			System.out.println(s);
		}
		catch(IOException io){
			System.out.println("Test exception : IO");
		}
		finally{
			System.out.println("Inside the finally block");
		}
	}
	public static void main(String[] args){
		a();
		
		
	}
}