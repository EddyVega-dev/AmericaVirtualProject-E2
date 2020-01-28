package modelo;

import static modelo.Constantes.*;

public class EmpleadoBueno extends Empleado {

    private String soloEmpleadoBueno = SOLO_EMPLEADO_BUENO;

    public String getSoloEmpleadoBueno() {
        return soloEmpleadoBueno;
    }

    public void setSoloEmpleadoBueno(String soloEmpleadoBueno) {
        this.soloEmpleadoBueno = soloEmpleadoBueno;
    }

}
