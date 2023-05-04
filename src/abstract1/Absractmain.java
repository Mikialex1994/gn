package abstract1;

import java.util.Scanner;

import java.util.Random;

public class Absractmain {

	public static void main(String[] args) {
		
		City a = new City();
		
		a.m1();
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-\n");
		
		a.m2();
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-\n");
		
		a.m3();
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-\n");
		
		a.m4();
		
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-\n");
		
		Scanner b = new Scanner(System.in);
		
       System.out.println("What is your name?");
       
       String x = b.nextLine();
       
       a.m5(x);
       
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-\n");
       
       double f1,f2,answer;
       
       System.out.println("put first num");
       
       f1 = b.nextDouble();
       
       System.out.println("Put second num");
       
       f2 = b.nextDouble();
       
       answer = f1+f2;
       
       System.out.println("The sum of the num is: " + answer);
       
       System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-\n");
       
       a.m6();
   
       
	}

}
