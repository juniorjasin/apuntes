# Diseño y proceso de desarrollo


## Proceso de construcción

## Ciclo de vida del producto


# Importante para la materia: ANÁLISIS y DISEÑO 

## Análisis

Aprender acerca del problema a resolver, entender las necesidades de los potenciales usuarios, tratar de identificar quién es realmente el usuario y entender todas las restricciones a la solución.

cargo de “Analista”: tiene que ser técnico, para traducir los que hablar con el cliente y que lo entiendan en las siguientes tareas. es bueno tenga conocimiento previo en el tema.

Ciclo “Educcion”(ahre), modelizacion, validacion.


## Diseño. Conceptos Fundamentales

* Modularización.
* Niveles de Abstracción.
* Ocultamiento de informacion.


## Calidad de diseño. Acoplamiento

* Independencia entre componentes
* Minimizar el acomplamiento

### Tipos de acomplamiento:

[La wiki me los resume](https://es.wikipedia.org/wiki/Acoplamiento_(inform%C3%A1tica))

* De contenido
* Comun
* Externo
* Control (componente controla otro componente)
* De estampado (mandar una estructura)


## Conhesion
[La wiki me los resume](https://es.wikipedia.org/wiki/Cohesi%C3%B3n_(inform%C3%A1tica))

* causal
* logica -> cosas del mismo tema (ej class de metodos matematicos)
* temporal -> para arranques de sistemas, cosas que pasan en determinados tiempos
* procedimental -> cumplen con procedimiento pero no es claro el uso exacto
* de datos (comunicacional) -> aprovechar momentos para obtener datos porque los necesito despues
* secuencial -> salida de uno, entrada de otro
* Funcional (la mejor) componente que cumple un objetivo especifico y nada mas.


## Adaptabilidad

para mantenimiento.

## Entendibilidad

* Cohesion,puede entenderse el componente sin ayuda de otro componente?
* Nombres, son significativos los nombres usados en el componenete?
* Documentacion.
* Complejidad.

## Atributos del diseño

Estos los ve el cliente. (podrian ser req. no funcionales)

Externos:
* Rendimiento
* Seguridad
* Disponibilidad
* Funcionalidad
* Usabilidad

Internos:
* Modificabilidad
* Portabilidad
* Reusabilidad
* Integrabilidad
* Testeablidad



# Refactorizacion

Transformacion de un programa, perservando su comportamiento.

Ventajas:

* Mayor calidad de soft
* Desarrollo eficiente
* Diseño evolutivo en vez de un gran diseño inicial
* Facilita la comprension del software
* Ayuda a encontrar errores
* Evitar la reescritura de codigo
* Rapidez del desarrollo

Desventajas:

* Cambio de las interfaces entre componentes (cosas que se envian entre si)
* Bases de datos (de una parte de la base de datos), te afecta todo (seguramente)

## Que no es refactorizar

* Buscar errores
* No mejora (necesariamente) el rendimiento del programa
* No añade nuevas caracteristicas

## Momentos para refactorizar

* Al momento de agregar una funcionalidad.
* Al momento de resolver una falla.
* Al momento de realizar una revision de codigo.

## Momentos para NO refactorizar

* Antes de una entrega

# Bad Smells

Errores clasicos de programacion.

Algunas caracteristicas deseables son:

* Codigo funcional con las pruebas correspondientes
* Que no haya codigo duplicado
* Que el codigo permite entender el diesño
* Minimizar el numero de clases y metodos

### Algunos Bad Smells (emoji calavera)

* Atributos temporales. ej: clases con atributos que no forman parte de la entidad.
* Cadenas de mensajes. Objetos que invocan a otro asi sucesivamente.
* Cambio divergente. ej: cuando se generan cambios constantemente a clases
* Cambios de cadena. Cuando se cambia algo en una clase, entonces luego hay que modificar muchas cosas
* Clases de datos. Clases que tienen atributos y metodos accesoras nada mas.
* Clases grandes.
* Clase perezosa. Clase que no aporta demasiado, debe ser eliminada.
* Comentarios. Comentario excesivo no es bueno.
* Codigo duplicado. 
* Envidia de caracteristicas. Una metodo que utiliza muchos elementos de otra clase.
* Switch stattements.
* Generalidad espectativa. Compotamiento por si a caso (que no se usa).
* Grupo de datos. Cuando se pasan muchos parametros a varios metodos (eso deberia ser un objeto)
* Intermediario. Si para hacer algo tenes que pasar por objetos intermedios.
* Intimidad inadecuada. Tratar con la parte privada de la clase.
* Jerarquias paralelas. Generar estructuras que representan lo mismo.
* Legado rechazado. Cuando hijo toma caracteristicas del padre, que en realidad no lo representan. 
  Herencia mal pensada
* Lista de parametros larga.
* Metodos largos.
* Obsesion primitivo. Uso excesivo de tipos primitivos. ej: si en una clase tenes 3 
  variables de tipo int con cod_area, nro, interno. En este caso es mejor crear una clase para 
  telefono.


Ejercicios:
Identificar bad smells en clases.
