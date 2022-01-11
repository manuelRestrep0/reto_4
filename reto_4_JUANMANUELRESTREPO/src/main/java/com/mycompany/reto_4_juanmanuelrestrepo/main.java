package com.mycompany.reto_4_juanmanuelrestrepo;
import java.util.HashSet;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        /*
        Menú de la aplicacion
        */
        boolean ejecucion = true;
        RegistroVehiculos[] Autos = new RegistroVehiculos[20];
        Alquiler[] Alquileres = new Alquiler[20];
        while(ejecucion)
        {
            int opcion;
            System.out.println("Digite una opcion:\n 1)Registro de autos.\n 2)Alquiler de autos.\n 3)Contratación de seguros.\n 0)Salir.");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                {
                    /*
                    NOTA: crear menu para visualizar los vehiculos.
                    */
                    int i=0;
                    boolean RegistroAux=true;
                    while(RegistroAux)
                    {
                        if(Autos[i]==null)
                        {
                            /*
                            NOTA: preguntar si aplica placa.
                            */
                            Autos[i] = new RegistroVehiculos();
                            Autos[i].setId(i+1);
                            System.out.println("Ingrese el tipo de vehiculo (Auto, Moto, Camion, etc):");
                            Autos[i].setTipo_Vehiculo(InputString());
                            System.out.println("Ingrese el modelo del vehiculo:");
                            Autos[i].setModelo(InputString());
                            System.out.println("Ingrese el anio del modelo:");
                            Autos[i].setAnioModelo(InputNumber());
                            System.out.println("Ingrese la placa del vehiculo:");
                            Autos[i].setPlaca(InputString());
                            System.out.println("Ingrese una breve descripcion del vehiculo:");
                            Autos[i].setDescripcion_Vehiculo(InputString());
                            System.out.println("Ingrese el precio por hora del vehiculo:");
                            Autos[i].setPrecioHora(InputNumber());
                            RegistroAux=false;
                        }
                        if(i==Autos.length)
                        {
                            
                        }
                        else
                            i++;
                    }
                }
                case 2:
                {
                    int i = 0;
                    boolean RegistroAux = true;
                    while(RegistroAux)
                    {
                        if(Autos[0] == null)
                        {
                            String[] Aux;
                            Alquileres[i] = new Alquiler();
                            System.out.println("Introduzca su tipo de documento y el numero separados por una ','(ejemplo:cc,111)");
                            Aux = InputString().split(",");
                            Alquileres[i].setTipoDocumento(Aux[0]);
                            Alquileres[i].setNumeroDocumento(Aux[1]);
                            System.out.println(Alquileres[i].getNumeroDocumento());
                            System.out.println(Alquileres[i].getTipoDocumento());
                            System.out.println("Introduzca su nombre completo");
                            Alquileres[i].setNombreCompleto(InputString());
                            System.out.println("Fecha de inicio (DD/MM/AA)");
                            Alquileres[i].setFechaInicio(InputString());
                            System.out.println("Fecha Final (DD/MM/AA)");
                            Alquileres[i].setFechaFinal(InputString());
                            /*
                            Para hacer: pedir el vehiculo que se va a alquilar para obtener el precio x hora,
                            luego convertir las fechas y calcular las horas entre estas para setear el valor a pagar.
                            
                            El vehiculo a elegir debe ubicarse antes de todo el codigo anterior.
                            */
                            
                            RegistroAux = false;
                            
                            
                            
                            
                        }
                    }
                    
                }
                case 3:
                {
                    
                }
                case 0:
                {
                    ejecucion = false;
                }
                    
                    
            }
        }
        
    }
    static String InputString()
    {
        String InputAux;
        Scanner input = new Scanner(System.in);
        InputAux = input.nextLine();
        return InputAux;    
    }
    static float InputNumber()
    {
        float inputAux;
        Scanner input = new Scanner(System.in);
        inputAux = input.nextFloat();
        return inputAux;     
    }
}
