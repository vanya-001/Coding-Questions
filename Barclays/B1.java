package Barclays;
import java.util.*;

/*
Stephen is doint an internship for N days, he may choose either an easy task or difficult task. He may also choose to perform no taks at all. He choosed a difficult task on days when only when he did not perform any work the previoud day. The amount paid by the company for both the easy and difficult tasks can vary each day, but the company always pays more for difficult tasks.
Write an algorithm to help stephen earn the maximum salary.
 */

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] easy = new int[5];
        int[] hard = new int[5];
        int[][] dp = new int[5][5];
        System.out.println("Enter elements for array easy:");
        for(int i=0; i<5; i++){
            easy[i] = sc.nextInt();
        }
        System.out.println("Enter elements for array hard:");
        for(int i=0; i<5; i++){
            hard[i] = sc.nextInt();
        }

        dp[0][0] = easy[0];
        dp[0][1] = hard[0];
        dp[0][2] = 0;
        
        for(int i=1; i<=5; i++){
            dp[i][1] = easy[i] + Math.max(dp[i-1][1],Math.max(dp[i-1][2], dp[i-1][3]) );
            dp[i][2] = hard[i] + dp[i-1][3];
            dp[i][3] = 0 + Math.max(dp[i-1][1],Math.max(dp[i-1][2], dp[i-1][3]) );
        }

        System.out.println(Math.max(dp[5][1],Math.max(dp[5][2], dp[5][3]) ));
        sc.close();
    }
}
