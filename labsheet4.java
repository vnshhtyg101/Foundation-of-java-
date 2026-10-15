import java.util.Scanner;

public class labsheet4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   BCA201P: LAB SHEET-04 (CLASSES & OBJECTS)");
        System.out.println("==================================================");
        System.out.print("Enter Question Number to run (1 - 30): ");
        int choice = sc.nextInt();
        System.out.println("--------------------------------------------------");

        switch (choice) {
            case 1:  testQ01(); break;
            case 2:  testQ02(); break;
            case 3:  testQ03(); break;
            case 4:  testQ04(); break;
            case 5:  testQ05(); break;
            case 6:  testQ06(); break;
            case 7:  testQ07(); break;
            case 8:  testQ08(); break;
            case 9:  testQ09(); break;
            case 10: testQ10(); break;
            case 11: testQ11(); break;
            case 12: testQ12(); break;
            case 13: testQ13(); break;
            case 14: testQ14(); break;
            case 15: testQ15(); break;
            case 16: testQ16(); break;
            case 17: testQ17(); break;
            case 18: testQ18(); break;
            case 19: testQ19(); break;
            case 20: testQ20(); break;
            case 21: testQ21(); break;
            case 22: testQ22(); break;
            case 23: testQ23(); break;
            case 24: testQ24(); break;
            case 25: testQ25(); break;
            case 26: testQ26(); break;
            case 27: testQ27(); break;
            case 28: testQ28(); break;
            case 29: testQ29(); break;
            case 30: testQ30(); break;
            default:
                System.out.println("Invalid Question Number! Please enter between 1 and 30.");
        }
    }

    // ====================================================
    // Basic Level (Q1–Q10)
    // ====================================================

    // Q1: Student Class
    static class Student {
        String name;          // instance field
        int age;              // instance field
        static int count = 0; // class (static) variable

        void setAndDisplay(String sName, int sAge) { // local variables
            name = sName;
            age = sAge;
            count++;
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
            System.out.println("Total Students Count: " + count);
        }
    }
    static void testQ01() {
        Student s1 = new Student();
        s1.setAndDisplay("Kanika", 19);
        Student s2 = new Student();
        s2.setAndDisplay("Rohan", 20);
    }

    // Q2: Rectangle Class
    static class Rectangle {
        double length, breadth;                      // instance fields
        static String shapeName = "Rectangle";       // class variable

        void calculateArea(double l, double b) {    // local variables
            length = l;
            breadth = b;
            double area = length * breadth;         // local variable
            System.out.println("Shape: " + shapeName);
            System.out.println("Length: " + length + ", Breadth: " + breadth);
            System.out.println("Area: " + area);
        }
    }
    static void testQ02() {
        Rectangle r = new Rectangle();
        r.calculateArea(10.5, 4.0);
    }

    // Q3: Circle Class
    static class Circle {
        double radius;                               // instance field
        static final double PI = 3.14159;            // class variable

        void computeMetrics(double r) {             // local variable
            radius = r;
            double area = PI * radius * radius;     // local variable
            double circumference = 2 * PI * radius; // local variable
            System.out.println("Circle Radius: " + radius);
            System.out.printf("Area: %.2f\n", area);
            System.out.printf("Circumference: %.2f\n", circumference);
        }
    }
    static void testQ03() {
        Circle c = new Circle();
        c.computeMetrics(7.0);
    }

    // Q4: Employee Class
    static class Employee {
        int empId;                                   // instance field
        double salary;                               // instance field
        static String companyName = "Tech Solutions";// class variable

        void displayDetails(int id, double sal) {    // local variables
            empId = id;
            salary = sal;
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + empId);
            System.out.println("Salary: " + salary);
        }
    }
    static void testQ04() {
        Employee emp = new Employee();
        emp.displayDetails(101, 65000.0);
    }

    // Q5: Book Class
    static class Book {
        String title, author;                        // instance fields
        double price;                                // instance field
        static String publisher = "Pearson Books";   // class variable

        void setDetails(String t, String a, double p) { // local variables
            title = t;
            author = a;
            price = p;
            System.out.println("Publisher: " + publisher);
            System.out.println("Title: " + title + " | Author: " + author + " | Price: " + price);
        }
    }
    static void testQ05() {
        Book b = new Book();
        b.setDetails("Java The Complete Reference", "Herbert Schildt", 750.0);
    }

    // Q6: Car Class
    static class Car {
        String brand;                                // instance field
        double mileage;                              // instance field
        static int wheels = 4;                       // class variable

        void displayCar(String b, double m) {        // local variables
            brand = b;
            mileage = m;
            System.out.println("Car Brand: " + brand);
            System.out.println("Mileage: " + mileage + " km/l");
            System.out.println("Wheels: " + wheels);
        }
    }
    static void testQ06() {
        Car c = new Car();
        c.displayCar("Hyundai i20", 18.5);
    }

    // Q7: BankAccount Class
    static class BankAccountBasic {
        long accountNumber;                          // instance field
        double balance;                              // instance field
        static String bankName = "State Bank of India"; // class variable

        void deposit(long acc, double depositAmount) { // local variables
            accountNumber = acc;
            balance += depositAmount;
            System.out.println("Bank: " + bankName);
            System.out.println("Account: " + accountNumber);
            System.out.println("Deposited: " + depositAmount + " | Current Balance: " + balance);
        }
    }
    static void testQ07() {
        BankAccountBasic acc = new BankAccountBasic();
        acc.deposit(1234567890L, 5000.0);
    }

    // Q8: Pen Class
    static class Pen {
        String color, type;                          // instance fields
        static String manufacturer = "Reynolds";     // class variable

        void displayPen(String c, String t) {        // local variables
            color = c;
            type = t;
            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Pen Color: " + color + " | Pen Type: " + type);
        }
    }
    static void testQ08() {
        Pen p = new Pen();
        p.displayPen("Blue", "Gel Pen");
    }

    // Q9: Laptop Class
    static class Laptop {
        String brand;                                // instance field
        int ram;                                     // instance field
        static String os = "Windows";                // class variable

        void showLaptop(String b, int r) {           // local variables
            brand = b;
            ram = r;
            System.out.println("Laptop: " + brand + " | RAM: " + ram + "GB | OS: " + os);
        }
    }
    static void testQ09() {
        Laptop l = new Laptop();
        l.showLaptop("Dell Inspiron", 16);
    }

    // Q10: Movie Class
    static class Movie {
        String name, genre;                          // instance fields
        double rating;                               // instance field
        static String industry = "Bollywood";        // class variable

        void showMovie(String n, String g, double r) { // local variables
            name = n;
            genre = g;
            rating = r;
            System.out.println("Industry: " + industry);
            System.out.println("Movie: " + name + " (" + genre + ") | Rating: " + rating + "/10");
        }
    }
    static void testQ10() {
        Movie m = new Movie();
        m.showMovie("3 Idiots", "Comedy/Drama", 8.4);
    }

    // ====================================================
    // Intermediate Level (Q11–Q20)
    // ====================================================

    // Q11: Calculator Class
    static class Calculator {
        static int operationsCount = 0; // class variable

        void add(double x, double y) {
            operationsCount++;
            System.out.println("Addition: " + (x + y));
        }
        void subtract(double x, double y) {
            operationsCount++;
            System.out.println("Subtraction: " + (x - y));
        }
        void multiply(double x, double y) {
            operationsCount++;
            System.out.println("Multiplication: " + (x * y));
        }
        void divide(double x, double y) {
            operationsCount++;
            if (y != 0) System.out.println("Division: " + (x / y));
            else System.out.println("Error: Division by zero");
        }
    }
    static void testQ11() {
        Calculator calc = new Calculator();
        calc.add(20, 10);
        calc.divide(50, 5);
        System.out.println("Total Operations Count: " + Calculator.operationsCount);
    }

    // Q12: StudentMarks Class
    static class StudentMarks {
        double marks1, marks2, marks3;
        static String universityName = "State Technical University";

        void calculateAverage(double m1, double m2, double m3) {
            marks1 = m1; marks2 = m2; marks3 = m3;
            double avg = (marks1 + marks2 + marks3) / 3.0; // local variable
            System.out.println("University: " + universityName);
            System.out.printf("Subject Marks: %.1f, %.1f, %.1f | Average: %.2f\n", marks1, marks2, marks3, avg);
        }
    }
    static void testQ12() {
        StudentMarks sm = new StudentMarks();
        sm.calculateAverage(78.5, 82.0, 91.5);
    }

    // Q13: Temperature Class
    static class Temperature {
        double celsius;
        static String scale = "Celsius";

        void convert(double c) {
            celsius = c;
            double fahrenheit = (celsius * 9.0 / 5.0) + 32; // local variable
            double kelvin = celsius + 273.15;               // local variable
            System.out.println("Original Scale: " + scale + " (" + celsius + "°C)");
            System.out.println("Fahrenheit: " + fahrenheit + "°F");
            System.out.println("Kelvin: " + kelvin + "K");
        }
    }
    static void testQ13() {
        Temperature t = new Temperature();
        t.convert(37.0);
    }

    // Q14: Person Class
    static class Person {
        String name;
        int age;
        static String country = "India";

        void checkVoting(String pName, int pAge) {
            name = pName;
            age = pAge;
            boolean isEligible = age >= 18; // local variable
            System.out.println("Name: " + name + " | Country: " + country + " | Age: " + age);
            if (isEligible) System.out.println("Status: Eligible to Vote.");
            else System.out.println("Status: NOT eligible to vote.");
        }
    }
    static void testQ14() {
        Person p = new Person();
        p.checkVoting("Aman", 17);
    }

    // Q15: SimpleInterest Class
    static class SimpleInterest {
        double principal, rate, time;
        static String bank = "Punjab National Bank";

        void calculateSI(double p, double r, double t) {
            principal = p; rate = r; time = t;
            double si = (principal * rate * time) / 100.0; // local variable
            System.out.println("Bank: " + bank);
            System.out.println("Principal: " + principal + ", Rate: " + rate + "%, Time: " + time + " yrs");
            System.out.println("Simple Interest: " + si);
        }
    }
    static void testQ15() {
        SimpleInterest si = new SimpleInterest();
        si.calculateSI(25000, 6.5, 3);
    }

    // Q16: Triangle Class
    static class Triangle {
        double a, b, c;
        static String type = "Scalene/Isosceles/Equilateral";

        void checkTriangle(double s1, double s2, double s3) {
            a = s1; b = s2; c = s3;
            boolean isValid = (a + b > c) && (a + c > b) && (b + c > a); // local variable
            System.out.println("Sides: " + a + ", " + b + ", " + c);
            if (!isValid) {
                System.out.println("Invalid Triangle.");
                return;
            }
            String classification; // local variable
            if (a == b && b == c) classification = "Equilateral Triangle";
            else if (a == b || b == c || a == c) classification = "Isosceles Triangle";
            else classification = "Scalene Triangle";
            System.out.println("Result: " + classification);
        }
    }
    static void testQ16() {
        Triangle tri = new Triangle();
        tri.checkTriangle(5, 5, 8);
    }

    // Q17: StudentGrade Class
    static class StudentGrade {
        String name;
        double marks;
        static double passingMarks = 40.0;

        void assignGrade(String sName, double sMarks) {
            name = sName;
            marks = sMarks;
            char grade; // local variable
            if (marks >= 85) grade = 'A';
            else if (marks >= 70) grade = 'B';
            else if (marks >= 55) grade = 'C';
            else if (marks >= passingMarks) grade = 'D';
            else grade = 'F';

            System.out.println("Student: " + name + " | Marks: " + marks);
            System.out.println("Result Grade: " + grade + (grade == 'F' ? " (FAIL)" : " (PASS)"));
        }
    }
    static void testQ17() {
        StudentGrade sg = new StudentGrade();
        sg.assignGrade("Simran", 76.5);
    }

    // Q18: ElectricBill Class
    static class ElectricBill {
        int units;
        static double fixedCharge = 50.0;

        void calculateBill(int u) {
            units = u;
            double unitCost; // local variable
            if (units <= 100) unitCost = units * 3.5;
            else if (units <= 300) unitCost = (100 * 3.5) + ((units - 100) * 5.0);
            else unitCost = (100 * 3.5) + (200 * 5.0) + ((units - 300) * 7.5);

            double totalBill = fixedCharge + unitCost; // local variable
            System.out.println("Units Consumed: " + units);
            System.out.println("Fixed Charge: ₹" + fixedCharge);
            System.out.println("Total Electricity Bill: ₹" + totalBill);
        }
    }
    static void testQ18() {
        ElectricBill eb = new ElectricBill();
        eb.calculateBill(250);
    }

    // Q19: Product Class
    static class Product {
        int id;
        String name;
        double price;
        static double discountRate = 10.0; // 10% discount

        void calculateFinalPrice(int pId, String pName, double pPrice) {
            id = pId; name = pName; price = pPrice;
            double discountAmount = (price * discountRate) / 100.0; // local variable
            double finalPrice = price - discountAmount;            // local variable
            System.out.println("Product: " + name + " (ID: " + id + ")");
            System.out.println("Original Price: ₹" + price + " | Discount: " + discountRate + "%");
            System.out.println("Final Payable Price: ₹" + finalPrice);
        }
    }
    static void testQ19() {
        Product p = new Product();
        p.calculateFinalPrice(1001, "Wireless Headphones", 2499.0);
    }

    // Q20: BankAccount with Balance Check
    static class BankAccountSecure {
        double balance = 10000.0;
        static String bankCode = "HDFC0001234";

        void withdraw(double amount) {
            double reqAmount = amount; // local variable
            System.out.println("Bank IFSC: " + bankCode);
            System.out.println("Current Balance: ₹" + balance + " | Requested Withdrawal: ₹" + reqAmount);
            if (reqAmount <= balance) {
                balance -= reqAmount;
                System.out.println("Withdrawal Successful! Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Transaction Failed: Insufficient Balance!");
            }
        }
    }
    static void testQ20() {
        BankAccountSecure acc = new BankAccountSecure();
        acc.withdraw(12000);
        acc.withdraw(4000);
    }

    // ====================================================
    // Advanced Level (Q21–Q30)
    // ====================================================

    // Q21: Palindrome Class
    static class Palindrome {
        static int countChecks = 0;

        void check(int num) {
            countChecks++;
            int original = num; // local variable
            int reversed = 0;   // local variable
            int temp = Math.abs(num);
            while (temp > 0) {
                reversed = (reversed * 10) + (temp % 10);
                temp /= 10;
            }
            if (num < 0) reversed = -reversed;

            System.out.println("Check #" + countChecks + " for number: " + original);
            if (original == reversed) System.out.println(original + " is a Palindrome.");
            else System.out.println(original + " is NOT a Palindrome.");
        }
    }
    static void testQ21() {
        Palindrome p = new Palindrome();
        p.check(12321);
        p.check(456);
    }

    // Q22: Armstrong Class
    static class Armstrong {
        static int totalChecks = 0;

        void check(int num) {
            totalChecks++;
            int original = num; // local variable
            int temp = num;
            int digits = 0;     // local variable
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = num;
            int sum = 0;        // local variable
            while (temp > 0) {
                int rem = temp % 10;
                sum += (int) Math.pow(rem, digits);
                temp /= 10;
            }

            System.out.println("Total checks conducted: " + totalChecks);
            if (sum == original) System.out.println(original + " is an Armstrong number.");
            else System.out.println(original + " is NOT an Armstrong number.");
        }
    }
    static void testQ22() {
        Armstrong a = new Armstrong();
        a.check(153);
        a.check(120);
    }

    // Q23: PrimeChecker Class
    static class PrimeChecker {
        static int totalPrimeChecks = 0;

        void checkPrime(int n) {
            totalPrimeChecks++;
            boolean isPrime = true; // local variable
            if (n <= 1) isPrime = false;
            else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            System.out.println("Total Prime Checks: " + totalPrimeChecks);
            System.out.println(n + (isPrime ? " is a PRIME number." : " is NOT a prime number."));
        }
    }
    static void testQ23() {
        PrimeChecker pc = new PrimeChecker();
        pc.checkPrime(29);
        pc.checkPrime(42);
    }

    // Q24: Fibonacci Class
    static class Fibonacci {
        static int seriesCount = 0;

        void printSeries(int n) {
            seriesCount++;
            System.out.println("Series Generation #" + seriesCount + " (Terms: " + n + "):");
            long t1 = 0, t2 = 1; // local variables
            for (int i = 1; i <= n; i++) {
                System.out.print(t1 + (i < n ? ", " : "\n"));
                long next = t1 + t2;
                t1 = t2;
                t2 = next;
            }
        }
    }
    static void testQ24() {
        Fibonacci f = new Fibonacci();
        f.printSeries(8);
    }

    // Q25: Factorial Class
    static class Factorial {
        static int totalCalls = 0;

        void compute(int n) {
            totalCalls++;
            long fact = 1; // local variable
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial computation call #" + totalCalls);
            System.out.println(n + "! = " + fact);
        }
    }
    static void testQ25() {
        Factorial fact = new Factorial();
        fact.compute(5);
        fact.compute(7);
    }

    // Q26: Matrix Class
    static class Matrix {
        int[][] data = new int[2][2];
        static String matrixType = "2x2 Square Matrix";

        Matrix(int a, int b, int c, int d) {
            data[0][0] = a; data[0][1] = b;
            data[1][0] = c; data[1][1] = d;
        }

        static void addAndSubtract(Matrix m1, Matrix m2) {
            System.out.println("Type: " + matrixType);
            int[][] sum = new int[2][2];  // local variable
            int[][] diff = new int[2][2]; // local variable

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sum[i][j] = m1.data[i][j] + m2.data[i][j];
                    diff[i][j] = m1.data[i][j] - m2.data[i][j];
                }
            }

            System.out.println("Addition Result:");
            System.out.println(sum[0][0] + "\t" + sum[0][1] + "\n" + sum[1][0] + "\t" + sum[1][1]);
            System.out.println("Subtraction Result:");
            System.out.println(diff[0][0] + "\t" + diff[0][1] + "\n" + diff[1][0] + "\t" + diff[1][1]);
        }
    }
    static void testQ26() {
        Matrix m1 = new Matrix(5, 8, 3, 4);
        Matrix m2 = new Matrix(1, 2, 2, 1);
        Matrix.addAndSubtract(m1, m2);
    }

    // Q27: StringReverse Class
    static class StringReverse {
        static int totalReversals = 0;

        void reverse(String input) {
            totalReversals++;
            String rev = ""; // local variable
            for (int i = input.length() - 1; i >= 0; i--) {
                rev += input.charAt(i);
            }
            System.out.println("Reversal Operation #" + totalReversals);
            System.out.println("Original: " + input + " | Reversed: " + rev);
        }
    }
    static void testQ27() {
        StringReverse sr = new StringReverse();
        sr.reverse("JavaDevelopment");
    }

    // Q28: WordCounter Class
    static class WordCounter {
        static String language = "English";

        void countWords(String sentence) {
            String trimmed = sentence.trim(); // local variable
            int count = 0;                    // local variable
            if (!trimmed.isEmpty()) {
                String[] words = trimmed.split("\\s+"); // local variable
                count = words.length;
            }
            System.out.println("Language: " + language);
            System.out.println("Sentence: \"" + sentence + "\"");
            System.out.println("Total Words: " + count);
        }
    }
    static void testQ28() {
        WordCounter wc = new WordCounter();
        wc.countWords("Welcome to Java Object Oriented Programming");
    }

    // Q29: Employee Salary Comparison
    static class EmployeeSalaryComp {
        String name;
        double salary;
        static String organization = "Global Tech Corp";

        EmployeeSalaryComp(String n, double s) {
            name = n;
            salary = s;
        }

        static void compare(EmployeeSalaryComp e1, EmployeeSalaryComp e2) {
            System.out.println("Organization: " + organization);
            System.out.println("Comparing " + e1.name + " (₹" + e1.salary + ") and " + e2.name + " (₹" + e2.salary + "):");
            if (e1.salary > e2.salary) {
                double diff = e1.salary - e2.salary; // local variable
                System.out.println(e1.name + " earns ₹" + diff + " more than " + e2.name);
            } else if (e2.salary > e1.salary) {
                double diff = e2.salary - e1.salary; // local variable
                System.out.println(e2.name + " earns ₹" + diff + " more than " + e1.name);
            } else {
                System.out.println("Both employees have equal salary.");
            }
        }
    }
    static void testQ29() {
        EmployeeSalaryComp e1 = new EmployeeSalaryComp("Aarav", 85000);
        EmployeeSalaryComp e2 = new EmployeeSalaryComp("Neha", 92000);
        EmployeeSalaryComp.compare(e1, e2);
    }

    // Q30: Library Class
    static class Library {
        int booksAvailable;
        static String libraryName = "Central University Library";

        Library(int initialBooks) {
            booksAvailable = initialBooks;
        }

        void issueBook(int count) {
            int req = count; // local variable
            System.out.println("--- " + libraryName + " ---");
            if (req <= booksAvailable) {
                booksAvailable -= req;
                System.out.println("Issued " + req + " book(s). Available now: " + booksAvailable);
            } else {
                System.out.println("Issue failed: Not enough books available!");
            }
        }

        void returnBook(int count) {
            int ret = count; // local variable
            booksAvailable += ret;
            System.out.println("Returned " + ret + " book(s). Available now: " + booksAvailable);
        }
    }
    static void testQ30() {
        Library lib = new Library(50);
        lib.issueBook(5);
        lib.returnBook(2);
    }
}