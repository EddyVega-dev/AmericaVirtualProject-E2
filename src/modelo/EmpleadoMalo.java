package modelo;

import static modelo.Constantes.*;

public class EmpleadoMalo extends Empleado {

    private String soloEmpleadoMalo = SOLO_EMPLEADO_MALO;

    public String getSoloEmpleadoMalo() {
        return soloEmpleadoMalo;
    }

    public void setSoloEmpleadoMalo(String soloEmpleadoMalo) {
        this.soloEmpleadoMalo = soloEmpleadoMalo;
    }

}
