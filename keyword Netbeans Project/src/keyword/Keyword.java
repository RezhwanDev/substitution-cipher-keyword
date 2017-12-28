/**
 * @author Rezhwan Sidiq
 * 21/Nov/2017
 * 22:10
 */
package keyword;
import java.util.Arrays;
    import java.util.Scanner;
        public class Keyword {
        
char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l', 'm',
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
char[] keyalpha =new char[alpha.length];
static Scanner sob= new Scanner(System.in);
        
    public void word(String keyword){
   char[] keychar=keyword.toCharArray();
   int count=0;
   
        for (int i = 0; i < keychar.length; i++) {
            keyalpha[count++]=keychar[i];
        }
        for (int i = 0; i < alpha.length; i++) {
            boolean x=false;
            for (int j = 0; j < keychar.length; j++) {
                if (alpha[i] == keyalpha[j]) {
                    x=true;
                }   }
            if (x == false) {
                keyalpha[count++]=alpha[i];
            }
        }
        System.out.println(Arrays.toString(alpha));
        System.out.println(Arrays.toString(keyalpha));
    }
    
    public void enc(String Plain){
       char[] charPlain=Plain.toCharArray();
        for (int i = 0; i < charPlain.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (charPlain[i] == alpha[j]) {
                    System.out.print(keyalpha[j]);
                    
                }
            }
        }System.out.println("");
    }
    
    public void dec(String cipher){
       char[] charcipher=cipher.toCharArray();
        
       for (int i = 0; i < charcipher.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (charcipher[i] == keyalpha[j]) {
                    System.out.print(alpha[j]);
                    
                }
            }
        }
        System.out.println("");
    
    }

        public static void main(String[] args) {
            Keyword cob = new Keyword();
            cob.word("rezhwan");
            cob.enc("abcdef");
            cob.dec("rezhwan");
            
    }
}
/*Output
[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
[r, e, z, h, w, a, n, b, c, d, f, g, i, j, k, l, m, o, p, q, s, t, u, v, x, y]
bwggk
hello
*/