public class MaximumWaterBetweenBuildings {
    
    /**
     * The task is to delete N-2 buildings such that the water that can 
     * be trapped between the remaining two building is maximum.
     * Note: The total water trapped between two buildings is gap between 
     * them (number of buildings removed) multiplied by height of the smaller building.
     * 
     * height[] = {2,1,3,4,6,5}
     * Output: 8
     * Explanation: The heights are 2 1 3 4 6 5.
     * So we choose the following buildings
     * 2,5  and remove others. Now gap between 
     * two buildings is equal to 4, and the
     * height of smaller one is 2. So answer is
     * 2 * gap = 2*4 = 8. There is
     * no answer greater than this.
     * @param arr
     * @return
     */
    public static int getMaxWater(int height[]){
        int left = 0, right = height.length - 1;
        int max = 0, min, gap;
        while(left < right){
            gap = (right - left - 1);
            min = Math.min(height[left], height[right]);
            max = Math.max(max, min * gap);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
