/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Alumno
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   ClaseMia m=new ClaseMia();     
   ClaseMia x=new ClaseMia(23);
   ClaseMia z=new ClaseMia('g', 3.14F);
   ClaseMia s=new ClaseMia(12, 16.35F,"hola");
   
 
     
          
        System.out.println("x  "+x.h);
        System.out.println("z  "+z.i+','+z.j);
        System.out.println("s  "+s.h+','+s.j+','+s.k);
   
        System.out.println("suma enteros: "+(x.h+s.h));
        
        
        System.out.println("concatenacion "+s.k);
        
    }
}
