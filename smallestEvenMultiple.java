class Solution {
    public int smallestEvenMultiple(int n) {
        int x = n;
        
        if (x%2==0){
            x = n;
        }
        while (x%2!=0){
            x+=n;
        }
        return x; 
    }
}