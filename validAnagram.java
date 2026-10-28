class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            counts.put(current, counts.getOrDefault(current, 0)+1);
            
}
        for (int j =0; j < t.length(); j++){
            char current = t.charAt(j);
            if (!counts.containsKey(current) || counts.get(current)==0) {
            return false;
            
}counts.put(current, counts.get(current)-1);
            }
    

return true;    }
}
