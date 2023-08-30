class Solution {
    public List<String> letterCombinations(String digits) {
        return helper("", digits);
    }
    
    static List<String> helper(String ans, String ip){
         if(ip.isEmpty()) {
            if(ans.isEmpty()){
                ArrayList<String> empty = new ArrayList<>();
                return empty;
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(ans);
                return list;
            }
            
        }
        
        int digit = ip.charAt(0) - '0';
        int i=(digit-2)*3;
        if(digit > 7) {
            i+=1;
        }
       
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }
        
        ArrayList<String> list = new ArrayList<>();
                
        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(helper(ans+ch, ip.substring(1)));
        }
        
        return list;
    }
}  