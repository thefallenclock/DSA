/*
==========================================================
Problem ID : FPS002
Problem    : Single Range Sum Query
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Read an integer array from the user and construct its Prefix
Sum Array.

Then read two integers L and R representing the starting
and ending indices of a range.

Print the sum of elements from index L to index R using
the Prefix Sum Array.

Do NOT traverse the original array to calculate the answer.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
1 3

Output:
12

Explanation:
The required range is:
4 + 1 + 7 = 12

Using Prefix Sum:
prefix[3] - prefix[0]
= 14 - 2
= 12

------------------------------------------

Example 2:

Input:
5
2 4 1 7 3
0 2

Output:
7

Explanation:
Since the range starts from index 0,
the answer is simply:

prefix[2] = 7

------------------------------------------

Example 3:

Input:
4
5 5 5 5
2 3

Output:
10

Explanation:
The required range is:
5 + 5 = 10

Using Prefix Sum:
prefix[3] - prefix[1]
= 20 - 10
= 10

------------------------------------------

Example 4:

Input:
1
8
0 0

Output:
8

Explanation:
Only one element exists in the array,
so the range sum is 8.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- 0 <= L <= R < n

Concepts Used:
- Arrays
- Prefix Sum
- Prefix Preprocessing
- Range Sum Query
- Conditional Logic

Expected Approach:

1. Read the size of the array.
2. Read all array elements.
3. Construct the Prefix Sum Array.
4. Read the values of L and R.
5. If L == 0, the answer is prefix[R].
6. Otherwise, the answer is:
   prefix[R] - prefix[L - 1].
7. Print the answer.

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

public class FPS002_SingleRangeSumQuery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the starting of the range: ");
        int begin = sc.nextInt();
        System.out.println("Enter the ending of the range: ");
        int end = sc.nextInt();

        int[] prefix = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        if (begin == 0) System.out.println(prefix[end]);
        else System.out.println(prefix[end] - prefix[begin - 1]);

        sc.close();
    }
}

/*

==========================
Learning Notes

Pattern Learned:
- Range Sum Query using Prefix Sum Array.
- Answering queries in O(1) after preprocessing.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Prefix Sum is built once and reused for fast queries.
- If L == 0:
      answer = prefix[R]
- Otherwise:
      answer = prefix[R] - prefix[L - 1]
- Preprocessing converts repeated O(n) work into O(1) queries.

Revision Date:
27-07-2026

Confidence (1-10):
10/10

==========================
*/