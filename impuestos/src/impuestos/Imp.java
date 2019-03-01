/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestos;

import java.util.ArrayList;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class Imp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Particular particular = new Particular("asd", "12312", "honda", 2012, 240000.0, 5);
        System.out.println(particular.CalcularTenencia());
        
        Camioneta camioneta = new Camioneta("asd2", "12312", "honda", 2012, 240000.0, 5,false);
        System.out.println(camioneta.CalcularTenencia());
        
        Taxi taxi = new Taxi("asd3", "123456", "susuki", 2008,190000.0 ,5 , 2);
        System.out.println(taxi.CalcularTenencia());
        
        Camion camion = new Camion("asd4", "12345", "dodge", 2012, 220000.0, 2, true, 2);
        System.out.println(camion.CalcularTenencia());
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        
        vehiculos.add(particular);
        vehiculos.add(taxi);
        vehiculos.add(camioneta);
        vehiculos.add(camion);
       
        for(Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.getPlaca());
            
        }
        //ArrayList<Vehiculo>
                
                
                
               
    }
    
}
