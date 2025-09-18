package Sistema;
import Sistema.models.EmpleadoTemporal;
import Sistema.models.EmpleadoPermanente;
import Sistema.models.ReporteDesempenio;
import Sistema.models.Departamento;

public class Main {
    public static void main(String[] args) {

        Departamento dptoCX = new Departamento(1, "Customer Experience", "CX está encargado de mejorar la experiencia y calidad de servicio al cliente.");
        Departamento dptoOP = new Departamento(2, "Operaciones", "OP se encarga de todo lo que tiene que ver con la producción de los productos.");

        EmpleadoPermanente emple1 = new EmpleadoPermanente(002, "Marcela", "Ramirez", java.time.LocalDate.of(2021, 6, 24), "Customer Experience", "Seguro de salud, plan de retiro", 3000.00, java.time.LocalDate.of(2028, 5, 15));
        EmpleadoTemporal emple2 = new EmpleadoTemporal(005, "Luis", "Martinez", java.time.LocalDate.of(2023, 3, 10), "Operaciones", 20.00, 6);
        EmpleadoTemporal emple3 = new EmpleadoTemporal(003, "Paulina", "Upegui", java.time.LocalDate.of(2020, 11, 5), "Customer Experience", 22.00, 12);

        dptoCX.asignarEmpleado(emple1);
        dptoOP.asignarEmpleado(emple2);
        dptoCX.asignarEmpleado(emple3);

        ReporteDesempenio reporteCX= new ReporteDesempenio(555, java.time.LocalDate.of(2025, 9, 18), 8.5);
        ReporteDesempenio reporteOP= new ReporteDesempenio(556, java.time.LocalDate.of(2025, 9, 18), 7.9);
        ReporteDesempenio reportemp1= new ReporteDesempenio(557, java.time.LocalDate.of(2025, 9, 18), 9.5);
        ReporteDesempenio reportemp2= new ReporteDesempenio(558, java.time.LocalDate.of(2025, 9, 18), 8.0);

        reporteCX.generarReporteDepartamento(dptoCX);
        reporteOP.generarReporteDepartamento(dptoOP);
        reportemp1.generarReporteEmpleado(emple1);
        reportemp2.generarReporteEmpleado(emple2);

        System.out.println("---EMPLEADOS DEL DEPARTAMENTO DE CX--");
        System.out.println(dptoCX.mostrarEmpleadosPorDepartamento());

        System.out.println("---EMPLEADOS DEL DEPARTAMENTO DE OP--");
        System.out.println(dptoOP.mostrarEmpleadosPorDepartamento());







    }
}
