
//set Dropdown-Menus to default, even is value is cached from before:
document.addEventListener("DOMContentLoaded", function () {
    document.querySelector("#dropdown").value = "8";
    document.querySelector("#difficulty").value = "easy";
    setUpGameBoard(8);
});

let size = 8;
let numberOfBombs;
let numberOfBombsLeft;
let noBomb;


// setUpGameBoard(8);

var dropdown = document.querySelector("#dropdown");
dropdown.addEventListener("change", chooseSize);

document.querySelector("#reset").addEventListener("click", reset);

function chooseSize(event) {
    // var selectedValue = event.target.value;
    size = parseInt(event.target.value);
    // console.log("Size in Function", size);
    setUpGameBoard(size);
}

  // //what happens at first click?
  function firstClick(event) {
    var numberOfBombs = size;
    var clickedID = event.target.id;
    // console.log("geklickt", clickedID);
    while (numberOfBombs > 0) {
        var i = Math.floor(Math.random() * size);
        var j = Math.floor(Math.random() * size);
        //select a button randomly to place a bomb:
        var buttonId = i.toString() + j.toString(); // Concatenate i and j as strings
        // console.log("buttonId",buttonId)
        var button = document.getElementById(buttonId);
       
        if (!button.classList.contains("bomb") && clickedID != buttonId) {
            button.classList.add("bomb");
            //TODO Get rid of textcontent!
            //button.textContent = "*";
            numberOfBombs--;
            // console.log("Bombe bei ", buttonId);
        }
    }

    var buttons = document.querySelectorAll("button:not(#reset)");
    //for all buttons that are no bombs, count how many bombs on surrounding buttons:
    for (var button of buttons) {
        if (!button.classList.contains("bomb")) {
            var counter = 0;
            var buttonId = button.id;

            // Extract individual numbers
            var row = parseInt(buttonId.charAt(0)); // Get the first character and convert it to a number
            var col = parseInt(buttonId.charAt(1));

            for (var i = row - 1; i <= row + 1; i++) {
                for (var j = col - 1; j <= col + 1; j++) {
                    var testId = i.toString() + j.toString();
                    // console.log(testId, "TestId, Inhalt: ", document.getElementById(testId).textContent);
                    if (document.getElementById(testId) !== null && document.getElementById(testId).classList.contains("bomb")) {
                        counter++;
                    }
                }
            }
            //write number of surrounding bombs into textContent
            button.textContent = counter;
            // document.getElementById(counter).textContent = numberOfBombsLeft;
        }
    }
    //after first click, remove eventlistener for first click
    //add eventlistener for click (uncover) and rightclick (warning)
    for (var button of buttons) {
        button.removeEventListener("click", firstClick);
        button.addEventListener("click", uncover);
        button.addEventListener("contextmenu", warning);
    }
    //set clicked button to uncovered
    event.target.classList.add('uncovered');
    checkAround(event.target);
}

function setUpGameBoard(size) {
    //call function iWon every second;
//return value interval is a unique ID representing this interval.
const interval = setInterval(isWon, 1000);

    const gameBoard = document.querySelector("#game");
    gameBoard.innerHTML = ""; //clear
    console.log("Schritt 1");    
    numberOfBombs = size;
    noBomb = size * size - numberOfBombs;
    numberOfBombsLeft = size;
    console.log("Bombs", numberOfBombs, "Size", size, "NoBombs", noBomb);
    console.log("Schritt 2");
    gameBoard.style.width = size * 40 + "px";
    gameBoard.style.height = size * 40 + "px";
    console.log("Schritt 3");
    //Create buttons:
    for (var i = 0; i < size; i++) {
        for (var j = 0; j < size; j++) {
            let tile = document.createElement("button");
            let id = i.toString() + j.toString();
            // console.log("id", id);
            tile.setAttribute("id", id);
            tile.textContent = "0";
            tile.addEventListener("click", firstClick);
            gameBoard.appendChild(tile);
        }
    }
    console.log("Schritt 4");
    //Select all buttons except the reset-button:
    var buttons = document.querySelectorAll("button:not(#reset)");
    //Give eventlistener to all buttons for first click:
    for (var button of buttons) {
        // console.log(button.classList);
        button.addEventListener("click", firstClick);
    }

    console.log("Schritt 5");
    document.querySelector("#counter").textContent = numberOfBombsLeft;
    // console.log("Counter initialisiert", numberOfBombsLeft);
    //interval = setInterval(isWon, 1000);
    
    // //what happens at first click?
    // function firstClick(event) {
    //     var numberOfBombs = size;
    //     var clickedID = event.target.id;
    //     // console.log("geklickt", clickedID);
    //     while (numberOfBombs > 0) {
    //         var i = Math.floor(Math.random() * size);
    //         var j = Math.floor(Math.random() * size);
    //         //select a button randomly to place a bomb:
    //         var buttonId = i.toString() + j.toString(); // Concatenate i and j as strings
    //         // console.log("buttonId",buttonId)
    //         var button = document.getElementById(buttonId);
           
    //         if (!button.classList.contains("bomb") && clickedID != buttonId) {
    //             button.classList.add("bomb");
    //             //TODO Get rid of textcontent!
    //             //button.textContent = "*";
    //             numberOfBombs--;
    //             // console.log("Bombe bei ", buttonId);
    //         }
    //     }

    //     // var buttons = document.querySelectorAll("button");
    //     //for all buttons that are no bombs, count how many bombs on surrounding buttons:
    //     for (var button of buttons) {
    //         if (!button.classList.contains("bomb")) {
    //             var counter = 0;
    //             var buttonId = button.id;

    //             // Extract individual numbers
    //             var row = parseInt(buttonId.charAt(0)); // Get the first character and convert it to a number
    //             var col = parseInt(buttonId.charAt(1));

    //             for (var i = row - 1; i <= row + 1; i++) {
    //                 for (var j = col - 1; j <= col + 1; j++) {
    //                     var testId = i.toString() + j.toString();
    //                     // console.log(testId, "TestId, Inhalt: ", document.getElementById(testId).textContent);
    //                     if (document.getElementById(testId) !== null && document.getElementById(testId).classList.contains("bomb")) {
    //                         counter++;
    //                     }
    //                 }
    //             }
    //             //write number of surrounding bombs into textContent
    //             button.textContent = counter;
    //             // document.getElementById(counter).textContent = numberOfBombsLeft;
    //         }
    //     }
    //     //after first click, remove eventlistener for first click
    //     //add eventlistener for click (uncover) and rightclick (warning)
    //     for (var button of buttons) {
    //         button.removeEventListener("click", firstClick);
    //         button.addEventListener("click", uncover);
    //         button.addEventListener("contextmenu", warning);
    //     }
    //     //set clicked button to uncovered
    //     event.target.classList.add('uncovered');
    //     checkAround(event.target);
    // }
}


function warning(event) {
    event.preventDefault();
    var button = event.target;
    // console.log("WARNING", button.classList);
    if (!button.classList.contains('uncovered')) {

        if (button.classList.contains('warning')) {
            button.classList.remove('warning');
            button.addEventListener("click", uncover);
            button.textContent = button.getAttribute('data-original-text');
            numberOfBombsLeft++;
        }
        else {
            // Store original text content in a data attribute
            button.setAttribute('data-original-text', button.textContent);
            button.classList.add('warning');
            button.removeEventListener("click", uncover);
            button.textContent = "<!>";
            numberOfBombsLeft--;
        }
    }
    document.querySelector("#counter").textContent = numberOfBombsLeft;
}


//function can be called with event or button as argument
function uncover(event) {
    // console.dir("Eventtyp:", event.type);
    if (event.type == "click") {
        var button = event.target;
    }
    else {
        var button = event;
    }
    // console.log(button.classList);

    if (button.classList.contains("bomb")) {
        alert("VERLOREN!");
        var allBombs = document.querySelectorAll(".bomb");
        for (var b of allBombs) {
            // console.dir(b);
            b.classList.add("exploded");
        }
        removeListeners();
    }

    else {
        button.classList.add('uncovered');
        // button.classList.remove('covered');
        // console.log("Uncovered", button.id);
        checkAround(button);
    }
}



function checkAround(button) {
    if (button.textContent == "0") {

        var buttonId = button.id;
        // console.log("checkaround", buttonId, "Content", button.textContent);

        var row = parseInt(buttonId.charAt(0));
        var col = parseInt(buttonId.charAt(1));

        for (var i = row - 1; i <= row + 1; i++) {
            for (var j = col - 1; j <= col + 1; j++) {
                var testId = i.toString() + j.toString();
                var testButton = document.getElementById(testId);
                if (testButton !== null && !testButton.classList.contains('uncovered') && buttonId !== testId) {
                    uncover(document.getElementById(testId));
                }
            }
        }
    }
}




function isWon() {
    // console.log("isWon?");
    let allBombs = document.querySelectorAll(".bomb");
    let allUncovered = document.querySelectorAll(".uncovered").length; //number of uncovered buttons

    // console.log(allUncovered, noBomb);

    let counterWarnings = 0; //number of warnings on actual bombs
    for (let i = 0; i < allBombs.length; i++) {
        if (allBombs[i].classList.contains("warning")) {
            counterWarnings++;
        }
    }

    console.log(counterWarnings, numberOfBombs); 
    console.log(allUncovered, noBomb);

    if (counterWarnings === numberOfBombs || allUncovered === noBomb) {
        alert("GEWONNEN!");
        console.log("Win");
        //uncover all Buttons
        let allNormalButtons = document.querySelectorAll("button:not(.bomb):not(.reset)")//css-selector!
        for (var b of allNormalButtons) {
            b.classList.add("uncovered");
        }
        console.log("Clear Interval! ");
        clearInterval(interval);
        removeListeners();
    }
}
  


function removeListeners() {
    var buttons = document.querySelectorAll("button:not(#reset)");

    for (var button of buttons) {
        button.removeEventListener("click", uncover);
        button.removeEventListener("contextmenu", warning);
    }
}

function reset() {
    setUpGameBoard(size);
 }


/*

Schwierigkeit auswählen
GEwonnen, wenn alle aufgedeckt?: Funktion wird nicht gestartet bei Reset
Interval beenden, wenn gewonnen oder verloren

*/