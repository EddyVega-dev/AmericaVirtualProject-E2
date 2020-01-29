package modelo;

public class EmpresaAmericaVirtual {

    public Empleado obtenerEmpleado(EmpleadoTablaDB unEmpleadoDB) {

        return FabricaEmpleado.fabricar(unEmpleadoDB);

    }

}
