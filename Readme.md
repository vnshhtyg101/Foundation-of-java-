# BCA201P: Foundations of Java Development

Welcome to the **BCA201P – Foundations of Java Development** repository. This repository contains complete Java lab solutions, structured implementations, and object-oriented designs aligned with the **BCA III Semester** curriculum.

---

## 📌 Repository Overview

This repository includes progressive lab assignments starting from foundational syntax and operator mechanics to advanced Object-Oriented Programming (OOP) paradigms like encapsulation, multilevel/hybrid inheritance, and interface implementation.

* **Course Code:** BCA201P
* **Course Title:** Foundations of Java Development
* **Semester:** BCA III Semester
* **Language:** Java (JDK 19+ / 21+)
* **IDE/Editor:** Visual Studio Code / IntelliJ IDEA

---

## 📂 Lab Sheets Directory

| Lab Sheet | Core Focus / Module | Key Concepts Explored | Status |
| --- | --- | --- | --- |
| **Lab Sheet-01** | Foundations & Operators (Q1–Q30) | Variables, Arithmetic, Relational, Logical, Conditionals, Type Casting | Completed |
| **Lab Sheet-02** | Operators, Bitwise & Control Loops (Q1–Q30) | Unary, Shift, Bitwise, Loops (`for`, `while`, `do-while`, `for-each`), Flow Control (`break`, `continue`) | Completed |
| **Lab Sheet-03** | Array Data Structures (Q1–Q30) | 1-D Arrays, 2-D Matrices, 3-D Arrays, Jagged Arrays, Algorithmic Operations | Completed |
| **Lab Sheet-04** | Classes, Objects & Scope (Q1–Q30) | Class Variables (`static`), Instance Variables, Local Scope, Encapsulation, State Tracking | Completed |
| **Lab Sheet-05** | Advanced OOP & Interfaces (Q1–Q20) | Encapsulation, Inheritance Hierarchies, Dynamic Method Overriding, Interfaces, Hybrid Systems | Completed |

---

## 📑 Lab Sheets Detailed Breakdown

### 🔹 Lab Sheet 01: Core Basics & Decision Control

* Basic input/output using `java.util.Scanner`
* All fundamental arithmetic and relational operations
* Explicit and implicit type conversions (Float $\to$ Int, ASCII conversions)
* Multi-way branching using `if-else` and nested `if-else` ladders
* Fundamental problem solving: Prime check, Armstrong numbers, Palindromes, Income tax evaluation

### 🔹 Lab Sheet 02: Operators, Bitwise Manipulation & Iterations

* Unary operators (prefix vs. postfix counter simulations)
* Fast arithmetic with Bitwise Shift operators (`<<`, `>>`, bitwise rotation)
* Bit manipulation algorithms (counting set bits using bitwise AND)
* Looping structures: `for`, `while`, `do-while`, and enhanced `for-each`
* Jump controls (`break` vs `continue`) with boundary condition handling

### 🔹 Lab Sheet 03: Multi-Dimensional & Jagged Arrays

* **1-D Arrays:** Reverse traversal, element accumulation, max/min, frequency mapping, in-place duplicate removal
* **2-D Arrays:** Matrix input/output, row/column aggregations, transpose, matrix addition & multiplication, diagonal & boundary element traversal
* **3-D Arrays:** Layered tensor-like storage, search, and conditional counting
* **Jagged Arrays:** Non-uniform row structures, individual row sorting, student subject mark allocations
* **Sparse Matrix Verification:** Zero vs non-zero element ratio check

### 🔹 Lab Sheet 04: Object-Oriented Fundamentals (Classes & Scopes)

* Class variables (`static`) for shared state tracking (e.g., student counts, call counters)
* Instance variables representing distinct object states
* Local variable scoping inside class methods
* Real-world entity abstractions: `BankAccount`, `Library`, `Movie`, `Employee`, `Matrix`, `ElectricBill`

### 🔹 Lab Sheet 05: Inheritance Paradigms & Polymorphism

* **Data Encapsulation:** Private data members with business-rule validation inside setters
* **Single Inheritance:** `Animal` $\to$ `Dog`, `Person` $\to$ `Student`
* **Multilevel Inheritance:** `Animal` $\to$ `Dog` $\to$ `Puppy`, `Person` $\to$ `Employee` $\to$ `Manager`
* **Hierarchical Inheritance:** `Employee` $\to$ `Developer` & `Manager`
* **Dynamic Method Overriding:** Runtime polymorphism using `@Override` and `super`
* **Multiple & Hybrid Inheritance:** Leveraging Java `interface` implementations (`Camera`, `MusicPlayer`, `Researcher`, `Programmer`)
* **Capstone OOP System:** Integrated University Employee Management System combining all OOP pillars

---

## 🏗️ Architectural Hierarchy (Lab Sheet 05 Capstone)

```
                     +--------------------+
                     | UniversityEmployee |
                     +--------------------+
                               |
                +--------------+--------------+
                | extends                     | extends
                v                             v
          +-----------+                 +-----------+
          |  Teacher  |                 |   Admin   |
          +-----------+                 +-----------+
                |    \
        extends |     \ implements
                v      v
   +-----------------+  <<interface>>
   | VisitingTeacher |   Researcher
   +-----------------+

```

---

## 🛠️ How to Compile & Run

### Prerequisites

* Java Development Kit (JDK 19, 21, or newer)
* VS Code or IntelliJ IDEA with the **Extension Pack for Java** installed

### Clone the Repository

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>

```

### Compile and Execute

You can compile and run any of the standalone lab files:

```bash
# Compile
javac Main.java

# Run
java Main

```

When prompted, enter the **Question Number (e.g., 1 to 30)** to view that specific program's execution and output in the terminal.

---

## 👤 Author

* **Student Name:** Kanika Sharma
* **Degree:** Bachelor of Computer Applications (BCA)
* **Course:** Foundations of Java Development (BCA201P)

---

## 📜 License

This project is open-source and intended for academic learning, reference, and coursework submissions.