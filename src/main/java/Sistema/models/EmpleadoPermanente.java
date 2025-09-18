package Sistema.models;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
    private String beneficios;
    private double salarioMensual;
    private LocalDate fechaFinContrato;

    public EmpleadoPermanente(int idEmpleado, String nombre, String apellido, LocalDate fechaIngreso, String departamento, String beneficios, double salarioMensual, LocalDate fechaFinContrato) {
        super(idEmpleado, nombre, apellido, fechaIngreso, departamento);
        this.beneficios = beneficios;
        this.salarioMensual = salarioMensual;
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getBeneficios() {
        return beneficios;
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }
    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }
    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
}
