/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Isabella
 */
public class DepartamentoTest {
    private Departamento departamento;
    private EmpleadoPermanente empleado1;
    private EmpleadoTemporal empleado2;
    
    @BeforeEach
    public void setUp() {
        // Se ejecuta antes de cada prueba
        departamento = new Departamento(1, "Recursos Humanos", "Departamento de RRHH");
        empleado1 = new EmpleadoPermanente(101, "Juan", "Pérez", 
            LocalDate.of(2020, 1, 1), "Recursos Humanos", 
            "ARL, Seguro", 3000000.0, LocalDate.of(2025, 1, 1));
        empleado2 = new EmpleadoTemporal(102, "Ana", "García", 
            LocalDate.of(2023, 6, 1), "Recursos Humanos", 
            25.0, 6);
    }
    
    @Test
    public void testAsignarEmpleado() {
        boolean resultado = departamento.asignarEmpleado(empleado1);
        assertTrue(resultado, "Debería poder asignar un empleado");
        assertEquals(1, departamento.getEmpleados().size(), 
            "El departamento debería tener 1 empleado");
    }
    
    @Test
    public void testBuscarEmpleadoExistente() {
        departamento.asignarEmpleado(empleado1);
        Empleado encontrado = departamento.buscarEmpleado(101);
        assertNotNull(encontrado, "Debería encontrar el empleado");
        assertEquals("Juan", encontrado.getNombre());
    }
    
    @Test
    public void testBuscarEmpleadoNoExistente() {
        Empleado encontrado = departamento.buscarEmpleado(999);
        assertNull(encontrado, "No debería encontrar un empleado inexistente");
    }
    
    @Test
    public void testActualizarEmpleado() {
        departamento.asignarEmpleado(empleado1);
        
        EmpleadoPermanente empleadoActualizado = new EmpleadoPermanente(
            101, "Juan Carlos", "Pérez", 
            LocalDate.of(2020, 1, 1), "Recursos Humanos", 
            "ARL, Seguro Premium", 3500000.0, LocalDate.of(2025, 1, 1));
        
        Empleado anterior = departamento.actualizarEmpleado(101, empleadoActualizado);
        assertNotNull(anterior, "Debería retornar el empleado anterior");
        
        Empleado actualizado = departamento.buscarEmpleado(101);
        assertEquals("Juan Carlos", actualizado.getNombre());
    }
    
    @Test
    public void testRemoverEmpleado() {
        departamento.asignarEmpleado(empleado1);
        departamento.asignarEmpleado(empleado2);
        
        Empleado removido = departamento.removerEmpleado(101);
        assertNotNull(removido, "Debería retornar el empleado removido");
        assertEquals(1, departamento.getEmpleados().size(), 
            "Debería quedar 1 empleado");
    }
    
    @Test
    public void testRemoverEmpleadoNoExistente() {
        Empleado removido = departamento.removerEmpleado(999);
        assertNull(removido, "No debería remover un empleado inexistente");
    }
}
