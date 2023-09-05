package Barclays;
// Seating Arrangement in Exam Hall

// Problem Statement  :
// Semester exams are going on for university students. Examiners noticed that a group of people are trying to cheat. They marked students of that group as ‘1’ and students of another group ( who are not cheating ) as ‘0’ 

// We can reduce cheating by not allowing students from group 1 to sit together, means no two students from group 1 can sit together. Seatings are marked using above conditions. Your task is to give the seating placement of nth possibility. Possibility order from 1 to 10 is given below

// [1  10  100  101  1000  1001  1010  10000  10001  10010]

import java.util.*;

public class B4 {
    public static void possibilities(int n) {
        int c = 0;
        String b = "";
        for (int i = 1; n != c; i++) {
            String s = Integer.toString(i, 2);
            if (!s.contains("11")) {
                c++;
                b = s;
            }
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int a[] = new int[tc];
        for (int i = 0; i < tc; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < tc; i++) {
            possibilities(a[i]);
        }
    }
}
