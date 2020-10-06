package newjava;

public class Prime_number {

	public static void main(String[] args) {

		int n =5;
		boolean isprime = true;
		int count = 2;
		while(count <= Math.sqrt(n)) {
			if(n % count == 0) {
				System.out.println("not prime");
				isprime = false;
				break;
			}
			count++;
		}
			if(isprime == true) {
				System.out.println("prime");
			}
	}

}
