import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class: System, Math, FileWriter
		// instance: F1, F2
		
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter F1=new FileWriter("data.txt");
		F1.write("Hello");
		F1.write(" java");
		F1.close();
		
		FileWriter F2=new FileWriter("data2.txt");
		F2.write("Hello");
		F2.write(" java2");
		F2.close();
		
		F1.write("!!!");
		F1.close();

	}

}
