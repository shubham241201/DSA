class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();

        List<String> part = new ArrayList<>();

        helper(res, part, s, 0);

        return res;
    }

    private void helper(List<List<String>> res, List<String> part, String s, int i){
        if(i >= s.length()){
            res.add(new ArrayList<>(part));
            return;
        }

        for(int j = i; j < s.length(); j++){
            if(isPali(s, i, j)){
                part.add(s.substring(i, j+1));
                helper(res, part, s, j+1);
                part.remove(part.size()-1);
            }
        }
    }

    private boolean isPali(String s, int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l = l + 1;
            r = r - 1;
        }
        return true;
    }
}