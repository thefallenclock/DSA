/*
==========================================================
Problem ID : FAR004
Problem    : Find Maximum Element
Pattern    : Running Best
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and find the largest element using
a single traversal.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
50

Explanation:
50 is the largest element in the array.

------------------------------------------

Example 2:

Input:
5
50 40 30 20 10

Output:
50

Explanation:
The first element is already the maximum.

------------------------------------------

Example 3:

Input:
5
-5 -2 -10 -1 -8

Output:
-1

Explanation:
-1 is greater than every other negative number.

------------------------------------------

Example 4:

Input:
1
100

Output:
100

Explanation:
The array contains only one element, so it is the maximum.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Solve using exactly one traversal.
- Do NOT sort the array.
- Do NOT use Arrays.sort().
- Do NOT use Collections.max().

Concepts Used:
- Scanner
- Dynamic Array
- Array Traversal
- Running Best Pattern
- Conditional Statements

Expected Approach:

1. Read the array size.
2. Create the array.
3. Read all elements.
4. Assume the first element is the maximum.
5. Traverse the remaining elements.
6. Update the maximum whenever a larger element is found.
7. Print the maximum.

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

public class FAR004_FindMaximumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int m = 0; m < size; m++) {
            if (nums[m] > max) {
                max = nums[m];
            }
        }
        System.out.println(max + " is the greatest value in the array.");

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Running Best Pattern

Mistakes I Made:
Initialized max with Integer.MIN_VALUE instead of the first array element for this specific pattern.

New Java Methods Learned:
Integer.MIN_VALUE

New Concepts Learned:
Running Best Pattern

Revision Date:
22-07-2026

Confidence (1-10):
10

==========================
*/