public class isSorted {


    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};

        System.out.print(checkSort(arr,arr.length-1));

    }

    public static int checkSort(int[] arr, int index){
        if(arr.length<=1) return 1;

        if(arr[index-1]<arr[index-2]){
            return 0;
        }
        else return checkSort(arr,index+1);




        }

    }

