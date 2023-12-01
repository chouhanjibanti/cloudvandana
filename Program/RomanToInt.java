//  Program Convert Roman number into Integer Number
package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
    
    public int romanToInt(String s){

        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
         map.put('M', 1000);

         int result=0;

         for(int i=0;i<s.length();i++)
         {
            if(i>0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                 result += map.get(s.charAt(i))- 2*map.get(s.charAt(i-1));
            }else{
                 result += map.get(s.charAt(i));
            }
         }
         return result;
        
    }
     static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

       
        System.out.println("enter the Roman : ");
        String s1 = scan.next();
     
        // create object ref. variable of RomanToInt 
        RomanToInt rot = new RomanToInt();

        // call the romanToInt() help of ref variable of RomanToInt class 
        int res=rot.romanToInt(s1);
        System.out.println(res);
    }
}
