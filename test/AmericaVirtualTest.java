
import modelo.Empleado;
import modelo.EmpresaAmericaVirtual;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static modelo.Constantes.*;

public class AmericaVirtualTest {

    @Test
    public void retornoAdecuadoDeNombreDeHomeroAlObtenerEmpleado(){

        Empleado empleadoMalo = (new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_MALO_PRETENDIDO);

        assertEquals(NOMBRE_EMPLEADO_MALO_PRETENDIDO,empleadoMalo.getNombre());

    }

}
