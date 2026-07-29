/*
==========================================================
Problem ID : FPS008
Problem    : Count Prefix Sums Greater Than K
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Read an integer array from the user and construct its Prefix
Sum Array.

Then read an integer K.

Count how many Prefix Sum values are strictly greater than K.

Print the count.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
10

Output:
2

Explanation:

Prefix Sum Array:
2 6 7 14 17

Values greater than 10:
14
17

Count = 2

------------------------------------------

Example 2:

Input:
5
1 1 1 1 1
2

Output:
3

Explanation:

Prefix Sum Array:
1 2 3 4 5

Values greater than 2:
3
4
5

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

Prefix Sum Array:
5 10 15 20

Only 20 is greater than 15.

------------------------------------------

Example 4:

Input:
5
2 -1 4 -2 5
3

Output:
2

Explanation:

Prefix Sum Array:
2 1 5 3 8

Values greater than 3:
5
8

Count = 2

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- -10^9 <= K <= 10^9

Concepts Used:
- Arrays
- Prefix Sum
- Prefix Preprocessing
- Traversal
- Counting

Expected Approach:

1. Read the size of the array.
2. Read all array elements.
3. Construct the Prefix Sum Array.
4. Read K.
5. Traverse the Prefix Sum Array.
6. Count all Prefix Sum values greater than K.
7. Print the count.

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

public class FPS008_CountPrefixSumsGreaterThanK {

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
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
            if (prefix[i] > K) {
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
- Counting Prefix Sum values that satisfy a given condition.
- Traversing the Prefix Sum Array while constructing it.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- The Prefix Sum Array itself can become the input for solving a problem.
- Counting conditions can often be checked during Prefix Sum construction.
- Prefix Sum problems are not limited to range queries.

Revision Date:
29-07-2026

Confidence (1-10):
10/10

==========================
*/