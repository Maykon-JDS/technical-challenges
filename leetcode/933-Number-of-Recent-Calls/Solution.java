class RecentCounter {

    ArrayDeque<Integer> requests;

    public RecentCounter() {

        this.requests = new ArrayDeque<>();

    }

    public int ping(int t) {

        requests.addLast(t);

        while (!requests.isEmpty() && requests.peekFirst() < t - 3000) {
            requests.pollFirst();
        }

        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */