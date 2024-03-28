const toDo = [];
var myButton = document.querySelector("button");
if (myButton !== null) {
    myButton.addEventListener("click", function (event) {
        event.preventDefault(); // unterbinde submit des Formulars
        addToDo();
    });
}
function addToDo() {
    var todoList = document.getElementById("ToDos");
    if (todoList !== null) {
        const what = document.querySelector("input[name='title']");
        const when = document.querySelector("input[name='date']");
        if (what !== null && when !== null) {
            toDo.push([what.value, when.value]);
            console.log("Wohin?");
            console.log(todoList);
            displayMatrix(todoList, toDo);
        }
    }
}
function displayMatrix(htmlElement, matrix) {
    htmlElement.innerHTML = "";
    console.log(htmlElement);
    for (var i = 0; i < matrix.length; i++) { //number of rows
        htmlElement.innerHTML += "<tr><td class='aufgabe'>" + matrix[i][0] + "</td><td class='datum'>" + matrix[i][1] + "</td><td><input type='checkbox' data-row =" + i + "onclick='isDone(" + i + ")'></td></tr>";
    }
}
function isDone(i) {
    console.log("checkbox");
    toDo.splice(i, 1);
    // var todoList = document.getElementById("ToDos");
    // displayMatrix(todoList, toDo)
    console.log(toDo);
}
