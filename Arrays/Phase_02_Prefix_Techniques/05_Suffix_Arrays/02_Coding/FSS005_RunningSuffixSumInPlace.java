/*
==========================================================
Problem ID : FSS005
Problem    : Running Suffix Sum (In-Place)
Pattern    : Space Optimization
Difficulty : Easy

Description:
Given an integer array, convert it into its
Suffix Sum Array without using any extra array.

Modify the original array itself.

Print the modified array.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3

Output:
17 15 11 10 3

Explanation:

Original:
2 4 1 7 3

Modified:
17 15 11 10 3

------------------------------------------

Example 2:

Input:
5
1 2 3 4 5

Output:
15 14 12 9 5

------------------------------------------

Example 3:

Input:
1
8

Output:
8

------------------------------------------

Example 4:

Input:
4
5 5 5 5

Output:
20 15 10 5

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6

Concepts Used:
- Arrays
- Reverse Traversal
- In-place Update
- Space Optimization

Expected Approach:

1. Read the array.
2. Traverse from right to left.
3. Update the current element using the next element.
4. Print the modified array.

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

public class FSS005_RunningSuffixSumInPlace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }        

        System.out.println("Output: ");
        int sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sum = sum + nums[i];
            nums[i] = sum;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Performing in-place Suffix Sum preprocessing.
- Reusing the original array to save extra memory.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- An array can be transformed into its Suffix Sum Array without creating another array.
- In-place preprocessing reduces auxiliary space from O(n) to O(1).
- The in-place recurrence is:
      arr[i] = arr[i] + arr[i + 1]

Revision Date:
03-08-2026

Confidence (1-10):
10/10

==========================
*/