import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) > 'Z') b = b + (char)(a.charAt(i) - 32);
            else b = b + (char)(a.charAt(i) + 32);
        }
        System.out.println(b);
    }
}