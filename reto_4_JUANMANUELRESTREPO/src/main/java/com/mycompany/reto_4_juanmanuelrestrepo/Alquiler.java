package com.mycompany.reto_4_juanmanuelrestrepo;
public class Alquiler extends RegistroVehiculos {
    private String tipoDocumento;
    private String NumeroDocumento;
    private String NombreCompleto;
    String FechaInicio;
    String FechaFinal; //pensar en mejor forma para realizar las fechas.
    double ValorPagar;
    private String DescripcionUso;

    public Alquiler() {
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public double getValorPagar() {
        return ValorPagar;
    }

    public void setValorPagar(double ValorPagar) {
        this.ValorPagar = ValorPagar;
    }

    public String getDescripcionUso() {
        return DescripcionUso;
    }

    public void setDescripcionUso(String DescripcionUso) {
        this.DescripcionUso = DescripcionUso;
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