/*
Problem: LeetCode #49 - Group Anagrams
Approach:
Sort each word alphabetically to create a common key for anagrams.
Use a HashMap to group words that share the same sorted key.
Time Complexity: O(n * k log k)
Space Complexity: O(n * k)
n = number of strings, k = maximum length of a string
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> map = new HashMap<>(); 

    for(int i = 0; i < strs.length; i++){
    String current = strs[i];
    char[] letters = current.toCharArray();
    Arrays.sort(letters);
    String sortedWord = new String(letters);
    if (map.containsKey(sortedWord)){
        map.get(sortedWord).add(current);    
    }
    else {
        List<String> group = new ArrayList<>();
        group.add(current);
        map.put(sortedWord, group);
    }
    
    }return new ArrayList<>(map.values());
    }
}
    
