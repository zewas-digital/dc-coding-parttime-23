// localStorage.clear();

//Idee: eindeutige ID, automatisch vergeben, aus Datum + lfdNr?
//JSON.stringify wandelt json in String um, umgekehrt JSON.parse
//VAlidierung: leere Eingaben, komische Formate
//Tabelle nach Fälligkeit sortieren

// var lfdNr = 1;

//hier nur zum Testen; eigentlich sollten die Aufgaben gespeichert bleiben
//window.localStorage.clear();

//const toDoArray = [];
//Retrieve Data from Local Storage
//Bonus: Mehrfachauswahl? Checkboxen, mehrere gleichzeitig löschen oder ändern; 
//evtl. nur einzelne Felder, z.B. nur Datum
// z.B. auch Menüpunkt neue Aufgabe: ausblenden am Anfang, z.B. wenn selten neue Aufgaben erzeugt werden
//2D-Array durch Array von Objekten ersetzten, gesamtes in Storage 


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
    const dateInput = document.querySelector("input[name='date']").value;
    const when = formatDate(dateInput);

    if (what !== "" && isValidDate(when)) {
        toDoArray.push([what, when]);
    }
    else {
        alert("Schrott eingegeben!")
    }

    console.log(toDoArray);
    buildList();
    arrayToLocalStorage(toDoArray);

}

function buildList() {

    const todoList = document.querySelector("#ToDos");
    todoList.innerHTML = ""; //remove old table
    const numberOfTasks = toDoArray.length;

    for (let i = 0; i < numberOfTasks; i++) {

        let task = document.createElement("tr");

        const what = document.createElement("td");
        what.textContent = toDoArray[i][0];
        // console.log(what.textContent);
        what.classList.add("aufgabe");
        what.addEventListener("click", changeTask2);

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
    let matrix = [];
    const keys = Object.keys(localStorage);
    for (let i = 0; i < keys.length; i++) {
        let taskString = localStorage.getItem(i);
        let separateStrings = taskString.trim().split(","); //remove blanks, split by comma
        // matrix.push([separateStrings[0], separateStrings[1], separateStrings[2]]);
        matrix.push([separateStrings[0], separateStrings[1]]);
    }
    return matrix;
}

function arrayToLocalStorage(matrix) {
    localStorage.clear();
    for (let i = 0; i < matrix.length; i++) {
        // var trueOrFalse = matrix[i][2];
        // var rowToString = matrix[i][0].toString() + "," + matrix[i][1].toString() + "," + trueOrFalse;
        const rowToString = matrix[i][0].toString() + "," + matrix[i][1].toString();
        localStorage.setItem(i, rowToString);
    }
}
function changeDate() {
    const taskRow = this.closest("tr");
    const parent = taskRow.parentNode;
    const allChildren = parent.childNodes;
    const index = Array.prototype.indexOf.call(allChildren, taskRow);

    // const newDate = prompt("Bitte geben Sie das neue Datum ein:").match(pattern);

    const newDate = prompt("Bitte geben Sie das neue Datum ein:");

    if (isValidDate(newDate)) {
        toDoArray[index][1] = newDate;
    }
    else {
        alert("Schrott eingegeben!")
    }

    buildList();
    arrayToLocalStorage(toDoArray);
}

function changeTask() {
    // console.log(this, "this");
    const taskRow = this.closest("tr");
    const parent = taskRow.parentNode;
    const allChildren = parent.childNodes;
    const index = Array.prototype.indexOf.call(allChildren, taskRow);
    // console.log(toDoArray[index], "ändern");

    const newText = prompt("Bitte geben Sie die neue Aufgabe ein:", toDoArray[index][0]);
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

}

function changeTask2(){
    // console.log("Change2");
    const taskRow = this.closest("tr");
    const parent = taskRow.parentNode;
    const allChildren = parent.childNodes;
    const index = Array.prototype.indexOf.call(allChildren, taskRow);
    //original Text:
    const originalText = this.textContent;
    //create new input-element:
    const inputElement = document.createElement("input");
    inputElement.type = "text";
    inputElement.value = originalText; //write old text into new element as placeholder

    const thisthis = this;
    //when inputElement looses focus, do the following:
    inputElement.addEventListener("blur", function() {
        const newText = inputElement.value;
        console.log(newText, "newText");
        thisthis.innerText = newText;
        taskRow.replaceChild(thisthis, inputElement);
        toDoArray[index][0] = newText;
    })

    console.log(this.textContent, "alter Wert?");
    this.textContent = "";
    console.log(this.textContent, "ersetzt");
    taskRow.replaceChild(inputElement, thisthis);
    inputElement.focus();

    

/*
To address this issue, you correctly stored a reference to the original this 
in the variable thisthis. However, when you attempt to replace the inputElement 
with thisthis, you are effectively trying to replace the inputElement with the same element (this) 
which it was replaced by originally. This can lead to unexpected behavior.

To resolve this issue, you should use the thisthis variable to replace the inputElement 
with the original element in the blur event listener, and vice versa.
*/



    // toDoArray[index][0] = newText;
    buildList();
    arrayToLocalStorage(toDoArray);
}




function removeTask(event) {
    if (confirm("Sicher?")) {

        // Get the row that contains the target element (the element that triggered the event)
        const taskRow = event.target.closest("tr");
        // console.log(taskRow, "geklickte Zeile");
        const parent = taskRow.parentNode;
        const allChildren = parent.childNodes;
        const index = Array.prototype.indexOf.call(allChildren, taskRow);
        // console.log(index, "Nr. der Zeile (?)");
        // console.log(toDoArray, "Todo-Array");
        toDoArray.splice(index, 1); //1 Reihe löschen

        buildList();
        arrayToLocalStorage(toDoArray);
    }
}
function formatDate(inputDate) {
    // Parse the input date
    const parsedDate = new Date(inputDate);
    // Format the date into dd.mm.yyyy, template literal
    //                                  Tag            Monat (Januar = 0)                          Jahr
    const formattedDate = `${parsedDate.getDate()}.${parsedDate.getMonth() + 1}.${parsedDate.getFullYear()}`;
    return formattedDate;
}

function isValidDate(dateString) {
    // Regular expression to validate date format (dd.mm.yyyy)
    const datePattern = /^(0?[1-9]|[12][0-9]|3[01])\.(0?[1-9]|1[012])\.\d{4}$/;
    return datePattern.test(dateString);
}