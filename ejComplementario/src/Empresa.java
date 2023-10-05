
public class Empresa {

    public double acumulador = 0;

    public Empresa() {
    }

    public void contratar(Servicio s1) {

        if (s1 instanceof TrabajoPintura) {

            System.out.println("La edificacion a pintar es " + ((TrabajoPintura) s1).edificacion);
            System.out.println("--------------------------");
            System.out.println("detalle de servicio");
            s1.detalleServicio();
            acumulador += s1.costeTotal();

        } else if (s1 instanceof RevisionAlarma) {
            System.out.println("detalle de servicio");
            s1.detalleServicio();
            acumulador += s1.costeTotal();

        }

    }

    public void costoTotalObras() {

        System.out.println("Todos los servicios contratados de la empresa suman un total de ");
        System.out.println(acumulador);

    }

}
