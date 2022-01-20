package com.mycompany.reto_4_juanmanuelrestrepo;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        /*
        Menú de la aplicacion
        */      
        boolean ejecucion = true;
        int cantidad = 10;
        int EleccionVehiculo=0;
        
        //List<RegistroVehiculos> Autos = new ArrayList<>();
        RegistroVehiculos[] Autos = new RegistroVehiculos[cantidad];
        Alquiler[] Alquileres = new Alquiler[cantidad];
        Seguro[] Seguros = new Seguro[cantidad];
        Autos[0] = new RegistroVehiculos(1,"ABC123","Vehiculo para 5 personas de tipo automovil","Automovil","Renault Logan",2016,70000);
        Autos[1] = new RegistroVehiculos(2,"DEF123","Camioneta offroad para viajar","Camioneta","Ford Ranger",2020,200000);
        Autos[2] = new RegistroVehiculos(3,"GHI123","Vehiculo electrico tipo automovil","Automovil","Tesla S",2021,340000);
        while(ejecucion)
        {
            int opcion;
            System.out.println("Digite una opcion:\n 1)Elegir Vehiculo.\n 2)Alquiler de Vehiculo.\n 3)Contratación de seguros.\n 0)Salir.");
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                {
                    System.out.println("1) Elegir un vehiculo ya registrado. \n 2)Registrar un vehiculo");
                    input = new Scanner(System.in);
                    if(input.nextInt() == 1)
                    {
                        EleccionVehiculo = ElegirVehiculo(Autos);
                        break;
                    }
                    if(input.nextInt() == 2)
                    {
                        int i=0;
                        boolean RegistroAux=true;
                        while(RegistroAux)
                        {
                            if(Autos[i]==null)
                            {
                            /*
                            NOTA: preguntar si aplica placa.
                            */
                                System.out.println(i);
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
                                break;
                            }
                            else
                                i++;
                            }
                    }
                    break;
                }
                case 2:
                {
                    if(EleccionVehiculo == 0)
                    {
                        EleccionVehiculo = ElegirVehiculo(Autos);
                    }
                    int i = 0;
                    boolean RegistroAux = true;
                    while(RegistroAux)
                    {
                        if(VerificarArray(Autos)==false)
                        {
                            String[] Aux;
                            Alquileres[i] = new Alquiler();
                            System.out.println("Introduzca su tipo de documento y el numero separados por una ','(ejemplo:cc,111)");
                            Aux = InputString().split(",");
                            if(Aux.length==2)
                            {
                                Alquileres[i].setTipoDocumento(Aux[0]);
                                Alquileres[i].setNumeroDocumento(Aux[1]);
                            }
                            System.out.println(Alquileres[i].getNumeroDocumento());
                            System.out.println(Alquileres[i].getTipoDocumento());
                            System.out.println("Introduzca su nombre completo");
                            Alquileres[i].setNombreCompleto(InputString());
                            System.out.println("Fecha de inicio (AAAA/MM/DD)");
                            Alquileres[i].setFechaInicio(InputString());
                            System.out.println("Fecha Final (AAAA/MM/DD)");
                            Alquileres[i].setFechaFinal(InputString());
                            Alquileres[i].HorasAlquiler(Alquileres[i].getFechaInicio(),Alquileres[i].getFechaFinal());
                            Alquileres[i].setValorPagar(Autos[EleccionVehiculo].getPrecioHora()*Alquileres[i].getHoras());
                            /*
                            Para hacer: pedir el vehiculo que se va a alquilar para obtener el precio x hora,
                            luego convertir las fechas y calcular las horas entre estas para setear el valor a pagar.
                            
                            El vehiculo a elegir debe ubicarse antes de todo el codigo anterior.
                            */
                            
                            RegistroAux = false;
                            
                        }
                    }
                    break;
                    
                }
                case 3:
                {
                    int i = 0;
                    boolean RegistroAux = true;
                    while(RegistroAux)
                    {
                        if(Alquileres[i]!=null)
                        {
                            Seguros[i] = new Seguro();
                            System.out.println("Introduzca el nombre de la empresa");
                            Seguros[i].setEmpresa(InputString());
                            System.out.println("Introduzca una descripcion del seguro");
                            Seguros[i].setDescripcionSeguro(InputString());
                            i++;
                            RegistroAux = false;
                            
                        }
                    }
                    break;
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
    static int ElegirVehiculo(RegistroVehiculos[] Vehiculos)
    {
        int i=0;
        while(Vehiculos[i]!=null)
        {
            System.out.println(Vehiculos[i].getId());
            System.out.println(Vehiculos[i].getTipo_Vehiculo());
            System.out.print(Vehiculos[i].getModelo());
            System.out.println(" "+Vehiculos[i].getAnioModelo());
            System.out.println(Vehiculos[i].getEstadoVehiculo());
            System.out.println(Vehiculos[i].getDescripcion_Vehiculo());
            System.out.println("Desea elegir este vehiculo? (1-si / 0-no)");
            Scanner input = new Scanner(System.in);
            int eleccion = input.nextInt();
            if(eleccion == 1)
            {
                return Vehiculos[i].getId();
            }
            i++;
        }
    return 0;  
    }
    static boolean VerificarArray(RegistroVehiculos[] Vehiculos)
    {
        boolean isNull = true;
        for (RegistroVehiculos Vehiculo : Vehiculos) {
            if (Vehiculo != null) {
                isNull = false;
                return isNull;
            }   
        }
        return isNull;
    }
}
