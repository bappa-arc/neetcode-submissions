class Solution {
    public boolean isPalindrome(String s) {
        for (int i=0, j=s.length()-1 ;i<s.length() && i<j;){
            char ic=s.charAt(i);
            char jc=s.charAt(j);
            if(!Character.isLetterOrDigit(ic)){
                i++;

            }else if(!Character.isLetterOrDigit(jc)){
                j--;
            }else if(Character.toLowerCase(ic)!=Character.toLowerCase(jc)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
