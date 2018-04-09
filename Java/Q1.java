//program to print an integer
import java.util.Scanner;	
import java.math.BigInteger;
import static java.lang.Math.pow;
class Q2{	
	public static void main(String args[]){
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int x=reader.nextInt();
		int y=reader.nextInt();
		System.out.print("The sum of " + x + " and " + y +" is " +(x+y));
	}
}

class Q1{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		System.out.print("The number you entered is "+ n);
	}
}

class Q4{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int x=reader.nextInt();
		int y=reader.nextInt();
		System.out.print("The product of " + x +" and " +y +" is " +(x*y));
	}
}

class Q3{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int x=reader.nextInt();
		int y=reader.nextInt();
		System.out.print("The difference of " + x +" and " + y +" is " + (x-y));
	}
}

class Q5{
	public static void main(String args[]){
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter Principal, rate of interest and time period :");
		int x=reader.nextInt();
		int y= reader.nextInt();
		int z=reader.nextInt();
		System.out.print("The compound interest is " + (x*z*y));
	}
}

class Q7{
	public static void main(String args[]){
			Scanner reader=new Scanner(System.in);
			System.out.print("Enter radius ");
			int x=reader.nextInt();
			System.out.print("Area is " + (3.14*x*x));
			System.out.print("\nCircumference is " + (3.14*2*x));
			
	}

}

class Q8{
	public static void main(String args[]){
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter l,b and h");
		int l=reader.nextInt();
		int b=reader.nextInt();
		int h=reader.nextInt();
		System.out.print("The volume of the cuboid is" + l*b*h);
		System.out.print("SA of the cuboid is "+ (2*l+2*b+2*h));
	}
}

class Q9{
	public static void main(String args[]){
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter marks in 3 subjects");
		float m=reader.nextInt();
		int s=reader.nextInt();
		int x=reader.nextInt();
		System.out.print("Percentage of marks is "+ ((m+s+x)*100)/300);
		
		
	}
}
class Q6{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter principal and rate of interest : ");
		float p=reader.nextInt();
		float r=reader.nextInt();
		
		
		System.out.print("Compound interest for 3 years is " );
		
	}
}

class Q10{
	public static void main(String args[]){
		Scanner reader= new Scanner(System.in);
		System.out.print("Enter basic salary : ");
		float bs=reader.nextInt();
		float da=(70*bs)/100;
		float hra=(15*bs)/100;
		float pf=(8*bs)/100;
		float it=(12*bs)/100;
		float ma=1000;
		
		float ns=bs+da+hra+ma-pf-it;
		System.out.print("Net salary is : " + ns);
	}
}

class Q11{
	    public static void main(String args[]){
			Scanner reader= new Scanner(System.in);
			System.out.print("Enter Customer Number : ");
			int num=reader.nextInt();
			System.out.println("Enter Customer Name: ");
			reader.nextLine();
			String nam=reader.nextLine();
			System.out.print("Enter Current Reading and Past Reading : ");
			float cr=reader.nextFloat();
			float pr=reader.nextFloat();
			float cpu=5.2f;
			float bill=(cr-pr)*cpu;
			System.out.print("\nElectricity Bill");
			System.out.print("\n---------------------------");
			System.out.print("\nCustomer Number : \t"+ num);
			System.out.print("\nCustomer Name \t: \t" + nam);
			System.out.print("\nPast Reading \t: \t" + pr);
			System.out.print("\nCurrent Reading : \t" + cr);
			System.out.print("\nUnits Consumed \t: \t" + (cr-pr));
			System.out.print("\nCharge per unit : \t" + (cpu));
			System.out.print("\nBilled amount \t: \t" + (bill));
			System.out.print("\n---------------------------");
						
		}
}

class Q12{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter Lorry Number : ");
		int lorry=reader.nextInt();
		System.out.print("Enter Distance travelled : ");
		float dist=reader.nextInt();
		System.out.print("Enter rate per kms : ");
		float rate= reader.nextInt();
		System.out.print("Enter Days travelled : ");
		int days=reader.nextInt();
		float bill=rate*dist;
		System.out.print("\nLorry no is " + lorry);
		System.out.print("\nDistance is "+ dist +" and rate is "+ rate);
		System.out.print("\nNo of days is " + days);
		System.out.print("\nBilled amount is " + bill);
	}
}

class Q13{
	public static void main(String[] args){
		Scanner reader =new Scanner(System.in);
		int days=reader.nextInt();
		int years = days/365;
		int month = (days%365)/30;
		int day=(days%365)%30;
		System.out.print(" Days : "+ day + "\n Months : "+ month +"\n Years : "+ years);
	}
}

class Q14{
	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);
		int num=reader.nextInt();
		if(num>=1){
			System.out.print("Number is Positive");
		}
		else{
			System.out.print("Number is not Positive");
		}
		
	}
}

class Q15{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int num=reader.nextInt();
		if(num%2==1){
			System.out.print("Odd");
		}
		else{
			System.out.print("Even");
		}
	}
	
}

class Q16{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int num=reader.nextInt();
		if(num%400==0)
			System.out.print("Leap Year");
		else if(num%100==0)
			System.out.print("Not a leap year");
		else if(num%4==0)
			System.out.print("Leap year");
		else
			System.out.print("Not a leap year");
	}
}

class Q17{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		int num3= reader.nextInt();
		if(num1<=num3 && num3<=num2)
			System.out.print("Number is in range");
		else
			System.out.print("Number is not in range ");
	}
}

class Q18{
	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		if(a>b && a>c)
			System.out.print(a+ " is greatest");
		else if(b>a && b>c)
			System.out.print(b + " is greatest ");
		else if (c!=a || c!=b)
			System.out.print(" error ");
		else 
			System.out.print(c + " is greatest");
		
	}
}
class Q19{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		int num3= reader.nextInt();
		float per= (a+b+c+num1+num3+num2);
		if(per>=60)
			System.out.print("FC");
		else if(per>=48)
			System.out.print("SC");
		else if(per>=40)
			System.out.print("Pass");
		else
			System.out.print("ReExam");
			
		
	}
}

class Q21{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int bs=reader.nextInt();
		if(bs<2000){
			bs=bs+(5*bs)/100;
		}
		else if(2000<=bs && bs<=5000)
			bs=bs+(7*bs)/100;
		else if(5000<=bs && bs<7000)
			bs=bs+(9*bs)/100;
		else 
			bs=bs+(12*bs)/100;
		System.out.print("Final Salary is "+ bs);
	}
}

class Q22{
	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);
		int count=1;
		int x=reader.nextInt();
		while(count<=x){
			System.out.print(count++ + "\n");
		}
	}
}

class Q23{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int sum=0;
		int x=reader.nextInt();
		while(x>=1){
			sum= sum + (x)*(x);
			x--;
		}	
		System.out.print(sum+1);
	}
}
class Q24{	
	static int fact(int n){
		if(n==1){
			return 1;
		} else {
			return n*(fact(n-1));
		}
	}
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int n=reader.nextInt();
		System.out.println(fact(n));
	}
}

class Q25{
	static String rev(int n){
		return(Integer.to.String(n));
	}
	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);
		int n=reader.nextInt();
		System.out.println(rev(n));
	}
}