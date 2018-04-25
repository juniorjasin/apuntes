## Custom Tags

Necesitamos: 

1) Clase java
  - SampleTagSupport
  - BodyTagSupport
  
2) TLD --> xml

3) Incluirlo en el JSP
<@taglib prefix="ct" uri="reference_to_TLD" />

```html
<ct: saludo />
<ct: saldo></ct:saludo>
```
