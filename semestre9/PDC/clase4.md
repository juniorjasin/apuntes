## JQuery

Aniadirlo a nuestro `html`
```html
<script type="text/javascript" src="./jquery-3.3.1.min.js"></script>
```

Sintaxis jquery

```javascript
$(document).ready(funcion{
// lo que haga aca se va a ejecutar cuando se cargue la pagina
});
```

Acceder a un identificadorde `<p id="parrafo"> </p>`
El selector `#`es el mas especifico. Porque solo se le aplica a los que tienen id="parrafo"
```javascript
$(#parrafo).css("color","#00ff00");
```

- JSON
Lo que esta entre llaves es en formato JSON
```javascript
({"color":"00ff00", "background": "#ff0000"});
```
- Ahora se aplica a todas las clases parrafo
```javascript
$(.parrafo).css("color","#00ff00");
```

- Ahora si queremos que se aplicar algo a una porcion del html.
```html
<div id="div1">
    <p class="p"> </p>
    <p class="p"> </p>
</div>

<div id="div2">
    <p class="p"> </p>
</div>
```
Para aplicar solo a los `class="p"` del primer `div`:
```javascript
$(".p", $(#div1));
$("#div1 .p");
$("#div1").find(".p");
```

**Importante** podemos usar una u otra forma:
```javascript
// Estilo javascript
$(.parrafo).css(backgroundColor,"#00ff00");
// Estilo css
$(.parrafo).css("background-color","#00ff00");
```

Para hacer un append a un tag dentro de otro, esto sirve para evitar hacer un for
a cada elemento `<p>` dentro de cada `<div>`. Es mas eficiente.
```javascript
$(#div p).append("&");
```

Con los mensajes (ventanas) se bloquea el hilo de ejecucion hasta que se selecciona una opcion
y luego se sigue cargando la pagina.


### Funciones 
```javascript
function nombre(){
}

function nombre2(param1, param2){
}
```

### Condicionales

```javascript
var1 = 2;
var2 = '2';

// Entra por True por mas que sean tipos distintos.
if(var1 == var2){
}

// False
if(var1 != var2){
}

// ===: exactamente igual, compara si son el mismo tipo.
if(var1 === var2){
}

// !==: exactamente distinto, compara si no son el mismo tipo.
if(var1 === var2){
}
```

`isNaN(param1)` : The isNaN() function determines whether a value is an illegal number (Not-a-Number).
This function returns true if the value equates to NaN. Otherwise it returns false.


### Declaracion de objetos

- Con una funcion y asignando atributos a traves de los paramentros.
- Con un json (mejor alternativa).
- Creando un objeto con `new`y con el operador `.` le seteo los atributos.

### Eventos

- `setInterval()` vs. `setTimeout()`

`setInterval()`: se llama periodicamente y NO corta (a menos que llames a `clearInterval()`)
`setTimeout()`: se llama el metodo y luego corta.


Los metodos de eventos empiezan con **on**. Todo lo que ejecutan los eventos son funciones.
[Algunos eventos.](https://www.w3schools.com/js/js_events.asp)


Aplicar propiedad por **posicion**. Aplica al objeto de id #bloque y esta en la posicion 0.
```javascript
$("#bloque p:eq[0]").css("color","#00ff00");
```

- Vimos todos los ejemplos [1 al 8]

Para saber cuantos campos seleccionados hay. Por ej, cuando se utilizan en los tag `<select>`
```javascript
$("#iequipo :selected").length;
```

Para obtener solo los campos checked.
```javascript
$("#input [name=hobbies]:checked");
```

### Storage
- sessionStorage: se mantiene mientras la persona no cierre la pagina.
- localStorage: se mantiene hasta que no limpie el historial.

Nos permite guardar informacion mas rapida en el navegador. Si queremos enviar esto en el lado
del servidor tenemos que hacer un `POST`.

Trabajo practico:

3 paginas minimo, pueden ser mas.

- Para respuesta unica usar: checkbox o select
- Para respuesta con varias opciones: checkbox o select multiple
- Para informar un valor: range, o algo mas.

Hay que resolverlo con jquery, javascript, html, css. Nada de backend.
