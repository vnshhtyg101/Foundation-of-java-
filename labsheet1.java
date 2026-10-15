import java.util.Scanner;

public class labsheet1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   JAVA ASSIGNMENT: QUESTIONS 1 TO 30");
        System.out.println("==================================================");
        System.out.print("Enter Question Number to run (1 - 30): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:  q01(); break;
            case 2:  q02(); break;
            case 3:  q03(); break;
            case 4:  q04(); break;
            case 5:  q05(); break;
            case 6:  q06(); break;
            case 7:  q07(); break;
            case 8:  q08(); break;
            case 9:  q09(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;
            case 15: q15(); break;
            case 16: q16(); break;
            case 17: q17(); break;
            case 18: q18(); break;
            case 19: q19(); break;
            case 20: q20(); break;
            case 21: q21(); break;
            case 22: q22(); break;
            case 23: q23(); break;
            case 24: q24(); break;
            case 25: q25(); break;
            case 26: q26(); break;
            case 27: q27(); break;
            case 28: q28(); break;
            case 29: q29(); break;
            case 30: q30(); break;
            default:
                System.out.println("Invalid Question Number! Please choose between 1 and 30.");
        }
    }

    // 1. Display name, age, college name
    static void q01() {
        String name = "Kanika";
        int age = 20;
        String collegeName = "My College of Engineering";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + collegeName);
    }

    // 2. Arithmetic operations
    static void q02() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division/Modulus by zero is undefined.");
        }
    }

    // 3. Even or Odd
    static void q03() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
    }

    // 4. Relational operators
    static void q04() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " > " + b + "  : " + (a > b));
        System.out.println(a + " < " + b + "  : " + (a < b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
    }

    // 5. Explicit type casting
    static void q05() {
        System.out.print("Enter a floating-point number: ");
        float floatVal = sc.nextFloat();
        int intVal = (int) floatVal;

        System.out.println("Original float value: " + floatVal);
        System.out.println("Converted integer value: " + intVal);
    }

    // 6. ASCII value
    static void q06() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value of '" + ch + "' is: " + (int) ch);
    }

    // 7. Divisible by 3 and 5
    static void q07() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is NOT divisible by both 3 and 5.");
        }
    }

    // 8. Vowel or Consonant
    static void q08() {
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        } else {
            System.out.println("Not an alphabetic character.");
        }
    }

    // 9. Total, Percentage, Pass/Fail
    static void q09() {
        System.out.print("Enter marks for Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }

    // 10. Greatest of two numbers
    static void q10() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater.");
        } else if (b > a) {
            System.out.println(b + " is greater.");
        } else {
            System.out.println("Both are equal.");
        }
    }

    // 11. Largest of three (nested if-else)
    static void q11() {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;
        if (a >= b) {
            if (a >= c) largest = a;
            else largest = c;
        } else {
            if (b >= c) largest = b;
            else largest = c;
        }
        System.out.println("Largest number is: " + largest);
    }

    // 12. Leap Year
    static void q12() {
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    // 13. Positive, Negative, or Zero
    static void q13() {
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // 14. Character classification
    static void q14() {
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= '0' && ch <= '9') System.out.println("Digit");
        else if (ch >= 'A' && ch <= 'Z') System.out.println("Uppercase Letter");
        else if (ch >= 'a' && ch <= 'z') System.out.println("Lowercase Letter");
        else System.out.println("Special Character");
    }

    // 15. Armstrong number (3-digit)
    static void q15() {
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;
            int sum = (d1 * d1 * d1) + (d2 * d2 * d2) + (d3 * d3 * d3);

            if (sum == num) System.out.println(num + " is an Armstrong Number.");
            else System.out.println(num + " is NOT an Armstrong Number.");
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }

    // 16. Income tax calculation
    static void q16() {
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        double tax = 0.0;

        if (salary <= 250000) tax = 0.0;
        else if (salary <= 500000) tax = (salary - 250000) * 0.05;
        else if (salary <= 1000000) tax = (250000 * 0.05) + ((salary - 500000) * 0.20);
        else tax = (250000 * 0.05) + (500000 * 0.20) + ((salary - 1000000) * 0.30);

        System.out.println("Tax: " + tax);
    }

    // 17. Palindrome check
    static void q17() {
        System.out.print("Enter an integer: ");
        int original = sc.nextInt();
        int num = Math.abs(original);
        int reversed = 0;

        while (num > 0) {
            int digit = (int) (num % 10);
            reversed = (reversed * 10) + digit;
            num = (int) (num / 10);
        }

        if (Math.abs(original) == reversed) System.out.println(original + " is a Palindrome.");
        else System.out.println(original + " is NOT a Palindrome.");
    }

    // 18. Prime number
    static void q18() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n <= 1) isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) System.out.println(n + " is Prime.");
        else System.out.println(n + " is NOT Prime.");
    }

    // 19. Valid operator and execution
    static void q19() {
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (op == '+') System.out.println("Result: " + (a + b));
            else if (op == '-') System.out.println("Result: " + (a - b));
            else if (op == '*') System.out.println("Result: " + (a * b));
            else if (op == '/') {
                if (b != 0) System.out.println("Result: " + (a / b));
                else System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }

    // 20. Marriage eligibility
    static void q20() {
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender == 'M') {
            if (age >= 21) System.out.println("Eligible for marriage.");
            else System.out.println("Not eligible (Male min age is 21).");
        } else if (gender == 'F') {
            if (age >= 18) System.out.println("Eligible for marriage.");
            else System.out.println("Not eligible (Female min age is 18).");
        } else {
            System.out.println("Invalid gender.");
        }
    }

    // 21. Valid triangle
    static void q21() {
        System.out.print("Enter three angles: ");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();

        if (a1 > 0 && a2 > 0 && a3 > 0 && (a1 + a2 + a3 == 180.0)) {
            System.out.println("Valid triangle.");
        } else {
            System.out.println("Not a valid triangle.");
        }
    }

    // 22. Square or Rectangle
    static void q22() {
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        if (l > 0 && b > 0) {
            if (l == b) System.out.println("It is a Square.");
            else System.out.println("It is a Rectangle.");
        } else {
            System.out.println("Dimensions must be positive.");
        }
    }

    // 23. Celsius to Fahrenheit
    static void q23() {
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = ((double) 9 / 5 * c) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }

    // 24. Perfect number
    static void q24() {
        System.out.print("Enter positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        if (sum == num) System.out.println(num + " is a Perfect Number.");
        else System.out.println(num + " is NOT a Perfect Number.");
    }

    // 25. Logical operator simulation
    static void q25() {
        System.out.print("Enter first int (0=false, non-zero=true): ");
        int a = sc.nextInt();
        System.out.print("Enter second int (0=false, non-zero=true): ");
        int b = sc.nextInt();
        System.out.print("Enter logical operator (&, |, ^): ");
        char op = sc.next().charAt(0);

        boolean b1 = (a != 0);
        boolean b2 = (b != 0);

        if (op == '&') System.out.println("Result: " + (b1 && b2));
        else if (op == '|') System.out.println("Result: " + (b1 || b2));
        else if (op == '^') System.out.println("Result: " + (b1 ^ b2));
        else System.out.println("Invalid operator.");
    }

    // 26. First and last digit match (5-digit)
    static void q26() {
        System.out.print("Enter a 5-digit number: ");
        int num = Math.abs(sc.nextInt());
        if (num >= 10000 && num <= 99999) {
            int first = num / 10000;
            int last = num % 10;
            if (first == last) System.out.println("First and last digits are SAME (" + first + ").");
            else System.out.println("First and last digits are DIFFERENT (" + first + " and " + last + ").");
        } else {
            System.out.println("Not a 5-digit number.");
        }
    }

    // 27. Profit or Loss
    static void q27() {
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (sp > cp) System.out.println("Profit: " + (sp - cp));
        else if (cp > sp) System.out.println("Loss: " + (cp - sp));
        else System.out.println("No Profit, No Loss.");
    }

    // 28. Count digits
    static void q28() {
        System.out.print("Enter an integer: ");
        long num = Math.abs(sc.nextLong());
        int count = 0;
        if (num == 0) count = 1;
        else {
            while (num > 0) {
                count++;
                num /= 10;
            }
        }
        System.out.println("Number of digits: " + count);
    }

    // 29. Height classification
    static void q29() {
        System.out.print("Enter height in cm: ");
        double h = sc.nextDouble();
        if (h < 150) System.out.println("Short");
        else if (h <= 170) System.out.println("Average");
        else System.out.println("Tall");
    }

    // 30. Simple Calculator
    static void q30() {
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        if (op == '+') System.out.println("Result: " + (num1 + num2));
        else if (op == '-') System.out.println("Result: " + (num1 - num2));
        else if (op == '*') System.out.println("Result: " + (num1 * num2));
        else if (op == '/') {
            if (num2 != 0) System.out.println("Result: " + (num1 / num2));
            else System.out.println("Error: Division by zero.");
        } else {
            System.out.println("Invalid operator.");
        }
    }
}