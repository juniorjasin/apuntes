# Codigo de 3 direcciones

*A lo sumo* tiene 3 direcciones:
  - X direccione en mem donde se guarda resultado
  - Z e Y son otras dos direcciones

```
X = Y (op) Z // este tiene 3 direcciones
X = Y (op) CTE
X = Y
X = CTE
```

## Para el final 
```diff
+ Agregar la generacion de codigo intermedio al TP2
```

"para esta etapa no importa el tipo de datos" Eschoyes 1974 - ∞

### Ejemplo de paso a codigo de 3 direcciones

``` c
int x = 0;
int y = 10;
int z = 0;
z = 3 * x + y / 2;
```

Ahora en C3D (codigo de 3 direcciones)

```
x = 0
y = 10
z = 0
t0 = 3 * x
t1 = y / 2 
t2 = t0 + t1
z = t2
t3 = z == 8
IFJMP t3 LABEL L0
    y = 5 * x
    JMP L1
L0 :
    x =  5 * y
L1 :
```
### Ejemplo de While

``` C
While(x > 0){
  z += 5;
  x -+ z;
}
```

C3D

```
L2:
t4 = x > 0
IFJMP t4 LABEL L3
  z = z + 5
  x = x - z
  JMP L2
L3:
```

### Ejemplo de For

``` C
for(x=0; x < 10; x++){
  z += y *2;
}
```

C3D:

```
X = 0
L4 :
t5 = x < 10
IFJMP t5 LABEL L5
  t6 = y * 2
  z + z + t6
  x = x + 1
  JMP L4
L5:
```
