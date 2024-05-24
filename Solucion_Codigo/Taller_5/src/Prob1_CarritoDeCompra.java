import java.util.ArrayList;
import java.util.List;
class CarritoDeCompras {
    public List<Prob1_Producto> productos;
    public List<Integer> cantidades;
    public double total;
    public CarritoDeCompras() {
        productos = new ArrayList<>();
        cantidades = new ArrayList<>();
        total = 0;
    }
    public void agregarProducto(List<Prob1_Producto> tienda, String nombreProducto, int cantidad) {
        for (Prob1_Producto producto : tienda) {
            if (producto.getNombre().equals(nombreProducto)) {
                if (producto.getCantidad() >= cantidad) {
                    productos.add(producto);
                    cantidades.add(cantidad);
                    System.out.println("Agregado " + cantidad + " de " + nombreProducto + " al carrito.");
                } else {
                    System.out.println("No hay suficiente cantidad de " + nombreProducto + ". Disponible: " + producto.getCantidad());
                }
                return;
            }
        }
        System.out.println("Producto " + nombreProducto + " no encontrado en la tienda.");
    }
    public double calcularTotal() {
        total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio() * cantidades.get(i);
        }
        return total;
    }
    public void realizarPago(double montoPagado, double montoPromocional, double descuento) {
        double totalCompra = calcularTotal();
        if (totalCompra > montoPromocional) {
            totalCompra *= (1 - descuento / 100);
        }
        if (montoPagado >= totalCompra) {
            System.out.println("Pago realizado con éxito. ¡Gracias por su compra!");
            for (int i = 0; i < productos.size(); i++) {
                productos.get(i).reducirCantidad(cantidades.get(i));
            }
            productos.clear();
            cantidades.clear();
        } else {
            System.out.println("Pago insuficiente. Faltan $" + String.format("%.2f", totalCompra - montoPagado));
        }
    }
    public void mostrarDetalleCompra() {
        if (productos.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Detalle de la compra:");
            for (int i = 0; i < productos.size(); i++) {
                Prob1_Producto producto = productos.get(i);
                int cantidad = cantidades.get(i);
                System.out.println(producto.getNombre() + ": " + cantidad + " unidades, Precio unitario: $" + String.format("%.2f", producto.getPrecio()));
            }
        }
    }
}
