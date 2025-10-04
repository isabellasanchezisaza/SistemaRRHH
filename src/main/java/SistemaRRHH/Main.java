package SistemaRRHH;
import Sistema.models.EmpleadoTemporal;
import Sistema.models.EmpleadoPermanente;
import Sistema.models.ReporteDesempenio;
import Sistema.models.Departamento;
import Sistema.views.IniciarSesion;
import Controllers.Sistema;

public class Main {
    public static void main(String[] args) {

        //EJEMPLO DE USO!!!!

        //Creamos departamentos.
        Departamento dptoCX = new Departamento(1, "Customer Experience", "CX está encargado de mejorar la experiencia y calidad de servicio al cliente.");

        //Creamos empleados.
        EmpleadoPermanente emple1 = new EmpleadoPermanente(458, "Marcela", "Ramirez", java.time.LocalDate.of(2021, 6, 24), "Customer Experience", "ARL, Caja de compensación,Seguro de salud, plan de retiro", 2500000.00, java.time.LocalDate.of(2028, 5, 15));
        
        EmpleadoTemporal emple3 = new EmpleadoTemporal(284, "Paulina", "Upegui", java.time.LocalDate.of(2020, 11, 5), "Customer Experience", 22.00, 12);
        
        EmpleadoPermanente emple5 = new EmpleadoPermanente(969, "María", "Sepulveda", java.time.LocalDate.of(2024,6,24), "Customer Experience", "ARL, Caja de compensación, Seguro de salud, plan de retiro", 2500000, java.time.LocalDate.of(2028,5,15));
        

        //Llamamos al método para agregar a los empleados en sus respectivos departamentos.
        dptoCX.asignarEmpleado(emple1);
        
        dptoCX.asignarEmpleado(emple3);
        
        dptoCX.asignarEmpleado(emple5);
        

        //Imprimimos la lista de los empleados por departamento.
        System.out.println("---EMPLEADOS DEL DEPARTAMENTO DE CX--");
        System.out.println(dptoCX.mostrarEmpleadosPorDepartamento());

        

        //Creamos los reportes
        ReporteDesempenio reporteCX= new ReporteDesempenio(555, java.time.LocalDate.of(2025, 9, 18), 8.5);
        
        ReporteDesempenio reportemp1= new ReporteDesempenio(557, java.time.LocalDate.of(2025, 9, 18), 9.5);
        

        //Llamamos al método que nos genera los reportes, tanto de departamento como individual.
        reporteCX.generarReporteDepartamento(dptoCX);
        
        reportemp1.generarReporteEmpleado(emple1);
        

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

        //-----------------------------------------------------------------------------------------------------------------
        
        
        Sistema sistema= new Sistema(dptoCX, emple1, reporteCX);
        
        IniciarSesion iniciar = new IniciarSesion(null, true, sistema);
        iniciar.setVisible(true);







    }
}
