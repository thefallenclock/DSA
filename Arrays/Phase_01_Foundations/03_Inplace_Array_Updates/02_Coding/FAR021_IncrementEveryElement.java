/*
==========================================================
Problem ID : FAR021
Problem    : Increment Every Element
Pattern    : In-place Array Update
Difficulty : Very Easy

Description:
Read an integer array from the user and increment every
element by 1.

Modify the original array itself.

Finally, print the updated array.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
11 21 31 41 51

------------------------------------------

Example 2:

Input:
4
-2 5 0 7

Output:
-1 6 1 8

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Modify the array in-place.
- Do not create another array.

Concepts Used:
- Scanner
- Array Traversal
- In-place Array Update
- Assignment

Expected Approach:

1. Read the array.
2. Traverse the array once.
3. Increment each element by 1:
      arr[i] = arr[i] + 1;
4. Print the updated array.

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

public class FAR021_IncrementEveryElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Unconditional In-place Array Update
Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
An array element can be incremented directly using assignment. 
The original array is modified without creating another array.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/