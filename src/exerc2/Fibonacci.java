package exerc2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Informe um número: ");
		        int num = scanner.nextInt();

		   
		        if (isFibonacci(num)) {
		            System.out.println(num + " pertence à sequência de Fibonacci.");
		        } else {
		            System.out.println(num + " não pertence à sequência de Fibonacci.");
		        }

		        scanner.close();
		    }

		    public static boolean isFibonacci(int n) {
		
		        int a = 0, b = 1, c;

		      
		        if (n == a || n == b) {
		            return true;
		        }

		     
		        while (b < n) {
		            c = a + b;
		            a = b;    
		            b = c;     

		           
		            if (b == n) {
		                return true;
		            }
		        }

		       
		        return false;
		    }

}
	


