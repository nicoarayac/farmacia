/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Nicolás
 */
public class Cliente {
    
    public String numeroCliente;
    public String nombre;
    public String medicamentoAdquirido;

    public Cliente(String numeroCliente, String nombre, String medicamentoAdquirido) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }
    
    
    
}
