



public class Empresa {
    
    public int acumulador=0;

    public Empresa() {
    }
    
    
    public void contratar(Servicio s1){
        
        if (s1 instanceof TrabajoPintura) {
            
            System.out.println("La edificacion a pintar es "+((TrabajoPintura) s1).edificacion);
            System.out.println("--------------------------");
            System.out.println("");
            s1.detalleServicio();
            
            //terminar dsadasdasdas
            
        }
           
          
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
