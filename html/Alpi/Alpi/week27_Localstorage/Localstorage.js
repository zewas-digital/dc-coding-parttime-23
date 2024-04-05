const saveData = () => {
    const name = document.getElementById('name').value;
    
    // Daten im Local Storage speichern
    localStorage.setItem('name', name);

    
    // Ausgabe aktualisieren
    document.getElementById('output').innerHTML = 'Daten gespeichert!';
};

const readData = () => {
    const name = localStorage.getItem('name');


    // Ausgabe aktualisieren
    document.getElementById('output').innerHTML = 'Name:';
};

const clearData = () => {
    // Local Storage leeren
    localStorage.clear();

    // Ausgabe aktualisieren
    document.getElementById('output').innerHTML = 'Daten gelöscht!';
};

document.getElementById('saveData').addEventListener('click', saveData);
document.getElementById('readData').addEventListener('click', readData);
document.getElementById('clearData').addEventListener('click', clearData);
