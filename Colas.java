//Anthony Joel Carhuachin Calixto 
package practica02Colas;

import javax.swing.JOptionPane;

public class Colas {
    int frente ;
    int Final ;
    int max;
    Persona[] cola; //Arreglo pila de tipo Alumno
    
    //guardar espacio en la ram 
    public Colas (int max){
        this.Final = 0;
        this.frente = 0;
        this.max = max;
        this.cola = new Persona[this.max+1];
        //para espacios de la ram
        for (int i = 0; i < this.max+1; i++) {
            cola[i] = new Persona();
        }
    }

    public Colas() {
        this.Final = 0;
        this.frente = 0;
        this.max = 4;
        this.cola = new Persona[max+1];
    }
    
    public int getFrente(){
        return frente;
    }
     
//    public void vaciarPila(){
//        this.tope = 0;
//    }
    
    public boolean isColaLlena(){
        if(this.Final == this.max){
            return true;
        }else return false;
    }
    
    public boolean isColaVacia(){
        if(this.frente == this.Final){
            return true;
        }else return false;
    }
    
    public void llenarCola( int pos,String codigo, String nombre,double tarifa, int hora){
        
            cola[pos].registrar(codigo, nombre, tarifa, hora);
        frente++;
    }
    
    public void mostrar(){
        if (this.isColaVacia()) 
            JOptionPane.showMessageDialog(null,"La pila esta vacia no hay elemento que mostrar");
        else{
            for (int i = 0; i<frente; i++){
            cola[i].mostrarDatos();
            }
        }
    }
     
    public void eliminar (){
        if (this.isColaVacia()){
            JOptionPane.showMessageDialog(null,"La pila ya esta vavia");
        }else{ 
            frente--;
            System.out.println("Trabajador eliminado....");
        }
    }
    
}
