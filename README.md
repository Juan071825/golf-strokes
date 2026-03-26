# Golf Strokes

Este proyecto pretende calcular la puntuación de una tarjeta de golf implementando el patrón estrategia, el cuál se caractería por permitir que el programa exhiba un comportamiento distinto según la situación. El software de esta aplicación será contruido utilizando el lenguaje de programación Java, el gestor de proyectos Maven y la herramienta de control de versiones Git.


## Dominio

<li><strong>'Divot'</strong>, agujero hecho por el palo o por la bola cuando chocan con el cesped.</li>
<li><strong>'Hole'</strong>, sección de campo de golf en la que se disputa un hoyo *en este contexto hoyo se refiere al agujero donde hay que insertar la bola, no a la traducción de 'hole' al castellano.</li>
<li><strong>'Colors'</strong>, son distintos niveles creados para adaptar la distancia del punto inicial de lanzamiento al hoyo, por ejemplo para un niño.</li>
<li><strong>'Out'</strong>, es la suma de la distancia en metros de los 'holes' agrupados por 'colors'.</li>
<li><strong>'Stroke'</strong>, golpe a la bola.</li>
<li><strong>'Par'</strong>, es el numero de 'strokes' recomendado para completar un 'hole'.</li>

<li><strong>'Bogey'</strong>, situación el la que el jugador completa el 'hole' en 1 'stroke' más que el 'par'.</li>
<li><strong>'Doble Bogey'</strong>, situación el la que el jugador completa el 'hole' en 2 'stroke' más que el 'par'.</li>
<li><strong>'Triple Bogey'</strong>, situación el la que el jugador completa el 'hole' en 3 'stroke' más que el 'par'.</li>

<li><strong>'Birdie'</strong>, situación el la que el jugador completa el 'hole' en 1 'stroke' menos que el 'par'.</li>
<li><strong>'Eagle'</strong>, situación el la que el jugador completa el 'hole' en 2 'stroke' menos que el 'par'.</li>
<li><strong>'Albatross'</strong>, situación el la que el jugador completa el 'hole' en 3 'stroke' menos que el 'par'.</li>

<li><strong>'Green'</strong>, montículo cercano al hoyo.</li>
<li><strong>'Lip Out'</strong>, cuando la bola hace una corbata no entrando en el hoyo</li>
<li><strong>'Handicap'</strong>, Resultado del calculo de la suma de golpes por encima del par/nº de partidas de un jugador.</li>

<li><strong>8 strokes</strong>, 'snowman'.</li>

Cada círculo rodeando el nº de 'strokes' en una 'hole' índica que se hizo 1 'stroke' por debajo del 'par', cada cuadrado indica lo contrario, 1 por encima del 'par'.


