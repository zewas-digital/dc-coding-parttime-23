document.querySelector("#saveData").addEventListener("click", saveData);
document.querySelector("#readData").addEventListener("click", readData);
document.querySelector("#clearData").addEventListener("click", clearData);


var lfdNr = 1;

function saveData() {

    var myData = document.querySelector("#myData").value;
    console.log(lfdNr, myData);
    localStorage.setItem(lfdNr, myData);
    lfdNr++;
}

function readData() {

    var savedData = localStorage.getItem(lfdNr);
    document.querySelector("input").value = savedData;

    // for (var i = 0; i < savedData.length; i++){
    //     savedData[i];
    // }

    console.log(savedData);
    console.log(window.localStorage);
    
}

function clearData(){
    localStorage.removeItem(lfdNr);
}