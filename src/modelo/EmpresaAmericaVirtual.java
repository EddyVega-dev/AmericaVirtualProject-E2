package modelo;

public class EmpresaAmericaVirtual {

    public Empleado obtenerEmpleado(EmpleadoTablaDB unEmpleadodb) {

        return unEmpleadodb.generarEmpleado(new FabricaEmpleados());

    }

}
