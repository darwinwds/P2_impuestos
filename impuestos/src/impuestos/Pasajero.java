/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestos;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public abstract class Pasajero extends Vehiculo{
    private final Integer nuPasajeros;

    public Pasajero(String placa, String nuSerie, String marca, Integer modelo, Double valorFacture,Integer nuPasajeros) {
        super(placa, nuSerie, marca, modelo, valorFacture);
        this.nuPasajeros=nuPasajeros;
        
        
        
    }
    @Override
    public Double CalcularTenencia() {
       return this.getValorFacture() * CalcularBaseGravable();
    }
    public Integer getNuPasajeros() {
        return nuPasajeros;
    }

   
    
    
}
