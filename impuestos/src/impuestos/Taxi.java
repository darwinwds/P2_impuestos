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
public class Taxi extends Pasajero{
    private Integer anios;
    public Taxi(String placa, String nuSerie, String marca, Integer modelo, Double valorFacture, Integer nuPasajeros,Integer anios) {
        super(placa, nuSerie, marca, modelo, valorFacture, nuPasajeros);
        this.anios=anios;
    }

    @Override
    public Double CalcularTenencia() {
        return super.CalcularTenencia(); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getAnios() {
        return anios;
    }

    public void setAnios(Integer anios) {
        this.anios = anios;
    }
    
    
}
