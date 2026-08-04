/*
==========================================================
Problem ID : FSS007
Problem    : Longest Suffix With Sum ≤ K
Pattern    : Suffix Preprocessing
Difficulty : Medium

Description:
Given an integer array and an integer K, find the length
of the longest suffix whose sum is less than or equal to K.

A suffix ends at the last index of the array.

Print only the length of the longest valid suffix.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
12

Output:
3

Explanation:

Suffix Sum Array:

17
15
11
10
3

Suffixes:

2 4 1 7 3 -> 17 ✗
4 1 7 3   -> 15 ✗
1 7 3     -> 11 ✓
7 3       -> 10 ✓
3         -> 3 ✓

The longest valid suffix is:

1 7 3

Length = 3

------------------------------------------

Example 2:

Input:
5
1 2 3 4 5
9

Output:
2

Explanation:

Suffix Sum Array:

15
14
12
9
5

Longest valid suffix:

4 5

Length = 2

------------------------------------------

Example 3:

Input:
4
5 5 5 5
4

Output:
0

Explanation:

No suffix has sum <= 4.

------------------------------------------

Example 4:

Input:
6
3 2 1 4 5 2
12

Output:
4

Explanation:

Suffix Sum Array:

17
14
12
11
7
2

Longest valid suffix:

1 4 5 2

Length = 4

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 0 <= arr[i] <= 10^6
- 0 <= K <= 10^9

Concepts Used:
- Arrays
- Suffix Sum
- Reverse Traversal
- Linear Scan

Expected Approach:

1. Read the array.
2. Build the Suffix Sum Array.
3. Read K.
4. Traverse the Suffix Sum Array.
5. Find the leftmost suffix whose sum is <= K.
6. Print its length.

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

public class FSS007_LongestSuffixWithSumLessThanOrEqualToK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the comparision number: ");
        int k = sc.nextInt();

        System.out.println("Output: ");
        int[] suffixSum = new int[nums.length];
        suffixSum[nums.length - 1] = nums[nums.length - 1]; 
        for (int i = nums.length - 2; i >= 0; i--) {
            suffixSum[i] = nums[i] + suffixSum[i + 1];
        }

        int ans = 0;

        for (int i = 0; i < suffixSum.length; i++) {

            if (suffixSum[i] <= k) {
                ans = nums.length - i;
                break;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Finding the longest valid suffix using a Suffix Sum Array.

Mistakes I Made:
- Initially solved the problem by counting valid suffixes instead of directly finding the leftmost valid suffix.
- Although counting works under the given constraints, finding the first valid suffix better matches the problem statement.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- For arrays with non-negative elements, Suffix Sums are monotonic.
- The leftmost valid suffix gives the maximum suffix length.
- Multiple correct algorithms can exist, but choosing the one that best expresses the underlying idea improves readability.

Revision Date:
03-08-2026

Confidence (1-10):
10/10

==========================
*/