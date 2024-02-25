class Solution {
    int count;
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(root.val);
        count=0;
        dfs(root,pq);
        return count;
    }
    public void dfs(TreeNode root,PriorityQueue<Integer> pq){
        if (root == null) return;
    
    if (root.val >= pq.peek()) {
        count++;
    }

    pq.add(root.val);
    dfs(root.left, pq);
    dfs(root.right, pq);
    pq.remove(root.val);
    }
}