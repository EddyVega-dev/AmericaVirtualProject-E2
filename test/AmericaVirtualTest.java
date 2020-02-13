
import modelo.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static modelo.Constantes.*;

public class AmericaVirtualTest {

    @Test
    public void testRetornoAdecuadoDeNombreDeHomeroAlObtenerEmpleadoMalo(){

        Empleado empleadoMalo = (new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_MALO_PRETENDIDO);

        assertEquals(NOMBRE_EMPLEADO_MALO_PRETENDIDO,empleadoMalo.getNombre());

    }

    @Test
    public void testRetornoApropiadoDeSoloTipoDeEmpleadoDeHomeroAlObtenerEmpleadoMalo(){

        EmpleadoMalo empleadoMalo = (EmpleadoMalo)(new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_MALO_PRETENDIDO);

        assertEquals(SOLO_EMPLEADO_MALO,empleadoMalo.getSoloEmpleadoMalo());

    }

    @Test
    public void testRetornoAdecuadoDeNombreDeSmithersAlObtenerEmpleadoBueno(){

        Empleado empleadoBueno = (new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_BUENO_PRETENDIDO);

        assertEquals(NOMBRE_EMPLEADO_BUENO_PRETENDIDO,empleadoBueno.getNombre());

    }

    @Test
    public void testRetornoApropiadoDeSoloTipoDeEmpleadoDeSmithersAlObtenerEmpleadoMalo(){

        EmpleadoBueno empleadoBueno = (EmpleadoBueno)(new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_BUENO_PRETENDIDO);

        assertEquals(SOLO_EMPLEADO_BUENO,empleadoBueno.getSoloEmpleadoBueno());

    }

    @Test
    public void testLanzamientoDeTipoEmpleadoInvalidoExceptionPorNoSerDeNingunTipoConocido(){

        Empleado empleadoNuevo = (new EmpresaAmericaVirtual()).obtenerEmpleado(EMPLEADODB_NUEVO_PRETENDIDO);

        assertEquals(NOMBRE_EMPLEADO_NUEVO_PRETENDIDO,empleadoNuevo.getNombre());

    }

}
