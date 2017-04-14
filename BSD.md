# apuntes BSD

### SQL

* creacion de tablas


```SQL
CREATE TABLE nombre_de_talba
(
nombre_columna  tipo  not null (o null) primary key (o references nombre_de_talba)
)
go -- instruccion propia de sql server
```
* insersion de valores

```SQL
INSERT INTO nombre_de_talba (nombre_columna, nombre_columna)
VALUES (value1, value2)
go -- instruccion propia de sql server
```


* eliminar tabla

```SQL
drop table nombre_de_talba
go -- instruccion propia de sql server
```

* obtener toda una tabla

```SQL
-- variante 1
SELECT *
FROM nombre_tabla
-- variate 2
SELECT collumna1, columna2, ... , columnaN
FROM nombre_tabla
```

