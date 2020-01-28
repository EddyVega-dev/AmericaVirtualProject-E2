
import modelo.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static modelo.Constantes.*;

public class AmericaVirtualTest {

    @Test
    public void retornoAdecuadoDeNombreDeHomeroAlObtenerEmpleadoMalo(){

        Empleado empleadoMalo = (new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_MALO_PRETENDIDO);

        assertEquals(NOMBRE_EMPLEADO_MALO_PRETENDIDO,empleadoMalo.getNombre());

    }

    @Test
    public void retornoApropiadoDeSoloTipoDeEmpleadoDeHomeroAlObtenerEmpleadoMalo(){

        EmpleadoMalo empleadoMalo = (EmpleadoMalo)(new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_MALO_PRETENDIDO);

        assertEquals(SOLO_EMPLEADO_MALO,empleadoMalo.getSoloEmpleadoMalo());

    }

    @Test
    public void retornoAdecuadoDeNombreDeSmithersAlObtenerEmpleadoBueno(){

        Empleado empleadoBueno = (new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_BUENO_PRETENDIDO);

        assertEquals(NOMBRE_EMPLEADO_BUENO_PRETENDIDO,empleadoBueno.getNombre());

    }

    @Test
    public void retornoApropiadoDeSoloTipoDeEmpleadoDeSmithersAlObtenerEmpleadoMalo(){

        EmpleadoBueno empleadoBueno = (EmpleadoBueno)(new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_BUENO_PRETENDIDO);

        assertEquals(SOLO_EMPLEADO_BUENO,empleadoBueno.getSoloEmpleadoBueno());

    }

}
