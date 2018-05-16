# Conexion a la base de datos

JSP ------------ Servlet --------------- JDBC --- BD
listado.jsp     index.jsp      


Nuestro index.jsp va a ser el Servlet

### Para consultas planas
Statement ----> sin parametros

### Para consultas con parametros
PrependStatement ----> parametros
          --> Select
          --> insert
          --> update
          --> delete
          
### Para procedimientos almacenados
CallableStatement ----> Store procedure
          
Para evitar tener codigo inyectable(sql injection)
```
Select * from tabla where codigo=? 
```

setAutocimmit = true --> hace el commit por nosotros, la efectiviza.

setAutocimmit = false --> hace un rollback. y el commit es a mano.

Manejo transaccional: que nosotros sepamos cuando hacer el setAutocommit true o false.

forward: se usa para volver a otro server. (en vez de hacer sendRedirect que vuelve hasta el cliente)

Buscar jar de mysql

Bean Class por cada tabla que queramos manejar.
