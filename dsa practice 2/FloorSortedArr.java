public class FloorSortedArr {
    public int floorSort( int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start< end){
            int mid = start+(end - start)/2;
            if (arr[mid]== target){
                return mid;
            }
            if (arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        FloorSortedArr fs = new FloorSortedArr();
        int[] arr = {1,3,5,6};
        int target  = 5;
        int pos = fs.floorSort(arr, target);
        System.out.println(pos);
    }
}