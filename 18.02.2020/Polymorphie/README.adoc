= Aufgabe 1: Java Game

== 1.1 Anforderung:

Schreiben Sie eine Klasse `Game`, welche beim `Erzeugen` einen `Titel`, eine
`Version`, ein `Spielfeld`, so wie einen `Spieler` erhält. Außerdem soll jedes 
im Spiel erzeugte Objekt eine `id` erhalten.

Die Schwierigkeit hierbei ist, dass der Konstruktor `nur den Titel und die 
Version übergeben` bekommt. Das `Spielfeld`, das `Spieler-Objekt`, so wie die
`id` müssen während der Laufzeit verwaltet werden.

=== Klasse: Game
* titel
* version
* player
* playboard
* id

== 1.2 Spiel-Logik:
In der `Klasse Game` befinden sich bereits Methoden zum Erzeugen eines
Spielfelds, so wie zur Ausgabe des Spielfelds. `Vervollständigen Sie diese`. 

== 1.3 Game-Objekte:

Schreiben Sie im nächsten Schritt die `Klassen Player, Enemy und Obstacle`,
welche das `Interface GameObject implementieren` sollen. 

Die Klassen benötigen einen `Konstruktor`, `private Instanzvariablen` und es
müssen außerdem `sinnvolle Typen` gewählt werden.

=== Interface GameObject:

* public long getId()
* public void print()
* public int getX()
* public int getY()

