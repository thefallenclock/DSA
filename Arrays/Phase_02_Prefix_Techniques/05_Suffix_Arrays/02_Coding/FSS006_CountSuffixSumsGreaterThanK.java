/*
==========================================================
Problem ID : FSS006
Problem    : Count Suffix Sums Greater Than K
Pattern    : Suffix Preprocessing
Difficulty : Easy

Description:
Given an integer array, construct its Suffix Sum Array.

Then read an integer K.

Count how many Suffix Sum values are strictly greater
than K.

Print the count.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
9

Output:
4

Explanation:

Suffix Sum Array:

17 15 11 10 3

Values greater than 9:

17
15
11
10

Count = 4

------------------------------------------

Example 2:

Input:
5
1 1 1 1 1
2

Output:
3

Explanation:

Suffix Sum Array:

5
4
3
2
1

Values greater than 2:

5
4
3

Count = 3

------------------------------------------

Example 3:

Input:
4
5 5 5 5
15

Output:
1

Explanation:

Suffix Sum Array:

20
15
10
5

Only 20 is greater than 15.

------------------------------------------

Example 4:

Input:
5
2 -1 4 -2 5
3

Output:
3

Explanation:

Suffix Sum Array:

8
6
7
3
5

Values greater than 3:

8
6
7
5

Count = 4

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- -10^9 <= K <= 10^9

Concepts Used:
- Arrays
- Suffix Sum
- Reverse Traversal
- Counting

Expected Approach:

1. Read the array.
2. Build the Suffix Sum Array.
3. Read K.
4. Traverse the Suffix Sum Array.
5. Count all values greater than K.
6. Print the count.

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

public class FSS006_CountSuffixSumsGreaterThanK {

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

        int count = 0;
        for (int j = suffixSum.length - 1; j >= 0; j--) {
            if (suffixSum[j] > k) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Counting values in a preprocessed Suffix Sum Array that satisfy a given condition.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Once a Suffix Sum Array is built, it can be treated like any other array for searching, counting, or applying conditions.
- Traversal direction is independent of the preprocessing direction when only scanning values.

Revision Date:
03-08-2026

Confidence (1-10):
10/10

==========================
*/