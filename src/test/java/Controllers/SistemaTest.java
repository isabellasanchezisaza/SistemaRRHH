/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Sistema.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Isabella
 */
public class SistemaTest {
    private Sistema sistema;
    private Departamento departamento;
    private EmpleadoPermanente empleado;
    private ReporteDesempenio reporte;
    
    @BeforeEach
    public void setUp() {
        departamento = new Departamento(1, "TI", "Departamento de TI");
        empleado = new EmpleadoPermanente(201, "María", "López", 
            LocalDate.of(2021, 3, 15), "TI", 
            "ARL, Caja", 2800000.0, LocalDate.of(2026, 3, 15));
        reporte = new ReporteDesempenio(1, LocalDate.now(), 9.0);
        
        sistema = new Sistema(departamento, empleado, reporte);
    }
    
    @Test
    public void testAsignarEmpleado() {
        EmpleadoTemporal nuevoEmpleado = new EmpleadoTemporal(
            202, "Carlos", "Ruiz", LocalDate.now(), "TI", 30.0, 12);
        
        boolean resultado = sistema.asignarEmpleado(nuevoEmpleado);
        assertTrue(resultado);
    }
    
    @Test
    public void testBuscarEmpleadoPorId() {
        sistema.asignarEmpleado(empleado);
        Empleado encontrado = sistema.buscarEmpleado(201);
        assertNotNull(encontrado);
        assertEquals("María", encontrado.getNombre());
    }
    
    @Test
    public void testSetUsername() {
        sistema.setUsername("admin");
        assertEquals("admin", sistema.getUsername());
    }
    
    @Test
    public void testSetRol() {
        sistema.setRol("ADMIN");
        assertEquals("ADMIN", sistema.getRol());
    }
}
