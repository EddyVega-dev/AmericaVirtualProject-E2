# AmericaVirtualProject - Ejercicio2

## Descripción

-   Se pide codear un posible refactor del método:

    `public Empleado obtenerEmpleado(EmpleadoTablaDB unEmpleadodb)`  
    
-   Con cierto criterio para obtenerlo:

    ![](https://github.com/EddyVegaGarcia/AmericaVirtualProject-E2/blob/master/AmericaVirtualE2.png)

## Solución del programa

-   JDK 8: Herramienta utilizada para el desarrollo de la solución del programa.

-   JUnit 4.12: Herramienta utilizada para el desarrollo de test.

-   Para este gestión de proyecto realice la metodología de trabajo de un proceso incremental la cuál es **Metodologías ágiles**.
    
-   Diseño de solución orientada a objetos.
    
-   Diseño de contrato sin romper el concepto de **encapsulamiento**.
 
-   Uso del patrón Simple Factory para generar Empleados y así evitar romper el encapsulamiento y repetición de código.

-   El refactor ameritaba la delegación de tareas y construcción de empleados desde una clase, el patrón empleado realiza esas característica muy bien, teniendo en cuenta todos los tipos que se tienen y otorga la facilidad de optimizarlo a un agregado a futuro.
  
## Explicación del programa

-   Se realiza el patrón Factory de manera adecuada y se termina la refactorización de manera eficiente, concluyendo de toda esa llamada de getters y setters a una sola fabricación:
 
    `FabricaEmpleados.fabricar(unEmpleadoDB)`
    
-   La clase FabricaEmpleados realiza un guardado estático de los tipos, ya obtenidos, y que se quiere fabricar guardandolos en el Map. Luego al llamado de fabricar se comprueba si se encuentra, fabrica al empleado adecuado y lo devuelve.

    ```
           static {
               empleado.put(MALO, HOMERO);
               empleado.put(BUENO, SMITHERS);
               empleado.put(null, NUEVO);
           }
    ```

## Diagrama UML

- Diagrama de clases: 

    ![](https://github.com/EddyVegaGarcia/AmericaVirtualProject-E2/blob/master/AmericaVirtualUML.png)

## Desarrollador

-   Tengo conocimientos de Git con lo cuál cree este respositorio y pude ir trabajando a la par con el desarrollo del programa.
    
-   Este trabajo puede desarrollarse desde un inicio con diseño **Unit Testing** con conceptos de **TDD** gracias a la herramienta de **Unix** para Java: `Junit`. 
