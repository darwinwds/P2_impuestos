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
public class Carga extends Vehiculo {
    private Integer tonelada;
    private boolean publico;
    public Carga(String placa, String nuSerie, String marca, Integer modelo, Double valorFacture,Integer tonelada,boolean publico) {
        super(placa, nuSerie, marca, modelo, valorFacture);
        this.publico=publico;
        this.tonelada=tonelada;
    }

    @Override
    public Double CalcularBaseGravable() {
        if(!this.publico)
            return super.CalcularBaseGravable();
        else{
            return this.getModelo() >= 2009 ? 0.05 : 0.01;
         
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
    public Integer getTonelada() {
        return tonelada;
    }

    public void setTonelada(Integer tonelada) {
        this.tonelada = tonelada;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    @Override
    public Double CalcularTenencia() {
        return this.getValorFacture() * 1 + (this.tonelada / 10.0 * CalcularBaseGravable());
    }

  
    
}
