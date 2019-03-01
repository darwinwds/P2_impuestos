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
public class Camion extends Carga{
    private Integer ejes;
    public Camion(String placa, String nuSerie, String marca, Integer modelo, Double valorFacture, Integer tonelada, boolean publico,Integer ejes) {
        super(placa, nuSerie, marca, modelo, valorFacture, tonelada, publico);
        this.ejes=ejes;
    }

    @Override
    public Double CalcularBaseGravable() {
        return super.CalcularBaseGravable() *(1+ejes*0.01);//To change body of generated methods, choose Tools | Templates.
    }
    
        
    public Integer getEjes() {
        return ejes;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }
    
}
