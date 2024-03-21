const tasks = [];

document.getElementById('addTaskButton').addEventListener('click', function() {
    const taskInput = document.getElementById('taskInput');
    const dateInput = document.getElementById('dateInput');

    if (taskInput.value && dateInput.value) {
        const task = {
            id: tasks.length + 1,
            name: taskInput.value,
            date: dateInput.value
        };
        tasks.push(task);
        addTaskToDOM(task);
        taskInput.value = ''; // Reset Inputs
        dateInput.value = ''; //   "     "
    }
});

function addTaskToDOM(task) {
    const taskList = document.getElementById('taskList');
    const li = document.createElement('li');
    li.setAttribute('data-id', task.id);
    li.innerHTML = `${task.name} (Fällig am: ${task.date}) <span class="edit">Bearbeiten</span> <span class="delete">Löschen</span>`;

    const editButton = li.querySelector('.edit');
    const deleteButton = li.querySelector('.delete');

    editButton.addEventListener('click', function() {
        const newName = prompt('Aufgabe bearbeiten:', task.name);
        if (newName) {
            task.name = newName;
            li.innerHTML = `${task.name} (Fällig am: ${task.date}) <span class="edit">Bearbeiten</span> <span class="delete">Löschen</span>`;
        }
    });

    deleteButton.addEventListener('click', function() {
        const confirmDelete = confirm('Sind Sie sicher, dass Sie diese Aufgabe löschen möchten?');
        if (confirmDelete) {
            tasks.splice(tasks.findIndex(t => t.id === task.id), 1);
            taskList.removeChild(li);
        }
    });

    taskList.appendChild(li);
}
