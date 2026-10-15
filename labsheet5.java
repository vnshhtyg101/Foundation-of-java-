import java.util.Scanner;

public class labsheet5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   BCA201P: LAB SHEET-05 (OOP CONCEPTS)");
        System.out.println("==================================================");
        System.out.print("Enter Question Number to run (1 - 20): ");
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
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 20.");
        }
    }

    // ====================================================
    // Encapsulation (Q1 - Q3)
    // ====================================================

    // Q1: Student Encapsulation
    static class StudentQ1 {
        private String name;
        private int rollNo;
        private double marks;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getRollNo() { return rollNo; }
        public void setRollNo(int rollNo) { this.rollNo = rollNo; }

        public double getMarks() { return marks; }
        public void setMarks(double marks) { this.marks = marks; }

        public void displayDetails() {
            System.out.println("--- Student Details ---");
            System.out.println("Name    : " + getName());
            System.out.println("Roll No : " + getRollNo());
            System.out.println("Marks   : " + getMarks());
        }
    }
    static void testQ01() {
        StudentQ1 s = new StudentQ1();
        s.setName("Kanika Sharma");
        s.setRollNo(101);
        s.setMarks(88.5);
        s.displayDetails();
    }

    // Q2: Bank Account with Validation
    static class BankAccountQ2 {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public String getAccountNumber() { return accountNumber; }
        public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

        public String getAccountHolder() { return accountHolder; }
        public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }

        public double getBalance() { return balance; }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.printf("Successfully deposited: ₹%.2f | Current Balance: ₹%.2f\n", amount, balance);
            } else {
                System.out.println("Deposit Error: Deposit amount must be greater than 0.");
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal Error: Amount must be greater than 0.");
            } else if (amount > balance) {
                System.out.printf("Withdrawal Error: Insufficient funds. Requested: ₹%.2f, Available: ₹%.2f\n", amount, balance);
            } else {
                balance -= amount;
                System.out.printf("Successfully withdrawn: ₹%.2f | Remaining Balance: ₹%.2f\n", amount, balance);
            }
        }
    }
    static void testQ02() {
        BankAccountQ2 acc = new BankAccountQ2();
        acc.setAccountNumber("SB-987654");
        acc.setAccountHolder("Amit Verma");

        System.out.println("Account: " + acc.getAccountNumber() + " | Holder: " + acc.getAccountHolder());
        acc.deposit(5000.0);
        acc.deposit(-200.0); // Invalid deposit
        acc.withdraw(2000.0);
        acc.withdraw(6000.0); // Invalid withdrawal (overdraft)
    }

    // Q3: Employee Salary Encapsulation with Validation inside Setter
    static class EmployeeQ3 {
        private int employeeId;
        private String employeeName;
        private double salary;

        public int getEmployeeId() { return employeeId; }
        public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

        public String getEmployeeName() { return employeeName; }
        public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

        public double getSalary() { return salary; }
        public void setSalary(double salary) {
            if (salary < 0) {
                System.out.println("Validation Error: Salary cannot be negative (Input: " + salary + ").");
            } else if (salary > 1000000) {
                System.out.println("Validation Error: Salary cannot exceed ₹10,00,000 (Input: " + salary + ").");
            } else {
                this.salary = salary;
                System.out.println("Salary updated successfully to: ₹" + salary);
            }
        }

        public void displayEmployee() {
            System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Salary: ₹" + salary);
        }
    }
    static void testQ03() {
        EmployeeQ3 emp = new EmployeeQ3();
        emp.setEmployeeId(201);
        emp.setEmployeeName("Rahul Mehta");

        System.out.println("--- Testing Invalid Salaries ---");
        emp.setSalary(-5000);       // Negative check
        emp.setSalary(1500000);     // Above 1M check

        System.out.println("--- Testing Valid Salary ---");
        emp.setSalary(450000);      // Valid check
        emp.displayEmployee();
    }

    // ====================================================
    // Single Inheritance (Q4 - Q6)
    // ====================================================

    // Q4: Animal -> Dog
    static class AnimalQ4 {
        void eat() { System.out.println("Animal is eating food."); }
        void sleep() { System.out.println("Animal is sleeping."); }
    }
    static class DogQ4 extends AnimalQ4 {
        void bark() { System.out.println("Dog is barking: Woof! Woof!"); }
    }
    static void testQ04() {
        DogQ4 dog = new DogQ4();
        dog.eat();
        dog.sleep();
        dog.bark();
    }

    // Q5: Person -> Student
    static class PersonQ5 {
        String name;
        int age;

        PersonQ5(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayPerson() {
            System.out.println("Person Name: " + name + ", Age: " + age);
        }
    }
    static class StudentQ5 extends PersonQ5 {
        int rollNo;
        String course;

        StudentQ5(String name, int age, int rollNo, String course) {
            super(name, age);
            this.rollNo = rollNo;
            this.course = course;
        }

        void displayStudent() {
            displayPerson();
            System.out.println("Roll No: " + rollNo + ", Course: " + course);
        }
    }
    static void testQ05() {
        StudentQ5 s = new StudentQ5("Pooja Nair", 20, 304, "BCA");
        s.displayStudent();
    }

    // Q6: Encapsulated Employee -> Manager
    static class EmployeeQ6 {
        private String name;
        private double salary;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }
    }
    static class ManagerQ6 extends EmployeeQ6 {
        private String department;

        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        public void displayManager() {
            System.out.println("Manager Name : " + getName());
            System.out.println("Department   : " + getDepartment());
            System.out.println("Salary       : ₹" + getSalary());
        }
    }
    static void testQ06() {
        ManagerQ6 mgr = new ManagerQ6();
        mgr.setName("Suresh Raina");
        mgr.setSalary(85000.0);
        mgr.setDepartment("Information Technology");
        mgr.displayManager();
    }

    // ====================================================
    // Multilevel Inheritance (Q7 - Q9)
    // ====================================================

    // Q7: Animal -> Dog -> Puppy
    static class AnimalQ7 {
        void eat() { System.out.println("Animal: eating food."); }
    }
    static class DogQ7 extends AnimalQ7 {
        void bark() { System.out.println("Dog: barking."); }
    }
    static class PuppyQ7 extends DogQ7 {
        void play() { System.out.println("Puppy: playing with a ball."); }
    }
    static void testQ07() {
        PuppyQ7 p = new PuppyQ7();
        p.eat();
        p.bark();
        p.play();
    }

    // Q8: Person -> Employee -> Manager
    static class PersonQ8 {
        String name;
        PersonQ8(String name) { this.name = name; }
        void displayName() { System.out.println("Name (from Person): " + name); }
    }
    static class EmployeeQ8 extends PersonQ8 {
        int employeeId;
        EmployeeQ8(String name, int employeeId) {
            super(name);
            this.employeeId = employeeId;
        }
        void displayEmployee() {
            displayName();
            System.out.println("Employee ID (from Employee): " + employeeId);
        }
    }
    static class ManagerQ8 extends EmployeeQ8 {
        String department;
        ManagerQ8(String name, int employeeId, String department) {
            super(name, employeeId);
            this.department = department;
        }
        void displayManager() {
            displayEmployee();
            System.out.println("Department (from Manager): " + department);
        }
    }
    static void testQ08() {
        ManagerQ8 m = new ManagerQ8("Vikas Gupta", 501, "Finance");
        m.displayManager();
    }

    // Q9: Vehicle -> Car -> ElectricCar
    static class VehicleQ9 {
        void start() { System.out.println("Vehicle started."); }
        void stop() { System.out.println("Vehicle stopped."); }
    }
    static class CarQ9 extends VehicleQ9 {
        void drive() { System.out.println("Car is being driven on the road."); }
    }
    static class ElectricCarQ9 extends CarQ9 {
        void chargeBattery() { System.out.println("ElectricCar battery charging... 100%"); }
    }
    static void testQ09() {
        ElectricCarQ9 tesla = new ElectricCarQ9();
        tesla.start();
        tesla.drive();
        tesla.chargeBattery();
        tesla.stop();
    }

    // ====================================================
    // Hierarchical Inheritance (Q10 - Q12)
    // ====================================================

    // Q10: Animal -> Dog and Cat
    static class AnimalQ10 {
        void eat() { System.out.println("Animal eats nourishment."); }
    }
    static class DogQ10 extends AnimalQ10 {
        void bark() { System.out.println("Dog barks."); }
    }
    static class CatQ10 extends AnimalQ10 {
        void meow() { System.out.println("Cat meows."); }
    }
    static void testQ10() {
        DogQ10 d = new DogQ10();
        CatQ10 c = new CatQ10();
        System.out.print("Dog behavior: "); d.eat(); d.bark();
        System.out.print("Cat behavior: "); c.eat(); c.meow();
    }

    // Q11: Person -> Student and Teacher
    static class PersonQ11 {
        String name;
        PersonQ11(String name) { this.name = name; }
        void displayName() { System.out.println("Name: " + name); }
    }
    static class StudentQ11 extends PersonQ11 {
        String course;
        StudentQ11(String name, String course) {
            super(name);
            this.course = course;
        }
        void study() {
            displayName();
            System.out.println("Role: Student | Studying Course: " + course);
        }
    }
    static class TeacherQ11 extends PersonQ11 {
        String subject;
        TeacherQ11(String name, String subject) {
            super(name);
            this.subject = subject;
        }
        void teach() {
            displayName();
            System.out.println("Role: Teacher | Teaching Subject: " + subject);
        }
    }
    static void testQ11() {
        StudentQ11 s = new StudentQ11("Rohit", "Computer Science");
        TeacherQ11 t = new TeacherQ11("Dr. Sharma", "Data Structures");
        s.study();
        System.out.println("--------------------");
        t.teach();
    }

    // Q12: Employee -> Developer and Manager
    static class EmployeeQ12 {
        String employeeName;
        int employeeId;
        EmployeeQ12(String name, int id) {
            this.employeeName = name;
            this.employeeId = id;
        }
        void displayEmployee() {
            System.out.println("ID: " + employeeId + " | Name: " + employeeName);
        }
    }
    static class DeveloperQ12 extends EmployeeQ12 {
        String programmingLanguage;
        DeveloperQ12(String name, int id, String lang) {
            super(name, id);
            this.programmingLanguage = lang;
        }
        void writeCode() {
            displayEmployee(); // Inherited member
            System.out.println("Child-specific: Writing code in " + programmingLanguage);
        }
    }
    static class ManagerQ12 extends EmployeeQ12 {
        String department;
        ManagerQ12(String name, int id, String dept) {
            super(name, id);
            this.department = dept;
        }
        void conductMeeting() {
            displayEmployee(); // Inherited member
            System.out.println("Child-specific: Conducting sprint meeting for " + department + " department");
        }
    }
    static void testQ12() {
        DeveloperQ12 dev = new DeveloperQ12("Aarav", 101, "Java");
        ManagerQ12 mgr = new ManagerQ12("Priya", 102, "Engineering");
        dev.writeCode();
        System.out.println("--------------------");
        mgr.conductMeeting();
    }

    // ====================================================
    // Method Overriding (Q13 - Q15)
    // ====================================================

    // Q13: Animal Sound Overriding
    static class AnimalQ13 {
        void makeSound() { System.out.println("Generic animal sound"); }
    }
    static class DogQ13 extends AnimalQ13 {
        @Override
        void makeSound() { System.out.println("Dog sound: Woof Woof!"); }
    }
    static class CatQ13 extends AnimalQ13 {
        @Override
        void makeSound() { System.out.println("Cat sound: Meow Meow!"); }
    }
    static void testQ13() {
        AnimalQ13 d = new DogQ13();
        AnimalQ13 c = new CatQ13();
        d.makeSound();
        c.makeSound();
    }

    // Q14: Employee Salary Calculation Overriding
    static class EmployeeQ14 {
        double baseSalary;
        EmployeeQ14(double base) { this.baseSalary = base; }

        double calculateSalary() {
            return baseSalary;
        }
    }
    static class ManagerQ14 extends EmployeeQ14 {
        double bonus;
        ManagerQ14(double base, double bonus) {
            super(base);
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return baseSalary + bonus; // Manager gets base + bonus
        }
    }
    static void testQ14() {
        EmployeeQ14 emp = new EmployeeQ14(40000);
        EmployeeQ14 mgr = new ManagerQ14(40000, 15000);

        System.out.println("Standard Employee Salary: ₹" + emp.calculateSalary());
        System.out.println("Manager Salary (Overridden): ₹" + mgr.calculateSalary());
    }

    // Q15: Shape Area Overriding
    static class ShapeQ15 {
        void calculateArea() { System.out.println("Area not defined for generic shape."); }
    }
    static class CircleQ15 extends ShapeQ15 {
        double radius;
        CircleQ15(double r) { this.radius = r; }

        @Override
        void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.printf("Circle (r=%.2f) Area: %.2f sq units\n", radius, area);
        }
    }
    static class RectangleQ15 extends ShapeQ15 {
        double length, breadth;
        RectangleQ15(double l, double b) { this.length = l; this.breadth = b; }

        @Override
        void calculateArea() {
            double area = length * breadth;
            System.out.printf("Rectangle (%.2f x %.2f) Area: %.2f sq units\n", length, breadth, area);
        }
    }
    static void testQ15() {
        ShapeQ15 c = new CircleQ15(5);
        ShapeQ15 r = new RectangleQ15(4, 6);
        c.calculateArea();
        r.calculateArea();
    }

    // ====================================================
    // Multiple Inheritance using Interfaces (Q16 - Q17)
    // ====================================================

    // Q16: Camera + MusicPlayer -> Smartphone
    interface CameraQ16 {
        void takePhoto();
    }
    interface MusicPlayerQ16 {
        void playMusic();
    }
    static class SmartphoneQ16 implements CameraQ16, MusicPlayerQ16 {
        @Override
        public void takePhoto() {
            System.out.println("Smartphone: Captured photo at 108MP resolution.");
        }
        @Override
        public void playMusic() {
            System.out.println("Smartphone: Playing music on stereo speakers.");
        }
    }
    static void testQ16() {
        SmartphoneQ16 phone = new SmartphoneQ16();
        phone.takePhoto();
        phone.playMusic();
    }

    // Q17: Printer + Scanner -> MultiFunctionMachine with Encapsulation
    interface PrinterQ17 {
        void print();
    }
    interface ScannerQ17 {
        void scan();
    }
    static class MultiFunctionMachineQ17 implements PrinterQ17, ScannerQ17 {
        private String machineName;
        private int machineId;

        public String getMachineName() { return machineName; }
        public void setMachineName(String machineName) { this.machineName = machineName; }

        public int getMachineId() { return machineId; }
        public void setMachineId(int machineId) { this.machineId = machineId; }

        @Override
        public void print() {
            System.out.println("Machine " + machineName + " (ID: " + machineId + "): Printing document in high resolution...");
        }

        @Override
        public void scan() {
            System.out.println("Machine " + machineName + " (ID: " + machineId + "): Scanning optical image to PDF...");
        }
    }
    static void testQ17() {
        MultiFunctionMachineQ17 mfm = new MultiFunctionMachineQ17();
        mfm.setMachineName("HP LaserJet Pro");
        mfm.setMachineId(8801);
        mfm.print();
        mfm.scan();
    }

    // ====================================================
    // Hybrid Inheritance (Q18 - Q19)
    // ====================================================

    // Q18: Vehicle -> Car -> ElectricCar + Electric
    static class VehicleQ18 {
        void start() { System.out.println("Vehicle ignition on."); }
    }
    static class CarQ18 extends VehicleQ18 {
        void drive() { System.out.println("Car is moving on roads."); }
    }
    interface ElectricQ18 {
        void chargeBattery();
    }
    static class ElectricCarQ18 extends CarQ18 implements ElectricQ18 {
        @Override
        public void chargeBattery() {
            System.out.println("ElectricCar: Battery charging via Fast DC Charger.");
        }
    }
    static void testQ18() {
        ElectricCarQ18 nexonEV = new ElectricCarQ18();
        nexonEV.start();
        nexonEV.drive();
        nexonEV.chargeBattery();
    }

    // Q19: Employee -> Developer + Programmer + Researcher
    static class EmployeeQ19 {
        private String name;
        private int employeeId;

        public EmployeeQ19(String name, int employeeId) {
            this.name = name;
            this.employeeId = employeeId;
        }

        public String getName() { return name; }
        public int getEmployeeId() { return employeeId; }

        public void displayEmployee() {
            System.out.println("Employee ID: " + employeeId + " | Name: " + name);
        }
    }
    interface ProgrammerQ19 {
        void writeCode();
    }
    interface ResearcherQ19 {
        void conductResearch();
    }
    static class DeveloperQ19 extends EmployeeQ19 implements ProgrammerQ19, ResearcherQ19 {
        public DeveloperQ19(String name, int employeeId) {
            super(name, employeeId);
        }

        @Override
        public void writeCode() {
            System.out.println("Developer " + getName() + " is writing Java microservices code.");
        }

        @Override
        public void conductResearch() {
            System.out.println("Developer " + getName() + " is researching AI/ML algorithms.");
        }
    }
    static void testQ19() {
        DeveloperQ19 dev = new DeveloperQ19("Dr. Ritesh", 401);
        dev.displayEmployee();
        dev.writeCode();
        dev.conductResearch();
    }

    // ====================================================
    // Integrated OOP System (Q20)
    // ====================================================

    interface Researcher {
        void conductResearch();
    }

    static class UniversityEmployee {
        private int employeeId;
        private String employeeName;
        private double salary;

        public UniversityEmployee(int id, String name, double salary) {
            this.employeeId = id;
            this.employeeName = name;
            this.salary = salary;
        }

        public int getEmployeeId() { return employeeId; }
        public String getEmployeeName() { return employeeName; }
        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }

        public double calculateSalary() {
            return this.salary;
        }

        public void displayDetails() {
            System.out.println("ID: " + employeeId + " | Name: " + employeeName + " | Base Salary: ₹" + salary);
        }
    }

    static class Teacher extends UniversityEmployee implements Researcher {
        private String subject;

        public Teacher(int id, String name, double salary, String subject) {
            super(id, name, salary);
            this.subject = subject;
        }

        public void teach() {
            System.out.println(getEmployeeName() + " is delivering a lecture on " + subject + ".");
        }

        @Override
        public void conductResearch() {
            System.out.println(getEmployeeName() + " is conducting research in the field of " + subject + ".");
        }

        @Override
        public double calculateSalary() {
            // Base salary + 15% academic allowance
            return getSalary() + (getSalary() * 0.15);
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Permanent Teacher | Subject: " + subject + 
                               " | Net Salary (with allowance): ₹" + calculateSalary());
        }
    }

    static class VisitingTeacher extends Teacher {
        private int hoursWorked;
        private static final double HOURLY_RATE = 1200.0;

        public VisitingTeacher(int id, String name, double baseSalary, String subject, int hoursWorked) {
            super(id, name, baseSalary, subject);
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            // Paid purely on hourly basis for lectures
            return hoursWorked * HOURLY_RATE;
        }

        @Override
        public void displayDetails() {
            System.out.println("ID: " + getEmployeeId() + " | Name: " + getEmployeeName() + 
                               " | Role: Visiting Teacher | Hours: " + hoursWorked + 
                               " | Calculated Pay: ₹" + calculateSalary());
        }
    }

    static class Admin extends UniversityEmployee {
        private String department;

        public Admin(int id, String name, double salary, String department) {
            super(id, name, salary);
            this.department = department;
        }

        public void manageDepartment() {
            System.out.println(getEmployeeName() + " is managing operations for the " + department + " department.");
        }

        @Override
        public double calculateSalary() {
            // Base salary + fixed admin bonus
            return getSalary() + 5000.0;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Admin Officer | Department: " + department + 
                               " | Net Salary: ₹" + calculateSalary());
        }
    }

    static void testQ20() {
        System.out.println("=== UNIVERSITY EMPLOYEE SYSTEM DEMO ===");
        Teacher t1 = new Teacher(101, "Dr. Sunita Rao", 65000, "Computer Networks");
        VisitingTeacher vt1 = new VisitingTeacher(102, "Prof. Manoj Kumar", 0, "Cloud Computing", 35);
        Admin a1 = new Admin(103, "Rajesh Chawla", 45000, "Admissions & Exams");

        System.out.println("\n[1] Teacher Execution:");
        t1.displayDetails();
        t1.teach();
        t1.conductResearch();

        System.out.println("\n[2] Visiting Teacher Execution:");
        vt1.displayDetails();
        vt1.teach();

        System.out.println("\n[3] Admin Execution:");
        a1.displayDetails();
        a1.manageDepartment();
    }
}