class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int l=0,r=height.length-1;
        while(l<r){
            int width=r-l;
            int ht=Math.min(height[l],height[r]);
            area=Math.max(area,width*ht);
            if(height[l]<=height[r]) l++;
            else r--;
        }
        return area;
        
    }
}