import java.util.Scanner;

public class PrimeNumber{    
	
	 public static void main(String args[]){	
		 Scanner scanner = new Scanner(System.in);
		 long i,m=0,flag=0;
		 System.out.print("Number: ");
		 long n = scanner.nextLong();
		 scanner.close();   
		 m=n/2;      
		 if(n==0||n==1){  
			 System.out.println(n+" is not a prime number");      
		 }else{  
			 for(i=2;i<=m;i++){      
				 if(n%i==0){      
					 System.out.println(n+" is not a prime number");      
					 flag=1;      
					 break;
				 }      
			 }      
			 if(flag==0)  { System.out.println(n+" is a prime number"); }  
		 }
	 }    
 	}