# XML
tiene una estructura, para saber como vendran los datos, es decir, asegurarnos que estructura viene (atributos, 
tipos de datos de cada atributo, relaciones (1 a muchos, 0 a 1, etc), etc). Este esquema de validacion del xml
es un archivo ```.xsd```

dos acciones posibles

- parsear
- transformar

### parsear
- transformo xml para obtener datos.
- En Java tenemos dos opciones:
    - DOM --> genera modelo de objetos y me da metodos para manipular
      - Mas sencillo
      - XPath --> podemos buscar un elemento especifico dentro del xml. ej: "tomamos elementos de x type". *USAR ESTE*
    - SAX --> funciona a traves de eventos, genera eventos de lectura donde decimos que hacer
                                
### transformar
- XSLT --> transformacion de xml a html
- Le damos el xml, el esquena y con eso construye el html

Vamos a ver solo ejemplos con DOM

### ejemplo xPath
```java
// obtengo los cant dentro de un nodo producto, con cant = 0
xPath.compile("productos/producto/cant[text()=0]")

// ! despues de ejecutar compile, nos quedamos parados en la ruta que se
//   ejecuto antes, por eso hacemos ../ para acceder a nombres (otro atrubito de producot)
xPath.compile("../nom");
```
