package com.mycompany.reto_4_juanmanuelrestrepo;
public class Seguro extends Alquiler {
    private String Empresa;
    private String DescripcionSeguro;

    public Seguro() {
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

    @Override
    public String getFechaInicio() {
        return FechaInicio;
    }

    @Override
    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    @Override
    public String getFechaFinal() {
        return FechaFinal;
    }

    @Override
    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    

}