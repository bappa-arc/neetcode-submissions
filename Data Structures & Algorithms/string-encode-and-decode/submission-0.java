class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();
        for (String str : strs){
            int n = str.length();
            encodedStr.append(n).append("#").append(str);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStr = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int sharpIndex = str.indexOf('#', i);
            int n = Integer.parseInt(str.substring(i, sharpIndex));
            String s = str.substring(sharpIndex + 1, sharpIndex + 1 + n);
            decodedStr.add(s);
            i = sharpIndex + 1 + n;
        }
        return decodedStr;
    }
}