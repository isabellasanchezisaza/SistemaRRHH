package Sistema.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReporteDesempenio {
    private int idReporte;
    private LocalDate fechaGeneracion;
    private double metricas;
    private ArrayList<Empleado> empleados; //Relación con Empleado.
    private ArrayList<Departamento> departamentos; //Relación con Departamento.

    //Constructor.
    public ReporteDesempenio(int idReporte, LocalDate fechaGeneracion, double metricas) {
        this.idReporte = idReporte;
        this.fechaGeneracion = fechaGeneracion;
        this.metricas = metricas;
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }

    //Getters y Setters.
    public int getIdReporte() {
        return idReporte;
    }
    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }
    public double getMetricas() {
        return metricas;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    //Método de generación de reporte (para cada uno).
    public void  generarReporteEmpleado (Empleado empleado) {

        System.out.println("----REPORTE DE EMPLEADO---");
        System.out.println("Id del reporte: " + this.idReporte);
        System.out.println("Fecha: " + this.fechaGeneracion);
        System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido());
        System.out.println("Departamento: " + empleado.getDepartamento());
        System.out.println("Desempeño promedio: " + this.metricas);
        System.out.println("--------------------------");

    }

    public void generarReporteDepartamento (Departamento departamento) {

        System.out.println("----REPORTE DEPARTAMENTO---");
        System.out.println("Id del reporte: " + this.idReporte);
        System.out.println("Fecha: " + this.fechaGeneracion);
        System.out.println("Departamento: " + departamento.getNombre());
        System.out.println("Desempeño promedio: " + this.metricas);
        System.out.println("--------------------------");
    }
}
