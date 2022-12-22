# Forest
forest management system based on a grid

task:
OOP - Implement You can't see the forest for the trees if the trees in the forest are systematically lined up, because from any location the view of many trees is blocked. In a rectangular grid of a sanctuary, trees stand on all grid points, point-like, without extension. At Christmas time, by cutting some trees, the sparing was thinned out. The forester in charge of the spade keeps a record of the state of his spade in the office by means of a management program. The following activities are to be included in the program: � A tree is cut down. � A forest aisle (row or column of trees) is cut. Given the UML class diagram of a class Tree and a class Forest:

Implement the two classes: a) Class Tree: Create the instance variable gefaellt, simulate the felling of a tree in the instance method faellen() and mark a felled and not felled tree differently in the toString method, for example with �o� and �x�. b) Class Forest: Create the forest as instance variable baeume. In doing so, introduce a necessary constructor to create the forest. Simulate the felling of a tree 1 or a tree slice in appropriate instance methods and enable a representation of the forest as a grid of felled or un-felled trees by overriding the toString method. In the example of a 7 � 9 sparing, all trees in the 4th row and the 5th column, as well as one tree in the 7th row in the 8th location, were cleared:

(c) The forester was assigned a spruce sparing. In an already developed administration program WaldMain.java he can enter menu-driven changes within his sparing. This program can register the felling of trees or entire tree corridors and display the current state of a forest. Apply the classes you have developed together with the management program in a test to a 23 � 35 - sparing: � A tree had to be cut down because of a lightning strike. It was in the 13th row in the 19th position counted from the left. Every 10th tree column and 7th tree row was cut for fire protection. Every 3rd column and 3rd row were cut down as Christmas trees for thinning. � Using your program, generate the grid plot and transfer the current state of sparing to a WaldMain.out file. � Try to cut a tree outside the sparing, for example in the 24th row at the 18th position. How does the program react? Complete the classes with appropriate javadoc comments and create an online documentation for the whole project: javadoc -private -d WaldDoc *.java

translated from the original task in german language:

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

