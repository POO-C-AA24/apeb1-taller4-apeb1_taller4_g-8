import java.util.Scanner;
public class Problema2_EmpleadosEjecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su salario");
            double salario = entrada.nextDouble();
            System.out.println("Diite su edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el porcentaje de aumento salarial");
            double aumento= entrada.nextDouble();
            Problema2_EmpleadosBase empleado = new Problema2_EmpleadosBase(nombre, salario, edad, aumento);
            empleado.calcularAumento();
            System.out.println(empleado);
            System.out.println("Desea registrar mas empleados? s/n");
            String op = entrada.next();
            entrada.nextLine();
            if (op.equals("n")) break;
            
        }       
    }
}
