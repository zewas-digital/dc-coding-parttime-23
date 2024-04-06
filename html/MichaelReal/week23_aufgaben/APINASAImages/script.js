document.addEventListener('DOMContentLoaded', function() {
    // Orte mit Koordinaten
    const places = {
        "Grand Canyon, USA": { lat: 36.1069, lon: -112.1129 },
        "Great Barrier Reef, Australien": { lat: -18.2871, lon: 147.6992 },
        "Mount Everest, Nepal/China": { lat: 27.9881, lon: 86.9250 },
        "Pyramiden von Gizeh, Ägypten": { lat: 29.9792, lon: 31.1342 },
        "Amazonas-Regenwald, Brasilien": { lat: -3.4653, lon: -62.2159 },
        "Antarktis": { lat: -82.8628, lon: 135.0000 },
        "Serengeti, Tansania": { lat: -2.3328, lon: 34.5665 },
        "Great Wall of China, China": { lat: 40.4319, lon: 116.5704 },
        "Galapagos-Inseln, Ecuador": { lat: -0.9538, lon: -90.9656 },
        "Aurora Borealis (für beste Sichtbarkeit), Tromsø, Norwegen": { lat: 69.6492, lon: 18.9553 },
        "Area 51": { lat: 37.242, lon: -115.8191 },
        // Fügen Sie hier weitere Orte hinzu...
    };

    // Anzeigen der Liste der Orte
    const placesList = document.getElementById('placesList');
    placesList.innerHTML = '<ul>';
    Object.entries(places).forEach(([place, coords]) => {
        placesList.innerHTML += `<li>${place}: Latitude ${coords.lat}, Longitude ${coords.lon}</li>`;
    });
    placesList.innerHTML += '</ul>';

    // Event Listener für den "Bild laden" Button
    document.getElementById('loadImage').addEventListener('click', function() {
        const lat = document.getElementById('latitude').value;
        const lon = document.getElementById('longitude').value;
        const date = document.getElementById('date').value;
        const dim = document.getElementById('dimension').value;
        const apiKey = 'Wn9AUB3KvC8xz9emlSPGsANchoPXmPa9vM2KdYS8';

        const imageUrl = `https://api.nasa.gov/planetary/earth/imagery?lon=${lon}&lat=${lat}&date=${date}&dim=${dim}&api_key=${apiKey}`;

        fetch(imageUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            } else {
                // Erhalten der Antwort als Blob, da es sich um ein Bild handelt
                return response.blob();
            }
        })
        .then(blob => {
            // Erstellen einer URL für den Blob
            const imageUrl = URL.createObjectURL(blob);
            // Setzen der Bild-URL als Quelle für das <img>-Element
            document.getElementById('satelliteImage').src = imageUrl;
            document.getElementById('satelliteImage').alt = `Satellitenbild von Breite: ${lat}, Länge: ${lon}, am ${date}`;
        })
        .catch(error => {
            console.error('Fehler beim Abrufen des Satellitenbildes:', error);
            alert('Fehler beim Laden des Bildes. Bitte versuchen Sie es später erneut.');
        });
    });

    // Initialisieren der Karte
    var mymap = L.map('mapid').setView([51.505, -0.09], 2);
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 19,
        attribution: '© OpenStreetMap contributors'
    }).addTo(mymap);

    // Hinzufügen eines Klick-Event-Listeners zur Karte
    mymap.on('click', function(e) {
        var coord = e.latlng;
        var lat = coord.lat;
        var lng = coord.lng;

    // Setzen der Koordinaten in die Eingabefelder
    document.getElementById('latitude').value = lat.toFixed(5);
    document.getElementById('longitude').value = lng.toFixed(5);
    });

    // Hinzufügen von Markern basierend auf den Orten
    Object.entries(places).forEach(([name, coords]) => {
        L.marker([coords.lat, coords.lon]).addTo(mymap)
            .bindPopup(name);
    });
});
