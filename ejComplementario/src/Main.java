
import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Servicio dep1 = new TrabajoPintura("departamento", 20, 15, true, "pedro aznar", "charly garcia", LocalDate.of(2023, Month.MARCH, 10));
        Servicio edificio1 = new TrabajoPintura("edificio", 2050, 15, true, "indio solari", "skay beilinson", LocalDate.of(2023, Month.OCTOBER, 4));
        Servicio casa = new TrabajoPintura("casa", 100, 15, true, "gustavo napoli", "tete", LocalDate.of(2023, Month.DECEMBER, 9));

        Empresa michoTito = new Empresa();
        michoTito.contratar(dep1);
        Empresa elSeñorDeLosNovillos = new Empresa();
        elSeñorDeLosNovillos.contratar(edificio1);
        Empresa nike = new Empresa();
        nike.contratar(casa);

        System.out.println("MICHOTITO COSTE TOTAL");
        michoTito.costoTotalObras();
        System.out.println("EL SEÑOR DE LOS NOVILLOS TOTAL");
        elSeñorDeLosNovillos.costoTotalObras();
        System.out.println("NIKE COSTE TOTAL");
        nike.costoTotalObras();

    }

}
