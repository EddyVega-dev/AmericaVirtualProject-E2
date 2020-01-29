package modelo;

public class EmpresaAmericaVirtual {

    public Empleado obtenerEmpleado(EmpleadoTablaDB unEmpleadoDB) {

        return FabricaEmpleados.fabricar(unEmpleadoDB);

    }

}
