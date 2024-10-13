import java.util.Scanner; //Imports the Scanner class from the java.util package

public class userinput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates a scanner object that reads from the console
        
        System.out.println("Enter a number: "); //Prints text to the console
        
        int number = scanner.nextInt(); //Reads the next integer from the console
        
        System.out.println("You entered: " + number); //Prints text to the console
        
        scanner.close(); //Closes the scanner object
    }
}