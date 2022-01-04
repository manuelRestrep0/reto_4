package com.mycompany.reto_4_juanmanuelrestrepo;
public class Seguro extends Alquiler {
    private String Empresa;
    private String DescripcionSeguro;

    public Seguro() {
    }

    public Seguro(String Empresa, String DescripcionSeguro, String FechaInicio, String FechaFinal, int id) {
        super(FechaInicio, FechaFinal, id);
        this.Empresa = Empresa;
        this.DescripcionSeguro = DescripcionSeguro;
    }
    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getDescripcionSeguro() {
        return DescripcionSeguro;
    }

    public void setDescripcionSeguro(String DescripcionSeguro) {
        this.DescripcionSeguro = DescripcionSeguro;
    }

    
    
}
