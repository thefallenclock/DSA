/*
==========================================================
Problem ID : FAR003
Problem    : Reverse Traversal of an Array
Pattern    : Reverse Traversal
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and print the elements in reverse order.

Do NOT modify the original array.
Only traverse it from the last index to the first.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
50 40 30 20 10

Explanation:
The array is traversed from the last element to the first.

------------------------------------------

Example 2:

Input:
4
1 2 3 4

Output:
4 3 2 1

Explanation:
Reverse traversal simply changes the visiting order.

------------------------------------------

Example 3:

Input:
1
100

Output:
100

Explanation:
A single-element array remains the same.

------------------------------------------

Example 4:

Input:
3
-5 0 7

Output:
7 0 -5

Explanation:
Negative and zero values should also be printed correctly.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Do NOT create another array.
- Do NOT modify the original array.

Concepts Used:
- Scanner
- Dynamic Array
- Reverse Traversal
- for Loop
- Array Indexing

Expected Approach:

1. Read the array size.
2. Create the array.
3. Read all elements.
4. Start a loop from the last index.
5. Print each element while moving towards index 0.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FAR003_ReverseTraversal {

    public static void reversePrint(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[n - 1 - i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reversePrint(arr);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Reverse Traversal

Mistakes I Made:
None

New Java Methods Learned:
Creating a helper method for reverse traversal.

New Concepts Learned:
There are two ways to reverse traverse:
1. Start from the last index and decrement.
2. Start from 0 and map each index using (n - 1 - i).

Revision Date:
25-07-2026

Confidence (1-10):
10

==========================
*/