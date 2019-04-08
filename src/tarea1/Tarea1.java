/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author licho
 */
public class Tarea1 {

    
    public static void main(String[] args){ 
        String ruta=leerRuta();
        String texto=leerArchivo(ruta);
        boolean a=agregarLinea(ruta);
        if(a){
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");
            System.out.println("Archivo modificado:");
            leerArchivo(ruta);
        }
        
    }
    
    
    public static String leerArchivo(String ruta) { //lee el archivo txt
        
        
        Path archivo = Paths.get(ruta);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
            System.out.println(texto);
            return texto;
        } catch (IOException e) {
            texto="El archivo no fue encontrado";
            System.out.println(texto);
            return texto;
        }
    }
    
    public static boolean agregarLinea(String ruta){ //agrega la linea al archivo txt
    try {
            File file = new File(ruta);        
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);                                        
            bw.newLine(); 
            bw.write("The first man who stepped on the moon.");  
            bw.close();
            return true;
        }catch (IOException e) {
            return false;
        }
    }
    
    public static String leerRuta(){ //lee la ruta que especifica una persona
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la ruta del arhivo");
        try{
            String ruta = teclado.nextLine();
            return ruta;
        }
        catch(InvalidPathException excepcion){
            return "";
        }
    }
    
    
      
}
    

