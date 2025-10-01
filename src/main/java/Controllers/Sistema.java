package Controllers;
import Sistema.models.Empleado;
import Sistema.models.ReporteDesempenio;
import Sistema.models.Departamento;

public class Sistema {
    private Departamento departamento;
    private Empleado empleado;
    private ReporteDesempenio reporte;
    private String username;
    private String password;
    private String rol;

    public Sistema(Departamento departamento, Empleado empleado, ReporteDesempenio reporte, String username, String password, String rol) {
        this.departamento = departamento;
        this.empleado = empleado;
        this.reporte = reporte;
        this.username= username;
        this.password= password;
        this.rol=rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    public Departamento getDepartamento() {
        return departamento;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public ReporteDesempenio getReporte() {
        return reporte;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public void setReporte(ReporteDesempenio reporte) {
        this.reporte = reporte;
    }

    public boolean asignarEmpleado(Empleado empleado) {
        return this.departamento.asignarEmpleado(empleado);
    }

    public Empleado buscarEmpleado(Empleado empleado) {
        return this.departamento.buscarEmpleado(empleado);
    }

    public Empleado buscarEmpleado(int idEmpleado) {
        return this.departamento.buscarEmpleado(idEmpleado);
    }

    public Empleado actualizarEmpleado(int idEmpleado, Empleado empleado) {
        return this.departamento.actualizarEmpleado(idEmpleado, empleado);
    }

    public Empleado removerEmpleado(int idEmpleado) {
        return this.departamento.removerEmpleado(idEmpleado);
    }

    public void  generarReporteEmpleado (Empleado empleado) {
        this.reporte.generarReporteEmpleado(empleado);
    }

    public void generarReporteDepartamento (Departamento departamento) {
        this.reporte.generarReporteDepartamento(departamento);
    }
}
