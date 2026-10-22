    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edexponenciaciónnumero;

import java.util.Scanner;

/**
 *
 * @author papu_master
 */
public class EdExponenciaciónNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y;
        double resu;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Programa que calcula la exponenciación de un número x elevado al valor y");
        System.out.println("¿Qué número quieres exponenciar?");
        x = lector.nextInt();
        System.out.println("¿A qué potencia quieres el exponente?");
        y = lector.nextInt();
        
        resu = calcularExponente(x,y);
        
        System.out.println(x + " a la potencia " + y + " es igual a: " + resu);
    }
    
    public static double calcularExponente(int x, int y){
        if(y > 0){
            return x * calcularExponente(x, y - 1);
        }else if(y < 0){
            return (1.0 / x) * calcularExponente(x, y + 1);
        }else{
            return 1;
        }
    }
    
}
