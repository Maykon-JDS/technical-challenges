package codility.FloodDepth;
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    public int solution(int[] A) {
        int n = A.length;
        if (n < 3) return 0; // não pode formar um vale

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Construir o array de máximos à esquerda
        leftMax[0] = A[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], A[i]);
        }

        // Construir o array de máximos à direita
        rightMax[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], A[i]);
        }

        int maxDepth = 0;

        // Calcular a profundidade da água em cada posição
        for (int i = 0; i < n; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - A[i];
            if (water > 0) {
                maxDepth = Math.max(maxDepth, water);
            }
        }

        return maxDepth;
    }

}
