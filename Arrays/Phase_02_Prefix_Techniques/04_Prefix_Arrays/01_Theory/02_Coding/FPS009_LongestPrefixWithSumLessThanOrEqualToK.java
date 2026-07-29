/*
==========================================================
Problem ID : FPS009
Problem    : Longest Prefix with Sum ≤ K
Pattern    : Prefix Preprocessing
Difficulty : Medium

Description:
Given an integer array and an integer K, find the length
of the longest prefix whose sum is less than or equal to K.

A prefix starts from index 0.

Print only the length of the longest valid prefix.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
10

Output:
3

Explanation:

Prefix Sums:
2
6
7
14
17

The longest prefix having sum <= 10 is:

2 4 1

Length = 3

------------------------------------------

Example 2:

Input:
5
1 1 1 1 1
3

Output:
3

Explanation:

Prefix Sums:
1
2
3
4
5

Longest valid prefix:
1 1 1

Length = 3

------------------------------------------

Example 3:

Input:
4
5 5 5 5
4

Output:
0

Explanation:

The first Prefix Sum is already greater than K.

No valid prefix exists.

------------------------------------------

Example 4:

Input:
6
3 2 1 4 5 2
15

Output:
5

Explanation:

Prefix Sums:
3
5
6
10
15
17

The longest prefix whose sum <= 15 is:

3 2 1 4 5

Length = 5

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- -10^9 <= K <= 10^9

Concepts Used:
- Arrays
- Prefix Sum
- Traversal
- Observation

Expected Approach:

1. Read the array.
2. Build the Prefix Sum Array.
3. Read K.
4. Traverse the Prefix Sum Array.
5. Find the largest index whose Prefix Sum is <= K.
6. Print the corresponding prefix length.

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

public class FPS009_LongestPrefixWithSumLessThanOrEqualToK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        int[] prefix = new int[arr.length];
        int sum = 0;
        for (int i = 0 ; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        int ans = 0;
        for (int k = 0; k < prefix.length; k++) {
            if (prefix[k] <= K) {
                ans = k + 1;
            }
            else break;
        }
        System.out.println(ans);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Using Prefix Sums to determine the longest valid prefix satisfying a condition.
- Tracking the last valid prefix index while traversing.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Prefix Sum at index i represents the sum of the first (i + 1) elements.
- The answer can be obtained by remembering the last prefix that satisfies the condition.
- Early termination using break is only valid when Prefix Sums are guaranteed to be non-decreasing 
(for example, when all array elements are non-negative).

Revision Date:
29-07-2026

Confidence (1-10):
10/10

==========================
*/