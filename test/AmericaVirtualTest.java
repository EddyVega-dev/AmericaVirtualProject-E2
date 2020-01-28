
import modelo.Empleado;
import modelo.EmpresaAmericaVirtual;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static modelo.Constantes.*;

public class AmericaVirtualTest {

    @Test
    public void retornoAdecuadoDeNombreDeHomeroAlObtenerEmpleado(){

        EmpresaAmericaVirtual empresa = new EmpresaAmericaVirtual();

        Empleado empleadoMalo = empresa.obtenerEmpleado(EMPLEADODB_MALO_PRETENDIDO);

        assertEquals("homero",empleadoMalo.getNombre());

    }

}
