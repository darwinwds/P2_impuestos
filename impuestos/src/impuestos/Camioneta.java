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
public class Camioneta extends Carga{

    public Camioneta(String placa, String nuSerie, String marca, Integer modelo, Double valorFacture, Integer tonelada, boolean publico) {
        super(placa, nuSerie, marca, modelo, valorFacture, tonelada, publico);
    }
    
    @Override
    public Double CalcularTenencia() {
        return super.CalcularTenencia(); 
    }
    
}
