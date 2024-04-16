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
