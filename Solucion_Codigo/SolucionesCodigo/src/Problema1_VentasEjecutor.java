import java.util.Scanner;
public class Problema1_VentasEjecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        boolean bandera= true;
        double monto = 0;
        String op;
        int productos = 0;
        while(bandera){
            System.out.println("Ingrese el valor del producto");
            double precio = entrada.nextDouble();
            monto += precio;
            System.out.println("Desea registrar más productos? Presione 'n' "
                    + "para salir");
            op = entrada.next();
            productos += 1;
            if (op.equals("n")){
                bandera = false;
            }
        }
        Problema1_VentasBase compra1= new Problema1_VentasBase(monto, productos);
        compra1.calcularDescuento();
        compra1.calcularPrecioFinal();
        System.out.println(compra1);
}
}
