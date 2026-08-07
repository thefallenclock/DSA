/*
==========================================================
Problem ID : FDA008
Problem    : Corporate Flight Bookings
Pattern    : Difference Array Application
Difficulty : Medium

Description:
There are n flights numbered from 1 to n.

You are given booking records.

Each booking consists of:

- firstFlight
- lastFlight
- seats

Every flight from firstFlight to lastFlight
(inclusive) receives the given number of seats.

Return an array answer where:

answer[i]

=

total seats booked for flight (i + 1)

Use the Difference Array technique.

------------------------------------------

Example 1:

Input:

5
3

1 2 10
2 3 20
2 5 25

Output:

10 55 45 25 25

Explanation:

Booking 1:

Flights 1-2
+10 seats

Booking 2:

Flights 2-3
+20 seats

Booking 3:

Flights 2-5
+25 seats

Final:

Flight1 = 10

Flight2 = 10 +20 +25 =55

Flight3 =20 +25 =45

Flight4 =25

Flight5 =25

------------------------------------------

Example 2:

Input:

3
2

1 3 5
2 2 4

Output:

5 9 5

------------------------------------------

Example 3:

Input:

4
1

3 4 8

Output:

0 0 8 8

------------------------------------------

Example 4:

Input:

5
2

1 5 2
3 4 3

Output:

2 2 5 5 2

------------------------------------------

Constraints:

- 1 <= n <= 2 × 10^4
- 1 <= bookings <= 2 × 10^4
- 1 <= first <= last <= n

Concepts Used:

- Difference Array
- Prefix Sum
- Range Updates
- 1-Based Indexing

Expected Approach:

1. Read n.
2. Create a Difference Array of size n.
3. Read the number of bookings.
4. For every booking:
      difference[first - 1] += seats
      if (last < n)
          difference[last] -= seats
5. Restore using Prefix Sum.
6. Print the final booking array.

Time Complexity:
O(n + bookings)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FDA008_CorporateFlightBookings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] flights = new int[size];

        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            System.out.print("Enter the first flight: ");
            int firstFlight = sc.nextInt();
            System.out.print("Enter the last flight: ");
            int lastFlight = sc.nextInt();
            System.out.print("Enter the number of seats: ");
            int seats = sc.nextInt();

            flights[firstFlight - 1] += seats;
            if (lastFlight < size) flights[lastFlight] -= seats; 
        }

        for (int i = 1; i < size; i++) {
            flights[i] += flights[i - 1];
        }

        for (int i = 0; i < size; i++) {
            System.out.print(flights[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Solving a real interview problem using the Difference Array technique with 1-based indexing.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Many interview problems disguise the Difference Array pattern using real-world scenarios.
- 1-based indexing from the problem statement must be converted to 0-based indexing for Java arrays.
- The update rules become:
      difference[first - 1] += seats
      if (last < n)
          difference[last] -= seats
- After reconstruction, the Difference Array itself becomes the final answer array.

Revision Date:
07-08-2026

Confidence (1-10):
10/10

==========================
*/