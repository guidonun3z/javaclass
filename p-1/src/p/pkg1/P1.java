/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p.pkg1;

/**
 *
 * @author Zeus
 */
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //primer objeto 
        Darian Uno = new Darian();
        Uno.edad=15;
        Uno.nombre="Juan Carlos";
        Uno.imprimir_nombre();
        //segundo objeto 
        Uno.imprimir_edad();
        Darian Dos = new Darian();
        Darian Tres;
        
    }
    //clase
    public static class Darian{
        //atributos
        int edad;
        float estatura;
        String nombre;
        
        //metodos
        public void imprimir_edad()
        {
            System.out.println(this.edad);
        }
        public void imprimir_nombre()
        {
            System.out.println(this.nombre);
        }
    }

}
