/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import lecturaArchivosClase.LeerArchivoTexto1;

/**
 *
 * @author Usuario
 */
public class Principal {
     public static void main( String args[] )
   {
      LeerArchivoTexto11 aplicacion = new LeerArchivoTexto11();
      OperacionData op = new OperacionData();
      aplicacion.abrirArchivo();
      op.agregarInformacion(aplicacion.leerRegistros());
       System.out.printf("El promedio es: %f",op.obtenerPromedioCapacidad());
      
      //aplicacion.leerRegistros(); // clientes.txt
      // aplicacion.leerRegistros2(); // datos.txt
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto