public class Problema2_EmpleadosBase {
    public String nombre;
    public double salario;
    public int edad;
    public double aumento;
    public double total;

    public Problema2_EmpleadosBase(String nombre, double salario, int edad, double aumento) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.aumento = aumento;
    }
    
    public double calcularAumento(){
        total = salario + (salario * aumento) / 100;
        return total; 
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + "\nSalario= " + salario + "$\nEdad= " + 
                edad + " años\nAumento= " + aumento + "Total= " + total + '$';
    }
    
    
}
