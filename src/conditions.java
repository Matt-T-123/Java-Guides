public class conditions {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 5;

        if (number > number2) { // if (condition) run this code
            System.out.println("Number is greater than number2");
        } else if (number < number2) { // else if (condition) run this code
            System.out.println("Number is less than number2");
        } else { // else run this code
            System.out.println("Number is equal to number2");
        }

        if (number == 10 && number2 == 5) { // if (condition and condition) run this code
            System.out.println("Number is 10 and number2 is 5");
        }

        if (number == 10 || number2 == 5) { // if (condition or condition) run this code
            System.out.println("Number is 10 or number2 is 5");
        }

        if (!(number == 5)) { // if (not condition) run this code
            System.out.println("Number is not 5");
        }
    }
}
