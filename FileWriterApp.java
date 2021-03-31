import java.io.FileWriter;
import java.io.Writer;

public class FileWriterApp {

	public static void main(String[] args) {
		FileWriter fileWriter=new FileWriter(fileName:"filewriter.txt");
		
		fileWriter.write(str:"data 1");
		fileWriter.write(str:"data 2");
		fileWriter.write(str:"data 2");

	}

}
