public class testing {
	/**
	* @description Eine kleine Hilfestellung zum Anfangen mit der aktuellen Aufgabe zu zufällig generierten Arrays
	* @author JustOneDeveloper
	* 
	* Note: Die Dinger rechts sind für das Auskommentieren meiner kurzen Texte. Wenn ihr die Wegmacht, achtet darauf, dass
	* 	diese Texte auch gone sind.
	*/


	//Ihr Werdet Brauchen:


	//Global definiert, also außerhalb von Funktionen und Methoden:

	public int[] zahlen = new int[50];		//Neuen Ganzzahlen-Array der Größe 50 machen,
							//denn wir wollen 50 zufällige Zahlen



	//Global definieren sollten wir auch einen normalen integer, nämlich unseren Maximalwert
	//Das machen wir so:

	public int maximalerWert = 100;





	//Als nächstes brauchen wir eine Methode, um diese Zahlen zu setzen:

	public void zahlenSetzen() {
																			/*
		Als erstes eine for-schleife, die auch 50 mal durchläuft
		Dazu also prüfen, ob i kleiner als 50 ist, damit die Schleife 0-49 durchläuft								*/

		for(int i = 0; i < 50; i += 1) {
																			/*
			Dann immer aus dem zahlen-array die "i-te" Stelle nehmen
			(Also beim ersten Durchlauf 0, dann 1, dann 2 usw. bis 49)
			Jetzt kommt die Methode für einen												*/

			zahlen[i] = (int) (Math.random() * maximalerWert) + 1;		//Die im Unterricht kennengelernte Random-Formel

																			/*
			Hier müsst ihr anschließend noch einbauen, dass keine Zahlen doppelt vorkommen.
			Das macht ihr, indem ihr alle Zahlen, die bisher schon generiert wurden (lässt sich an unserem i erkennen)
			überprüft. Dann schaut ihr, ob es die gleiche Zahl ist wie die, die jetzt generiert wurde (zahlen[i]).
			Falls ja, müsst ihr den Schleifendurchlauf nochmal machen.
			By the way, diesen erneuten Durchlauf macht ihr HIER mit einer weiteren Schleife, also eine Schleife in
			einer Schleife.															*/


	//		Bei irgendwelchen Fragen kontaktiert mich einfach.

		}

	}

}