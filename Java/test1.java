class student
{
public int id;
String name;
private String bg;

	public student (int id , String name , String bg)
	{

	this.id=id;
	this.name=name;
	this.bg=bg;
	}

	public void display()
	{
	
	System.out.println(id);
	System.out.println(name);
	System.out.println(bg);
	}
}
class stude 
{

	public static void main(String[] args)
	{
		student s;
		s=new student(101,"jaimit","xyz");
		s.name="abc";
		s.display();
	}


}