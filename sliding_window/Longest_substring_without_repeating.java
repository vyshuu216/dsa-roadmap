class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int i=0;
        int max=0;
        HashSet<Character> h=new HashSet<>();
        for(int j=0;j<s.length();j++)
        {
            while(h.contains(s.charAt(j)))
            {
                h.remove(s.charAt(i));
                i++;
            }
            h.add(s.charAt(j));
            max=Math.max(max,h.size());
        }
        return max;
    }
}
