class SmallestInfiniteSet {
    HashSet<Integer> set;   // set that will conatins any removed element
    int min = 1;    // min element in non-removed universal set
    public SmallestInfiniteSet() {
        set = new HashSet<>();
    }
    
    public int popSmallest() {
        while(set.contains(min)) min++;        
        set.add(min);
        return min;
    }
    
    public void addBack(int num) {
        if(set.contains(num)){
            min = Math.min(num,min);
            set.remove(num);
        }
    }
}
