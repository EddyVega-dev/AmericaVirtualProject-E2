package modelo;

import java.util.HashMap;
import java.util.Map;

import static modelo.Constantes.*;
import static modelo.TipoEmpleado.*;

public class FabricaEmpleados {

    static Map<Enum, Empleado> empleado =  new HashMap<>();

    static {
        empleado.put(MALO, HOMERO);
        empleado.put(BUENO, SMITHERS);
        empleado.put(null, NUEVO);
    }

    public static Empleado fabricar(TipoEmpleado unTipo, String unNombre, String unApellido){

        Empleado empleadoFabricado =null;

        if (empleado.containsKey(unTipo)) {

            empleadoFabricado = empleado.get(unTipo);
            empleadoFabricado.setNombre(unNombre);
            empleadoFabricado.setApellido(unApellido);

        }

        return empleadoFabricado;

    }

}
