package modelo;

import static modelo.Constantes.*;

public class EmpleadoTablaDB {

    private String nombre;
    private String apellido;
    private TipoEmpleado tipo;
    private String soloEmpleadoBueno = SOLO_EMPLEADO_BUENO;
    private String soloEmpleadoMalo = SOLO_EMPLEADO_MALO;

    public EmpleadoTablaDB(String unNombre, String unApellido, TipoEmpleado unTipoEmpleado) {

        this.nombre = unNombre;
        this.apellido = unApellido;
        this.tipo = unTipoEmpleado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }

    public String getSoloEmpleadoBueno() {
        return soloEmpleadoBueno;
    }

    public void setSoloEmpleadoBueno(String soloEmpleadoBueno) {
        this.soloEmpleadoBueno = soloEmpleadoBueno;
    }

    public String getSoloEmpleadoMalo() {
        return soloEmpleadoMalo;
    }

    public void setSoloEmpleadoMalo(String soloEmpleadoMalo) {
        this.soloEmpleadoMalo = soloEmpleadoMalo;
    }

}
