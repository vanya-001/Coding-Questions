package Atlassian;
import java.util.*;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrray");
        int n = sc.nextInt();

        System.out.println("Enter the elements in array");
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements to be taken");
        int k = sc.nextInt();

        Arrays.sort(a, 1, n+1);

        int[] prefix = new int[n];
        prefix[0] = 0;
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + a[i];
        }
        int final_ans = 0;
        int my = (int) 1e18;

        for(int i=0; i<=n-k+1; i++){
            int start = i;
            int d = k+i-1;
            if(k%2 != 0){
                int mid = a[(start+d)/2];
                // Start--> md-1
                int l1 = Math.abs(mid-start);
                int sum1 = (start > 0) ? prefix[mid - 1] - prefix[start - 1] : prefix[mid - 1];
                int ans1 = Math.abs(l1*a[mid]-sum1);

                // md+1-->d
                int l2 = Math.abs(d-mid);
                int sum2 = prefix[d] - prefix[mid];
                int ans2 = Math.abs(l2*a[mid] - sum2);

                final_ans = ans1 + ans2;
                my = Math.min(my, final_ans);
            }
            else{
                int mid1 = a[(start+d)/2];
                int mid2 = a[mid1+1];
                // Start--> md-1
                int l1 = Math.abs(mid1-start);
                int sum1 = (start > 0) ? prefix[mid1 - 1] - prefix[start - 1] : prefix[mid1 - 1];
                int ans1 = Math.abs(l1*a[mid1]-sum1);

                // md+1-->d
                int l2 = Math.abs(d-mid1);
                int sum2 = prefix[d] - prefix[mid1];
                int ans2 = Math.abs(l2*a[mid1] - sum2);

                final_ans = ans1 + ans2;
                my = Math.min(my,final_ans);

                // Start--> md-1
                l1 = Math.abs(mid2-start);
                sum1 = (start > 0) ? prefix[mid2 - 1] - prefix[start - 1] : prefix[mid2 - 1];
                ans1 = Math.abs(l1*a[mid2]-sum1);

                // md+1-->d
                l2 = Math.abs(d-mid2);
                sum2 = prefix[d] - prefix[mid2];
                ans2 = Math.abs(l2*a[mid2] - sum2);

                final_ans = ans1 + ans2;
                my = Math.min(my, final_ans);
            }
            }
            System.out.println(my);
            sc.close();
    }
}
