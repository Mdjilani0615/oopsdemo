package basics;

public class CountVowels {

	public static void main(String[] args) {
		String s="java is fun";
		/*Scanner scan=new Scaneer(System.in);
		System.out.println("enter a sentence");
		String s=scan.nextLine();
		scan.close();*/
		
        int count=0;
       
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' ||
                    s.charAt(i) =='o' || s.charAt(i) =='u')
            {
                count+=1;
                System.out.println("Vowel found : "+s.charAt(i));
            }
           
        }
        System.out.println("Total no. of vowels in string :"+count);
		// TODO Auto-generated method stub

	}

}

