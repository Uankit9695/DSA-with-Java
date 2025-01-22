package Array;

public class MinValue {

    static int minvalue(int arr[]){
        int ans =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,5,6,3,4,7,9};
        System.out.println(minvalue(arr));

    }
}
