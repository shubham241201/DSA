class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s= s.replace(" ", "");
        s= s.replaceAll("\\p{Punct}", "");
        String ans = "";
        for(int i = 0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            if(ch==(':') || ch==(',')){
                continue;
            }
            ans = ch + ans;
        }
        if ( ans.equals(s)){
            return true;
        }
        return false;
    }
}