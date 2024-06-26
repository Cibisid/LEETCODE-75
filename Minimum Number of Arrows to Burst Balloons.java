class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b)->{
            return (a[1] < b[1]) ? -1 : 1;
        });
        Deque<int[]> pointsStack = new ArrayDeque<>();
        pointsStack.offerLast(points[0]);
        int size = points.length;
        for(int indx = 1; indx < size; indx++){
           int currEnd = points[indx][1], currStart = points[indx][0];
           while(!pointsStack.isEmpty() && pointsStack.peekLast()[1] >= currStart){
             var popInter = pointsStack.pollLast();
             currStart = Math.max(currStart, popInter[0]);
             currEnd = Math.min(currEnd, popInter[1]);
           }
           pointsStack.offerLast(new int[]{currStart, currEnd});
        }
        return pointsStack.size();
    }
}