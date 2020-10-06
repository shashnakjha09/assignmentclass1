package newjava;
public class Even_odd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int even_sum = 0;
		int odd_sum = 0;
     for(int i = 1; i<=6; i++) {
    	 if(i%2 == 0) {
    		even_sum = even_sum + i;
    	 }
    	 else{
    		 odd_sum = odd_sum +i;
    	 }
    	 System.out.println(odd_sum );
    	 
    	 System.out.println(even_sum);

       }
     
     

     
     
     
	}

}
