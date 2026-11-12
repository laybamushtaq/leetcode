class Solution {
    public int numberOfSteps(int num) {
       int zero = num;
       int steps = 0;

       while (zero >0){
        if (zero%2 == 0){
            zero = zero/2;
            steps++;
        } else{
            zero--;
            steps++;
        }
       }
return steps;
    } 
}
