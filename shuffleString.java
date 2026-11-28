class Solution {
    public String restoreString(String s, int[] indices) {
        int i = 0;
        char[] st = new char[s.length()];

        while (i < indices.length) {
            st[indices[i]] = s.charAt(i);
            i++;
        }

        return new String(st);
    }
