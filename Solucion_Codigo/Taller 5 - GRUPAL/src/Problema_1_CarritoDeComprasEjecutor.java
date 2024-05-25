import java.util.ArrayList;
import java.util.List;
public class Problema_1_CarritoDeComprasEjecutor {
    public static void main(String[] args) {
        double montoPagado = 20;
        double montoPromocional = 1000;
        double descuento = 10; 
        Problema_1_Producto producto1 = new Problema_1_Producto("Manzana", 0.5, 100);
        Problema_1_Producto producto2 = new Problema_1_Producto("Banana", 0.3, 150);
        Problema_1_Producto producto3 = new Problema_1_Producto("Cereal", 2.5, 50);
        List<Problema_1_Producto> tienda = new ArrayList<>();
        tienda.add(producto1);
        tienda.add(producto2);
        tienda.add(producto3);
        Problema_1_CarritoDeCompra carrito = new Problema_1_CarritoDeCompra();
        carrito.agregarProducto(tienda, "Manzana", 10);
        carrito.agregarProducto(tienda, "Banana", 5);
        carrito.agregarProducto(tienda, "Cereal", 2);
        carrito.mostrarDetalleCompra();
        System.out.println("Total de la compra: $" + String.format("%.2f", carrito.calcularTotal()));
        carrito.realizarPago(montoPagado, montoPromocional, descuento);
        carrito.mostrarDetalleCompra();
    }
}
