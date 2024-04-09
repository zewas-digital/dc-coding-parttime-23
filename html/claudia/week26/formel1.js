fetch("http://ergast.com/api/f1/2024.json")
    .then((response) => {
        if (!response.ok) {
            throw new Error("Netzwerkfehler");
        }
        return response.json(); // Konvertiert die Antwort in JSON-Format
    })
    .then(function (data) {
        // console.log("Daten vom Server erhalten:", data);
        // console.log(data.MRData.RaceTable);

        for (var i = 0; i < data.MRData.RaceTable.Races.length; i++) {

            var race = data.MRData.RaceTable.Races[i];

            var raceline = document.createElement("div");

            var round = document.createElement("p");
            var racename = document.createElement("p");
            var circuit = document.createElement("p");
            var date = document.createElement("p");

            round.classList.add("round");
            racename.classList.add("racename");
            circuit.classList.add("circuit");
            date.classList.add("date");

            round.textContent = race.round;
            racename.textContent = race.raceName;
            circuit.textContent = race.Circuit.circuitName;
            date.textContent = race.date;

            raceline.append(round, racename, circuit, date);
            document.getElementById("formel1daten").append(raceline);
        }

    })
    .catch((error) => {
        console.error("Fehler beim Abrufen der Daten:", error);
    });

let roundNr = 4;
// function getResult(roundNr) {

    fetch("http://ergast.com/api/f1/2024/" + roundNr + "/results.json")
        .then((response) => {
            if (!response.ok) {
                throw new Error("Netzwerkfehler");
            }
            return response.json(); // Konvertiert die Antwort in JSON-Format
        })
        .then(function (data) {
            console.log("Daten vom Server erhalten:", data.MRData);
            var results = data.MRData.RaceTable.Races[0].Results;
            //???
            if (!data.MRData || !data.MRData.RaceTable || !data.MRData.RaceTable.Races || !data.MRData.RaceTable.Races[0]) {
                console.log("Noch keine Ergebnisse vorhanden");
                throw new Error("Required data is missing or undefined");
            }
            //???^^
            console.log(results);
            for (var i = 0; i < results.length; i++){
                var result = results[i];
                console.log(result.Driver.givenName + " " + result.Driver.familyName, result.Driver.nationality, result.Constructor.name);
            }
           // }


        })
        .catch((error) => {
            console.error("Fehler beim Abrufen der Daten:", error);
        });



// }


