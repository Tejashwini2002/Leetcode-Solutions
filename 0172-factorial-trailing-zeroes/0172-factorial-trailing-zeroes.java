class Solution {
    public int trailingZeroes(int n) {
        int number_of_trailing_zeroes=0;
        while(n!=0){
            number_of_trailing_zeroes = number_of_trailing_zeroes +  n/5;
            n = n/5;
        }
        return number_of_trailing_zeroes;
    }
}