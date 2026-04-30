class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

       for (int i = 0; i < stones.length ; i++){
        pq.offer(stones[i]);
       }

       while(pq.size()>1){
        int stone1 = pq.poll();
        int stone2 = pq.poll();

        if(stone2< stone1)
            pq.offer(stone1-stone2);
       }

       if(pq.isEmpty())
        return 0;


        return pq.peek();

        
        
    }
}
