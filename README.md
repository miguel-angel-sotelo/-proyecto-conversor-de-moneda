<h1> Conversor de monedas </h1>
-Estado del proyecto: Concluido.
Bienvenidos a mi proyecto de conversor de monedas,proyecto que fue aprendido ha hacer gracias a @Alura latam. Este proyecto tiene la funcin especifica de convertir y calcular el valor de diferentes divisas consumiendo una api de ExchangeApi,la cual  nos proporciona uana actualizacion en tiempo real del valor de la moneda de cada pais .
Acontinuacion podremos tener informacion mas detallada sobre la construccion y el funcionamiento de esta aplicacion.


![image](https://github.com/user-attachments/assets/86a93293-4c55-44ee-bdb4-e02d71516011)

Este es elmenu,el cual nos muestra las diferentes opciones,que nos permitiran convertir monedas especificas e incluso dar por terminada la sesion de la aplicacion.
Acontinuacion veremos como nuestra api nos traera el valor actualizado de las monedas a convertir.

![Captura de pantalla 2024-11-23 160737](https://github.com/user-attachments/assets/05887b09-d500-4ed3-ae81-0767cd35fa88)

Acontinuacion deberemos ingresar el valor deseado a convertir y la aplicacion nos devolvera en pantalla el calculo convertido.

![Captura de pantalla 2024-11-23 161210](https://github.com/user-attachments/assets/691b0bde-975e-403c-b516-109886f83247)

Este ciclo se repetira las veces deseadas por el usuario,hasta elegir la opcion de salir.

![Captura de pantalla 2024-11-23 161404](https://github.com/user-attachments/assets/522f332d-42c3-4f72-96f0-8d727fc6c5d4)

<h1> Paquetes creados y funcion de cada una. </h1>

Para la realizacion de este proyecto fue necesario crear cuatro paquetes llamados: Principal. ConsultarMoneda. Moneda. ConvertirMoneda.

Acontinuacion explicaremos detalladamente la funcion de cada una de estas clases:

<h1>Clase Pincipal</h1>

![Captura de pantalla 2024-11-23 162705](https://github.com/user-attachments/assets/de609fde-9912-41a9-875c-d4244260666a)

En este paquete encontramos los codigos encargados de imprimir el menu en consola y de enviar la solicitud a la clase ConcultarMoneda ,para cada uno de los casos.

<h1>Clase ConcultarMoneda.</h1>
En este paquete encontraremos los codigos encargados de conectarse a la API , estos traeran los valores actalizados desde el servidor de ExchangeApi y guardara estos valores en la clase Moneda.

![Captura de pantalla 2024-11-23 164313](https://github.com/user-attachments/assets/17b31f5c-8b48-4f2c-843f-1f2d4e1f2697)


<h1>Clase Moneda.</h1>
En esta clase guardaremos el valos de las  distintas divisas q nos proporcionó la clase ConsultarMoneda y atibuiremos estos valores a las variables moneda base y moneda destino, asi podremos manipular estos valores, hacer los calculos y convertirlos en la clase ConvertirMoneda para asi mostrar el valor final que espera ver impreso en la consola por el usuario:

![image](https://github.com/user-attachments/assets/9f8ec736-8147-487a-b460-005f7ee783e3)

<h1>Clase ConvertirMoneda.</h1>

En esta clase encontraremos los codigos q utilizamos para crear el metodo de conversion de moneda trayendo los valores ya guardados e la clase Moneda y proporcionado por la API en la clase ConsultarMoneda .
En esta face del programa haremos el calculo de un valor proporcionado por el cliente de la moneda base,haremos la conversion y devolveremos el valor final a el usuario.

![Captura de pantalla 2024-11-23 172210](https://github.com/user-attachments/assets/ec04a3b8-d2e4-49a7-aa92-13d37d81b5b5)

Esta ha sido la ecplicación completa de este proyecto ,espero sea de su agrado y muchas gracias..














 
