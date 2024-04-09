// Function to save data to local storage
function saveData() {
    var inputData = document.getElementById('inputData').value;
    localStorage.setItem('data', inputData);
    console.log('Data saved to local storage.');
}
// Function to read data from local storage
function readData() {
    var storedData = localStorage.getItem('data');
    if (storedData) {
        console.log('Data retrieved from local storage:', storedData);
    }
    else {
        console.log('No data found in local storage.');
    }
}
var x = 0;
// Function to clear data from local storage
function clearData() {
    localStorage.removeItem('data');
    console.log('Data cleared from local storage.');
}
function saveToDo() {
    var todo = document.getElementById("aufgabe").value;
    var kalender = document.getElementById("kalender").value;

    const toDoList = [todo, kalender];
    console.log(toDoList);

    
}
var savetasks=[];      //Array zum Speichern der Eingaben
 const taskForm = document.getElementById('taskForm');
 const taskInput = document.getElementById('taskInput');
 const dateInput = document.getElementById('dateInput');

 const taskList = document.getElementById('taskList');

 function addTask(task, date) {         //Aufgabe hinzufügen
    savetasks.push({ task, date });
    renderTasks();
}
//DOM
function renderTasks() {
    taskList.innerHTML = '';
    savetasks.forEach((task, index) => {
        const li = document.createElement('li');
        li.innerHTML = `
            <span>${task.task} - ${task.date}</span>
            <button class="edit-btn" data-index="${index}">Bearbeiten</button>
            <button class="delete-btn" data-index="${index}">Löschen</button>
        `;
        taskList.appendChild(li);
    });
    const editButtons = document.querySelectorAll('.edit-btn');
    editButtons.forEach(button => {                                  //delete & edit
        button.addEventListener('click', editTask);
    });

    const deleteButtons = document.querySelectorAll('.delete-btn');
    deleteButtons.forEach(button => {
        button.addEventListener('click', deleteTask);
    });
}
function editTask(event) {
    const index = event.target.getAttribute('data-index');
    const newTask = prompt('Aufgabe bearbeiten:', savetasks[index].task);
    const newDate = prompt('Datum bearbeiten:', savetasks[index].date);

    if (newTask !== null && newTask.trim() !== '' && newDate !== null) {
        savetasks[index].task = newTask;
        savetasks[index].date = newDate;
        renderTasks();
    }
}


function deleteTask(event) {
    const index = event.target.getAttribute('data-index');
    savetasks.splice(index, 1);
    renderTasks();
}
