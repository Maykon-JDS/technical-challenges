import java.util.*;

class Solution {

    HashMap<Integer, Integer> cache;

    public Solution() {
        this.cache = new HashMap<>();

        cache.put(0, 0);
        cache.put(1, 1);
        cache.put(2, 1);
    }

    public int fib(int n) {
        if (cache.get(n) != null) return cache.get(n);
        if (n < 0) return 0;

        cache.put(n, fib(n - 1) + fib(n - 2));
        return cache.get(n);
    }
}