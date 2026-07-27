/*
==========================================================
Problem ID : FAR017
Problem    : Replace Negative Numbers with Zero
Pattern    : In-place Array Update
Difficulty : Very Easy

Description:
Read an integer array from the user and replace every
negative element with 0.

Modify the original array itself.

Finally, print the updated array.

------------------------------------------

Example 1:

Input:
6
5 -2 8 -7 10 -1

Output:
5 0 8 0 10 0

------------------------------------------

Example 2:

Input:
5
1 2 3 4 5

Output:
1 2 3 4 5

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Modify the array in-place.
- Do not create another array.

Concepts Used:
- Scanner
- Array Traversal
- if Statement
- In-place Array Update

Expected Approach:

1. Read the array.
2. Traverse the array once.
3. If an element is negative:
      arr[i] = 0;
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

public class FAR017_ReplaceNegativeNumbersWithZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = 0;
            System.out.print(arr[i] + " ");
        }



        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Conditional In-place Array Update

Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
Using an if statement to modify only selected elements while leaving the rest unchanged.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/