package abstract1;

public class  City extends Place {
	
  void m1() {
	
	int count = 10;
	
	
	do {
		
		System.out.println(count + "\n");
		
		count++;
	} 
	
	while (count <= 10); 
	
	
}



  void m2() {
	  
	  // Array
	  
	// An array is a collection of similar types of data. 
	
	System.out.println("list" +  "\t" + "City");
	
	String name[]= {"Dc","ohio","new mexico"};
	
	for(int x = 0; x < name.length; x++) {
		
		System.out.println(1+x + " \t  " + name[x]+"\n");
		
	}
	
	
}
void m3() {
	
	int age[]= {100,99,90,81};

	int sum = 0;
	
	for (int a = 0; a < age.length; a++) {
		
		sum+=age[a];
	}
	 
	  System.out.println("\nThere Age is: " + sum + "\n");
	  
}
void m4() {
	
	System.out.println(Math.abs(-2) + "\n"); // Gives the Absolute value.
	
    // Example: -3 = 3 || 3 = 3

System.out.println(Math.ceil(5.2) + "\n"); // Makes the double value upward and return it.

      // Example: 5.9 = 6 || 1.1 = 2.

System.out.println(Math.floor(9.9) + "\n"); // Makes the double value downward and return it.

       // Example: 5.9 = 5 || 1.1 = 1.

System.out.println(Math.max(9.9, 1.1) + "\n"); // Gives the maximum value.

          // Example: (9.9 , 1.1) = 9.9.

System.out.println(Math.min(9.9, 1.1) + "\n"); // Gives the minimum value.

          // Example: (9.9 , 1.1) = 1.1.

System.out.println(Math.pow(5, 3)   +"\n"); // " (Basically what it does is 5*5*5)"

System.out.println(Math.sqrt(9) + "\n"); //  " (it gives you the square root of the argument)" 

}
void m5(String name) {
	
	System.out.println("hi " + name);
}
void m6() {
	
	int miki[]= {1,2,3,4,5};
	
	int arr[]= {5,4,3,2,1};
	
	int sum = 0;
	
	for(int x:miki) {
		
		sum+=x;
	}
	
	System.out.println("The sum of the Miki is: " + sum);
}




@Override
void m5() {
	// TODO Auto-generated method stub
	
}





}


