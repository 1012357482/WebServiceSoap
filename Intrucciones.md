# Creación Servicio Web calculadora desde eclipse 
## 1. Se usa el plugin JAXWS, este ya viene integrado para la versión del JDK del ejercicio que es la 1.8.  
- Se crean tres clases, la cuales son 
  - ### Calculadora.java  
    Esta es una interfaz la cual solmanete define un metodo abstracto llamado operación , tiene tres parametros en donde el primero es el tipo de operación a escoger con un número y los otros dos son los valores númericos a operar.  
    Tien dos anotaciónes @WebService en el nombre de la clasa(Esta indica que la Intefaz es un endPoint) y en el metódo @WebMethod (Indica el metodo u operación a exponer)
  - ### CalculadoraImp.java  
    Clase que implementa la interfaz calculadora, sus endpoint indican que interfaz definir en el webService, implementa metodos de la interfaz  y operaciones a realizar.
  - ### CalculadoraPublish.java  
    Clase con el metodo main usa un metodo endpoint.publis para indicar la url del servidor virtual donde se desplegara el webSErvice y la clase que implementa el webservice.
Por último se valida que el servicio este arriba ejecutando esta última clase, y se dirije hasta la dirección de despligue del servidor y en la url se agrega "?wsdl" para visualizar el wsdl del webservice, ejemplo: "http://localhost:1515/WS/Calculadora?wsdl"   
## 2. Se creará el cliente.

Sabiendo la ruta del proyecto ejemplo "C:\\MyWorkspace\proyectoWebSErvice\src"  ingresar hasta el src desde el cmd y ejecutar el siguiente comando.  
__"wsimport -s . http://localhost:1515/WS/Calculadora?wsdl"__  
El ultimo parámetro es la ruta del archivo wsld de webService, al ejecutar este comando de forma exitosa se crean más clases de forma automatica en el proyecto java, debido al uso del comando, esto por la API JAXW:
- CalculadoraImplService.java
- ObjectFactory.java
- Operacion.java
- OperacionResponse.java
- package-info.java
Ahora se creará una nueva clase **CalculadoraConsumer.java** en ella se crea un objeto de la clase **CalculadoraImplService.java**  implementando las operaciones de "suma, resta, multipliacioón y división"
y se ejecuta la prueba.
## 3. SOAP.UI 
Si se desea probar el web service desde un cliente diferente, se usa el software SOAP.UI pasandole como unico argumento la url del wsdl.
