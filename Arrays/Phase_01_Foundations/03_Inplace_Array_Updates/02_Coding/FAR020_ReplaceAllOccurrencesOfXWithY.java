/*
==========================================================
Problem ID : FAR020
Problem    : Replace All Occurrences of X with Y
Pattern    : In-place Array Update
Difficulty : Easy

Description:
Read an integer array from the user. Then read two
integers X and Y.

Replace every occurrence of X in the array with Y.

Modify the original array itself.

Finally, print the updated array.

------------------------------------------

Example 1:

Input:
6
2 5 2 9 2 3
2
10

Output:
10 5 10 9 10 3

------------------------------------------

Example 2:

Input:
5
1 2 3 4 5
7
0

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
- Value Comparison

Expected Approach:

1. Read the array.
2. Read X and Y.
3. Traverse the array once.
4. If an element equals X:
      arr[i] = Y;
5. Print the updated array.

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

public class FAR020_ReplaceAllOccurrencesOfXWithY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter X: ");
        int X = sc.nextInt();
        System.out.println("Enter Y: ");
        int Y = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) arr[i] = Y;
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Value-based In-place Array Update

Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
Array elements can be updated by comparing their value with a target value. 
Only matching elements are modified while the rest remain unchanged.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/