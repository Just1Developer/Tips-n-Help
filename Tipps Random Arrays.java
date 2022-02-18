public class testing {
	/**
	* @description Eine (kleine) Hilfestellung zum Anfangen mit der aktuellen Aufgabe zu zufällig generierten Arrays
	* @author JustOneDeveloper
	* 
	* Note: Die Dinger rechts sind für das Auskommentieren meiner kurzen Texte. Wenn ihr die wegmacht, achtet darauf, dass
	* 	diese Texte auch gone sind.
	*/


	//Ihr werdet brauchen:


	//Global definiert, also außerhalb von Funktionen und Methoden:

	public int[] zahlen = new int[50];		//Neuen Ganzzahlen-Array der Größe 50 machen,
							//denn wir wollen 50 zufällige Zahlen



	//Global definieren sollten wir auch einen normalen Integer, nämlich unseren Maximalwert
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
			
			
			//Schleife zählt alle Zahlen durch, die kleiner sind als i. Also alle, die bisher gesetzt wurden.
			for(int j = 0; j < i; j++) {
				//Falls die aktuell überprüfte Zahl die gleiche ist wie die Zahl, die wir vorhin gesetzt haben,
				//wird i um eins verkleinert, damit die Schleife gleich nochmal durchläuft
				if(zahlen[j] == zahlen[i]) {
					i--;		/*Ist das gleiche wie i -= 1 oder i = i-1;
					
					j auf i setzen, damit die Bedingung der Schleife nicht mehr erfüllt ist und
					sie demnach abgebrochen wird. Ob wir 1 oder 5 duplikate finden ändert nichts
					daran, ob wir den durchlauf wiederholen oder nicht.								*/
					
					j = i;
				}
			}
			
	//		Bei irgendwelchen Fragen kontaktiert mich einfach.

		}

	}
	
	//Jetzt brauchen wir noch eine Methode, um eine Zahl an einer beliebigen Stelle einzusetzen:
	public void zahlEinsetzen(int zahl, int stelle) {
		
		//Zunächst machen wir einen neuen int array, den wir um 1 größer machen als den bisherigen
		int length = zahlen.length;
		int[] neu = new int[length + 1];
		
		//Dann setzen wir die Stelle auf eins niedriger, weil die 1ste Stelle ja zahlen[0] ist.
		stelle--;
																			/*
		Dann muss das jetzt in 3 Schritten bearbeitet werden:
		1. In einer Schleife die zahlen von 0 bis zur stelle vom alten Array in neu kopieren
		   -> for-Schleife
		2. Den Wert von neu an Position stelle auf die neue Zahl (zahl) setzen
		3. In einer weiteren Schleife (kann auch die gleiche sein, ist aber ein Tucken komplizierter)
			die restlichen Werte aus unserem zahlen-array an die Position packen, die um 1 verschoben
			ist.
			ACHTUNG! Das kann etwas tückisch sein. Viel Glück!										*/
		
		
		//Am Ende muss dann noch unser alter zahlen-array weg, also mit dem neuen überschrieben werden:
		zahlen = neu;
	}

}
