/*
==========================================================
Problem ID : FDA002
Problem    : Restore Original Array
Pattern    : Difference Preprocessing
Difficulty : Easy

Description:
Given a Difference Array, reconstruct the Original Array.

The Difference Array is defined as:

difference[0] = original[0]

For every index i > 0:

difference[i] = original[i] - original[i - 1]

Print the reconstructed Original Array.

------------------------------------------

Example 1:

Input:
5
10 10 10 10 10

Output:
10 20 30 40 50

Explanation:

original[0] = 10

original[1] = 10 + 10 = 20

original[2] = 20 + 10 = 30

original[3] = 30 + 10 = 40

original[4] = 40 + 10 = 50

------------------------------------------

Example 2:

Input:
5
2 3 4 5 6

Output:
2 5 9 14 20

------------------------------------------

Example 3:

Input:
4
7 0 0 0

Output:
7 7 7 7

------------------------------------------

Example 4:

Input:
5
5 -2 5 -6 7

Output:
5 3 8 2 9

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= difference[i] <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Prefix Sum
- Traversal

Expected Approach:

1. Read the Difference Array.
2. Create an Original Array.
3. Store:
      original[0] = difference[0]
4. For every remaining index:
      original[i] = original[i - 1] + difference[i]
5. Print the Original Array.

Time Complexity:
O(n)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FDA002_RestoreOriginalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of difference array: ");
        int[] difference = new int[size];
        for (int i = 0; i < size; i++) {
            difference[i] = sc.nextInt();
        }

        System.out.println("Output: ");
        int[] original = new int[size];
        original[0] = difference[0];
        for (int i = 1; i < size; i++) {
            original[i] = original[i - 1] + difference[i];
        }

        for (int i = 0 ; i < size; i++) {
            System.out.print(original[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Restoring an Original Array from a Difference Array using Prefix Sum.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Difference Array can be converted back into the Original Array by computing a Prefix Sum.
- Difference Arrays and Prefix Sums are inverse transformations of each other.
- The recurrence for restoration is:
      original[i] = original[i - 1] + difference[i]

Revision Date:
05-08-2026

Confidence (1-10):
10/10

==========================
*/