
public class printing {

	public static void main(String[] args) {
		int number = 10; // Creates an integer variable with the value of 10
		double decimal = 10.5; // Creates a double variable with the value of 10.5
		float floatDecimal = 10.5f; // Creates a float variable with the value of 10.5
		long longNumber = 1000000000000000000L; // Creates a long variable with the value of 1000000000000000000
		short shortNumber = 10; // Creates a short variable with the value of 10
		byte byteNumber = 10; // Creates a byte variable with the value of 10

		System.out.println(number);
		System.out.println(decimal);
		System.out.println(floatDecimal);
		System.out.println(longNumber);
		System.out.println(shortNumber);
        System.out.println(byteNumber); 
		
		System.out.print("Print to current line");
		System.out.println("Prints text then stops you writing to current line");
		String line = "prints string";
		System.out.printf("%s", line); //More info at https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Formatter.html#conversions-heading
		System.out.println("""
						This is a text block!
						You can write multiple lines!
						""");
	}

}