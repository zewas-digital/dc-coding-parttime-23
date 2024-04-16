import Task from './Task';


let tasks = JSON.parse(localStorage.getItem('LocalTaskArray_OO')) || [];

var task = document.getElementById('addTask');
task.addEventListener('click', createTaskOjekt);
addToDOM();

let taskArray =[];
let taskArrayInProgress = [];
let taskArrayDone = [];

function addToDOM() {

    const numberOfTasks = tasks.length;
    const taskList = document.getElementById('tasklist');
    const taskListInProgress = document.getElementById('tasklistInProgress');
    const taskListDone = document.getElementById('tasklistDone');
    taskList.innerHTML = '';
    taskListInProgress.innerHTML = '';
    taskListDone.innerHTML = '';

    for (let i = 0; i < numberOfTasks; i++){

        if( tasks[i].undone == true){

            const taskObject = {
                date: taskArray[index].date,
                task: taskArray[index].task
            };

            taskArray.push(taskObject);

        }else if( tasks[i].inProgress == true){

            const taskObject = {
                date: taskArrayInProgress[index].date,
                task: taskArrayInProgress[index].task
            };

            taskArrayInProgress.push(taskObject);

        }else if( tasks[i].done == true){
        
            const taskObject = {
                date: taskArrayDone[index].date,
                task: taskArrayDone[index].task
            };

            taskArrayDone.push(taskObject);
        
        }
    }

    bubblesort(taskArray);
    bubblesort(taskArrayInProgress);
    bubblesort(taskArrayDone);

    for (var i = 0; i < taskArray.length; i++) {

        let task = taskArray[i];
        let taskDiv = document.createElement('div');
        taskDiv.className = 'taskDiv';
        let taskDate = document.createElement('p');
        taskDate.innerHTML = task.date;
        let taskText = document.createElement('p');
        taskText.innerHTML = task.task;

        taskDiv.innerHTML += '<hr>'
        taskDiv.appendChild(taskDate);
        taskDiv.appendChild(taskText);
        taskDiv.innerHTML += '<button onclick=" removeTaskArray(' + i + ')">Löschen</button>';
        taskDiv.innerHTML += '<button onclick="changeTaskArray(' + i + ')">Bearbeiten</button>';
        taskDiv.innerHTML += '<button onclick="task_inProgress(' + i + ')">in Bearbeitung</button>';
        taskDiv.innerHTML += '<button onclick="task_done(' + i + ')">erledigt</button>';
        taskList.appendChild(taskDiv);
    }

    for (var i = 0; i < taskArrayInProgress.length; i++) {

        let task = taskArrayInProgress[i];
        let taskDiv = document.createElement('div');
        taskDiv.className = 'taskDiv';
        let taskDate = document.createElement('p');
        taskDate.innerHTML = task.date;
        let taskText = document.createElement('p');
        taskText.innerHTML = task.task;

        taskDiv.innerHTML += '<hr>'
        taskDiv.appendChild(taskDate);
        taskDiv.appendChild(taskText);
        taskDiv.innerHTML += '<button onclick=" removeTaskArray(' + i + ')">Löschen</button>';
        taskDiv.innerHTML += '<button onclick="changeTaskArray(' + i + ')">Bearbeiten</button>';
        taskDiv.innerHTML += '<button onclick="task_inProgress(' + i + ')">in Bearbeitung</button>';
        taskDiv.innerHTML += '<button onclick="task_done(' + i + ')">erledigt</button>';
        taskListInProgress.appendChild(taskDiv);
    }

    for (var i = 0; i < taskArrayDone.length; i++) {

        let task = taskArrayDone[i];
        let taskDiv = document.createElement('div');
        taskDiv.className = 'taskDiv';
        let taskDate = document.createElement('p');
        taskDate.innerHTML = task.date;
        let taskText = document.createElement('p');
        taskText.innerHTML = task.task;

        taskDiv.innerHTML += '<hr>'
        taskDiv.appendChild(taskDate);
        taskDiv.appendChild(taskText);
        taskDiv.innerHTML += '<button onclick=" removeTaskArray(' + i + ')">Löschen</button>';
        taskDiv.innerHTML += '<button onclick="changeTaskArray(' + i + ')">Bearbeiten</button>';
        taskDiv.innerHTML += '<button onclick="task_inProgress(' + i + ')">in Bearbeitung</button>';
        taskDiv.innerHTML += '<button onclick="task_done(' + i + ')">erledigt</button>';
        taskListDone.appendChild(taskDiv);
    }
}

function bubblesort(array) {

    let x;
    let y;

    for (let i = 0; i < array.length; i++) {

        for (let j = 0; j < array.length - 1; j++) {
            let a = array[j].date;
            let b = array[j + 1].date;

            if (a == '') {
                a = '1970-01-01';
            }
            if (b == '') {
                b = '1970-01-01';
            }

            if (a > b) {
                x = array[j];
                y = array[j + 1];
                array[j] = y;
                array[j + 1] = x;
            }
        }

    }
    return array;
}