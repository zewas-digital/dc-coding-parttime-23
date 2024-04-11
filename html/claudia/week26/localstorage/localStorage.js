document.querySelector("#saveData").addEventListener("click", saveData);
document.querySelector("#readData").addEventListener("click", readData);
document.querySelector("#clearData").addEventListener("click", clearData);

//Problem: sobald lfdNr zum zweiten Mal vorkommt, wird alter Datensatz überschrieben 
var lfdNr = Math.round(Math.random() * 100);

function saveData() {

    var myData = document.querySelector("#myData").value;
    console.log(lfdNr, myData);
    localStorage.setItem(lfdNr, myData);
    lfdNr++;
}

function readData() {

    document.querySelector("input").value = "???";

    for (let i = 0; i < localStorage.length; i++) {
        const key = localStorage.key(i);
        const value = localStorage.getItem(key);
        console.log(key, value);
    }

   console.log("local storage", window.localStorage);
    
}

function clearData(){
    // localStorage.removeItem(lfdNr);
    localStorage.clear();
}