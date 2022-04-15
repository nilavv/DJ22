public class BinarySearch {
    public static void main(String[] args) {
        int[] arr  = new int[]{1,22,300,420,5423,654,7,8,9};

        System.out.println("The index for 5423 is "+search(arr,0,arr.length-1,5423));
    }

    private static int search(int[] arr, int left, int right, int x) {
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(x<arr[mid]){
            return search(arr,left,mid,x);
        }
        else{
            return search(arr,mid+1,right,x);
        }

    }
}
