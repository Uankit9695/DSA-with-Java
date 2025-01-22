package Sarching;

public class OrderAgnostic {
    static int orderagonastic(int arr[], int targer){
        int start=0;
        int end= arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==targer){
                return mid;
            }
            if(isAsc){
                if(targer<arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(targer>arr[mid]){
                    end= mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,10,11,13,16};
        int arr1[]={22,21,18,14,15,11,6,5,4,2};
        int target =11;
        System.out.println(orderagonastic(arr,target));
        System.out.println(orderagonastic(arr1,target));
    }
}
