/*
==========================================================
Problem ID : FAR016
Problem    : Replace Every Element with Square
Pattern    : In-place Array Update
Difficulty : Very Easy

Description:
Read an integer array from the user and replace every
element with its square.

Modify the original array itself.

Finally, print the updated array.

------------------------------------------

Example 1:

Input:
5
1 2 3 4 5

Output:
1 4 9 16 25

------------------------------------------

Example 2:

Input:
4
-2 5 0 -3

Output:
4 25 0 9

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
3. Replace each element with:
      arr[i] = arr[i] * arr[i];
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

public class FAR016_ReplaceEveryElementWithSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
            System.out.print(arr[i] + " ");
        }        

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
In-place Array Update

Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
An array element can be transformed and written back into the same position. 
The traversal logic remains the same while only the transformation changes.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/