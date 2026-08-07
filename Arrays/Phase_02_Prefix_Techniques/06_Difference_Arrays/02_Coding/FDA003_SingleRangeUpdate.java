/*
==========================================================
Problem ID : FDA003
Problem    : Single Range Update
Pattern    : Difference Array Update
Difficulty : Medium

Description:
Given an integer array, perform one range update using
the Difference Array technique.

You are given:

- L (starting index)
- R (ending index)
- X (value to add)

Add X to every element from index L to R.

Use a Difference Array.

Do NOT update every element individually.

Finally, reconstruct and print the updated array.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50
1 3 5

Output:
10 25 35 45 50

Explanation:

Original:
10 20 30 40 50

Add 5 from index 1 to 3.

Updated:
10 25 35 45 50

------------------------------------------

Example 2:

Input:
5
2 4 6 8 10
0 2 3

Output:
5 7 9 8 10

------------------------------------------

Example 3:

Input:
5
1 1 1 1 1
2 4 2

Output:
1 1 3 3 3

------------------------------------------

Example 4:

Input:
4
5 10 15 20
0 3 1

Output:
6 11 16 21

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 0 <= L <= R < n
- -10^6 <= X <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Prefix Sum
- Range Update

Expected Approach:

1. Read the original array.
2. Build the Difference Array.
3. Read L, R and X.
4. Update:
      difference[L] += X
5. If R + 1 exists:
      difference[R + 1] -= X
6. Restore the Original Array.
7. Print the updated array.

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

public class FDA003_SingleRangeUpdate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of difference array: ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the initial index: ");
        int start = sc.nextInt();
        System.out.println("Enter the ending index: ");
        int end = sc.nextInt();
        System.out.println("Enter the difference: ");
        int diff = sc.nextInt();

        System.out.println("Output: ");
        int[] difference = new int[size];
        difference[0] = nums[0];
        for (int i = 1; i < size; i++) {
            difference[i] = nums[i] - nums[i - 1];
        }
        difference[start] += diff;
        if (end != size - 1) difference[end + 1] -= diff;

        int[] updated = new int[size];
        updated[0] = difference[0];
        for (int i = 1; i < size; i++) {
            updated[i] = updated[i - 1] + difference[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(updated[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Performing a single range update using a Difference Array.

Mistakes I Made:
- Initially updated every element in the range instead of updating only two positions in the Difference Array.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A range update in a Difference Array requires modifying only:
      difference[L] += X
      difference[R + 1] -= X (if it exists)
- After applying the update, a Prefix Sum reconstructs the updated original array.
- Difference Arrays make individual range updates O(1); reconstruction is performed once after all updates.

Revision Date:
06-08-2026

Confidence (1-10):
10/10

==========================
*/