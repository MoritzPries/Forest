# Forest
forest management system based on a grid

based on the task (in german language)

OOP - Implementieren
Man sieht den Wald vor lauter Bäumen nicht, wenn die Bäume im Wald systematisch in Reihe
und Glied stehen, denn von jedem Standort aus ist der Blick auf viele Bäume versperrt.
In einem rechtwinkligen Gitter einer Schonung stehen auf allen Gitterpunkten Bäume, punktförmig,
ohne Ausdehnung. Zur Weihnachtszeit wurde durch das Fällen einiger Bäume die Schonung
ausgelichtet.
Der für die Schonung zuständige Förster hält im Büro mittels eines Verwaltungsprogramms den
Zustand seiner Schonung fest. Folgende Aktivitäten sollen im Programm berücksichtigt werden:
 Ein Baum wird gefällt.
 Eine Schneise (Zeile oder Spalte von Bäumen) wird geschlagen.
Gegeben sei das UML-Klassendiagramm einer Klasse Baum und einer Klasse Wald:

Implemetieren Sie die beiden Klassen:
a) Klasse Baum: Legen Sie die Instanzvariable gefaellt an, simulieren Sie das Fällen eines
Baumes in der Instanzmethode faellen() und markieren Sie in der toString-Methode
einen gefällten und nicht gefällten Baum unterschiedlich, zum Beispiel mit o und x.
b) Klasse Wald: Legen Sie den Wald als Instanzvariable baeume an. Führen Sie dabei einen
notwendigen Konstruktor zum Walderzeugen ein. Simulieren Sie das Fällen eines Baumes
1
oder einer Baumschneise in entsprechenden Instanzmethoden und ermöglichen Sie durch
Überschreiben der toString-Methode eine Darstellung des Waldes als Raster der gefällten
bzw. ungefällten Bäume.
In dem Beispiel einer 7  9 - Schonung wurden alle Bäume der 4. Zeile und der 5. Spalte,
sowie ein Baum in der 7. Zeile an der 8. Stelle gerodet:

c) Dem Förster wurde eine Fichtenschonung zugeordnet. In einem bereits entwickelten Verwaltungsprogramm
WaldMain.java kann er menügesteuert Veränderungen innerhalb seiner
Schonung eintragen. Dieses Programm kann das Fällen von Bäumen oder ganzer Baumschneisen
registrieren und den aktuellen Zustand eines Waldes anzeigen.
Wenden Sie die von Ihnen entwickelten Klassen zusammen mit dem Verwaltungsprogramm
in einem Test auf eine 23  35 - Schonung an:
 Ein Baum musste wegen eines Blitzeinschlages gefällt werden. Er stand in der 13. Zeile
an 19. Stelle von links gezählt. Jede 10. Baumspalte und 7. Baumzeile wurde aus
Brandschutzgründen geschlagen. Zum Ausdünnen wurden jede 3. Spalte und 3. Zeile
als Weihnachtsbäume abgeholzt.
 Erzeugen Sie mit Ihrem Programm die Rasterdarstellung und übertagen Sie den aktuellen
Zustand der Schonung in eine Datei WaldMain.out.
 Versuchen Sie einen Baum auÿerhalb der Schonung zu fällen, etwa in der 24. Zeile an
18. Stelle. Wie reagiert das Programm?
Vervollständigen Sie die Klassen durch geeignete javadoc-Kommentare und erstellen Sie
eine Online-Dokumentation für das Gesamtprojekt:
javadoc -private -d WaldDoc *.java

