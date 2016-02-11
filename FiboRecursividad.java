package Parcial3º;
import java.util.Scanner;
public class FiboRecursividad {
	static int fib(int val){
	 	if ((val==1)||(val==2))
	 		return 1;
	 	else
	 		return (fib(val-1)+fib(val-2));
	 }
	public static void main(String[]args){
		Scanner Keyboard= new Scanner(System.in);
		int n;
		System.out.println("Numero: ");n=(int)Keyboard.nextInt();
		System.out.println("Fibonacci: "+fib(n));
	}
}
