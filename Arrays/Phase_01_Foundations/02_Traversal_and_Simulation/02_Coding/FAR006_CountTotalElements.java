/*
==========================================================
Problem ID : FAR006
Problem    : Count Total Elements
Pattern    : Basic Traversal
Difficulty : Very Easy

Description:
Read the size of an integer array from the user and determine
the total number of elements present in the array.

Print the total number of elements.

Do NOT count using a loop.
Use the array's built-in length property.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
Total Elements = 5

------------------------------------------

Example 2:

Input:
1
100

Output:
Total Elements = 1

------------------------------------------

Constraints:
- 1 <= n <= 1000

Concepts Used:
- Scanner
- Array Declaration
- Array Length Property

Expected Approach:

1. Read the array.
2. Use arr.length.
3. Print the answer.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FAR006_CountTotalElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Total Elements : " + arr.length);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Using the length property to find the total number of elements.

Mistakes I Made:
None.

New Java Methods Learned:
arr.length

New Concepts Learned:
The length property stores the total number of elements in an array and can be accessed in O(1) time.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/