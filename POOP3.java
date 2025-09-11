/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Dirak
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("####### arreglos ########");
        
        int a = 23;
        int b[] = new int[3]; // forma heredada de c
        b [0] = 10;
        b [1] = 20;
        b [2] = 30;
        
        System.out.println("b.length=" +b.length);
        for (int i = 0; i < b.length; i++) {
            int j = b[i];
            System.out.println(j);
        }
        
        int []c = {1, 2, 3, 4, 5};
        int [] d;
        d = new int[10];
        
        System.out.println("###### For ###########");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba: "+i);
        }
        for (int i = 0; i < d.length; i++) {
            d[i] = i * 100;
            System.out.println(d[i]);
        }
        
        System.out.println("############ for each###########");
        for(int temp: d){
            System.out.println(temp);
        }
        System.out.println("######## cadena de caracteres #######");
        String s = new String("Hola mundo");
        System.out.println(s);
        String s1 = "Hola Mundo en s1";
        System.out.println(s1);
        
        String nombre = "Mario";
        String apellido = "Sanchez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        
        System.out.println("#####Operador punto ####");
        
        System.out.println("arreglo con "+d.length+" elementos");
        System.out.println("Nombre completo tiene "+nombreCompleto.length());
        char[] hola2 = {'h', 'o', 'l','a'};
        System.out.println("elemntos en hola"+hola2.length);
        //String holaCadena = hola2.toString();
        
        
        System.out.println("######## Wrapper ######");
        int f = 35;
        Integer g = new Integer(35);
        Integer h = 35;
        String s3 = h.toString();
        System.out.println(s3);
        
        
        
        
        System.out.println("###### Colecciones #####");
        System.out.println("##### Arraylist #########");
        System.out.println("Coleccion de datos ordenados y ue mantiene un oreden de insercion");
        ArrayList < Integer > miArrayList = new ArrayList<Integer>();
        
        miArrayList.add(4);
        miArrayList.add(11);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(1));
        miArrayList.add(0,22);
        System.out.println(miArrayList.get(0));
        System.out.println("##");
        for (Integer integer : miArrayList){
            System.out.println(integer);
        }
        System.out.println("###");
        miArrayList.add(2,8);
        for (Integer intger : miArrayList){
            System.out.println("integer");
        }
        System.out.println("###### Hash table #####");
        // <key, value>
        // key -> Set
        // value -> List
        
        Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
        miTabla.put(319061170, "Mario Sanchez");
        miTabla.put(319061175, "Angel Carmona");
        System.out.println("Elementos en Tabla="+miTabla.size());
        miTabla.put(319061178, "Fernanda Espinoza");
        System.out.println("ELementos en tabla="+miTabla.size());
        for(String valor : miTabla.values()){
            System.out.println(valor);
        }
        /*
        for(Integer key:miTabla.keySet()){
            System.out.println(key);
        }/*
        
       
        */
        System.out.println("###### Enumeracion #####");
        Integer llave;
        String valor;
        
        Enumeration<Integer> llaves = miTabla.keys();
        while(llaves.hasMoreElements()){
            llave = llaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println("Elemento<"+llave+","+valor+">");
        }
        
        
        System.out.println("####### math #######");
        
        System.out.println(Math.PI);
        System.out.println(Math.abs(-66));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(3,2));
        
        System.out.println("Date");
        Date hoy = new Date();
        System.out.println(hoy);
        
        System.out.println("Calendar");
        
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de " + (calendarioHoy.get(Calendar.MONTH)+1) + " de " + calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);  
        // 
        
        // EJ2 Realizar una agenda con 5 registros guardando el nombre y el cumpleaños de la persona <String, Calendar> e imprimir todos los registros
        
        // Crear el HashMap (tabla hash)
        HashMap<String, String> diccionario = new HashMap<>();

       
        diccionario.put("Ulterior", "Que se dice que, sucede o se ejecuta después de otra cosa.");
        diccionario.put("Amansar", "Hacer manso, domesticar.");
        diccionario.put("Suave", "Liso y blando al tacto.");
        diccionario.put("Enpalmar", "Unir dos maderos, tubos, cables .");
        diccionario.put("Maridar", "Casar, contraer matrimonio.");

        System.out.println("Diccionario:");
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        
        
        
    }
    
    
    
}
