# Refactorizacion

Vemos el archivo pdf de refactorizacion. Con ejemplo de clase Run.


Ejemplo clase Run. 

caso 1.
Bad Smell --> cambio divergente 
Solucion --> Extract class (sacar las clases inner que tiene)

caso 2.
Bad Smell --> Intimidad inadecuada 
Solucion --> Encapsular campo (hacer los atributos privados y crear metodos accesores)

caso 3.
Bad Smell --> Envidia de caracteristicas
Solucion --> Mover campos, pasamos las variables a la clase Estrella (a la que deben pertenecer)



## Ejercicio: Identificar y corregir bad smells (Punto.zip)

1) 
Bad Smell: cambio divergente 
Justificacion: Se tiene la clase Punto dentro de Run, lo cual induce a que a que se 
cambie esta clase con frecuencia.
Solucion: Extract class (sacar las clases inner que tiene) a un nuevo archivo.

2)
Bad Smell: Intimidad inadecuada
Justificacion: Los atributos de la clase Punto son publicos.
Solucion: Encapsular campo (hacer los atributos privados y crear metodos accesores)

3) envidia de caracteristicas, agregar color a la clase Punto.

4) grupo de datos, porque las clases que dibujan reciben varios parametros iguales
solucion : reemplazar la variable local por variable de clase y mandar solo puntos.

