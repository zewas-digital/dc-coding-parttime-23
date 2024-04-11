// localStorage.clear();
//TODO: Daten aus LocalStorage auslesen, Aufgabenliste neu erzeugen, lfdNr setzen
//ARray erzeugen - in LocalStorage einlesen
//JSON.stringify wandelt json in String um, umgekehrt JSON.parse
//falls Text leer oder Datum ungültig -> kein Einlesen!
//VAlidierung: leere Eingaben, komische Formate
//Tabelle nach Fälligkeit sortieren


// var lfdNr = 1;

//hier nur zum Testen; eigentlich sollten die Aufgaben gespeichert bleiben
//window.localStorage.clear();


//const toDoArray = [];
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

    const what = document.querySelector("input[name='title']").value;
    const when = document.querySelector("input[name='date']").value;

    if (what !== "" && when !== "") {
        toDoArray.push([what, when]);
    }

    console.log(toDoArray);
    buildList();
    arrayToLocalStorage(toDoArray);

    
}

function buildList() {

    let todoList = document.querySelector("#ToDos");
    todoList.innerHTML = ""; //remove old table
    let numberOfTasks = toDoArray.length;
    
    for (let i = 0; i < numberOfTasks; i++) {

        let task = document.createElement("tr");

        const what = document.createElement("td");
        what.textContent = toDoArray[i][0];
        // console.log(what.textContent);
        what.classList.add("aufgabe");
        what.addEventListener("click", changeTask);

        const when = document.createElement("td");
        when.textContent = toDoArray[i][1];
        // console.log(when.textContent);
        when.classList.add("datum");
        when.addEventListener("click", changeDate);

        // const box = document.createElement("td");
        // const checkbox = document.createElement("input");
        // checkbox.setAttribute("type", "checkbox");//which attribute, which type?
        // // checkbox.checked = toDoArray[i][2] ? true : false;
        // checkbox.checked = false;
        // checkbox.addEventListener("change", removeTask);
        // box.appendChild(checkbox);


        const box = document.createElement("td");
        box.textContent = "🔨";
        box.classList.add("clear");
        box.addEventListener("click", removeTask);
        


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
    localStorage.clear();
    for (var i = 0; i < matrix.length; i++) {
        var trueOrFalse = matrix[i][2];
        var rowToString = matrix[i][0].toString() + "," + matrix[i][1].toString() + "," + trueOrFalse;
        localStorage.setItem(i, rowToString);

    }
    
}
function changeDate(event){
    let taskRow = event.target.closest("tr");
    const parent = taskRow.parentNode;
    const allChildren = parent.childNodes;
    let index = Array.prototype.indexOf.call(allChildren, taskRow);

    let pattern =/[0-9]{4}-[0-9]{2}-[0-9]{2}/;

    let newDate = prompt("Bitte geben Sie das neue Datum ein:").match(pattern);
    toDoArray[index][1] = newDate;

    buildList();
    arrayToLocalStorage(toDoArray);
}

function changeTask(event){
   
    let taskRow = event.target.closest("tr");
    const parent = taskRow.parentNode;
    const allChildren = parent.childNodes;
    let index = Array.prototype.indexOf.call(allChildren, taskRow);
    console.log(toDoArray[index], "ändern");


    let newText = prompt("Bitte geben Sie die neue Aufgabe ein:", toDoArray[index][0]);
    toDoArray[index][0] = newText;
   
    buildList();
    arrayToLocalStorage(toDoArray);

    //neues input-Element mit dem Text wie bisher:
    // let inputElement = document.createElement("input");
    // inputElement.type = "text";
    // inputElement.value = itemToChange.innerText;
    // itemToChange.innerHTML ="";
    // itemToChange.appendChild(inputElement);
    // inputElement.focus();

    // inputElement.addEventListener("blur", function() {
    //     // Get the new value entered by the user
    //     const newValue = inputElement.value;
    
    //     // Replace the input element with the new value in the cell
    //     itemToChange.innerText = newValue;
    //   });


    // console.log("Ändern", itemToChange);
}

function removeTask(event) {
    if (confirm("Sicher?")){
   
    // Get the row that contains the target element (the element that triggered the event)
    let taskRow = event.target.closest("tr");
    // console.log(taskRow, "geklickte Zeile");
    const parent = taskRow.parentNode;
    const allChildren = parent.childNodes;
    let index = Array.prototype.indexOf.call(allChildren, taskRow);
    // console.log(index, "Nr. der Zeile (?)");
    // console.log(toDoArray, "Todo-Array");
    toDoArray.splice(index, 1); //1 Reihe löschen

    buildList();
    arrayToLocalStorage(toDoArray);
    }

}
