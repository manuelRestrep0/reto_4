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
        while(ejecucion)
        {
            int opcion;
            System.out.println("Digite una opcion:\n 1)Registro de autos.\n 2)Alquiler de autos.\n 3)Contratación de seguros.\n 0)Salir.");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                {
                    int i=0;
                    boolean RegistroAux=true;
                    while(RegistroAux)
                    {
                        if(Autos[i]==null)
                        {
                            
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
                    /*
                    Alquiler de autos
                    */
                }
                case 3:
                {
                    /*
                    Seguros
                    */  
                }
                default:
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
