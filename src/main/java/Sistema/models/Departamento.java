package Sistema.models;

import java.util.ArrayList;

public class Departamento {
    private int idDepartamento;
    private String nombre;
    private String descripcion;
    private ArrayList<Empleado> empleados; //Relación con Empleado.

    //Constructor.
    public Departamento(int idDepartamento, String nombre, String descripcion) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.empleados = new ArrayList<>();
    }

    //Getters y Setters.
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //CRUD
    public boolean asignarEmpleado(Empleado empleado) {
        return this.empleados.add(empleado);
    }

    public Empleado buscarEmpleado(Empleado empleado) {
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado e = this.empleados.get(i);
            if (e.equals(empleado)) {
                return e;
            }
        }
        return null;
    }

    public Empleado buscarEmpleado(int idEmpleado) {
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado e = this.empleados.get(i);
            if (e.getIdEmpleado() == idEmpleado) {
                return e;
            }
        }
        return null;
    }

    public int buscarIndiceEmpleado(int idEmpleado) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado e = this.empleados.get(i);
            if (e.getIdEmpleado() == idEmpleado) {
                return i;
            }
        }
        return -1; // No encontrado
    }

    public Empleado actualizarEmpleado(int idEmpleado, Empleado empleado) {
        int index = this.buscarIndiceEmpleado(idEmpleado);
        if (index < 0) {
            return null;
        }
        return this.empleados.set(index, empleado);
    }

    public Empleado removerEmpleado(int idEmpleado) {
        int index = this.buscarIndiceEmpleado(idEmpleado);
        if (index < 0) {
            return null;
        }
        return this.empleados.remove(index);
    }

    public String mostrarEmpleadosPorDepartamento() {
        String lista = "";
        for (int i = 0; i < this.empleados.size(); i++) {
            Empleado e = this.empleados.get(i);
            lista += e.toString() + "\n";
        }
        return lista;
    }
}
