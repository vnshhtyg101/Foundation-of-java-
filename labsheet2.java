import java.util.Scanner;
import java.util.Random;

public class labsheet2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   BCA201P: LAB SHEET-02 (Q1 TO Q30)");
        System.out.println("==================================================");
        System.out.print("Enter Question Number to run (1 - 30): ");
        int choice = sc.nextInt();
        System.out.println("--------------------------------------------------");

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
                System.out.println("Invalid question number! Please enter between 1 and 30.");
        }
    }

    // ----------------------------------------------------
    // Arithmetic Operators (Q1 - Q3)
    // ----------------------------------------------------

    // 1. Area of triangle using Heron's formula
    static void q01() {
        System.out.print("Enter three sides of triangle (a, b, c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Semi-perimeter (s): %.2f\n", s);
            System.out.printf("Area of Triangle: %.2f sq units\n", area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }

    // 2. Compound Interest: A = P(1 + r/100)^t, CI = A - P
    static void q02() {
        System.out.print("Enter Principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter Annual Rate of Interest (in %): ");
        double r = sc.nextDouble();
        System.out.print("Enter Time period (in years): ");
        double t = sc.nextDouble();

        double amount = p * Math.pow(1.0 + (r / 100.0), t);
        double ci = amount - p;

        System.out.printf("Total Amount: %.2f\n", amount);
        System.out.printf("Compound Interest: %.2f\n", ci);
    }

    // 3. Distance between two points in 2D plane: sqrt((x2 - x1)^2 + (y2 - y1)^2)
    static void q03() {
        System.out.print("Enter point 1 (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter point 2 (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance between points: %.4f\n", distance);
    }

    // ----------------------------------------------------
    // Unary Operators (Q4 - Q5)
    // ----------------------------------------------------

    // 4. Prefix and Postfix increment store visitor simulation
    static void q04() {
        int visitors = 0;
        System.out.println("Initial Visitors Count: " + visitors);

        // Postfix Increment: uses current value, then increments
        System.out.println("Visitor enters (Postfix count++): " + (visitors++));
        System.out.println("Count after postfix execution: " + visitors);

        // Prefix Increment: increments first, then uses value
        System.out.println("Another visitor enters (Prefix ++count): " + (++visitors));

        // Decrement simulation (visitors leaving)
        System.out.println("Visitor leaves (Postfix count--): " + (visitors--));
        System.out.println("Visitor leaves (Prefix --count): " + (--visitors));
        System.out.println("Final Visitors in store: " + visitors);
    }

    // 5. Output negative value using unary operator (-)
    static void q05() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int negativeValue = -num;
        System.out.println("Negative value using unary minus (-): " + negativeValue);
    }

    // ----------------------------------------------------
    // Assignment Operator (Q6 - Q7)
    // ----------------------------------------------------

    // 6. Reduce number by half using /= until < 1, count steps
    static void q06() {
        System.out.print("Enter a positive number: ");
        double num = sc.nextDouble();
        int steps = 0;

        System.out.println("Initial Value: " + num);
        while (num >= 1.0) {
            num /= 2.0; // Compound assignment operator
            steps++;
            System.out.printf("Step %d: Value = %.4f\n", steps, num);
        }
        System.out.println("Total steps to become less than 1: " + steps);
    }

    // 7. Accumulate rainfall data for 7 days using +=
    static void q07() {
        double totalRainfall = 0.0;
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for Day " + day + " (in mm): ");
            double daily = sc.nextDouble();
            totalRainfall += daily; // Compound assignment operator
        }
        System.out.printf("Total accumulated rainfall for 7 days: %.2f mm\n", totalRainfall);
        System.out.printf("Average daily rainfall: %.2f mm\n", totalRainfall / 7.0);
    }

    // ----------------------------------------------------
    // Relational Operators (Q8 - Q9)
    // ----------------------------------------------------

    // 8. Check valid triangle using angles
    static void q08() {
        System.out.print("Enter three angles: ");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();

        // Relational checks
        boolean positive = (a1 > 0) && (a2 > 0) && (a3 > 0);
        boolean sum180 = ((a1 + a2 + a3) == 180.0);

        if (positive && sum180) {
            System.out.println("The angles form a VALID triangle.");
        } else {
            System.out.println("The angles DO NOT form a valid triangle.");
        }
    }

    // 9. Compare two strings for lexicographic order without compareTo()
    static void q09() {
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        int minLen = Math.min(s1.length(), s2.length());
        int diff = 0;

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                if (c1 < c2) {
                    diff = -1;
                } else {
                    diff = 1;
                }
                break;
            }
        }

        if (diff == 0) {
            if (s1.length() < s2.length()) diff = -1;
            else if (s1.length() > s2.length()) diff = 1;
        }

        if (diff < 0) {
            System.out.println("\"" + s1 + "\" comes BEFORE \"" + s2 + "\" lexicographically.");
        } else if (diff > 0) {
            System.out.println("\"" + s1 + "\" comes AFTER \"" + s2 + "\" lexicographically.");
        } else {
            System.out.println("Both strings are identical.");
        }
    }

    // ----------------------------------------------------
    // Logical Operators (Q10 - Q11)
    // ----------------------------------------------------

    // 10. Leap year within a given range
    static void q10() {
        System.out.print("Enter year to check: ");
        int year = sc.nextInt();
        System.out.print("Enter start year of range: ");
        int startYear = sc.nextInt();
        System.out.print("Enter end year of range: ");
        int endYear = sc.nextInt();

        boolean isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        boolean inRange = (year >= startYear && year <= endYear);

        if (isLeap && inRange) {
            System.out.println(year + " is a Leap Year AND falls within [" + startYear + ", " + endYear + "].");
        } else {
            System.out.println("Condition NOT met (Leap: " + isLeap + ", In Range: " + inRange + ").");
        }
    }

    // 11. Pass criteria: (Theory >= 40% AND Practical >= 50%) OR Overall >= 50%
    static void q11() {
        System.out.print("Enter Theory marks % (0-100): ");
        double theory = sc.nextDouble();
        System.out.print("Enter Practical marks % (0-100): ");
        double practical = sc.nextDouble();

        double overall = (theory + practical) / 2.0;

        boolean condition1 = (theory >= 40.0 && practical >= 50.0);
        boolean condition2 = (overall >= 50.0);

        if (condition1 || condition2) {
            System.out.printf("Result: PASS (Theory: %.1f%%, Practical: %.1f%%, Overall: %.1f%%)\n",
                    theory, practical, overall);
        } else {
            System.out.printf("Result: FAIL (Theory: %.1f%%, Practical: %.1f%%, Overall: %.1f%%)\n",
                    theory, practical, overall);
        }
    }

    // ----------------------------------------------------
    // Ternary Operator (Q12 - Q13)
    // ----------------------------------------------------

    // 12. Smallest of four numbers using nested ternary operator
    static void q12() {
        System.out.print("Enter four numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int min12 = (n1 < n2) ? n1 : n2;
        int min34 = (n3 < n4) ? n3 : n4;
        int smallest = (min12 < min34) ? min12 : min34;

        System.out.println("Smallest number is: " + smallest);
    }

    // 13. Vowel, consonant, digit, or special symbol using ternary operator
    static void q13() {
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);
        char lower = Character.toLowerCase(ch);

        String type = (lower >= '0' && lower <= '9') ? "Digit"
                : (lower >= 'a' && lower <= 'z') ?
                    ((lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                        ? "Vowel" : "Consonant")
                : "Special Symbol";

        System.out.println("'" + ch + "' is classified as: " + type);
    }

    // ----------------------------------------------------
    // Bitwise Operators (Q14 - Q15)
    // ----------------------------------------------------

    // 14. Swap two integers without temp variable using XOR (^)
    static void q14() {
        System.out.print("Enter integer x: ");
        int x = sc.nextInt();
        System.out.print("Enter integer y: ");
        int y = sc.nextInt();

        System.out.println("Before Swap: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After Swap:  x = " + x + ", y = " + y);
    }

    // 15. Count set bits (Brian Kernighan's Algorithm with bitwise AND)
    static void q15() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;

        while (temp != 0) {
            temp = temp & (temp - 1); // Clears the lowest set bit
            count++;
        }

        System.out.println("Binary representation: " + Integer.toBinaryString(n));
        System.out.println("Number of set bits (1s): " + count);
    }

    // ----------------------------------------------------
    // Shift Operators (Q16 - Q17)
    // ----------------------------------------------------

    // 16. Fast multiplication and division by powers of 2 using << and >>
    static void q16() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter power k (for 2^k): ");
        int k = sc.nextInt();

        int multiplied = num << k; // num * 2^k
        int divided = num >> k;    // num / 2^k

        System.out.println(num + " * 2^" + k + " (using <<) = " + multiplied);
        System.out.println(num + " / 2^" + k + " (using >>) = " + divided);
    }

    // 17. Cyclically rotate bits to left by 2 positions
    static void q17() {
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int shift = 2;

        // In 32-bit integer: rotate left = (n << 2) | (n >>> (32 - 2))
        int rotated = (n << shift) | (n >>> (32 - shift));

        System.out.println("Original (Binary): " + String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println("Rotated  (Binary): " + String.format("%32s", Integer.toBinaryString(rotated)).replace(' ', '0'));
        System.out.println("Rotated decimal value: " + rotated);
    }

    // ----------------------------------------------------
    // Loops & Control Statements: for loop (Q18 - Q19)
    // ----------------------------------------------------

    // 18. First 20 terms of Fibonacci sequence using for loop
    static void q18() {
        long t1 = 0, t2 = 1;
        System.out.println("First 20 terms of Fibonacci sequence:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(t1 + (i < 20 ? ", " : "\n"));
            long next = t1 + t2;
            t1 = t2;
            t2 = next;
        }
    }

    // 19. Armstrong numbers between 1 and 1000 using for loop
    static void q19() {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            int temp = i;
            int numDigits = 0;
            while (temp > 0) {
                numDigits++;
                temp /= 10;
            }

            temp = i;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, numDigits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // ----------------------------------------------------
    // do-while loop (Q20 - Q21)
    // ----------------------------------------------------

    // 20. Repeatedly accept password until correct
    static void q20() {
        String correctPass = "Java2026";
        String entered;
        sc.nextLine(); // Clear buffer

        do {
            System.out.print("Enter password: ");
            entered = sc.nextLine();
            if (!entered.equals(correctPass)) {
                System.out.println("Incorrect password! Try again.");
            }
        } while (!entered.equals(correctPass));

        System.out.println("Access Granted! Welcome to the system.");
    }

    // 21. Display all factors of a number using do-while
    static void q21() {
        System.out.print("Enter a positive integer: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0) {
            System.out.println("Factors of 0 are infinite.");
            return;
        }

        System.out.print("Factors of " + num + ": ");
        int i = 1;
        do {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= num);
        System.out.println();
    }

    // ----------------------------------------------------
    // while loop (Q22 - Q23)
    // ----------------------------------------------------

    // 22. Reverse digits of an integer using while loop
    static void q22() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sign = (num < 0) ? -1 : 1;
        int n = Math.abs(num);
        int reversed = 0;

        while (n > 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n /= 10;
        }

        reversed *= sign;
        System.out.println("Reversed number: " + reversed);
    }

    // 23. Palindrome check using while loop
    static void q23() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int original = num;
        int n = Math.abs(num);
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        if (original >= 0 && original == rev) {
            System.out.println(original + " is a PALINDROME.");
        } else {
            System.out.println(original + " is NOT a palindrome.");
        }
    }

    // ----------------------------------------------------
    // for-each loop (Q24 - Q25)
    // ----------------------------------------------------

    // 24. Find max and min in integer array using for-each
    static void q24() {
        System.out.print("Enter number of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }

    // 25. Average marks of students in 2D array using for-each
    static void q25() {
        // Rows: Students, Cols: Subject Marks
        double[][] marks = {
            {85.5, 90.0, 78.0}, // Student 1
            {72.0, 68.5, 75.0}, // Student 2
            {94.0, 89.0, 92.5}  // Student 3
        };

        int studentIdx = 1;
        for (double[] studentRow : marks) {
            double sum = 0.0;
            for (double score : studentRow) {
                sum += score;
            }
            double avg = sum / studentRow.length;
            System.out.printf("Student %d Average Marks: %.2f\n", studentIdx++, avg);
        }
    }

    // ----------------------------------------------------
    // switch-case, continue, break (Q26 - Q30)
    // ----------------------------------------------------

    // 26. Weekday or Weekend using switch-case
    static void q26() {
        System.out.print("Enter day number (1 for Monday ... 7 for Sunday): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Day " + day + " is a Weekday.");
                break;
            case 6:
            case 7:
                System.out.println("Day " + day + " is a Weekend.");
                break;
            default:
                System.out.println("Invalid day! Please enter a value between 1 and 7.");
        }
    }

    // 27. Grade qualitative meaning using switch-case
    static void q27() {
        System.out.print("Enter grade (A, B, C, D, E, F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));

        switch (grade) {
            case 'A': System.out.println("A -> Excellent"); break;
            case 'B': System.out.println("B -> Good"); break;
            case 'C': System.out.println("C -> Satisfactory"); break;
            case 'D': System.out.println("D -> Pass"); break;
            case 'E': System.out.println("E -> Needs Improvement"); break;
            case 'F': System.out.println("F -> Fail"); break;
            default:  System.out.println("Invalid Grade entered.");
        }
    }

    // 28. Print 1 to 50 skipping perfect squares using continue
    static void q28() {
        System.out.println("Numbers from 1 to 50 (Skipping Perfect Squares):");
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) {
                continue; // Skip perfect square
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 29. Generate random numbers (1-100) and stop when divisible by 7 and 13 using break
    static void q29() {
        Random rand = new Random();
        int attempts = 0;

        System.out.println("Generating random numbers between 1 and 100:");
        while (true) {
            attempts++;
            int r = rand.nextInt(100) + 1; // 1 to 100
            System.out.print(r + " ");

            // Divisible by both 7 and 13 (i.e., divisible by 91)
            if (r % 7 == 0 && r % 13 == 0) {
                System.out.println("\nFound number " + r + " (divisible by 7 and 13) after " + attempts + " attempts. Terminating using break.");
                break;
            }
        }
    }

    // 30. Mixed Advanced Program
    static void q30() {
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // 1. Check if power of 4 using bitwise and shift operators:
        // A power of 4 is a power of 2 (n & (n - 1) == 0) and has 1-bit at odd bit positions (mask 0x55555555)
        boolean isPowerOf2 = (n > 0) && ((n & (n - 1)) == 0);
        boolean isPowerOf4 = isPowerOf2 && ((n & 0x55555555) != 0);
        System.out.println(n + " is " + (isPowerOf4 ? "a POWER of 4." : "NOT a power of 4."));

        // 2. Toggle the 3rd bit (index 2: 0-indexed, or bit mask 1 << 2 = 4)
        int toggled = n ^ (1 << 2);
        System.out.println("Original: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("3rd bit toggled: " + toggled + " (Binary: " + Integer.toBinaryString(toggled) + ")");

        // 3. Multiplication table, skipping multiples of 6 (continue), stopping at multiple of 48 (break)
        System.out.println("\nMultiplication table for " + n + ":");
        for (int i = 1; i <= 25; i++) {
            int prod = n * i;

            if (prod % 48 == 0) {
                System.out.println("Reached product " + prod + " (multiple of 48). Stopping loop using break.");
                break;
            }

            if (prod % 6 == 0) {
                System.out.println("Skipping product " + prod + " (multiple of 6) using continue.");
                continue;
            }

            System.out.println(n + " x " + i + " = " + prod);
        }
    }
}