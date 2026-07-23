/*
==========================================================
Problem ID : FAR006
Problem    : Count Even and Odd Numbers
Pattern    : Conditional Traversal
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and count how many even numbers and
how many odd numbers are present.

------------------------------------------

Example 1:

Input:
5
10 15 20 25 30

Output:
Even Count : 3
Odd Count  : 2

Explanation:
10, 20 and 30 are even.
15 and 25 are odd.

------------------------------------------

Example 2:

Input:
4
1 3 5 7

Output:
Even Count : 0
Odd Count  : 4

Explanation:
All elements are odd.

------------------------------------------

Example 3:

Input:
4
2 4 6 8

Output:
Even Count : 4
Odd Count  : 0

Explanation:
All elements are even.

------------------------------------------

Example 4:

Input:
1
0

Output:
Even Count : 1
Odd Count  : 0

Explanation:
0 is considered an even number because it is divisible by 2.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Solve using exactly one traversal.
- Do NOT use Streams.

Concepts Used:
- Scanner
- Dynamic Array
- Array Traversal
- Conditional Statements
- Modulus Operator (%)
- Counter Pattern

Expected Approach:

1. Read the array size.
2. Create the array.
3. Read all elements.
4. Initialize two counters: evenCount and oddCount.
5. Traverse the array once.
6. If the current element is even, increment evenCount.
7. Otherwise, increment oddCount.
8. Print both counts.

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

public class FAR006_CountEvenAndOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Counter Pattern

Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
Using counters to count elements satisfying a condition during traversal.

Revision Date:
22-07-2026

Confidence (1-10):
10

==========================
*/