fun main(){
    // Wichtig: Der readln()-Befehl gibt einen Wert des Typen String zurück. Dieser muss mit dem Anhang .toInt() erweitert werden, um in dem Fall unsere Eingabe in ein Int umzuwandeln.

    /* var laenge : Int
    laenge = readln().toInt()

    var breite : Int  //TODO : Nimm eine Eingabe an, welche der Breite zugeordnet wird.

    var flaeche : Int  //TODO : Die Flaeche eines Vierecks wird wie folgt berechnet : Breite * Flaeche

    // bitte println wieder auskommentieren zum Testen
    //println("$flaeche") */

    var laenge: Int? = null
    println("Gib eine Länge an!")
    laenge = readln().toInt()

    var breite: Int? = null
    println("Gib eine Breite an!")
    breite = readln().toInt()

    var flaeche: Int = laenge * breite

    println("Die Fläche beträgt $flaeche")
}