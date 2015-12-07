# CORBA: Java IDL 

El objetivo de esta práctica es la creación de una apliación distribuida
CORBA usando Java-IDL.

Con las especificaciones de CORBA, un programador puede implementar cualquier
componente especificado en la definición de CORBA.
Existe un gran número de herramientas CORBA disponibles http://www.corba.org.
Algunas de estas herramientas están desarrolladas por empresas, otras por investigadores
y otras por grupos independientes.

Como ejemplo de una herramienta de este tipo, se va a estudiar Java-IDL.
Esta herramienta forma parte de la plataforma Java 2 e incluye:

  * un orb 
  * un compilador del lenguaje de especificación de interfaces 'idl' a Java
  * un subconjunto de los servicios estándar de CORBA

Para dar soporte a estas componentes Java-IDL proporciona varios paquetes con interfaces y clases:

 * El paquete org.omg.CORBA contiene las interfaces y las clases
   que proporcionan la traducción (mapping) de las API 
   de CORBA omg al lenguaje de programación Java.
   También contiene interfaces y clases para soportar el API 
   de acceso al ORB.
 * El paquete org.omg.CosNaming contiene las interfaces y las clases
   que dan soporte al Servicio de Nombres para Java-IDL. 

El conjunto de herramientas que proporciona Java para desarrollar aplicaciones CORBA son:
 
 * idlj - Es el compilador IDL-a-Java. 
 * orbd - proceso que da soporte al Servicio de Nombres.

## Ejercicio.

1.  Implementar una aplicación cliente/servidor usando *Java IDL* 
    en la cual el servicio que ofrece el objeto remoto es un método 
    que suma los elementos de dos arrays. 
    El cliente ha de instanciar dos arrays de enteros e invocar 
    al método remoto para que realice la suma y devuelva el array resultado. 

2. Utilizar el método *currentTimeMillis()* de la clase System para establecer un
   cronómetro en el cliente del ejercicio anterior ¿Cuánto tiempo consume la implementación?

3. ¿Qué se puede decir, con respecto al tiempo que consumen, si se compara con
   las implementaciones realizadas en las prácticas anteriores con Sockets y RMI? 

4. Escriba una breve comparativa de las tres herramientas.
