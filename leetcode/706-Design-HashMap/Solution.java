class MyHashMap {

    List<Integer> keys = new ArrayList<Integer>();
    List<Integer> values = new ArrayList<Integer>();

    public MyHashMap() {
    }

    public void put(int key, int value) {

        int index = this.keys.indexOf(key);

        if(index != -1){
            this.values.set(index, value);
            return;
        }

        this.keys.add(key);
        this.values.add(value);
    }

    public int get(int key) {
       int index = this.keys.indexOf(key);

        if(index == -1){
            return -1;
        }

        return this.values.get(index);
    }

    public void remove(int key) {
        int index = this.keys.indexOf(key);

        if(index == -1){
            return;
        }

        this.keys.remove(index);
        this.values.remove(index);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */