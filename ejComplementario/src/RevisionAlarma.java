
import java.time.LocalDate;

public class RevisionAlarma extends Servicio {

    protected int alarmasRevisar;

    public RevisionAlarma(int alarmasRevisar, String trabajador, String cliente, LocalDate fechaInicio) {
        super(trabajador = "Revisor Especialista Contraincendios", cliente, fechaInicio);
        this.alarmasRevisar = alarmasRevisar;
    }

    public int getAlarmasRevisar() {
        return alarmasRevisar;
    }

    public void setAlarmasRevisar(int alarmasRevisar) {
        this.alarmasRevisar = alarmasRevisar;
    }

    @Override
    protected double costeMaterial() {
        System.out.println("no existe coste de material");
        return 0;
    }

    @Override
    protected double costeManoObra() {
        return (alarmasRevisar / 3) * 40;
    }

    @Override
    protected double costeTotal() {
        return costeManoObra();
    }

    @Override
    protected String detalleServicio() {

        System.out.println("REVISION PERIODICA ALARMAS CONTRAINCENDIOS");
        System.out.println("Cliente " + super.getCliente());
        System.out.println("Fecha de revision " + super.fechaInicio);
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("TOTAL " + costeTotal());
        System.out.println("------------------------------------------");

        return null;
    }

}
