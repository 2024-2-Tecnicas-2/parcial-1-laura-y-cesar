package com.mycompany.parcial1;

public class Principal {

    public static void main(String[] args) {
        // TODO: Aquí ingresas tu código para iniciar la aplicación.
public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto>productosSolicitados;
    private ArrayList<Integer>cantidadesSolicitadas;
    
    public Pedido(Cliente cliente){
    this.cliente = cliente;
    this.productosSolicitados = new ArrayList<>();
    this.cantidadesSolicitadas = new ArrayList<>();  
    }
    
    public void mostrarPedido(){
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Direccion: " + cliente.getDireccion());
        System.out.println("Correo: " + cliente.getCorreoElectronico());
        System.out.println("Productos solicitados: ");
            for(int i = 0; i < productosSolicitados.size(); i++) {
                Producto producto = productosSolicitados.get(i);
                int cantidad = cantidadesSolicitadas.get(i);
                    System.out.printLn("- " + producto.getNombre() + " -Cantidad: " + cantidad);
            }      
    }
}


    }
}
