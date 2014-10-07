/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sueldo,ventas,km,sueldobruto;
        int dias;
        
        System.out.print("Sueldo Fijo : ");
            Scanner dato=new Scanner(System.in);
            sueldo=dato.nextFloat();
            
        System.out.print("Importe de Ventas : ");
            ventas=dato.nextFloat();            
        
        System.out.print("Km realizados : ");
            km=dato.nextFloat();
                    
        System.out.print("Dias desplazandose : ");
            dias=dato.nextInt();
        
            sueldobruto=(float) ((ventas*0.05)+(km*2)+sueldo+(dias*30));
            
        System.out.println("Sueldo bruto : "+sueldobruto);    
    }
    
}
