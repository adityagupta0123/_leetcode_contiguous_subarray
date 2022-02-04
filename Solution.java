class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int max =0 ;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0)
                sum--;
            else if(nums[i] == 1)
                sum++;
            
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                if(len > max)
                    max = len;
            }else{
                map.put(sum,i);
            }
            
        }
        return max;
        
    }
}
