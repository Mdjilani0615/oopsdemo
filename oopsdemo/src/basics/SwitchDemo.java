package basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		int a,b;
        String op;
        Scanner   s=new Scanner(System.in);

 

         System.out.println("Enter 2 numbers :");
         a=s.nextInt();
         b=s.nextInt();
         System.out.println("Enter Operator :"); // +, -, *, /
         op=s.next();
         
         s.close();
         switch(op) {
         
         case "+": 
         		   System.out.println("The addition is " +(a + b));
         		   break;
         case "*": 
         			System.out.println("the multiplication is "+(a * b));
         			break;
         case "/": 
                   System.out.println("the divison of "+(a / b));
                    break;
                    
         case "-":
                  System.out.println("the subtraction of "+(a -b));
                  break;
                  
          default :System.out.println("invalid");
          
         
         }

	}

}
