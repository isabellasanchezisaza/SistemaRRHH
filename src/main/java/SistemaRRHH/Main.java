package SistemaRRHH;
import Sistema.models.EmpleadoTemporal;
import Sistema.models.EmpleadoPermanente;
import Sistema.models.ReporteDesempenio;
import Sistema.models.Departamento;

public class Main {
    public static void main(String[] args) {

        //EJEMPLO DE USO!!!!

        //Creamos departamentos.
        Departamento dptoCX = new Departamento(1, "Customer Experience", "CX está encargado de mejorar la experiencia y calidad de servicio al cliente.");
        Departamento dptoOP = new Departamento(2, "Operaciones", "OP se encarga de todo lo que tiene que ver con la producción de los productos.");

        //Creamos empleados.
        EmpleadoPermanente emple1 = new EmpleadoPermanente(458, "Marcela", "Ramirez", java.time.LocalDate.of(2021, 6, 24), "Customer Experience", "ARL, Caja de compensación,Seguro de salud, plan de retiro", 2500000.00, java.time.LocalDate.of(2028, 5, 15));
        EmpleadoTemporal emple2 = new EmpleadoTemporal(379, "Sebastián", "Tilano", java.time.LocalDate.of(2023, 3, 10), "Operaciones", 20.00, 6);
        EmpleadoTemporal emple3 = new EmpleadoTemporal(284, "Paulina", "Upegui", java.time.LocalDate.of(2020, 11, 5), "Customer Experience", 22.00, 12);
        EmpleadoPermanente emple4 = new EmpleadoPermanente(115, "Mateo", "Barahona", java.time.LocalDate.of(2019,2,11), "Operaciones", "ARL, Caja de compensación, Seguro de salud, plan de retiro", 2500000, java.time.LocalDate.of(2027,2,13));
        EmpleadoPermanente emple5 = new EmpleadoPermanente(969, "María", "Sepulveda", java.time.LocalDate.of(2024,6,24), "Customer Experience", "ARL, Caja de compensación, Seguro de salud, plan de retiro", 2500000, java.time.LocalDate.of(2028,5,15));
        EmpleadoTemporal emple6 = new EmpleadoTemporal(672, "Valeria", "Arias", java.time.LocalDate.of(2018,9,30), "Operaciones", 10000,15);

        //Llamamos al método para agregar a los empleados en sus respectivos departamentos.
        dptoCX.asignarEmpleado(emple1);
        dptoOP.asignarEmpleado(emple2);
        dptoCX.asignarEmpleado(emple3);
        dptoOP.asignarEmpleado(emple4);
        dptoCX.asignarEmpleado(emple5);
        dptoOP.asignarEmpleado(emple6);

        //Imprimimos la lista de los empleados por departamento.
        System.out.println("---EMPLEADOS DEL DEPARTAMENTO DE CX--");
        System.out.println(dptoCX.mostrarEmpleadosPorDepartamento());

        System.out.println("---EMPLEADOS DEL DEPARTAMENTO DE OP--");
        System.out.println(dptoOP.mostrarEmpleadosPorDepartamento());

        //Creamos los reportes
        ReporteDesempenio reporteCX= new ReporteDesempenio(555, java.time.LocalDate.of(2025, 9, 18), 8.5);
        ReporteDesempenio reporteOP= new ReporteDesempenio(556, java.time.LocalDate.of(2025, 9, 18), 7.9);
        ReporteDesempenio reportemp1= new ReporteDesempenio(557, java.time.LocalDate.of(2025, 9, 18), 9.5);
        ReporteDesempenio reportemp2= new ReporteDesempenio(558, java.time.LocalDate.of(2025, 9, 18), 8.0);
        ReporteDesempenio reportemp6= new ReporteDesempenio(559, java.time.LocalDate.of(2025, 9, 18), 9.0);

        //Llamamos al método que nos genera los reportes, tanto de departamento como individual.
        reporteCX.generarReporteDepartamento(dptoCX);
        reporteOP.generarReporteDepartamento(dptoOP);
        reportemp1.generarReporteEmpleado(emple1);
        reportemp2.generarReporteEmpleado(emple2);
        reportemp6.generarReporteEmpleado(emple6);

        //Gestión de excepciones:
        try {
            // Asignar un empleado a un departamento que no existe
            Departamento dptoVentas = null;
            dptoVentas.asignarEmpleado(emple1);
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede asignar al empleado debido a que el departamento no existe.");
        }

        try {
            // Generar un reporte para un empleado que no existe
            EmpleadoPermanente emple7 = null;
            ReporteDesempenio reportenull = new ReporteDesempenio(560, java.time.LocalDate.of(2025, 9, 18), 7.0);
            reportenull.generarReporteEmpleado(emple7);
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede generar el reporte porque el empleado no existe.");
        }









    }
}
