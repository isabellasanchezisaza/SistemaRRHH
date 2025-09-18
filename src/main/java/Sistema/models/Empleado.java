package Sistema.models;

import java.time.LocalDate;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;
    private String departamento;

    //Constructor.
    public Empleado(int idEmpleado, String nombre, String apellido, LocalDate fechaIngreso, String departamento) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
    }

    //Getters y Setters.
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Sobrecarga de método toString para mostrar la información del empleado.
    @Override

    public String toString() {
        return "ID:" + idEmpleado + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Fecha de ingreso: " + fechaIngreso + "\n";
    }


}
