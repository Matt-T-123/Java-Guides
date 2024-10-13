
public class printing {

	public static void main(String[] args) {
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