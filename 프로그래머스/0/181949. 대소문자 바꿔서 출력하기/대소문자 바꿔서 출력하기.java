import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] chars = a.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i] < 97){
                chars[i] = (char)(chars[i]+32);
            }else{
                chars[i] = (char)(chars[i]-32);
            }
        }
        a = String.valueOf(chars);
		System.out.println(a);
    }
}