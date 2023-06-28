package Walmart;

/*  Given two Strings S and T of length N
You can perform the following operations on string s any number of times. 
a) Rotate it left by 1 character. This operations costs A rupees. Rotatign left means the first character of the string becomes last, the second character becomes the firast and the third character becomes the second and so on.

b) Change a character of string S to any other character. This operations costs B rupees.

Find the minimum cost to make string S euqal to string T.

Sample testcase 
Testcase input:- 
abc 
bka
output:- 7
*/

public class W1{
    public static String Left(String s, int k){
        String s1 = s.substring(0, k);
        String s2 = s.substring(k);
        return s2+s1;
    }

    public static int check(String s, String t){
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = new String();
        s = "ABC";
        String t = new String();
        t = "BKA";

        int cost_rotate, A=2, B=3, total_cost, diff_char, ans = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            String newString  = Left(s, i);
            cost_rotate = A*i;
            diff_char = check(newString, t);
            total_cost = cost_rotate + diff_char *B;
            ans = Math.min(ans,total_cost);
        }

        System.out.println(ans);
    }
}