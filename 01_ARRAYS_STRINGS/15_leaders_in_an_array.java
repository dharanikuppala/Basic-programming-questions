/*
Q – Leaders in an Array

Problem Statement
Given an array of integers, print all the leaders in the array.
An element is said to be a leader if it is greater than or equal to all the elements to its right.
The rightmost element is always a leader.

Input Format
The first line contains an integer N — the size of the array
The second line contains N space-separated integers

Output Format
Print all the leaders in the array in the order they appear

Sample Input
6
16 17 4 3 5 2

Sample Output
17 5 2
Explanation (VERY IMPORTANT for interviews)

Traverse from right to left:

2 → leader (rightmost)
5 → greater than 2 → leader
3 → not greater than 5 → ❌
4 → not greater than 5 → ❌
17 → greater than 5 → leader
16 → not greater than 17 → ❌

Leaders = 17 5 2

💡 Key Pattern = Right → Left traversal + track max
*/

import java.util.*;

class Leaders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = leaders(arr, n);

        for(int x : ans){
            System.out.print(x + " ");
        }
    }

    public static int[] leaders(int[] arr, int n){
        ArrayList<Integer> list = new ArrayList<>();

        int leader = Integer.MIN_VALUE;

        // FIXED LOOP
        for(int i = n - 1; i >= 0; i--){
            if(arr[i] >= leader){
                list.add(arr[i]);
                leader = arr[i];
            }
        }

        Collections.reverse(list);

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
