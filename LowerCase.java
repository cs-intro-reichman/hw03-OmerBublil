public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println (lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String ans = "";
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt (i);
            if (c >= 'A' && c <= 'Z'){
                c = (char) (s.charAt (i) + 32) ;
                ans += c;
            }
            else {
                ans += c;
            }
        }
        return ans;

    }
}