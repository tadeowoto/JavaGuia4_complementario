
import java.time.LocalDate;

public class TrabajoPintura extends Servicio {

    protected String edificacion;
    protected double superficie, precioLitroPintura;
    protected boolean costeAdicional = false;

    public TrabajoPintura(String edificacion, double superficie, double precioLitroPintura, boolean costeAdicional, String trabajador, String cliente, LocalDate fechaInicio) {
        super(trabajador, cliente, fechaInicio);
        this.edificacion = edificacion;
        this.superficie = superficie;
        this.precioLitroPintura = precioLitroPintura;
        this.costeAdicional = costeAdicional;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioLitroPintura() {
        return precioLitroPintura;
    }

    public void setPrecioLitroPintura(double precioLitroPintura) {
        this.precioLitroPintura = precioLitroPintura;
    }

    public boolean isCosteAdicional() {
        return costeAdicional;
    }

    public void setCosteAdicional(boolean costeAdicional) {
        this.costeAdicional = costeAdicional;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    protected double costeMaterial() {

        return (superficie / 7.8) * precioLitroPintura;

    }

    @Override
    protected double costeManoObra() {

        return (superficie / 10) * 9.5;

    }

    @Override
    protected double costeTotal() {

        if (superficie < 50) {

            System.out.println("la superficie es menos de 50mts cuadrados, se la añade un costo de un 15%");
            costeAdicional = true;
            return (costeMaterial() + costeManoObra()) * 0.15;

        } else {
            return costeMaterial() + costeManoObra();
        }

    }

    @Override
    protected void detalleServicio() {

        System.out.println("TRABAJO DE PINTURA");
        System.out.println("Cliente: " + super.getCliente());
        System.out.println("Fecha de inicio: " + super.fechaInicio);
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Pintor: " + super.getTrabajador());
        System.out.println("Coste material " + costeManoObra());
        System.out.println("Coste adicional " + costeAdicional);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL " + costeTotal());

    }

}
