class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char x = ' ';

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j < t.length(); j++) {
            char current = t.charAt(j);

            if (map.containsKey(current) && map.get(current) > 0) {
                map.put(current, map.get(current) - 1);
            } else {
                x = current;
            }
        }

        return x;
    }
}
