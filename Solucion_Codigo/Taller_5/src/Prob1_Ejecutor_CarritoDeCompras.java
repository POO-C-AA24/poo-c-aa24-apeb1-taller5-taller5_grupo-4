import java.util.ArrayList;
import java.util.List;
public class Prob1_Ejecutor_CarritoDeCompras {
    public static void main(String[] args) {
        double montoPagado = 20;
        double montoPromocional = 1000;
        double descuento = 10; 
        Prob1_Producto producto1 = new Prob1_Producto("Manzana", 0.5, 100);
        Prob1_Producto producto2 = new Prob1_Producto("Banana", 0.3, 150);
        Prob1_Producto producto3 = new Prob1_Producto("Cereal", 2.5, 50);
        List<Prob1_Producto> tienda = new ArrayList<>();
        tienda.add(producto1);
        tienda.add(producto2);
        tienda.add(producto3);
        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarProducto(tienda, "Manzana", 10);
        carrito.agregarProducto(tienda, "Banana", 5);
        carrito.agregarProducto(tienda, "Cereal", 2);
        carrito.mostrarDetalleCompra();
        System.out.println("Total de la compra: $" + String.format("%.2f", carrito.calcularTotal()));
        carrito.realizarPago(montoPagado, montoPromocional, descuento);
        carrito.mostrarDetalleCompra();
    }
}
