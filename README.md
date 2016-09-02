# StreamUp
Bei diesem Prototypen handelt es sich um eine Anwendung, die im Rahmen eines Vortrags auf der JavaLand 2016 entstanden ist. Dort wurde gezeigt, wie eine Bitraten-adaptive HTTP-basierte Live-Video-Streaming-Lösung auf Basis von Java, MPEG-DASH, dem Websocket-Protokoll und dem HTML5-Videoelement möglich ist. Mit der Anwendung können sich beliebig viele Teilnehmer per Chat miteinander austauschen, untereinander Bilder verschicken und gleichzeit einen Videostream verfolgen, der durch einen der Teilnehmer initiiert wurde. Der Lösungsansatz erlaubt ebenfalls die Entgegennahme von Livestreams, die z.B. von der Kamera eines Smartphones aus gesendet werden.

## Hinweis ## 
Der Prototyp ist auf dem WildFly >=8 getestet und als Client wurde Firefox >=44 genommen. Für die Nutzung mit anderen Browsern müssen Anpassung den Codec entsprechend vorgenommen werde (siehe auch den Link unten "Live-Video-Streaming auf Basis von Web-Standards").

<p align="center"><br/>
  <img src="https://github.com/javaakademie/MovieStore/blob/master/preview.png" border="0">
</p>

## Links & Tools ## 
Links zu weiterführenden Erklärungen und zu hilfreichen Tools, die bei der Erstellung von MPEG-DASH-Dateien behilflich sein können. 

Artikel zum Lösungsansatz<br/>	   
<ul>
  <li>
	<a href="https://www.informatik-aktuell.de/entwicklung/programmiersprachen/live-video-streaming-auf-basis-von-web-standards.html" target="_blank">Live-Video-Streaming auf Basis von Web-Standards</a>
  </li>
  <li>
	<a href="http://javaakademie.de/blog/streamup-video-chunks-erzeugen-mpeg-dash" target="_blank">Erstellen von Video-Chunks</a>
  </li>
</ul>
<br/>

Einführung WebSockets<br/>	
<ul>
  <li>
	<a href="http://www.oracle.com/technetwork/articles/java/jsr356-1937161.html" target="_blank">Java API for WebSocket (JSR 356)</a>
  </li>
  <li>
	<a href="https://docs.oracle.com/javaee/7/api/javax/websocket/package-summary.html" target="_blank">WebSocket API</a>
  </li>
</ul>
<br/>

Einführung RESTful WebServices<br/>
<ul>
  <li>
	<a href="https://docs.oracle.com/cd/E24329_01/web.1211/e24983/overview.htm#RESTF105" target="_blank">Introduction to RESTful Web Services</a>
  </li>
</ul>
<br/>

MPEG Standard<br/>
<ul>
  <li>
	<a href="http://mpeg.chiariglione.org/" target="_blank">The Moving Picture Experts Group</a>
  </li>
</ul>
<br/>

MPEG-DASH
<ul>
  <li>
	<a href="http://dashif.org/">Dash Industry Forum</a>
  </li>
  <li>
	<a href="http://dashif.org/w/2015/04/DASH-IF-IOP-v3.0.pdf" target="_blank">DASH Spec</a>
  </li>
</ul>
<br/>

HTML5 & Media Source Extensions (MSE)<br/>
<ul>
  <li>
	<a href="https://www.w3.org/wiki/HTML/Elements/video" target="_blank">HTML5 Video Element</a>
  </li>
  <li>
	<a href="https://www.w3.org/TR/media-source/" target="_blank">Media Source Extensions (MSE)</a>
  </li>
</ul>
<br/>

Tools<br/>
<ul>
  <li>
	<a href="http://www.videolan.org/developers/x264.html" target="_blank">x264 (Video Datei vorbereiten)</a>
  </li>
  <li>
	<a href="https://gpac.wp.mines-telecom.fr/mp4box/" target="_blank">MP4Box (Erzeugen von MPEG-DASH Dateien)</a>
  </li>
  <li>
	<a href="https://www.ffmpeg.org/" target="_blank">FFmpeg</a>
  </li>
</ul>
<br/>    
