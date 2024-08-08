import java.util.Scanner;

public class ArrRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.println("enter element at arr"+i);
            arr[i]=sc.nextInt();
        }

        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
