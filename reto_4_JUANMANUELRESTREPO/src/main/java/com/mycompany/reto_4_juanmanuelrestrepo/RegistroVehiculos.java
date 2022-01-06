
package com.mycompany.reto_4_juanmanuelrestrepo;
public class RegistroVehiculos {
    
    public int id;
    private String Placa;
    private String Descripcion_Vehiculo;
    private String Tipo_Vehiculo;
    private String Modelo;
    private float AnioModelo;
    private float PrecioHora;
    
    public RegistroVehiculos() {
    }

    public RegistroVehiculos(int id) {
        this.id = id;
    }

    public RegistroVehiculos(int id, String Placa, String Descripcion_Vehiculo, String Tipo_Vehiculo, String Modelo, float AnioModelo, float PrecioHora, String EstadoVehiculo) {
        this.id = id;
        this.Placa = Placa;
        this.Descripcion_Vehiculo = Descripcion_Vehiculo;
        this.Tipo_Vehiculo = Tipo_Vehiculo;
        this.Modelo = Modelo;
        this.AnioModelo = AnioModelo;
        this.PrecioHora = PrecioHora;
        this.EstadoVehiculo = EstadoVehiculo;
    }
    
    public String getEstadoVehiculo() {
        return EstadoVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String EstadoVehiculo;

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getDescripcion_Vehiculo() {
        return Descripcion_Vehiculo;
    }

    public void setDescripcion_Vehiculo(String Descripcion_Vehiculo) {
        this.Descripcion_Vehiculo = Descripcion_Vehiculo;
    }

    public String getTipo_Vehiculo() {
        return Tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String Tipo_Vehiculo) {
        this.Tipo_Vehiculo = Tipo_Vehiculo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public float getAnioModelo() {
        return AnioModelo;
    }

    public void setAnioModelo(float año_Modelo) {
        this.AnioModelo = año_Modelo;
    }

    public float getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(float PrecioHora) {
        this.PrecioHora = PrecioHora;
    }
    
    public void EstadoVehiculo()
    {
        if(this.AnioModelo<=1 && this.AnioModelo>=0)
        {
            this.EstadoVehiculo = "Nuevo";
        }
        if(this.AnioModelo<=4 && this.AnioModelo>=2)
        {
            this.EstadoVehiculo = "Medianamente usado";
        }
        if(this.AnioModelo>=5)
        {
            this.EstadoVehiculo = "Usado";
        }
    }
    
}
