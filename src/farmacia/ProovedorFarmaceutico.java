/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author Nicolás
 */
public class ProovedorFarmaceutico {
    
    public String codigoProovedor;
    public String nombre;
    public String medicamentoSuministrado;

    public ProovedorFarmaceutico(String codigoProovedor, String nombre, String medicamentoSuministrado) {
        this.codigoProovedor = codigoProovedor;
        this.nombre = nombre;
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    public String getCodigoProovedor() {
        return codigoProovedor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }

    public void setCodigoProovedor(String codigoProovedor) {
        this.codigoProovedor = codigoProovedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }
    
    
}


