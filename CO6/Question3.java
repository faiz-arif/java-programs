package CO6;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the path of the source file: ");
            String sourcePath = scanner.nextLine();
            System.out.print("Enter the path of the destination file: ");
            String destinationPath = scanner.nextLine();
            File f1 = new File(sourcePath);
            File f2 = new File(destinationPath);
            Files.copy(f1.toPath(), f2.toPath());
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred while copying the file: " + e.getMessage());
        } finally {
            scanner.close();}}}
