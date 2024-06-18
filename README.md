# Challenge_1_Luis

El sistema es muy sencillo, lo divide en 3 clases.

![image](https://github.com/Luisby47/Challenge_1_Luis/assets/75922735/bf307930-bcd4-42d8-bf3c-385cde528754)

La clase "Moneda" voy a guardar los datos del json por medio de la libreria gson, en este caso solo me interesa tomar el basecode y conversion_rates.

![image](https://github.com/Luisby47/Challenge_1_Luis/assets/75922735/1406e863-c7ed-4c8f-aca6-76e8f124f21c)

La clase consulta simplemente realiza una peticion a la API para obtener los datos json de la moneda en especifica y lo conviverte en una clase Moneda, la cual tambien retorna.

![image](https://github.com/Luisby47/Challenge_1_Luis/assets/75922735/0aa537c1-b768-427d-893a-cb98465fa1cb)

Por ultimo el main, que esta dentro de un loop.
Este se encarga de determinar la accion elegida por el usario y seguidamente preguntar por el valor a convertir.

![image](https://github.com/Luisby47/Challenge_1_Luis/assets/75922735/53e009c0-c364-4d9c-835d-1436b1956171)

Seguidamente a esto, se obtiene los datos de la moneda y se realiza la operacion correspondiente para obtener la conversion correcta y mostrar en pantalla.

![image](https://github.com/Luisby47/Challenge_1_Luis/assets/75922735/a31ec2db-59cd-43d9-adb2-75cfc40f86c4)

