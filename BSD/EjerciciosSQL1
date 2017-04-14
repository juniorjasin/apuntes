drop table ajasinemp
drop table ajasincargos
drop table ajasindeptos
go

create table ajasindeptos
(nro_depto 		integer		not null primary key,
 nom_depto		varchar(20)	not null
)
go

create table ajasincargos
(nro_cargo 		integer		not null primary key,
 nom_cargo		varchar(20)	not null
)
go

create table ajasinemp
(nro_emp		integer		not null primary key,
 nom_emp		varchar(20)	not null,
 cargo			integer		not null references ajasincargos,
 salario		decimal(8,2)	not null,
 fecha_ingreso	datetime	not null,
 nro_depto		integer		not null references ajasindeptos,
 director		integer		null     references ajasinemp
)
go

insert into ajasindeptos (nro_depto, nom_depto)
values (10, 'CONTABILIDAD')
insert into ajasindeptos (nro_depto, nom_depto)
values (20, 'COMPRAS')
insert into ajasindeptos (nro_depto, nom_depto)
values (30, 'VENTAS')
insert into ajasindeptos (nro_depto, nom_depto)
values (40, 'PRODUCCION')
go

insert into ajasincargos (nro_cargo, nom_cargo)
values (1, 'PRESIDENTE')
insert into ajasincargos (nro_cargo, nom_cargo)
values (2, 'DIRECTOR')
insert into ajasincargos (nro_cargo, nom_cargo)
values (3, 'ADMINISTRATIVO')
insert into ajasincargos (nro_cargo, nom_cargo)
values (4, 'VENDEDOR')
go

insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (1, 'PEREZ', 1, 3500.00, '01 jan 2000 0:00', 10, null)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (2, 'RODRIGUEZ', 2, 2500.00, '01 jan 1999 0:00', 10, 1)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (3, 'LOPEZ', 2, 2500.00, '01 jan 2000 0:00', 20, 1)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (4, 'DOMINGUEZ', 2, 2500.00, '01 jul 1999 0:00', 30, 1)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (5, 'GONZALEZ', 3, 1500.00, '01 jul 2000 0:00', 10, 2)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (6, 'MONTERO GONZALEZ', 4, 1200.00, '01 may 2000 0:00', 10, 2)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (7, 'SANCHEZ', 3, 1500.00, '01 aug 2000 0:00', 20, 3)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (8, 'JIMENEZ', 3, 1500.00, '01 dec 1999 0:00', 20, 3)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (9, 'MARIANI', 4, 1500.00, '01 feb 2000 0:00', 30, 4)
insert into ajasinemp (nro_emp, nom_emp, cargo, salario, fecha_ingreso, nro_depto, director)
values (10, 'GIULIANI', 4, 1000.00, '01 mar 2000 0:00', 30, 4)
go

/*
EJERCICIOS:

1.	(nom_emp, nro_depto) de todos los empleados
2.	(todos los datos) de los empleados con salario entre 1500 y 2000
3.	(nro_emp, nom_emp, salario) de los empleados con cargo 'VENDEDOR' o 'ADMINISTRATIVO'
4.	(nom_emp, nom_depto) de todos los empleados
5.	(nom_emp) de los empleados del departamento 'CONTABILIDAD'
6.	(nom_depto) de los departamentos que tengan empleados
7.	(nom_depto) de los departamentos que tengan empleados con cargo 'VENDEDOR'
8.	(nom_depto) de los departamentos que no tengan empleados con cargo 'VENDEDOR'
9.	(nro_emp) de los empleados que trabajan en el mismo departamento que el empleado 'JIMENEZ'
10.	(nro_emp) de los empleados más antiguos que el 'PRESIDENTE'
11.	(nom_depto) de los departamentos que tienen empleados en todos los cargos
12.	(nro_emp, nom_emp, salario_anual) de los empleados con cargo 'VENDEDOR'. (salario_anual = salario*12)
13.	Cantidad de empleados por departamento (nom_depto, cantidad)
14.	Máximo, mínimo y promedio de salarios por departamento (nom_depto, máximo, mínimo, promedio)
15.	Máximo, mínimo y promedio de salarios (máximo, mínimo, promedio)
16.	(nom_depto) de los departamentos que tengan más de 3 empleados
17.	(nro_emp,nro_depto) de los empleados con menor salario en cada departamento
18.	(nro_emp,nro_depto) de los empleados con salario mayor al promedio del departamento
19.	(nro_emp) de los empleados con menor salario que el mayor salario del departamento nro. 30
*/


--1.	(nom_emp, nro_depto) de todos los empleados
SELECT nom_emp, nro_depto
FROM ajasinemp

--2.	(todos los datos) de los empleados con salario entre 1500 y 2000
SELECT *
FROM ajasinemp e
WHERE e.salario BETWEEN 1500 AND 2000

--3. (nro_emp, nom_emp, salario) de los empleados con cargo 'VENDEDOR' o 'ADMINISTRATIVO'

SELECT e.nro_emp, e.nom_emp, e.salario
FROM ajasinemp e JOIN ajasincargos c ON e.cargo = c.nro_cargo 
WHERE c.nom_cargo = 'VENDEDOR' OR c.nom_cargo = 'ADMINISTRATIVO'


--4.	(nom_emp, nom_depto) de todos los empleados
SELECT nom_emp, nom_depto
FROM ajasinemp e JOIN ajasindeptos d ON e.nro_depto = d.nro_depto 


--5.	(nom_emp) de los empleados del departamento 'CONTABILIDAD'
SELECT nom_emp
FROM ajasinemp e JOIN ajasindeptos d ON d.nro_depto = e.nro_depto
WHERE d.nom_depto = 'CONTABILIDAD'


--6.	(nom_depto) de los departamentos que tengan empleados
SELECT DISTINCT nom_depto
FROM ajasindeptos d JOIN ajasinemp e ON d.nro_depto = e.nro_depto 

--7.	(nom_depto) de los departamentos que tengan empleados con cargo 'VENDEDOR'
SELECT nom_depto
FROM ajasindeptos d
WHERE EXISTS (SELECT *
			  FROM ajasinemp e JOIN ajasincargos c ON e.cargo = c.nro_cargo
			  WHERE d.nro_depto = e.nro_depto 
			  AND c.nom_cargo = 'VENDEDOR'
			  )		    


--8.	(nom_depto) de los departamentos que no tengan empleados con cargo 'VENDEDOR'
SELECT nom_depto
FROM ajasindeptos d
WHERE NOT EXISTS (SELECT *
			  FROM ajasinemp e JOIN ajasincargos c ON e.cargo = c.nro_cargo
			  WHERE d.nro_depto = e.nro_depto 
			  AND c.nom_cargo = 'VENDEDOR'
			  )


--9.(nro_emp) de los empleados que trabajan en el mismo departamento que el empleado 'JIMENEZ'
SELECT nro_emp
FROM ajasinemp e
WHERE e.nro_depto = (SELECT nro_depto
				   FROM ajasinemp e1
				   WHERE e1.nom_emp = 'JIMENEZ'
				   ) AND e.nom_emp != 'JIMENEZ'




--10.	(nro_emp) de los empleados más antiguos que el 'PRESIDENTE'
SELECT nro_emp
FROM ajasinemp e JOIN ajasincargos c ON e.cargo = c.nro_cargo
WHERE  e.fecha_ingreso < 
		(SELECT e.fecha_ingreso
		FROM ajasinemp e JOIN ajasincargos c ON e.cargo = c.nro_cargo
		WHERE c.nom_cargo = 'PRESIDENTE') 
		

--11.	(nom_depto) de los departamentos que tienen empleados en todos los cargos
SELECT d.nom_depto
FROM ajasindeptos d
WHERE NOT EXISTS (SELECT *
				  FROM ajasincargos c
				  WHERE NOT EXISTS (
									SELECT *
									FROM ajasinemp e
									WHERE e.nro_depto = d.nro_depto AND e.cargo = c.nro_cargo))


--12.(nro_emp, nom_emp, salario_anual) de los empleados con cargo 'VENDEDOR'. (salario_anual = salario*12)
SELECT e.nro_emp, e.nom_emp, e.salario*12 sueldo_anual
FROM ajasinemp e JOIN ajasincargos c ON e.cargo = c.nro_cargo
WHERE c.nom_cargo = 'VENDEDOR'


--13.	Cantidad de empleados por departamento (nom_depto, cantidad)
SELECT d.nom_depto, COUNT(*)cantidad
FROM ajasinemp e JOIN ajasindeptos d ON e.nro_depto = d.nro_depto
GROUP BY d.nom_depto

--14.	Máximo, mínimo y promedio de salarios por departamento (nom_depto, máximo, mínimo, promedio)
SELECT d.nom_depto, MAX(e.salario) maximo, MIN(e.salario) minimo, AVG(e.salario) promedio
FROM ajasinemp e JOIN ajasindeptos d ON e.nro_depto = d.nro_depto
GROUP BY d.nom_depto

--15.	Máximo, mínimo y promedio de salarios (máximo, mínimo, promedio)
SELECT  MAX(e.salario) maximo, MIN(e.salario) minimo, AVG(e.salario) promedio
FROM ajasinemp e JOIN ajasindeptos d ON e.nro_depto = d.nro_depto
GROUP BY e.salario

--16. (nom_depto) de los departamentos que tengan más de 3 empleados
SELECT d.nom_depto
FROM ajasindeptos d JOIN ajasinemp e ON d.nro_depto = e.nro_depto
GROUP BY d.nom_depto
HAVING COUNT(*) > 3


--17.	(nro_emp,nro_depto) de los empleados con menor salario en cada departamento
SELECT e.nro_emp, e.nro_depto
FROM ajasinemp e
WHERE e.salario = (SELECT MIN(e1.salario)
				   FROM ajasinemp e1
				   WHERE e1.nro_depto = e.nro_depto)


--18.	(nro_emp,nro_depto) de los empleados con salario mayor al promedio del departamento
SELECT e.nro_emp, e.nro_depto
FROM ajasinemp e
WHERE e.salario > (SELECT AVG(e1.salario)
				   FROM ajasinemp e1
				   WHERE e1.nro_depto = e.nro_depto)


--19.	(nro_emp) de los empleados con menor salario que el mayor salario del departamento nro. 30
SELECT e.nro_emp
FROM ajasinemp e
WHERE  e.salario < (SELECT MAX(e1.salario)
		            FROM ajasinemp e1
		            WHERE e1.nro_depto = 30)


