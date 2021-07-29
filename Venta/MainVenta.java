public class MainVenta {
    public static void main(String[] args) {
        
        Cliente cliente;
        cliente = new Cliente();
        cliente.setId(20);
        cliente.setNombre("Marlon Agudelo");
        
        Producto producto;
        producto = new Producto();
        producto.setId(2);
        producto.setNombre("Camiseta");
    
        Factura factura;
        factura = new Factura();
        factura.setNumero(123);
        factura.setCantidad(15);
        
        System.out.println("El id del cliente es "+ cliente.getId());
        System.out.println("El nombre del cliente es "+ cliente.getNombre());
        System.out.println("El id del producto es "+producto.getId());  
        System.out.println("El nombre del producto es "+ producto.getNombre());
        System.out.println("El numero de la factura es "+factura.getNumero());
        System.out.println("La cantidad de productos es "+ factura.getCantidad());
        System.out.println("El cliente " + cliente.getNombre()+" compro la cantidad de "+ factura.getCantidad()+ " del producto "+producto.getNombre());
        
    }
}
