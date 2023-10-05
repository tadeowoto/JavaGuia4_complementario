
import java.time.LocalDate;








public class TrabajoPintura extends Servicio {
    
    protected String edificacion;
    protected double superficie, precioLitroPintura;

    public TrabajoPintura(String edificacion, double superficie, double precioLitroPintura, String trabajador, String cliente, LocalDate fechaInicio) {
        super(trabajador, cliente, fechaInicio);
        this.edificacion = edificacion;
        this.superficie = superficie;
        this.precioLitroPintura = precioLitroPintura;
    }
    
    
    
        
    
    
    
    
    
    
    
    @Override
    protected double costeMaterial(){
        
        
        
        return 0;
        
        
        
    }
    
    
    
    @Override
    protected double costeManoObra(){
        
        return 0;
        
    }
    
    
    @Override
    protected double costeTotal(){
        
        
        return 0;
        
    }
    
    
    @Override
    protected String detalleServicio(){
        
        
        
        return null;
        
    }
    
    
    
    
}
