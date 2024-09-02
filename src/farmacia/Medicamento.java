
package farmacia;
import java.time.LocalDate;
import farmacia.Cliente;
import java.util.UUID;

/**
 *
 * @author Nicolás
 */
public class Medicamento {
    
    public UUID id;
    public String nombre;
    public String tipo;
    public int stock;
    public LocalDate caducidad;

    public Medicamento(UUID id, String nombre, String tipo, int stock, LocalDate caducidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.caducidad = caducidad;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }
    
    public void vender(Cliente cliente) {
        //logica de venta
    }
 }
