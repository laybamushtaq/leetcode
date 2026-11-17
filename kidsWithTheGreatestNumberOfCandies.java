class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int max = 0;
     List<Boolean> result = new ArrayList<>();

     for (int i = 0; i < candies.length; i++){
        if (max < candies[i]){
            max = candies[i];
        }
     }   
    for (int j =0; j < candies.length; j++){
        result.add(candies[j] + extraCandies >= max);
    }
return result;
    }
}
