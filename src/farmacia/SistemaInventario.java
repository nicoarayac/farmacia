/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Nicolás
 */
public class SistemaInventario {
        
    public String codigoProovedor;
    public String clienteActual;
    public String proveedorActual; 

    public SistemaInventario(String codigoProovedor, String clienteActual, String proveedorActual) {
        this.codigoProovedor = codigoProovedor;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }

    public String getCodigoProovedor() {
        return codigoProovedor;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setCodigoProovedor(String codigoProovedor) {
        this.codigoProovedor = codigoProovedor;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }
    
    public void regitrarMedicamento(Medicamento medicamento){
        
    }
    
    public void registrarCliente(Cliente nombre){
}
    public void generarInformeVentas(){
}
}
