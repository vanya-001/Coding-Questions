package Accenture;

import java.util.*;

/*
 * There are n bulbs that are intially off. You first turn on all the bulbs, then you turn off all the bulb.
 * On the third round, you toggle every third bulb (turning on if its off or turning off if its on).
 * For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
 * Return the number of bulbs that are on after the n rounds.
 */
public class ToggleBulb {
    public static void bulbToggle(int n) {
        double a;
        a = Math.sqrt(n);
        System.out.println(Math.abs(a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bulbToggle(n);
        sc.close();
    }
}
