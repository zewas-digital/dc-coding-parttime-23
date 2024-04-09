// localStorage.clear();
//TODO: Daten aus LocalStorage auslesen, Aufgabenliste neu erzeugen, lfdNr setzen
//ARray erzeugen - in LocalStorage einlesen
//JSON.stringify wandelt json in String um, umgekehrt JSON.parse
//falls Text leer oder Datum ungültig -> kein Einlesen!


// var lfdNr = 1;

// const toDoArray = [];
//Retrieve Data from Local Storage


var myButton = document.querySelector("button");
if (myButton !== null) {
    myButton.addEventListener("click", function (event) {
        event.preventDefault(); // unterbinde submit des Formulars
        addToDo();
    });
}

const toDoArray = localStorageToArray();
console.log("ToDoArray beim Laden der Seite ", toDoArray);
buildList();

function addToDo() {

    let todoList = document.querySelector("#ToDos");
    console.log("Add, todoList: ", todoList);

    let task = document.createElement("tr");

    // const nr = document.createElement("td");
    // nr.textContent = lfdNr;
    // nr.classList.add("lfdnr");

    const what = document.createElement("td");
    what.textContent = document.querySelector("input[name='title']").value;
    what.classList.add("aufgabe");

    const when = document.createElement("td");
    when.textContent = document.querySelector("input[name='date']").value;
    when.classList.add("datum");

    const box = document.createElement("td");
    const checkbox = document.createElement("input");
    checkbox.setAttribute("type", "checkbox");//which attribute, which type?
    checkbox.addEventListener("change", isDone);
    box.appendChild(checkbox);

    // task.append(nr, what, when, box);
    task.append(what, when, box);
    todoList.append(task);




    //Array

    if (what !== null && when !== null) {
        toDoArray.push([what.textContent, when.textContent, false]);
        console.log("ARray ", toDoArray);

    }

    arrayToLocalStorage(toDoArray);

    //     if (todoList !== null) {
    //         const what = document.querySelector("input[name='title']");
    //         const when = document.querySelector("input[name='date']");
    //         if (what !== null && when !== null) {
    //             toDo.push([what.value, when.value]);
    //             console.log("Wohin?");
    //             console.log(todoList);
    //             displayMatrix(todoList, toDo);
    //         }
    //     }



    //LocalStorage
    // var taskToString = what.textContent + " " + when.textContent.toString();
    // localStorage.setItem(lfdNr, taskToString);
    // lfdNr++;
    // console.log("Local Storage ", window.localStorage);



}

function buildList() {

    let todoList = document.querySelector("#ToDos");
    let numberOfTasks = toDoArray.length;
    
    console.log(todoList);
    for (let i = 0; i < numberOfTasks; i++) {

        let task = document.createElement("tr");

        const what = document.createElement("td");
        what.textContent = toDoArray[i][0];
        what.classList.add("aufgabe");

        const when = document.createElement("td");
        when.textContent = toDoArray[i][1];
        when.classList.add("datum");

        const box = document.createElement("td");
        const checkbox = document.createElement("input");
        checkbox.setAttribute("type", "checkbox");//which attribute, which type?
        checkbox.checked = toDoArray[i][2] ? false : true;
        checkbox.addEventListener("change", isDone);
        box.appendChild(checkbox);

        // task.append(nr, what, when, box);
        task.append(what, when, box);
        todoList.append(task);
    }
}

function localStorageToArray() {
    var matrix = [];
    var keys = Object.keys(localStorage);
    for (var i = 0; i < keys.length; i++) {
        var taskString = localStorage.getItem(i);
        var separateStrings = taskString.trim().split(","); //remove blanks, split by comma
        matrix.push([separateStrings[0], separateStrings[1], separateStrings[2]]);
    }
    return matrix;
}

function arrayToLocalStorage(matrix) {
    // localStorage.clear();
    for (var i = 0; i < matrix.length; i++) {
        var trueOrFalse = matrix[i][2];
        var rowToString = matrix[i][0].toString() + "," + matrix[i][1].toString() + "," + trueOrFalse;
        localStorage.setItem(i, rowToString);

    }
    console.log("LS in Funktion", window.localStorage);
}

function isDone(event) {

    // Get the row that contains the target element (the element that triggered the event)
    let taskRow = event.target.closest("tr");
    let childElements = taskRow.querySelectorAll("*");
    let nr = taskRow.querySelector(".lfdnr");
    console.log(nr);

    if (!taskRow.classList.contains("done")) {

        taskRow.classList.add("done");
        childElements.forEach(child => {
            child.classList.add("done");
        });
    }
    else {
        taskRow.classList.remove("done");
        childElements.forEach(child => {
            child.classList.remove("done");
        });
    }

    //LocalStorage
    localStorage.removeItem(taskRow.querySelector(nr));


    // Remove the row from the todo-list table
    // taskRow.remove();
}

// // Add event listeners to each remove button (for removing tasks)
// todoList.addEventListener("click", function(event) {
//     if (event.target.classList.contains("remove-task")) {
//         removeTask(event);
//     }
// });





// function addToDo() {
//     var todoList = document.querySelector("#ToDos");
//     if (todoList !== null) {
//         const what = document.querySelector("input[name='title']");
//         const when = document.querySelector("input[name='date']");
//         if (what !== null && when !== null) {
//             toDo.push([what.value, when.value]);
//             console.log("Wohin?");
//             console.log(todoList);
//             displayMatrix(todoList, toDo);
//         }
//     }
// }


// function displayMatrix(htmlElement, matrix) {
//     htmlElement.innerHTML = "";
//     console.log(htmlElement);
//     for (var i = 0; i < matrix.length; i++) { //number of rows
//         htmlElement.innerHTML += "<tr><td class='aufgabe'>" + matrix[i][0] + "</td><td class='datum'>" + matrix[i][1] + "</td><td><input type='checkbox' data-row =" + i + "onclick='isDone(" + i + ")'></td></tr>";
//     }
// }
// function isDone(i) {
//     console.log("checkbox");
//     toDo.splice(i, 1);
//     // var todoList = document.getElementById("ToDos");
//     // displayMatrix(todoList, toDo)
//     console.log(toDo);
// }
