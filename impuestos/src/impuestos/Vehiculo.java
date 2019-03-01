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
public abstract class Vehiculo {
    private String placa;
    private String nuSerie;
    private String marca;
    private Integer modelo;
    private Double valorFacture;

    public Vehiculo(String placa, String nuSerie, String marca, Integer modelo, Double valorFacture) {
        this.placa = placa;
        this.nuSerie = nuSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.valorFacture = valorFacture;
    }

    public abstract Double CalcularTenencia();
    
    public Double CalcularBaseGravable(){
        return this.modelo >= 2009 ? 0.05 : 0.02;
    }
    
        
    
     
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNuSerie() {
        return nuSerie;
    }

    public void setNuSerie(String nuSerie) {
        this.nuSerie = nuSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Double getValorFacture() {
        return valorFacture;
    }

    public void setValorFacture(Double valorFacture) {
        this.valorFacture = valorFacture;
    }



}

