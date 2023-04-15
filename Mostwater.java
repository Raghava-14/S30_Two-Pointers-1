//Brute force

/*           Time Limit exceeds!!!
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        
        // Loop through all possible pairs of lines
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // Calculate the area of the container formed by the current pair of lines
                int area = Math.min(height[i], height[j]) * (j-i);
                
                // Update the maximum area if the current area is greater
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        
        return maxArea;
    }
}

*/

//Two pointers

//Time = O(n)
//Space = O(1)

class Solution {
    public int maxArea(int[] height) {
        int left = 0; // initialize left pointer to the start of the array
        int right = height.length - 1; // initialize right pointer to the end of the array
        int maxArea = 0; // initialize maxArea to 0
        while (left < right) { // loop until left pointer is less than right pointer
            int area = Math.min(height[left], height[right]) * (right - left); // calculate the area of the container
            maxArea = Math.max(maxArea, area); // update maxArea if necessary
            if (height[left] < height[right]) { // move the pointer with the smaller height
                left++;
            } else {
                right--;
            }
        }
        return maxArea; // return the maximum area
    }
}
