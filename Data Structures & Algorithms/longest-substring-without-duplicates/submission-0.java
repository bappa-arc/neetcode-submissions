class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character, Integer> map= new HashMap<>();
        int maxlength=0;
        int left=0;
        for (int right=0;right<s.length();right++){
            char cur=s.charAt(right);
            if(map.containsKey(cur)){
                left=Math.max(left, map.get(cur)+1);
            }
            map.put(cur,right);
            maxlength=Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
}
