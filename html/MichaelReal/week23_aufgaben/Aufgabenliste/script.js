const tasks = [];
const colors = ['violet', 'indigo', 'blue', 'green', 'yellow', 'orange', 'red']; // Regenbogenfarben
let colorIndex = 0; // Startindex für Regenbogenfarben

document.getElementById('addTaskButton').addEventListener('click', function() {
    const taskInput = document.getElementById('taskInput');
    const dateInput = document.getElementById('dateInput');

    if (taskInput.value && dateInput.value) {
        const task = {
            id: tasks.length + 1,
            name: taskInput.value,
            date: dateInput.value,
            color: colors[colorIndex] // Farbe aus der Palette zuweisen
        };
        tasks.push(task);
        addTaskToDOM(task);
        taskInput.value = ''; // Eingabefeld zurücksetzen
        dateInput.value = ''; // Datumsfeld zurücksetzen

        colorIndex = (colorIndex + 1) % colors.length; // Nächste Farbe für die folgende Aufgabe
    }
});

function formatDate(isoString) {
    const date = new Date(isoString);
    return `${date.getDate().toString().padStart(2, '0')}-${(date.getMonth() + 1).toString().padStart(2, '0')}-${date.getFullYear()}`;
}

function addTaskToDOM(task) {
    const taskList = document.getElementById('taskList');
    const li = document.createElement('li');
    li.setAttribute('data-id', task.id);
    li.style.backgroundColor = task.color; // Hintergrundfarbe setzen
    const formattedDate = formatDate(task.date);
    li.innerHTML = `${task.name} (Fällig am: ${formattedDate}) <span class="edit">Bearbeiten</span> <span class="delete">Löschen</span>`;

    addEventListeners(li, task);

    taskList.appendChild(li);
}

function addEventListeners(li, task) {
    const editButton = li.querySelector('.edit');
    const deleteButton = li.querySelector('.delete');

    editButton.addEventListener('click', function() {
        const newName = prompt('Aufgabe bearbeiten:', task.name);
        if (newName) {
            task.name = newName;
            li.innerHTML = `${task.name} (Fällig am: ${formatDate(task.date)}) <span class="edit">Bearbeiten</span> <span class="delete">Löschen</span>`;
            li.style.backgroundColor = task.color; // Stelle sicher, dass die Farbe beibehalten wird
            addEventListeners(li, task); // Event Listener erneut hinzufügen
        }
    });

    deleteButton.addEventListener('click', function() {
        const confirmDelete = confirm('Sind Sie sicher, dass Sie diese Aufgabe löschen möchten?');
        if (confirmDelete) {
            tasks.splice(tasks.findIndex(t => t.id === task.id), 1);
            li.parentNode.removeChild(li);
        }
    });
}
