package newjava;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f_sum = 1;
        for(int i = 1; i<=n; i++) {
        	f_sum = f_sum * i;
        }
        System.out.println(f_sum);
	}

}
