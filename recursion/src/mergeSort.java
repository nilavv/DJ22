public class mergeSort {


    public static void main(String[] args){
        int arr[] = new int[]{12,24,-1};
        sort(arr,0,arr.length-1);
        for (int i:arr) {
            System.out.print(i+",");
        }
    }

    public static void sort(int[] arr,int start,int end){
        if(start<end){

            int mid = (start +end) / 2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,end,mid);
        }
    }

    public static void merge(int[] arr,int start,int end,int mid){
        int[] temp = new int[end-start+1];
        int i=start,j=end,k=0;
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];

            }
            else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=end){
            temp[k++]=arr[j++];
        }

        for(int l =start; l<=end;l++){
            arr[l]=temp[l-start];
        }
    }

}
