package basics;

public class continouedemo {
	public static void main(String[] args) {
		int i,j;
	       
        System.out.println("********** Break Demo ***********");
       
        for(i=1;i<=10;i++)
        {
           
           
            System.out.println(i+" Raj");
        }
		System.out.println("********* Continue Demo **********");
	       
        for(j=1;j<=10;j++)
        {
            if(j==6)
            {
                continue; // Skips the current Iteration
            }
            System.out.println(j + " Java");
        }
	}
}
