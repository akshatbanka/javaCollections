import java.util.*;

public class MaxAreaHistogram {

    public static int maxArea(int height[]) {
        int maxarea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
        Stack<Integer> s = new Stack<>();

        // next smaller right
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.empty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsr[i] = height.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();// empty stack

        for (int i = 0; i < height.length; i++) {
            while (!s.empty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // area = width *length (width = nsr[i]-nsl[i]-1)

        for (int i = 0; i < height.length; i++) {
            int length = height[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = length * width;
            maxarea = Math.max(currarea, maxarea);
        }
        return maxarea;
    }

    public static void main(String args[]) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        int max = maxArea(height);
        System.out.println("Maximum area of histogram : " + max);

    }
}