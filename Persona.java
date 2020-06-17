//Anthony Joel Carhuachin Calixto 
package practica02Colas;

public class Persona {
    //atributos
    private String codigo;
    private String nombre;
    private double tarifa;
    private int hora;
//    private double sueldo;
    
    public Persona (){
        
    }
    
    public void registrar(String codigo, String nombre, double tarifa, int hora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.hora = hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    //****************************************
    public double hallarSueldo(){
        double suel=tarifa*hora;
        return suel;
    }
    public void mostrarSueldo(){
        System.out.println("Promedio: "+hallarSueldo());
    }
    public void mostrarDatos(){
        System.out.println("\nCodigo = "+codigo);
        System.out.println("Nombre = "+nombre);
        System.out.println("Tarifa = "+tarifa);
        System.out.println("Hora = "+hora);
        System.out.println("Sueldo al dia es= "+hallarSueldo());
        System.out.println("Sueldo mencial (26 dias trabajados) = " + hallarSueldo()*26);
    }
    
}
