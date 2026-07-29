/*
==========================================================
Problem ID : FPS004
Problem    : Range Average Query
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Read an integer array from the user and construct its Prefix
Sum Array.

Then read an integer Q representing the number of range
queries.

For each query, read two integers L and R representing the
starting and ending indices of the range.

Print the average of all elements from index L to index R.

Use the Prefix Sum Array to calculate the range sum.

Do NOT traverse the original array while answering any query.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
3
0 2
1 3
2 4

Output:
2.33
4.00
3.67

Explanation:
Query 1:
Sum = 7
Count = 3
Average = 7 / 3 = 2.33

Query 2:
Sum = 12
Count = 3
Average = 12 / 3 = 4.00

Query 3:
Sum = 11
Count = 3
Average = 11 / 3 = 3.67

------------------------------------------

Example 2:

Input:
4
5 5 5 5
2
0 3
1 2

Output:
5.00
5.00

------------------------------------------

Example 3:

Input:
5
1 2 3 4 5
2
0 4
2 4

Output:
3.00
4.00

------------------------------------------

Example 4:

Input:
1
8
1
0 0

Output:
8.00

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- 1 <= Q <= 1000
- 0 <= L <= R < n

Concepts Used:
- Arrays
- Prefix Sum
- Prefix Preprocessing
- Range Average
- Type Casting
- Floating Point Division

Expected Approach:

1. Read the array.
2. Build the Prefix Sum Array.
3. Read Q.
4. For every query:
   a. Compute the range sum using Prefix Sum.
   b. Compute the number of elements:
      count = R - L + 1
   c. Compute:
      average = (double) sum / count
   d. Print the average rounded to two decimal places.

Time Complexity:
O(n + Q)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FPS004_RangeAverageQuery {

   public static double average(int[] prefix, int start, int end) {
      if (start == 0) return (double)prefix[end]/(end - start + 1);
      else return ((double)(prefix[end] - prefix[start - 1]))/(end - start + 1);
   }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of an array: ");
         int size = sc.nextInt();
         System.out.print("\nEnter the numbers of the array: ");
         int[] arr = new int[size];
         for (int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
         }
         int[] prefix = new int[arr.length];
         int sum = 0;
         for (int i = 0; i < prefix.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
         }

         System.out.print("\nEnter the number of queries: ");
         int Queries = sc.nextInt();
         
         double[] answers = new double[Queries];
         for (int j = 0; j < answers.length; j++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            answers[j] = average(prefix, start, end);
         }

         for (int j = 0; j < answers.length; j++) {
            System.out.printf("%.2f", answers[j]);
            System.out.println();
         }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Range Average Query using Prefix Sum.
- Computing averages from range sums in O(1).

Mistakes I Made:
- None.

New Java Methods Learned:
- System.out.printf("%.2f", value) for formatted decimal output.

New Concepts Learned:
- Average = Range Sum / Number of Elements.
- Number of elements in a range:
      count = R - L + 1
- Integer division truncates the decimal part.
- Casting one operand to double performs floating-point division.
- Prefix Sum can be reused for calculations other than sums, such as averages.

Revision Date:
28-07-2027

Confidence (1-10):
10/10

==========================
*/