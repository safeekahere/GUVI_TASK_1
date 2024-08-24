import java.util.Scanner;

public class FindEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value to find if its even number");
      int a = sc.nextInt();
      if(a%2==0)
      {
    	  System.out.println("The number is an even number");
      }
      else
      {
    	  System.out.println("The number is not an even number");
      }
	}

}
