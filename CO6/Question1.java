package CO6;
import java.io.*;
/*Program to list the sub directories and files in a given directory and also search for a file name.*/
import java.util.Scanner;
import java.io.File;
class Question1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the full path to directory : ");
		String path = scanner.next();
		System.out.print("enter a filename to search : ");
		String search = scanner.next();
		File directory = new File(path);
		if( !directory.exists() || !directory.isDirectory() )
			System.out.println("unable to open directory");
		else {
			boolean found = false;
			File[] files = directory.listFiles();
			for(File file: files){
				if(file.isDirectory())
					System.out.printf("directory - %s\n",file.getName());
				if(file.isFile()){
					System.out.printf("file - %s\n",file.getName());
					if(file.getName().equals(search))
						found = true;
			}
			}
			if(found)
				System.out.printf("file %s found!\n",search);
			else
		System.out.print("file not found\n");
		}	}
}
