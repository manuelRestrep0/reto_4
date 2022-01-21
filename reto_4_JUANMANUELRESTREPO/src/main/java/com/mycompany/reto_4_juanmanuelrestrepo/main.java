package com.mycompany.reto_4_juanmanuelrestrepo;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        /*
        Menú de la aplicacion.
        Creacion de arreglos de las clases creadas,
        las variables ejecucion funciona para ejecutar el programa
        en un ciclo hasta que el usuario decida detenerlo.
        la variable cantidad es la longitud del arreglo.
        La variable eleccionvehiculo se inicializa en 0 para indicar que
        no se ha escogido ningun vehiculo, al momento de escoger alguno en 
        esta variable se almacena el id del vehiculo.
        */      
        boolean ejecucion = true;
        int cantidad = 6;
        int EleccionVehiculo=0;
        
        //List<RegistroVehiculos> Autos = new ArrayList<>();
        RegistroVehiculos[] Autos = new RegistroVehiculos[cantidad];
        Alquiler[] Alquileres = new Alquiler[cantidad];
        Seguro[] Seguros = new Seguro[cantidad];
        Autos[0] = new RegistroVehiculos(1,"ABC123","Vehiculo para 5 personas de tipo automovil","Automovil","Renault Logan",2016,700);
        Autos[1] = new RegistroVehiculos(2,"DEF123","Camioneta offroad para viajar","Camioneta","Ford Ranger",2020,200000);
        Autos[2] = new RegistroVehiculos(3,"GHI123","Vehiculo electrico tipo automovil","Automovil","Tesla S",2021,340000);
        
        Alquileres[0] = new Alquiler("cc","1001154483","JUAN MANUEL RESTREPO","2022/1/22","2022/7/21",3040800,"El automovil se usará para movilizarse a diario durante la fecha registrada.");
        Alquileres[0].HorasAlquiler(Alquileres[0].getFechaInicio(),Alquileres[0].getFechaFinal());
        
        Seguros[0] = new Seguro("RentalCars","El seguro cubre cualquier accidente que pueda tener el vehiculo siempre y cuando el conductor sea el que estaba conduciendo.");
        Seguros[0].DiasSeguro(Alquileres[0].getHoras());
        while(ejecucion)
        {
            /*
            Menu de la aplicacion donde se llaman los contructores y metodos de cada clase correspondiente.
            */
            System.out.println("Digite una opcion:\n 1)Elegir Vehiculo.\n 2)Alquiler de Vehiculo.\n 3)Contratación de seguros.\n 0)Salir.");
            Scanner input = new Scanner(System.in);
            switch(input.nextInt()){
                case 1:
                {
                    System.out.println("1) Elegir un vehiculo ya registrado. \n 2)Registrar un vehiculo");
                    input = new Scanner(System.in);
                    switch(input.nextInt())
                    {
                        case 1:
                        {
                            EleccionVehiculo = ElegirVehiculo(Autos);
                            break;
                        }
                        case 2:
                        {
                            int i=0;
                            boolean RegistroAux=true;
                            while(RegistroAux)
                            {
                                if(Autos[i]!=null)
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
                                    break;
                                }
                                else
                                    i++;
                                }
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
                        System.out.println("1) para mirar los alquileres.\n2)Para registrar un alquiler.");
                        input = new Scanner(System.in);
                        switch(input.nextInt())
                        {
                            case 1:
                            {
                                mostrarAlquileres(Alquileres);
                                break;
                            }
                            case 2:
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
                                RegistroAux = false;
                                break;
                            }
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
                        System.out.println("1) para ver los seguros registrados.\n2) para registrar un seguro.");
                        input = new Scanner(System.in);
                        switch(input.nextInt())
                        {
                            case 1:
                            {
                                mostrarSeguros(Seguros);
                                break;
                            }
                            case 2:
                            {
                                Seguros[i] = new Seguro();
                                System.out.println("Introduzca el nombre de la empresa");
                                Seguros[i].setEmpresa(InputString());
                                System.out.println("Introduzca una descripcion del seguro");
                                Seguros[i].setDescripcionSeguro(InputString());
                                i++;
                                RegistroAux = false;
                                break; 
                            }
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
        /*
        Funcion para pedir al usuario un string.
        */
        String InputAux;
        Scanner input = new Scanner(System.in);
        InputAux = input.nextLine();
        return InputAux;    
    }
    static void mostrarAlquileres(Alquiler[] AlqRegistrados)
    {
        int i = 0;
        while(AlqRegistrados[i] != null)
        {
            System.out.println(AlqRegistrados[i].getNombreCompleto());
            System.out.println(AlqRegistrados[i].getTipoDocumento());
            System.out.println(AlqRegistrados[i].getNumeroDocumento());
            System.out.println(AlqRegistrados[i].getDescripcionUso());
            System.out.println(AlqRegistrados[i].getHoras()+" Horas");
            System.out.println(AlqRegistrados[i].getValorPagar()+ "Pesos colombianos");
            i++;
        }
        
    }
    static void mostrarSeguros(Seguro[] SegRegistrados)
    {
        int i = 0;
        while(SegRegistrados[i]!=null)
        {
            System.out.println(SegRegistrados[i].getEmpresa());
            System.out.println(SegRegistrados[i].getDescripcionSeguro());
            System.out.println(SegRegistrados[i].getDias()+" Dias");
            i++;
        }
    }
    static float InputNumber()
    {
        /*
        Funcion para pedir al usuario un numero.
        */
        float inputAux;
        Scanner input = new Scanner(System.in);
        inputAux = input.nextFloat();
        return inputAux;     
    }
    static int ElegirVehiculo(RegistroVehiculos[] Vehiculos)
    {
        /*
        Funcion para mostrar los aspectos de cada vehiculo registrado.
        */
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
        /*
        Funcion para verificar si 
        */
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
