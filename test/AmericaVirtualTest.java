import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmericaVirtualTest {

    @Test
    public void retornoAdecuadoDeHomeroAlObtenerEmpleado(){

        EmpleadoTablaDB empleadoDB = new EmpleadoTablaDB( "homero", "simpsom", "MALO", "soloEmpleadoMalo");

        EmpresaAmericaVirtual empresa = new EmpresaAmericaVirtual();

        Empleado empleado = empresa.obtenerEmpleado(empleadoDB);

        assertEquals("homero",empleado.getNombre());

    }

}
