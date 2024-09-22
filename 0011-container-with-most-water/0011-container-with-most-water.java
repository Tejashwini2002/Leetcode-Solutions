class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0; // maximum area which can be obtained by the container
        int lp = 0, rp = (height.length)-1;/*initially the left pointer lp points to the index 0, and rp points to the index n-1 of the array of heights */
        int curr_area; // area of the current container 
        while(lp<rp){
            int width = rp-lp; // width means base of the container
            int minheight = Math.min(height[lp],height[rp]);
            curr_area = width * minheight;
            maxArea = Math.max(maxArea,curr_area);
            
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxArea;
    }
}