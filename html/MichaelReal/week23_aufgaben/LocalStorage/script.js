document.getElementById('saveButton').addEventListener('click', function() {
    const data = document.getElementById('dataInput').value;
    localStorage.setItem('meineDaten', data);
    alert('😏Daten gespeichert!😏');
});

document.getElementById('readButton').addEventListener('click', function() {
    const saveData = localStorage.getItem('meineDaten');
    document.getElementById('output').textContent = saveData || 'Keine Daten gefunden.';
});

document.getElementById('clearButton').addEventListener('click', function() {
    localStorage.removeItem('meineDaten');
    document.getElementById('output').textContent = 'Gespeicherte Daten werden hier angezeigt...';
    alert('🔥💣Daten gelöscht!💣🔥');
});