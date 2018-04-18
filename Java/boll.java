import java.util.*;
class Boll{	
	public static void main(String[] args){
	Scanner reader=new Scanner(System.in);
	String []s={"a","b","c","d"};
	int a = 0;
	for(int i=0; i<=8;i++){
		System.out.print("Guess : ");
		String n= reader.nextLine();
		for(a=0;a<=3;a++){
			if(s[a].equals(n)){			
				System.out.println(s[a]);
				System.out.println( s[a] +" is at position " +a);
				if(a==2 && i>2){
					System.out.println(" Raid :Congo");
					i=9;
					break;
				}else{
					continue;
			}			
				
		} 

	}	
	}
}
	
}