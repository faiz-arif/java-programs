package CO6;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
class Question4 {
	public static void main(String args[]) throws IOException {
		int number;
		FileReader fileReader = null;
		try {
			FileWriter fileWriterOne = new FileWriter("D:\\Programs\\github-rep\\faiz-arif\\java-programs\\odd.txt");
			FileWriter fileWriterTwo = new FileWriter("D:\\Programs\\github-rep\\faiz-arif\\java-programs\\even.txt");
			fileReader = new FileReader("D:\\Programs\\github-rep\\faiz-arif\\java-programs\\data.txt");
			while( ( number = fileReader.read() ) != -1){
				char character = (char)number;
				if( character % 2 == 0  )
					fileWriterTwo.write(character);
				else
					fileWriterOne.write(character);
			}
			fileWriterOne.close();
			fileWriterTwo.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Unable to read file!");
		}
		System.out.println();
		fileReader.close();
	}
}
