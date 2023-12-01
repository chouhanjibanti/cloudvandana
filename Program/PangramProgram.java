// check input is pangram or not.
package Program;

public class PangramProgram {
    
    public static void main(String[] args) {
        
         String s1 = "The Quick brown for jumps over the lazy dog hx";
        //  System.out.println(isPangram(s1.toLowerCase()));
         if (isPangram(s1.toLowerCase())) {
            System.out.println("Given input is pangram");
         } else {
            System.out.println("Given input is not pangram");
         }
    }

    public static boolean isPangram(String s1){
        
        if(s1.length()<26)
        {
            return false;
        }else{
            for(char ch='a';ch<='z';ch++){
                if(s1.indexOf(ch)<0){   // indexOf()--> If char is present in String return 1 or else return 0.
                    return false;
                }
            }
        }
         return true;
    }
}
