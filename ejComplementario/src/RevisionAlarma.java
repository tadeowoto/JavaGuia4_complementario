
import java.time.LocalDate;





public class RevisionAlarma extends Servicio {

    protected int alarmasRevisar;

    
    
    public RevisionAlarma(int alarmasRevisar, String trabajador, String cliente, LocalDate fechaInicio) {
        super(trabajador, cliente, fechaInicio);
        this.alarmasRevisar = alarmasRevisar;
    }
    

    
    @Override
    protected double costeMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected double costeManoObra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected double costeTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected String detalleServicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
    
    
    
    
    
}
