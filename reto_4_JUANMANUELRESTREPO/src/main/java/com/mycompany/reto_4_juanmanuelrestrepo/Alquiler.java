package com.mycompany.reto_4_juanmanuelrestrepo;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Alquiler {
    private String tipoDocumento;
    private String NumeroDocumento;
    private String NombreCompleto;
    String FechaInicio;
    String FechaFinal; //pensar en mejor forma para realizar las fechas.
    double ValorPagar;
    long Horas;
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

    public long getHoras() {
        return Horas;
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


    public void HorasAlquiler(String FechaInicial, String FechaFinal)
    {
        String[] FechaAux = FechaInicial.split("/");
        Calendar Fecha1 = Calendar.getInstance();
        Fecha1.set(Integer.parseInt(FechaAux[0]),Integer.parseInt(FechaAux[1])-1,Integer.parseInt(FechaAux[2]));
        FechaAux = FechaFinal.split("/");
        Calendar Fecha2 = Calendar.getInstance();
        Fecha2.set(Integer.parseInt(FechaAux[0]),Integer.parseInt(FechaAux[1])-1,Integer.parseInt(FechaAux[2]));
        Date Hora1 = Fecha1.getTime();
        Date Hora2 = Fecha2.getTime();
        long miliseg = Math.abs(Hora1.getTime() - Hora2.getTime());
        long HorasAux = TimeUnit.MILLISECONDS.toHours(miliseg);
        this.Horas = HorasAux;
    }
}