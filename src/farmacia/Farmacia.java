/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmacia;
import java.time.LocalDate;
import farmacia.Medicamento;
import farmacia.SistemaInventario;
import java.util.UUID;

/**
 *
 * @author Nicolás
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.of(2025, 9, 1);
        // UUID != string
        //crea medicament
        Medicamento medicamento1 = new Medicamento(UUID.randomUUID(), "paracetamol", "pastilla", 100, fechaActual);
        //registrar medicamento
        SistemaInventario sistemaInventario1 = new SistemaInventario("1", "Gabriela Peñaloza", "Constanza Gaete");
        sistemaInventario1.regitrarMedicamento(medicamento1);
        //Imprimo valor cliente
        System.out.println(sistemaInventario1.getClienteActual());
    }
    
}
