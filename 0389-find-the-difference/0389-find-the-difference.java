class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0; 
        int b = 0;
        for(int cs : s.toCharArray()) a += cs;
        for(int ct : t.toCharArray()) b += ct;
        return (char)(b-a);

    }
}