package Amazon;

/*
    Two arrays A & B of length N. You need to select two integers i and j such that 1<= i <= j <= N
    and they meet the following condition:-
    Ai XOR Ai+1 ... XOR Aj-1 XOR Aj = Bi XOR Bi+1 ... XOR Bj-1 XOR Bj
    Let, G = j-i+1

    Task:- Output the maximum value of G if there exists two integers i and j satistfying all the condiitions, else print 0 on a new line. 
*/
import java.util.*;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Enter the elements for array a");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for array b");
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for(int i=0; i<n; i++){
            c[i] = a[i] ^ b[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        int goodrm = 0;
        int oo = 0;
        for(int i=1; i<n; i++){
            oo = oo ^ c[i];
            if(!map.containsKey(oo)){
                map.put(oo,i);
            }
            else{
                int G = Math.abs(i - map.get(oo));
                goodrm = Math.max(G, goodrm);
            }
        }
        System.out.println(goodrm);
        sc.close();
    }
}
