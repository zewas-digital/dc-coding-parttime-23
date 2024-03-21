




function senden() {
    // Formularfelder auslesen
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const nachricht = document.getElementById("nachricht").value;

    // Daten in einem Objekt speichern
    const daten = {
        name: name,
        email: email,
        nachricht: nachricht,
    };

    // Objekt in der Konsole ausgeben
    console.log(daten);

    

    // Formular zurücksetzen
    document.getElementById("name").value = "";
    document.getElementById("email").value = "";
    document.getElementById("nachricht").value = "";

    alert("Vielen Dank für Ihre Nachricht!");

    return false;
}
