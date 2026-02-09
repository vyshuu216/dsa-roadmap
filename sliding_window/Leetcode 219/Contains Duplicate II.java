lass Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int val;
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        if(hm.containsKey(nums[i]))
        {
            val=hm.get(nums[i]);
            if(i-val<=k)
            {
                return true;
            }
        }
        hm.put(nums[i],i);
       }
       return false;
       
    }
}
