# Hoja de estilos

Formas de anadir estilos:
- Referenciar el archivo `.css` (mejor forma)
- Agregarlo como atributo (no permite reusabilidad)
- crear tag `<style>` (peor forma)

### Sinaxis de los estilos en clases.
```css
.nombre_clase{
    color:#0f0;
}
```

### Sinaxis de los estilos para _todos_ los tags.
```css
div{
    margin-left: 20px;
}
```

### Aplicar estilos a los `<div>` que sean de la clase `ml20`.
```css
div.ml20{
    margin-left: 20px;
}
```

### Aplicar estilos a los `<div>` que sean de la clase `ml20` y para _todos_ los parrafos `<p>`.
```css
div.ml20, p{
    margin-left: 20px;
}
```

### Aplicar estilos si encuentra dentro de un parrafor un div, entonces para esos elementos
va a aplicar este estilo. Va desde un padre a un hijo.
```css
p div{
    margin-left: 20px;
}
```

### Estilos para atributo `id`
Si un elemento tiene el `id="opcion2"` entonces aplica este estilo.
`!important` hace que si tenemos dos estilos aplicados, este tiene prioridad
```css
# opcion2{
    margin-left: 20px !important;
}
```

Para trabajar con width y height no es conveniente usar `px` porque es muy estatico.
Conviene usar `em` En relación con el tamaño de letra del elemento (2em significa 2 veces el
tamaño de la fuente actual)
[Mas sobre css units](https://www.w3schools.com/cssref/css_units.asp)


## Javascript & JQuery

Podemos incorporar jquery a nuestro archivo `html`. 
Agregar jquery:
```html
<script type="text/javascript" src="./PDC/jquery.js"></script>
```

Dentro de los tag `<script>` va el codigo javascript (o jquery).
Javascript es un lenguaje atipado, es decir, que las variables no hacen referencia a un tipo y pueden
cambiar el tipo de dato que almacenan.

### Funciones

```javascript
function newMetodo(a1, a2){
    // a1 y a2 son Undefined aca. Si las uso, salta error.
}
```
