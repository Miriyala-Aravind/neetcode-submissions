class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length() || s == null || t == null)
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray); 

    }
}
