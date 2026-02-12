public class Execution {
    public static void main(String args[]){
        //0004 - Product Of Array Except Self
        int arr[]=A0004ProductOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4});
        showIntArrayResults(arr);
    }
    static void showIntArrayResults(int arr[]){
        for(int n:arr){
            System.out.print(n+"\t");
        }
        System.out.println();
    }
}

