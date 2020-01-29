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

    public static Empleado fabricar(EmpleadoTablaDB unEmpleadoDB){

        Empleado empleadoFabricado =null;

        if (empleado.containsKey(unEmpleadoDB.getTipo())) {

            empleadoFabricado = empleado.get(unEmpleadoDB.getTipo());
            empleadoFabricado.setNombre(unEmpleadoDB.getNombre());
            empleadoFabricado.setApellido(unEmpleadoDB.getApellido());

        }

        return empleadoFabricado;

    }

}
