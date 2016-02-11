package Parcial3º;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[]args)
	{
		Scanner Keyboard= new Scanner(System.in);
		int i,n,fib,fib1,fib2,fibx;
		System.out.println("Numero");n=(int)Keyboard.nextInt();
		fib1=2; fib2=1; i=3;
		if((n==1)||(n==2)) 
			fib=1;
		else{
			do{
				fib = fib1 + fib2;
				fibx = fib1; i++;
				fib1 = fib;  fib2 = fibx;
			}while(i<n);
		}
		System.out.println("La serie Fibinacii del num "+n+" es\n"+fib);
	}
}
