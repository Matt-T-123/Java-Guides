public class maths {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 5;
        int result = number + number2;

        System.out.println(result); // Does 10 + 5

        result = number - number2; // Does 10 - 5
        System.out.println(result); 

        result = number * number2; // Does 10 multiplied 5
        System.out.println(result); 

        result = number / number2; // Does 10 divided by 5
        System.out.println(result); 

        result = number % number2; // Does 10 mod 5
        System.out.println(result); 

        number++; // Adds 1 to number
        System.out.println(number); 

        number--; // Subtracts 1 from number
        System.out.println(number); 

        number += 5; // Adds 5 to number
        System.out.println(number); 

        number -= 5; // Subtracts 5 from number
        System.out.println(number); 

        number *= 5; // Multiplies number by 5
        System.out.println(number); 

        number /= 5; // Divides number by 5
        System.out.println(number); 

        number %= 6; // Does number mod 6
        System.out.println(number); 
    }
}
