import java.util.Scanner;

public class Digit_in_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Number ");
		Long count = (long) 0;
	      System.out.println("Enter a number :");
	      Long num = sc.nextLong();
	      while(num>0){
	         num = num/10;
	         count++;
	      }
	      System.out.println("Number of digits in the entered integer are - "+count);
	   }

}
