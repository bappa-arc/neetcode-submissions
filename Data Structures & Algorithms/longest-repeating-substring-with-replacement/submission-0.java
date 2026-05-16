class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxcount = 0;
        int l = 0;
        int maxlength=0;

        for (int r=0; r < s.length(); r++){
            maxcount = Math.max(maxcount, ++count[s.charAt(r) - 'A']);
            if (r-l+1-maxcount > k){
                --count[s.charAt(l++) - 'A'];
            }
            maxlength=Math.max(maxlength, r-l+1);
        }
        return maxlength;
    }
}
