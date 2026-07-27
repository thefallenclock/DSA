/*
==========================================================
Problem ID : FAR009
Problem    : Find the Second Largest Element
Pattern    : Single-Pass Traversal + Dual Tracking
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and find the second largest distinct
element.

Do NOT sort the array.

If a second largest distinct element does not exist,
print:

Second Largest Not Found

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
Second Largest : 40

Explanation:
The largest element is 50.
The second largest distinct element is 40.

------------------------------------------

Example 2:

Input:
5
7 7 7 7 7

Output:
Second Largest Not Found

Explanation:
All elements are equal, so there is no second largest distinct element.

------------------------------------------

Example 3:

Input:
6
5 2 9 9 1 7

Output:
Second Largest : 7

Explanation:
The largest distinct element is 9.
The second largest distinct element is 7.

------------------------------------------

Example 4:

Input:
4
-10 -20 -30 -40

Output:
Second Largest : -20

Explanation:
The largest element is -10.
The second largest element is -20.

------------------------------------------

Constraints:
- 2 <= n <= 1000
- Elements may be positive, negative, or zero.
- Do NOT sort the array.
- Solve using a single traversal.

Concepts Used:
- Scanner
- Array Traversal
- Maximum Tracking
- if-else
- Integer.MIN_VALUE

Expected Approach:

1. Read the array.
2. Maintain two variables:
   - largest
   - secondLargest
3. Update both variables while traversing.
4. Print the second largest distinct element.
5. If it does not exist, print:
   Second Largest Not Found

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

public class FAR009_FindSecondLargestElement {

    // -10 -20 -30 -40 -50
    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        boolean found = false;

        if (arr.length < 2) {
            System.out.println("Second Largest Not Found");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
                
                if (secMax != Integer.MIN_VALUE) found = true;
            }
            else if (arr[i] != max && arr[i] > secMax) {
                secMax = arr[i];
                found = true;
            }
        }

        if (found) System.out.println("Second Largest: " + secMax);
        else System.out.println("Second Largest Not Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        secondLargest(arr);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Single-Pass Dual Tracking

Mistakes I Made:
1. Used arr[0] to determine whether a second largest existed.
2. Initially solved it using two traversals instead of one.
3. Learned that using Integer.MIN_VALUE as a sentinel can fail when it is a valid array element.

New Java Methods Learned:
None

New Concepts Learned:
Maintain both the largest and second largest values simultaneously during a single traversal.

Revision Date:
25-07-2026

Confidence (1-10):
9

==========================
*/