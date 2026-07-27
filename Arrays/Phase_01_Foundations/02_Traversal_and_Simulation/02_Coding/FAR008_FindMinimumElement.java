/*
==========================================================
Problem ID : FAR008
Problem    : Find Minimum Element
Pattern    : Running Best
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and find the smallest element using
a single traversal.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
10

Explanation:
10 is the smallest element in the array.

------------------------------------------

Example 2:

Input:
5
50 40 30 20 10

Output:
10

Explanation:
10 is the minimum element.

------------------------------------------

Example 3:

Input:
5
-5 -2 -10 -1 -8

Output:
-10

Explanation:
-10 is smaller than every other element.

------------------------------------------

Example 4:

Input:
1
100

Output:
100

Explanation:
The array contains only one element, so it is the minimum.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Solve using exactly one traversal.
- Do NOT sort the array.
- Do NOT use Arrays.sort().
- Do NOT use Collections.min().

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
4. Assume the first element is the minimum.
5. Traverse the remaining elements.
6. Update the minimum whenever a smaller element is found.
7. Print the minimum.

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

public class FAR008_FindMinimumElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int min = nums[0];
        for (int i = 0; i < size; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println(min + " is the smallest element in the array");

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:

Mistakes I Made:

New Java Methods Learned:

New Concepts Learned:

Revision Date:

Confidence (1-10):

==========================
*/