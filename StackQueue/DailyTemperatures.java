1️⃣ Template
/*
Problem: Daily Temperatures
LeetCode: https://leetcode.com/problems/daily-temperatures/
Pattern: Stack / Monotonic Stack
Time Complexity: O(n)
Space Complexity: O(n)

Approach:
- Use a stack to store indices
- Pop until current temperature is higher
- Calculate days difference
*/

2️⃣ Java solution

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int result[] = new int[temperatures.length];

        for(int i =0; i< temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()])
            {
                int removed = stack.pop();
                int ans = i-removed;
                // put into array
                result[removed]= ans;

            }

            stack.push(i);

        }

        return result;        
    }
}


3️⃣ Optional: main method for local testing
public class DailyTemperaturesTest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] temps = {73,74,75,71,69,72,76,73};
        int[] res = sol.dailyTemperatures(temps);
        for(int r : res) System.out.print(r + " ");
    }
}
