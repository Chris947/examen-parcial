/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ExamenParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //Marcas de Telefonos Moviles
        TelefonoMovil telefonoMovil01 = new TelefonoMovil();
        telefonoMovil01.setPantalla("4.7");
        telefonoMovil01.setCamara("8MP");
        telefonoMovil01.setProcesador("1.4GHZ");
        
        TelefonoMovil telefonoMovil02 = new TelefonoMovil();
        telefonoMovil01.setPantalla("4.7");
        telefonoMovil01.setCamara("8MP");
        telefonoMovil01.setProcesador("1.4GHZ");
        
        TelefonoMovil telefonoMovil03 = new TelefonoMovil();
        telefonoMovil01.setPantalla("4.7");
        telefonoMovil01.setCamara("8MP");
        telefonoMovil01.setProcesador("1.4GHZ");
        
        ArrayList listaTelefonoMoviles;
        listaTelefonoMoviles = new ArrayList();
        
        listaTelefonoMoviles.add(telefonoMovil01);
        listaTelefonoMoviles.add(telefonoMovil02);
        listaTelefonoMoviles.add(telefonoMovil03);
        
        System.out.println("EXAMEN PARCIAL");
        System.out.println("Christian Ferrua");
        System.out.println("");
        System.out.println("CATALOGO DE TELEFONOS MOVILES");
        System.out.println("");
        System.out.println("TELEFONOS MOVILES\n");
        System.out.println("  [1] Samsung S6");
        System.out.println("  [2] iPhone 6");
        System.out.println("  [3] Huawei P8");
        System.out.println("\nSELECCIONE EL MODELO: ");
        
        char opcion = sc.next().charAt(0);
        
        switch(opcion) {
        case '1':
              System.out.println("PANTALLA    : 4.7\n");
              System.out.println("CAMARA      : 8M'P'");
              System.out.println("PROCESADOR  : 1.4 Ghz");
              break;
        case '2':
              System.out.println("PANTALLA    : 4.7\n");
              System.out.println("CAMARA      : 8M'P'");
              System.out.println("PROCESADOR  : 1.4 Ghz");
              break;
        case '3':
              System.out.println("PANTALLA    : 4.7\n");
              System.out.println("CAMARA      : 8M'P'");
              System.out.println("PROCESADOR  : 1.4 GHZ");
              break;
    }
        //Operadora Movil
        System.out.println("  [C] CLARO");
        System.out.println("  [M] MOVISTAR");
        System.out.println("  [E] ENTEL");
        System.out.println("\nSELECCIONE OPERADORA: ");
        
        char operadora = sc.next().charAt(0);
        
        //Planes de compra de Telefono Movil
        //Claro Max 99
        PlanesMoviles planesMoviles01 = new PlanesMoviles();
        planesMoviles01.setPrecio("s/ 99");
        planesMoviles01.setMinutos("Ilimitados");
        planesMoviles01.setRPC("Ilimitados");
        planesMoviles01.setInternet("6 GB");
        planesMoviles01.setSMS("Ilimitados");
        //Claro Max 149
        PlanesMoviles planesMoviles02 = new PlanesMoviles();
        planesMoviles01.setPrecio("s/ 99");
        planesMoviles01.setMinutos("Ilimitados");
        planesMoviles01.setRPC("Ilimitados");
        planesMoviles01.setInternet("6 GB");
        planesMoviles01.setSMS("Ilimitados");
        //Claro Max 189
        PlanesMoviles planesMoviles03 = new PlanesMoviles();
        planesMoviles01.setPrecio("s/ 99");
        planesMoviles01.setMinutos("Ilimitados");
        planesMoviles01.setRPC("Ilimitados");
        planesMoviles01.setInternet("6 GB");
        planesMoviles01.setSMS("Ilimitados");
        
        ArrayList listaPlanesMoviles;
        listaPlanesMoviles = new ArrayList();
        
        listaPlanesMoviles.add(planesMoviles01);
        listaPlanesMoviles.add(planesMoviles02);
        listaPlanesMoviles.add(planesMoviles03);
        
        System.out.println("  [99]   CLARO MAX 99");
        System.out.println("  [149]  CLARO MAX 149");
        System.out.println("  [189]  CLARO MAX 189 ");
        System.out.println("\nSELECCIONE EL PLAN QUE DESEA: ");
        
        char Plan = sc.next().charAt(0);
        
        switch(Plan) {
        case '1':
              System.out.println("Precio    : S/99");
              System.out.println("Minutos   : ilimitados");
              System.out.println("RPC       : ilimitados");
              System.out.println("Internet  : 6GB");
              System.out.println("SMS       : ilimitados");
              break;
        
        case '2':
              System.out.println("Precio    : S/99");
              System.out.println("Minutos   : ilimitados");
              System.out.println("RPC       : ilimitados");
              System.out.println("Internet  : 6GB");
              System.out.println("SMS       : ilimitados");
              break;
        
        case '3':
              System.out.println("Precio    : S/99");
              System.out.println("Minutos   : ilimitados");
              System.out.println("RPC       : ilimitados");
              System.out.println("Internet  : 6GB");
              System.out.println("SMS       : ilimitados");
              break;
        }    
   }
}

