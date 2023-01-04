fun main (){
    // Addiere das Alter deiner Eltern und subtrahiere das Alter von dir und deinen Geschwistern von der Summe.
    // Lege das Alter der Personen jeweils als Variable an. Gib das Ergebnis mit dem println()-Befehl aus.

    var geburtsjahrMama: Int = 1965
    var geburtsjahrPapa: Int = 1963
    var geburtsjahrTim: Int = 1993
    var geburtsjahrIch: Int = 1996
    var geburtsjahrKathi: Int = 2004
    var geburtsjahrGreta: Int = 2005

    var alterMama: Int = 2022 - geburtsjahrMama
    var alterPapa: Int = 2022 - geburtsjahrPapa
    var alterTim: Int = 2022 - geburtsjahrTim
    var alterIch: Int = 2022 - geburtsjahrIch
    var alterKathi: Int = 2022 - geburtsjahrKathi
    var alterGreta: Int = 2022 - geburtsjahrGreta

    var addiertesAlterEltern: Int = alterMama + alterPapa
    println("Meine Eltern sind zusammen $addiertesAlterEltern Jahre alt.")
    var addiertesAlterGeschwisterUndIch: Int = alterTim + alterIch + alterKathi + alterGreta
    println("Meine 3 Geschwister und ich sind zusammen $addiertesAlterGeschwisterUndIch Jahre alt.")
    var addiertesAlterElternMinusAddiertesAlterGeschwisterUndIch: Int = addiertesAlterEltern - addiertesAlterGeschwisterUndIch

    println("Das Alter meiner Eltern minus dem Alter meiner Geschwister und mir beträgt: $addiertesAlterElternMinusAddiertesAlterGeschwisterUndIch")

}