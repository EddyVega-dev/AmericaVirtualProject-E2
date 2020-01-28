package modelo;

import static modelo.TipoEmpleado.BUENO;
import static modelo.TipoEmpleado.MALO;

public class Constantes {

    public static String NOMBRE_EMPLEADO_MALO_PRETENDIDO = "homero";

    public static String SOLO_EMPLEADO_BUENO = "soloEmpleadoBueno";
    public static String SOLO_EMPLEADO_MALO = "soloEmpleadoMalo";

    public static EmpleadoTablaDB EMPLEADODB_MALO_PRETENDIDO = new EmpleadoTablaDB( "homero", "simpsom", MALO );
    public static EmpleadoTablaDB EMPLEADODB_BUENO_PRETENDIDO = new EmpleadoTablaDB("smithers", "", BUENO);

    public static Empleado HOMERO = new EmpleadoMalo();
    public static Empleado SMITHERS = new EmpleadoBueno();
    public static Empleado NUEVO = new EmpleadoNuevo();


}
