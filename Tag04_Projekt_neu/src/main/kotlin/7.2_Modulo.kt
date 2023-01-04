fun main(){
    // Gordon hat 7 Geschwister. Außerdem hat er auch 65 Melonen, von denen er so viele wie möglich mit seinen 7 Geschwistern gerecht teilen will.
    // Wie viele Melonen hat er übrig, wenn alle Geschwister gleich viele Melonen haben?
    // Löse außerdem mögliche Compilerfehler.
    // Tipp: Die Anzahl der Melonen durch modulo Anzahl der Geschwister teilen.
    // Gib das Ergebnis über den println()-Befehl aus.

    /* val melonen : Int = 65
    val geschwister = 7
    val rest : Int */

    val melonen : Int = 65
    val geschwister = 7
    val geschwisterPlusGordon: Int = geschwister + 1 // 1 ist Gordon selber
    // println(geschwisterPlusGordon)

    println("Wenn Gordon seine $melonen Melonen gerecht mit seinen $geschwister Geschwistern teilen möchte, "  +
            "muss er die $melonen Melonen gleichmäßig auf $geschwisterPlusGordon Leute aufteilen.")
    println("Somit ergibt sich folgende Rechnung:")
    println("Anzahl der Melonen durch Anzahl der Personen")

    val melonenProPerson:Int = melonen/geschwisterPlusGordon
    // println(melonenProPerson)
    val rest: Int = melonen % geschwisterPlusGordon
    println("Jeder bekommt $melonenProPerson Melonen. Übrig bleiben $rest Melone(n).")
}