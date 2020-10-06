package newjava;
import java.util.Scanner;

public class Even_odd_sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		 int n = sc.nextInt();
         int  even_sum = 0;
         int  odd_sum = 0;
		int input = sc.nextInt();
           
		   if(input%2 == 0) {
			   even_sum = even_sum + input;
		   }
		   else {
			   odd_sum = odd_sum + input;
		   }
		  System.out.println(even_sum);
		  System.out.println(odd_sum);
	}

}
