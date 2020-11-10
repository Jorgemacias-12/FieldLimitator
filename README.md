# FieldLimitator

Libreria de java que nos permite limitar en un campo de texto la entrada del usuario, además de que el usuario solo ingrese texto, números con y sin caracteres especiales.

La librería contiene la clase **fieldInputVerifier** la cual nos permite lo siguiente:

- Limitar la cantidad de caracteres que pueden ser introducidos por el
usuario en un campo de texto.
- Limitar los caracteres que pueden ser introducidos por el usuario en un campo de texto.

Esta clase contiene los siguientes 3 métodos:

## <div align="center">Tabla de métodos</div>

|Nombre del método | argumentos | función|
|------------------|------------|--------|
|<div align="center">setInputFilterAndLimit</div>| JTextField field, int inputFilter, int characterLimit, KeyEvent evt| Permite que el programador limite el typeo de caracteres a partir de una longitud estática, además de aplicar un filtro que solo permita el typeo de algunos tipos de caracteres, números y caracteres especiales.
|<div align="center">setInputLimit</div>| JTextField field, int characterLimit, KeyEvent evt| Permite al programador limitar el typeo de caracteres al usuario en un especifico componente.|
|<div align="center">setInputFilter</div>|int inputFilter, KeyEvent evt| Permite que el programador aplique un filtro a un componente en especifico, el cual no permitira la entrada de algunos caracteres dependiendo del filtro aplicado.

## <div align="center">Tabla de constantes de la clase</div>

 *La clase contiene las siguientes constantes:*

|Nombre de la constante|Valor de la constante (int) | descripción |
|----------------------|----------------------------|-------------|
| <p align="center">NO_CHARACTERS</p>| 0 | Esta constante es un fitro que al aplicarlo en la función *setInputFilter* solo es permitido el typeo de números y caracteres especiales al componente aplicado.
|<p align="center">NO_NUMBERS</p>|1| Esta constante es un filtro que al aplicarlo en la función *setInputFilter* solo es permitido el typeo de letras y caracteres especiales al componente aplicado.
|<p align="center">CHARACTERS_WO_SPECIAL_CHARACTERS</p>|2| Esta constante es un filtro que al aplicarlo en la función *setInputFilter* solo es permitido el typeo de Letras sin la posibilidad de typear caracteres especiales.
|<p align="center">NUMBERS_WO_SPECIAL_CHARACTERS</p>|3| Esta constante es un filtro que al aplicarlo en la función *setInputFilter* solo es permitido el typeo de números sin la posibilidad de typear caracteres especiales.

 ## <div align="center">¿Cómo uso los métodos?</div>

 Primero debes de incluir la librería en tu proyecto, una vez hecho esto tendras que mandar a llamar el o los métodos que veas necesarios para tí.

 Si no sabes importar librerias en un proyecto de java puedes encontrar en los siguientes enlaces como hacerlo.

- Eclipse: [haz clic aquí](https://stackoverflow.com/questions/4962559/import-libraries-in-eclipse)

- Netbeans: [haz clic aquí](https://stackoverflow.com/questions/21002426/how-to-import-libraries-in-netbeans)

- IntelliJ IDEA [haz clic aquí](https://stackoverflow.com/questions/1051640/correct-way-to-add-external-jars-lib-jar-to-an-intellij-idea-project)

Una vez hayas incluido la librería, puedes aplicar los métodos mencionados arriba para cualquier componente de tipo JTextField.

**Nota**: debes de generar un evento a cada componente de tipo *KeyTyped* y mandar a llamar el o los métodos de la librería dentro de ese método.

## Pequeño ejemplo de código

```Java
    //KeyTyped method
    private void component_name KeyTyped(java.awt.KeyEvent evt){
        //Access to the static functions of the libraries for example:
        fieldInputVerifier.setInputFilterAndLimit(component_name, fieldInputVerifier.NUMBERS_WO_SPECIAL_CHARACTERS, 20, evt);
    }
```
Si deseas probar el funcionamiento de la librería antes de descargarla aquí tienes una aplicación de GUI para comprobar la funcionalidad.

[Clic aquí]() <!-- Añadir enlace de descarga cuando termine de pulir la aplicación.-->