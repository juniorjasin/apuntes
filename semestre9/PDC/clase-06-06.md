# Repaso parcial PDC

<ct: carreras function="traerAlumnos()">
// esto llama a la funcion traerAlumnos y ahi llama con ajax
// a un jsp donde esta el customTag (NO ES UN SERVLET)
// NO necesita un servlet porque los customTags hacen la conexion a la base

stmt.close(); --> limpia la memoria del statement

stmt.executeUpdate() --> devuelve la cantidad de registros afectados de la consulta. Lo podemos usar
			 cuando la query hace un update en la base

Cuando tenes un output usamos --> stmt.registerOutParameter()

stmt.getString("error") --> este nombre error lo sacamos del procedimiento almacenado (@error = @out_error)
pero tambien podemos usar el numero de parametro
stmt.getString(3) == es lo mismo stmt.getString("error")


Session --> cuando tengo muchos datos, ej: objetos. 

Cookies --> para persistir datos simples, ej: datos del usuario en campos

Esto se acostumbra a hacer en un servlet
