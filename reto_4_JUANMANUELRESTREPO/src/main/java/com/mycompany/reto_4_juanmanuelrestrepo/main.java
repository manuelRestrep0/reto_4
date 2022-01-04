package com.mycompany.reto_4_juanmanuelrestrepo;
import java.util.Scanner;
public class main {
    public static void main(String[] args)
    {
        /*
        Menú de la aplicacion
        */
        boolean ejecucion = true;
        while(ejecucion)
        {
            int opcion;
            Scanner input = new Scanner(System.in);
            opcion = input.nextInt();
            switch(opcion){
                case 1:
                {
                    /*
                    Registro de autos
                    */
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
}
