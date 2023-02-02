import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Declare the inputScanner and fileWriter variables.
        Scanner inputScanner = null;
        FileWriter fileWriter = null;

        try {
            //Create the Scanner and FileWriter objects.
            inputScanner = new Scanner(System.in);
            fileWriter = new FileWriter("student.txt");

            //Ask the user to input their name.
            System.out.println("Enter your name:");
            fileWriter.write(inputScanner.nextLine() + "\n");

            //Ask the user to input the year of school they are in.
            System.out.println("Enter which year of school you are in:");
            fileWriter.write(inputScanner.nextLine() + "\n");

            //Ask the user to input the name of their school.
            System.out.println("Enther the name of your school:");
            fileWriter.write(inputScanner.nextLine() + "\n");
        } catch (IOException e) {
            //Catch the exception and print that an error has occured.
            System.out.println("An error occured");
        } finally {
            //Close the input scanner.
            if (inputScanner != null) {
                inputScanner.close();
            }
            //Close the file writer.
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
