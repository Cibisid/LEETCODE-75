class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean[rooms.size()];
        dfs(rooms,vis,0);
        for(boolean i:vis) if(!i) return false;
        return true;
    }
    public void dfs(List<List<Integer>> rooms,boolean[] vis,int cur){
        if(vis[cur]) return ;
        vis[cur]=true;
        for(int i:rooms.get(cur)) dfs(rooms,vis,i);
    }
}