/*5. Pedir un número e indicar si es positivo o negativo.
 */

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class E5 {
    public static void main(String[] args) {
        try (//<editor-fold defaultstate="collapsed" desc="comment">
        Scanner sc = new Scanner(System.in)) {
            int num;
            System.out.print("Introduce un número: ");
            num=sc.nextInt();
            
            if( num < 0)
                System.out.println("Negativo");
            else
                // suponemos que el 0 es positivo.
                System.out.println("Positivo");
//</editor-fold>
        }
        }
}
