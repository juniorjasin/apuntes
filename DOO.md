# apuntes clase 12/04/17

Patrones de diseño

#### Builder

Utilizamos un Builder, para no tener que modificar en cada parte del codigo si modificamos el constructor
Java:

```java
public Class Ejemplo{
  private Ejemplo(){
  }
  
  public static Ejemplo create(int i){
  l = new Ejemplo();
  l.set(i)
  l.size(150,200);
  l.setColor('Color Blue);
  return l;
  }
}
```

#### Singleton

Utiliza un singleton, una unica instancia de un objeto y que quede disponible en todo el sistema.

```java
public Class Singleton extends JFrame { // indica que uso el constructor por defecto de JFrame
  private static Singleton s = new Singleton();
  
  public static Singleton get(){
    return s;
  }
  private Singleton(){} // para que no se puedan crear objetos, sino el constructor es publico por defecto
  
  Integer w,h,x,y;
  public getW(){return w;}
  public setW(Integer w){this.w=w;}
}
```

#### Factory

