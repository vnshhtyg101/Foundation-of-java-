import java.util.Scanner;
import java.util.Arrays;

public class labsheet3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   BCA201P: LAB SHEET-03 (Q1 TO Q30)");
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

    // ====================================================
    // Part A – 1-D Arrays (Q1–Q6)
    // ====================================================

    // 1. Input and display 5 integers using 1-D array
    static void q01() {
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 2. Input 10 integers and display them in reverse order
    static void q02() {
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Elements in reverse order: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 3. Sum of all elements in 1-D array
    static void q03() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }

    // 4. Maximum element in an array
    static void q04() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum element: " + max);
    }

    // 5. Count even and odd numbers in an array
    static void q05() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }

    // 6. Copy all elements from one array to another
    static void q06() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] original = new int[n];
        int[] copy = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
            copy[i] = original[i]; // copying
        }
        System.out.print("Copied array: ");
        for (int x : copy) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // ====================================================
    // Part B – 2-D Arrays (Q7–Q13)
    // ====================================================

    // 7. Input and display 3x3 matrix
    static void q07() {
        int[][] mat = new int[3][3];
        System.out.println("Enter elements for 3x3 matrix (9 integers):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 3x3 Matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 8. Sum of all elements in a matrix
    static void q08() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int sum = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                sum += mat[i][j];
            }
        }
        System.out.println("Sum of all elements in matrix: " + sum);
    }

    // 9. Sum of each row in a matrix
    static void q09() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += mat[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
        }
    }

    // 10. Sum of each column in a matrix
    static void q10() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += mat[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + ": " + colSum);
        }
    }

    // 11. Transpose of a matrix
    static void q11() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transposed Matrix (" + c + "x" + r + "):");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 12. Add two matrices of same size
    static void q12() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) a[i][j] = sc.nextInt();
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) b[i][j] = sc.nextInt();
        }
        System.out.println("Resultant Matrix (A + B):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((a[i][j] + b[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    // 13. Multiply two 3x3 matrices
    static void q13() {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        System.out.println("Enter elements of First 3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) a[i][j] = sc.nextInt();
        }
        System.out.println("Enter elements of Second 3x3 Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) b[i][j] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix (A x B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // ====================================================
    // Part C – 3-D Arrays (Q14–Q18)
    // ====================================================

    // 14. Input and display elements of a 2x2x2 3-D array
    static void q14() {
        int[][][] arr = new int[2][2][2];
        System.out.println("Enter 8 integers for 2x2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Elements of 3-D array:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    // 15. Sum of all elements in 3-D array
    static void q15() {
        int[][][] arr = new int[2][2][2];
        int sum = 0;
        System.out.println("Enter 8 integers for 2x2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                    sum += arr[i][j][k];
                }
            }
        }
        System.out.println("Sum of all elements in 3-D array: " + sum);
    }

    // 16. Count positive and negative numbers in 3-D array
    static void q16() {
        int[][][] arr = new int[2][2][2];
        int pos = 0, neg = 0, zeros = 0;
        System.out.println("Enter 8 integers for 2x2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                    if (arr[i][j][k] > 0) pos++;
                    else if (arr[i][j][k] < 0) neg++;
                    else zeros++;
                }
            }
        }
        System.out.println("Positive count: " + pos);
        System.out.println("Negative count: " + neg);
        System.out.println("Zero count: " + zeros);
    }

    // 17. Maximum element in 3-D array
    static void q17() {
        int[][][] arr = new int[2][2][2];
        System.out.println("Enter 8 integers for 2x2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) arr[i][j][k] = sc.nextInt();
            }
        }
        int max = arr[0][0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > max) max = arr[i][j][k];
                }
            }
        }
        System.out.println("Maximum element in 3-D array: " + max);
    }

    // 18. Search element in 3-D array and display its position
    static void q18() {
        int[][][] arr = new int[2][2][2];
        System.out.println("Enter 8 integers for 2x2x2 array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) arr[i][j][k] = sc.nextInt();
            }
        }
        System.out.print("Enter target element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == key) {
                        System.out.println("Found " + key + " at position: Layer=" + i + ", Row=" + j + ", Col=" + k);
                        found = true;
                    }
                }
            }
        }
        if (!found) System.out.println(key + " not found in the 3-D array.");
    }

    // ====================================================
    // Part D – Jagged Arrays (Q19–Q20)
    // ====================================================

    // 19. Create and display jagged array with 3 rows of different lengths
    static void q19() {
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[3];

        System.out.println("Enter elements for Jagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.println("Enter " + jagged[i].length + " elements for Row " + (i + 1) + ":");
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array display:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int val : jagged[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // 20. Store marks for students with different number of subjects
    static void q20() {
        System.out.print("Enter total number of students: ");
        int totalStudents = sc.nextInt();
        double[][] studentMarks = new double[totalStudents][];

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter number of subjects taken by Student " + (i + 1) + ": ");
            int subs = sc.nextInt();
            studentMarks[i] = new double[subs];
            System.out.println("Enter marks for " + subs + " subjects:");
            for (int j = 0; j < subs; j++) {
                studentMarks[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n--- Students Marks Record ---");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.print("Student " + (i + 1) + " Marks: ");
            for (double m : studentMarks[i]) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    // ====================================================
    // Part E – Additional Questions (Q21–Q30)
    // ====================================================

    // 21. Rotate array to left by one position
    static void q21() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;

        System.out.print("Array after left rotation by 1: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    // 22. Count frequency of each element in 1-D array
    static void q22() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Element Frequencies:");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " time(s)");
        }
    }

    // 23. Find second largest element in 1-D array
    static void q23() {
        System.out.print("Enter size of array (>= 2): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    // 24. Remove duplicate elements from 1-D array without collections
    static void q24() {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Sort array first to bring duplicates together
        Arrays.sort(arr);
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    // 25. Sum of main diagonal and secondary diagonal elements of square matrix
    static void q25() {
        System.out.print("Enter order of square matrix (N): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter elements of " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
        }

        int mainDiag = 0;
        int secDiag = 0;
        for (int i = 0; i < n; i++) {
            mainDiag += mat[i][i];
            secDiag += mat[i][n - 1 - i];
        }

        System.out.println("Sum of Main Diagonal: " + mainDiag);
        System.out.println("Sum of Secondary Diagonal: " + secDiag);
    }

    // 26. Display upper and lower triangular parts of square matrix
    static void q26() {
        System.out.print("Enter order of square matrix (N): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
        }

        System.out.println("\nUpper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) System.out.print(mat[i][j] + "\t");
                else System.out.print("0\t");
            }
            System.out.println();
        }

        System.out.println("\nLower Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) System.out.print(mat[i][j] + "\t");
                else System.out.print("0\t");
            }
            System.out.println();
        }
    }

    // 27. Print only boundary elements of a matrix
    static void q27() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();
        }

        System.out.println("Boundary Elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // 28. Search element in 2-D array and display row & column position
    static void q28() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == key) {
                    System.out.println("Found " + key + " at Row: " + i + ", Column: " + j);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Element not found in matrix.");
    }

    // 29. Sort elements of each row in a jagged array
    static void q29() {
        int[][] jagged = {
            {5, 2, 9},
            {8, 1, 4, 3},
            {7, 6}
        };

        System.out.println("Original Jagged Array:");
        for (int[] row : jagged) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        for (int[] row : jagged) {
            Arrays.sort(row); // sort each row individually
        }

        System.out.println("\nJagged Array with each row sorted:");
        for (int[] row : jagged) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    // 30. Check if matrix is a Sparse Matrix (zeros > non-zeros)
    static void q30() {
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int zeroCount = 0;
        int nonZeroCount = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 0) zeroCount++;
                else nonZeroCount++;
            }
        }

        System.out.println("Zero elements: " + zeroCount);
        System.out.println("Non-zero elements: " + nonZeroCount);

        if (zeroCount > nonZeroCount) {
            System.out.println("Result: The matrix IS a Sparse Matrix.");
        } else {
            System.out.println("Result: The matrix is NOT a Sparse Matrix.");
        }
    }
}
