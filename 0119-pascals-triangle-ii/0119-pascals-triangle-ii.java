class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element

        /* There is zero-based indexing for both rows and columns here. */
        //calculate the rest of the elements:
        for (int col = 1; col <= rowIndex; col++) {
            ans = ans * ((rowIndex - col)+1);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}