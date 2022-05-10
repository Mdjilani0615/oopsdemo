/*
 * Ternary Operator is the conditional operator that takes 3 operands.
 * It is used in place of if-else
 *      Syntax: variable= expr1 ? expr2 : expr3
 */
// Program to find maximum of 2 nos
import java.util.Scanner;


public class TernaryDemo {

    public static void main(String[] args) {
		
	
		int number;
        String size="";
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter ur Shirt Size:");
        number=s.nextInt();
        s.close();
        
	/*case 1:
        
        size="Kids";
        break;
case 29:
      size = "Small";
      break;



case 42:
      size = "Medium";
      break;




}*/
System.out.println("Size: " + size);
if(number >=1 && number <=50)
    System.out.println("Kid");
else if(number >=51 && number <=100)
    System.out.println("Medium");
else if(number >=101 && number <=200)
      System.out.println("Large");
else
System.out.println("Invalid");

	}

}
