/*
==========================================================
Problem ID : FAR014
Problem    : Count Positive, Negative and Zero Elements
Pattern    : Single-Pass Traversal + Multiple Counters
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and count how many elements are:

- Positive
- Negative
- Zero

Print the count of each category.

------------------------------------------

Example 1:

Input:
5
1 -2 0 4 -5

Output:
Positive : 2
Negative : 2
Zero : 1

Explanation:
1 and 4 are positive.
-2 and -5 are negative.
0 is zero.

------------------------------------------

Example 2:

Input:
4
0 0 0 0

Output:
Positive : 0
Negative : 0
Zero : 4

Explanation:
Every element is zero.

------------------------------------------

Example 3:

Input:
6
5 8 10 1 3 7

Output:
Positive : 6
Negative : 0
Zero : 0

Explanation:
Every element is positive.

------------------------------------------

Example 4:

Input:
5
-3 -1 -8 -10 -6

Output:
Positive : 0
Negative : 5
Zero : 0

Explanation:
Every element is negative.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Solve using a single traversal.
- Do NOT use Streams.

Concepts Used:
- Scanner
- Dynamic Array
- Array Traversal
- Counter Pattern
- if-else

Expected Approach:

1. Read the array size.
2. Create the array.
3. Read all elements.
4. Traverse the array once.
5. Use three counters:
   - positive
   - negative
   - zero
6. Print all three counts.

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

public class FAR014_CountPositiveNegativeZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) positive++;
            else if (arr[i] < 0) negative++;
            else zero++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Single-Pass Traversal + Multiple Counters

Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
One traversal can maintain multiple counters simultaneously.

Revision Date:
25-07-2026

Confidence (1-10):
10

==========================
*/