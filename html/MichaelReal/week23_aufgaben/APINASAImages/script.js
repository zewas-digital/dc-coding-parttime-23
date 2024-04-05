document.addEventListener('DOMContentLoaded', (event) => {
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
});