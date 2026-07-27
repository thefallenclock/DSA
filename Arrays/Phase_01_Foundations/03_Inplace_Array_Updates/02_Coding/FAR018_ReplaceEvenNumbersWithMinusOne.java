/*
==========================================================
Problem ID : FAR018
Problem    : Replace Even Numbers with -1
Pattern    : In-place Array Update
Difficulty : Very Easy

Description:
Read an integer array from the user and replace every
even element with -1.

Modify the original array itself.

Finally, print the updated array.

------------------------------------------

Example 1:

Input:
6
2 5 8 9 10 3

Output:
-1 5 -1 9 -1 3

------------------------------------------

Example 2:

Input:
5
1 3 5 7 9

Output:
1 3 5 7 9

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Modify the array in-place.
- Do not create another array.

Concepts Used:
- Scanner
- Array Traversal
- if Statement
- Modulus Operator (%)
- In-place Array Update

Expected Approach:

1. Read the array.
2. Traverse the array once.
3. If an element is even:
      arr[i] = -1;
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

public class FAR018_ReplaceEvenNumbersWithMinusOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) arr[i] = -1;
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
The modulus operator (%) can be used to identify even numbers. 
Conditional logic allows selective modification of array elements.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/