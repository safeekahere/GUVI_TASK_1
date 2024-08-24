import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find if its Prime or not");
        int value = sc.nextInt();
        int count =0;
        for(int i =2;i<=value/2;i++)
        {
        if(value%i ==0)
        {
        	count ++;
        	break;
        	
        }
	}  if(count ==0)
	{
		System.out.println(value+" is a Prime number");
		
	}
	else
	{
		System.out.println(value +"is not a prime number ");
	}
	}
}
