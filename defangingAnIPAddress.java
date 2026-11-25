class Solution {
    public String defangIPaddr(String address) {
        String defangIP = "";

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defangIP += "[.]";
            }
            else {
                defangIP += address.charAt(i);
            }
        }
        return defangIP;
    }
}