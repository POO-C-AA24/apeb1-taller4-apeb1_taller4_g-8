import java.util.ArrayList;
public class Problema1_VentasBase {
    public double monto;
    public int productos;
    public double descuento;

    public Problema1_VentasBase(double monto, int productos) {
        this.monto = monto;
        this.productos= productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public void setArreglo(ArrayList<Double> arreglo) {
        this.monto = monto;
    }

    public double calcularDescuento(){
        if (monto >= 1000 && productos <= 10){
            descuento = (monto *10) / 100;
        } else if (monto < 1000){
            descuento= (monto * 5) / 100;
        } else {
            descuento = 0;
        }
        return descuento;
    }
    
    public double calcularPrecioFinal(){
    return monto - descuento;
    }

    @Override
    public String toString() {
        return String.format("Monto= %.2f$\nValor de descuento= %.2f"
                + "\nTotal a cancelar= %.2f",
                monto, calcularDescuento(), calcularPrecioFinal());
    }
}
