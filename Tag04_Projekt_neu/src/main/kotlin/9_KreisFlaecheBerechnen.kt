fun main(){
    /* val PI : Double = 3.14 // Nicht ganz Pi, aber es reicht für unseren Zweck.

    //TODO : Hier muss noch die richtige Variable für den Radius intitialisiert werden.

    // bitte radius wieder auskommentieren zum Testen
    // radius = readln().toDouble()// Hier wird eine Eingabe vom Benutzer angenommen. Diese muss in einen geeigneten Datentypen umgewandelt werden mit .toDouble() !!

    var flaeche : Double // TODO : Den Wert für die Fläche der Variable flaeche zuordnen. Die Fläche eines Kreises wird wie folgt berechnet. PI * Radius * Radius

    // TODO : Gib das Ergebnis für die Fläche aus. Benutze hierzu die println()-Funktion. */

    val PI: Double = 3.14

    var radius: Double? = null
    println("Wie groß ist der Radius des Kreises?")
    radius = readln().toDouble()

    var flaeche: Double = PI * (radius*radius)
    println("Die Fläche beträgt $flaeche!")

}