package Sistema.models;

public class EmpleadoTemporal extends Empleado {
    private double tarifaHora;
    private int duracionContrato; // en meses

    public EmpleadoTemporal(int idEmpleado, String nombre, String apellido, java.time.LocalDate fechaIngreso, String departamento, double tarifaHora, int duracionContrato) {
        super(idEmpleado, nombre, apellido, fechaIngreso, departamento);
        this.tarifaHora = tarifaHora;
        this.duracionContrato = duracionContrato;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }
}
