package modelo;

import modelo.exception.TipoDeEmpleadoInvalidoException;

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

    public static Empleado fabricar(Enum unTipo, String unNombre, String unApellido){


        if (empleado.containsKey(unTipo)) {

            Empleado empleadoFabricado = empleado.get(unTipo);
            empleadoFabricado.setNombre(unNombre);
            empleadoFabricado.setApellido(unApellido);

            return empleadoFabricado;

        }

        throw new TipoDeEmpleadoInvalidoException();

    }

}
