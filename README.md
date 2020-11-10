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