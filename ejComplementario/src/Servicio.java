
import java.time.LocalDate;

public abstract class Servicio {

    protected String trabajador, cliente;
    protected LocalDate fechaInicio;

    public Servicio(String trabajador, String cliente, LocalDate fechaInicio) {
        this.trabajador = trabajador;
        this.cliente = cliente;
        //this.fechaInicio = fechaInicio;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    protected abstract double costeMaterial();

    protected abstract double costeManoObra();

    protected abstract double costeTotal();

    protected abstract void detalleServicio();

}
