/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsalud;

import java.io.*;
import java.util.Random;
import java.io.File;
import java.util.Scanner;


public class appsalud {

    public static void main (String[] args) throws IOException {
        Scanner breen=new Scanner(System.in);
        /*Creo un onjeto File. Recibe como parametro la ruta completa con el nombre del fichero
         * Para los usuarios de Windows la ruta seria mas o menos asi:"c:\\MiFichero.txt"*/
        String nombre = null,ing1 = null,ing2;
        String nomtwo = null, Juan,Teresa,Carlos,Monica,Julian, n;
int s;int u; int k; int d; int uno=1;int w = 0;
int uu = 0;
int q, edad=0;
        int a,b,l,f = 0,c,h,j,un=1, dos=2;
        int x=18048379;
        int y=10149000;
        int z=93764684;
        int m=99725400;
        int o=12684000;
        
             do{File Ffichero=new File("C:Miinformación");
             
                 System.out.println("***********BIENVENIDO A LA APP QUE ESTA HECHA PARA TU SALUD********* ");
System.out.println("1-Emite tu nueva poliza "+"\n2-Consultar info Ejecutivos  "+"\n3-Elimina tu registro (baja)"+"\n4-Ver tu poliza (consultar)");
        System.out.println("***********TU APLICACION QUE SE PREOCUPA POR TU SALUD********* ");
System.out.println("Elija una opcion");
        
        s=breen.nextInt();
        

                
if(s==1){
    
    //Si no Existe el fichero lo crea
                if(!Ffichero.exists()){
                     Ffichero.createNewFile();{

               //Abre un Flujo de escritura,sobre el fichero con codificacion utf-8. Ademas   en
               //el pedazo de sentencia "FileOutputStream(Ffichero,true)", true es por si existe el fichero
               //segir añadiendo texto y no borrar lo que tenia 
                BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"));
                //Escribe en el fichero la cardena que recibe la funcion. la cadena "\r\n" significa salto de linea
                Fescribe.write("\r\n");
                //Cierra el flujo de escritura
                Fescribe.close();
                
                }   }
                
          System.out.println("Escribe el nombre del contratante  "+"  ");
       nombre=breen.next();
       System.out.println("¿Cuantos asegurados agregara a la poliza?  "+" ");
       q=breen.nextInt();
       for(w=1;w<=q;w++){
            System.out.println("Por favor escribe el nombre del " + w + "  asegurado");
            nomtwo=breen.next();
            System.out.println("Por favor la edad de " + nomtwo + "  asegurado");
            edad=breen.nextInt();
            System.out.println("*********");
            System.out.println("Guardado con exito");
            }
       }
              
if(s==2) {
           System.out.println("Nuestra empresa cuenta con los siguientes Ejecutivos:   ");
         do{System.out.println("1-Juan Lopez, Gastos Medicos "+"\n2-Teresa Juarez, Cobranza  "+"\n3-Carlos Montes, Siniestros "+"\n4-Monica Manzano, Emergencias  "+"\n5-Julian Solis, Consulta cotizaciones "); 
        System.out.println("¿Que ejecutivo desea consultar ingrese un numero?");
        a=breen.nextInt();
        switch (a)
        {
                case 1: System.out.println("Juan Lopez :   Numero telefonico  "+x+ "  Horario 8-16");
                           break;
                case 2: System.out.println("Teresa Juarez :   Numero telefonico  "+y+ "  Horario 8-18");
                           break;
                case 3: System.out.println("Carlos Montes:    Numero telefonico  "+z+ "  Horario 12-20");
                           break;
                case 4: System.out.println("Monica Manzano:    Numero telefonico "+m+ "  Horario 8-13");
                           break;
                case 5: System.out.println("Julian Solis:     Numero telefonico "+o+ "  Horario 8-16");
                           break;
                default : System.out.println("Numero no válido, intente de nuevo");
                        }
          System.out.println("Quieres consultar otro ejecutivo?" + "\n 1-Si" + "\n 2-No ");
          b=breen.nextInt();
 
                   }while(b==un);
                   
                                System.out.println("Espere un momento estamos finalizando");
         
                                         System.out.println("Gracias por preferencia");
                 
        
                               }

if(s==3){
    
try {
         /*Si existe el fichero*/
         if(Ffichero.exists()){
           /*Borra el fichero*/  
           Ffichero.delete(); 
           System.out.println("Fichero Borrado con Exito");
         }
     } catch (Exception ex) {
         /*Captura un posible error y le imprime en pantalla*/ 
          System.out.println(ex.getMessage());
     }


}

if(s==4){
   try {
       /*Si existe el fichero*/
       if(Ffichero.exists()){
           /*Abre un flujo de lectura a el fichero*/
           BufferedReader Flee= new BufferedReader(new FileReader(Ffichero));
           String Slinea;
           System.out.println("**********Leyendo Fichero***********");
           /*Lee el fichero line a linea hasta llegar a la ultima*/
           while((Slinea=Flee.readLine())!=null) {
           /*Imprime la linea leida*/    
           System.out.println(Slinea);    
              System.out.print("Contratante    " + nombre + "\n   asegurados  " +  "\n  "+ nomtwo  + "\n   edad " + edad);
                        
           }
           
           System.out.println("*********Fin Leer Fichero**********");
           /*Cierra el flujo*/
           Flee.close();
        
             }else{
           System.out.println("Fichero No Existe");
         }
   } catch (Exception ex) {
       /*Captura un posible error y le imprime en pantalla*/ 
        System.out.println(ex.getMessage());
   }
 }

    
System.out.println("\n  DESEA REGRESAR AL MENU PRESIONE 1 \nSI QUIERE SALIR PRESIONE EL 5"); 
uu=breen.nextInt();

}
while( uu==1);

  System.out.println("************************************************");
System.out.println("* HECHO POR RUIZ FUENLEAL BRENDA *");
System.out.println("************************************************");

    }
}
   