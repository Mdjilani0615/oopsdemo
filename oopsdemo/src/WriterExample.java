import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		try {
			
			Writer w=new FileWriter("c:/demo/data.txt");
			
			String content="She sells sea Shell In the Sea.programming by MD";
			w.write(content);
			w.close();
			System.out.println("Datawriteen to a file");
			
		}
		
		catch(IOException e) {
			
			System.out.println("Error Occured");
			e.printStackTrace();
		}

	}

}
