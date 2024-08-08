import java.util.Scanner;

public class AvgOfArr {
    public static void main(String[] args) {
        int arr[] = new int[4];
        int sum = 0;
        double avg=0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum=sum+arr[i];

        }
        avg = sum/4.0;
        System.out.println(avg);
        sc.close();
    }
    
}
