package com.mycompany.reto_4_juanmanuelrestrepo;
public class Seguro {
    private String Empresa;
    private String DescripcionSeguro;
    long Dias;

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

    public long getDias() {
        return Dias;
    }

    public void DiasSeguro(long Horas)
    {
        long DiasAux = Horas/24;
        this.Dias = DiasAux;
    }

}