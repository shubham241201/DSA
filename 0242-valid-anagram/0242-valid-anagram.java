class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> yo = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            yo.put(ch, yo.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(yo.containsKey(ch) == false){
                return false;
            }
            else if(yo.get(ch) == 1){
                yo.remove(ch);
            }
            else{
                yo.put(ch, yo.get(ch) - 1);
            }
        }
        return true;
    }
}