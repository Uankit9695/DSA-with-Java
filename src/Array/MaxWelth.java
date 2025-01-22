package Array;

public class MaxWelth {

    static int maximumwelth(int accounts [][]){
        int max=Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int rowsum=0;
            for (int account=0;account<accounts[person].length;account++){
                rowsum =rowsum+accounts[person][account];
            }
            if(rowsum>max){
                max=rowsum;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][]={
                {4,1,3},
                {1,2,3},
                {3,4,9}

        };
        System.out.println(maximumwelth(arr));
    }
}
