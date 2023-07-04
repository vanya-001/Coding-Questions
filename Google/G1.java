package Google;
import java.util.*;

/* Count Pairs
    You are given the following 
    1) Integer n,c,d
    2) Array a as a1,a2,..., an of length n
    3) Array b as b1,b2,..., bn of length n

    Task
    Determine the number of pairs(i,j):
    (1<=i<j<=n) satisfying the Inequality 
    (ai - aj + c) = (bi - bj + d)
*/ 


public class G1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int c,d;
        System.out.println("Enter elements in array - a");
        for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter elements in array - b");
        for(int i=0; i<5; i++){
            b[i] = sc.nextInt();
        }

        System.out.println("Enter the numbers c & d");
        c = sc.nextInt();
        d = sc.nextInt();   
        int k = d - c;

        int count  = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<4; i++){
            int x = a[i] - b[i];
            m.put(x, m.getOrDefault(x,0) + 1);
            int y = x + k;
            m.put(y, m.getOrDefault(y, 0)+ 1);
            if(m.get(x) == m.get(y)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
