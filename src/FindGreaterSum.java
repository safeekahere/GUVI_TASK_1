import java.util.Scanner;

public class FindGreaterSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha Value of a , b , c and d");
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		//int sum1 = a+b;
		//int sum2 = c+d;
		if ((a+b)>(c+d))
		{
			System.out.println("The sum of a and b is greater than the sum of c and d");
		}
		else 
			System.out.println("The sum of a and b is smaller than the sum of c and d");

	}

}
