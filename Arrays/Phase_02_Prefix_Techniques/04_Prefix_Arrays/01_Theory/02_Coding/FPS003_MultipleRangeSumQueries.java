/*
==========================================================
Problem ID : FPS003
Problem    : Multiple Range Sum Queries
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Read an integer array from the user and construct its Prefix
Sum Array.

Then read an integer Q representing the number of range
queries.

For each query, read two integers L and R representing the
starting and ending indices of the range.

Print the sum of elements from index L to index R using the
Prefix Sum Array.

Do NOT traverse the original array while answering any query.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
3
0 2
1 3
2 4

Output:
7
12
11

Explanation:
Query 1:
2 + 4 + 1 = 7

Query 2:
4 + 1 + 7 = 12

Query 3:
1 + 7 + 3 = 11

------------------------------------------

Example 2:

Input:
4
5 5 5 5
2
0 3
1 2

Output:
20
10

Explanation:
The same Prefix Sum Array is reused for every query.

------------------------------------------

Example 3:

Input:
6
1 2 3 4 5 6
4
0 5
2 5
1 3
4 4

Output:
21
18
9
5

------------------------------------------

Example 4:

Input:
1
8
2
0 0
0 0

Output:
8
8

Explanation:
Even if the same query is repeated, the answer is obtained
in O(1) time.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- 1 <= Q <= 1000
- 0 <= L <= R < n

Concepts Used:
- Arrays
- Prefix Sum
- Prefix Preprocessing
- Multiple Range Queries
- Looping

Expected Approach:

1. Read the size of the array.
2. Read all array elements.
3. Construct the Prefix Sum Array.
4. Read Q.
5. Repeat Q times:
   a. Read L and R.
   b. If L == 0, answer = prefix[R].
   c. Otherwise, answer = prefix[R] - prefix[L - 1].
6. Print the answer for every query.

Time Complexity:
O(n + Q)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FPS003_MultipleRangeSumQueries {

    public static int solution(int[] arr, int[] prefix, int start, int end) {
        if (start == 0) {
            return prefix[end];
        }
        else {
            return prefix[end] - prefix[start - 1];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        int T = sc.nextInt();
        int[] answers = new int[T];

        for (int j = 0; j < T; j++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            answers[j] = solution(arr, prefix, start, end);
        }

        for (int k = 0; k < answers.length; k++) {
            System.out.println(answers[k]);
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Multiple Range Sum Queries using a single Prefix Sum Array.
- Preprocessing once and answering each query in O(1).

Mistakes I Made:
- Passed the original array to the solution() method even though it wasn't needed.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- The Prefix Sum Array is built only once regardless of the number of queries.
- Every query reuses the same Prefix Sum Array.
- Preprocessing reduces repeated work and improves efficiency.
- Overall Time Complexity:
      O(n + Q)
  where:
      n = array size
      Q = number of queries.

Revision Date:
28-07-09

Confidence (1-10):
10/10

==========================
*/