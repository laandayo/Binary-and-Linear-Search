package Common;

public class Algorithm {
	public int binaryS (int[] arr, int target) {
		int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
	
	public int linearS (int[] arr, int target) {   
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == target) {    
                return i;    
            }    
        }    
        return -1;    
	}
}
