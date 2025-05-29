import java.util.Scanner;

public class A19_Rat_Problem {

    public static int solve(int r, int unit, int arr[], int n){
        if(arr == null)
            return -1;

        int res = r * unit;
        int sum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            count++;
            if(sum>=res)
              break;
        }//for

        if(sum<res)
            return 0;
        return count;

    }// method


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rats:");
        int r = sc.nextInt();
        System.out.println("Enter the value of unit how rats eat food :");
        int unit = sc.nextInt();
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the value of arr(how food quantity at each home)");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
       System.out.println(solve(r, unit, arr, n));


    }
}
