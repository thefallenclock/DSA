/*
==========================================================
Problem ID : FAR010
Problem    : Find Second Smallest Element
Pattern    : Dual Tracking
Difficulty : Easy

Description:
Read an integer array from the user and find the second
smallest DISTINCT element.

If no second smallest distinct element exists, print:

Second Smallest Not Found

------------------------------------------

Example 1:

Input:
5
10 5 20 2 15

Output:
Second Smallest = 5

------------------------------------------

Example 2:

Input:
5
7 7 7 7 7

Output:
Second Smallest Not Found

------------------------------------------

Example 3:

Input:
6
-10 -20 -5 -30 -15 -25

Output:
Second Smallest = -25

------------------------------------------

Constraints:
- 2 <= n <= 1000
- Elements may be positive, negative or zero.
- Do NOT sort the array.
- Solve using a single traversal.

Concepts Used:
- Scanner
- Array Traversal
- if-else
- Dual Tracking

Expected Approach:

1. Read the array.
2. Maintain:
      smallest
      secondSmallest
3. Traverse the array only once.
4. Ignore duplicate values.
5. Print the result.

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

public class FAR010_FindSecondSmallestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //-10 -20 -5 -30 -15 -25
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
                if (secondSmallest != Integer.MAX_VALUE) found = true;
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
                found = true;
            }

        }

        if (found) System.out.println("Second Smallest = " + secondSmallest);
        else System.out.println("Second Smallest Not Found");

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Dual Tracking (Smallest & Second Smallest)

Mistakes I Made:
None.

New Java Methods Learned:
Integer.MAX_VALUE

New Concepts Learned:
Maintain two variables while traversing once.
When a new smallest element is found, the previous smallest becomes the second smallest.
Ignore duplicate values to ensure the second smallest is distinct.

Revision Date:
27-07-2026

Confidence (1-10):
10

==========================
*/