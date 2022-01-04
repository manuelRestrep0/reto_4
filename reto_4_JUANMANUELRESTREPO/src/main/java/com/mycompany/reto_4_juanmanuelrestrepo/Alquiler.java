package com.mycompany.reto_4_juanmanuelrestrepo;
public class Alquiler extends RegistroVehiculos {
    private String tipoDocumento;
    private double NumeroDocumento;
    private String NombreCompleto;
    String FechaInicio;
    String FechaFinal; //pensar en mejor forma para realizar las fechas.
    double ValorPagar;
    private String DescripcionUso;

    public Alquiler(String FechaInicio, String FechaFinal, int id) {
        super(id);
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
    }

    public Alquiler() {
    }

    public Alquiler(String tipoDocumento, double NumeroDocumento, String NombreCompleto, String FechaInicio, String FechaFinal, double ValorPagar, String DescripcionUso, int id) {
        super(id);
        this.tipoDocumento = tipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.NombreCompleto = NombreCompleto;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.ValorPagar = ValorPagar;
        this.DescripcionUso = DescripcionUso;
    }

    public Alquiler(String tipoDocumento, double NumeroDocumento, String NombreCompleto, String FechaInicio, String FechaFinal, double ValorPagar, String DescripcionUso) {
        this.tipoDocumento = tipoDocumento;
        this.NumeroDocumento = NumeroDocumento;
        this.NombreCompleto = NombreCompleto;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.ValorPagar = ValorPagar;
        this.DescripcionUso = DescripcionUso;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public double getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(double NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getDescripcionUso() {
        return DescripcionUso;
    }

    public void setDescripcionUso(String DescripcionUso) {
        this.DescripcionUso = DescripcionUso;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public double getValorPagar() {
        return ValorPagar;
    }
    
    
}
