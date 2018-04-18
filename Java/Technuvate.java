import java.util.Scanner;
//1
class Example
{
    		public static void main(String args[])
    		{
  		     int rows, number = 1, counter, j;
       		     Scanner input = new Scanner(System.in);
       		     System.out.println("Enter the number of rows for input:");
       		     rows = input.nextInt();
     		     System.out.println(" output");
    		     System.out.println("****************");
      			 for ( counter = 1 ; counter <= rows ; counter++ )
       				{
          				 for ( j = 1 ; j <= counter ; j++ )
           				{
                				System.out.print(number+" ");
                				number++;
           				}
          			 	System.out.println();
       			}
       		} 
      	}



//2
class JavaExample
 {
    public static void main(String[] args) {
int num = 370, number, temp, total = 0;
number = num;
       		while (number != 0)
        		{
            		        temp = number % 10;
            			total = total + temp*temp*temp;
            			number /= 10;
        		}

        		if(total == num)
            			System.out.println(num + " is an Armstrong number");
        		else
            			System.out.println(num + " is not an Armstrong number");
    	}

}

//3
class Test

{
    		
 		try

    			  {

        	   		Public Test()

        	    {

            	 System.out.println("GeeksforGeeks");

            	 throw new Exception();

        	
                }
  
  		  }

              catch(Exception e)

    			{

        		System.out.println("GFG");

    			}

    			public static void main(String[] args)

    			  {

        		Test test = new Test();

    } 

   }
