
let size = 8;
let difficulty = "easy";
let numberOfBombs;
let numberOfBombsLeft;
let noBomb;
let interval;

const dropdownElementSize = document.querySelector("#dropdownSize");
dropdownElementSize.addEventListener("change", chooseSize);
const dropdownElementDifficulty = document.querySelector("#dropdownDifficulty");
dropdownElementDifficulty.addEventListener("change", chooseDifficulty);
const resetButton = document.querySelector("#reset");
resetButton.addEventListener("click", reset);
// console.dir("Reset am Anfang: ", resetButton);

//set Dropdown-Menus to default:
document.addEventListener("DOMContentLoaded", function () {
    document.querySelector("#dropdownSize").value = "8";
    document.querySelector("#dropdownDifficulty").value = "easy";

    setUpGameBoard(8, "middle");
    document.querySelector("#counter").textContent = 8;

});

// console.log("Classlist reset: ");
//     console.dir(document.querySelector("#reset").classlist);


function chooseSize(event) {
    // console.log("choose Size, stop Interval");
    stopInterval();
    // var selectedValue = event.target.value;
    size = parseInt(event.target.value);
    // console.log("Size in Function", size);
    setUpGameBoard(size, difficulty);
}

function chooseDifficulty(event) {
    // console.log("chooseDifficulty, before: ", difficulty);
    stopInterval();
    difficulty = event.target.value;
    // switch
    // console.log("danach: ", difficulty);
    setUpGameBoard(size, difficulty);
}

// //what happens at first click?
function firstClick(event) {
    // console.log("firstClicK, number of Bombs: ", numberOfBombs);
    // let numberOfBombs = size;
    let clickedID = event.target.id;
    // const interval = setInterval(isWon, 1000);
    // console.log("geklickt", clickedID);
    while (numberOfBombs > 0) {
        let i = Math.floor(Math.random() * size);
        let j = Math.floor(Math.random() * size);
        //select a button randomly to place a bomb:
        let buttonId = i.toString() + j.toString(); // Concatenate i and j as strings
        // console.log("buttonId",buttonId)
        let button = document.getElementById(buttonId);

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
    // console.log("first button set to unclicked");
    startInterval();

    checkAround(event.target);
    // console.log("firstClicK fertig");


}

function setUpGameBoard(size, difficulty) {

    //call function iWon every second;
    //return value interval is a unique ID representing this interval.
    // const interval = setInterval(isWon, 1000);
    // console.log("set up game board");
    // console.log("bombs before switch", numberOfBombs);
    const gameBoard = document.querySelector("#game");
    gameBoard.innerHTML = ""; //clear
    // console.log("Schritt 1");    
    // console.log("switch, difficulty: ", difficulty)
    switch (difficulty) {
        case "easy":
            // console.log("easy");
            if (size === 5) numberOfBombs = 2;
            if (size === 8) numberOfBombs = 8;
            if (size === 10) numberOfBombs = 10;
            break;
        case "middle":
            // console.log("middle");            
            if (size === 5) numberOfBombs = 3;
            if (size === 8) numberOfBombs = 12;
            if (size === 10) numberOfBombs = 15;
            break;
        case "difficult":
            // console.log("difficult");

            if (size === 5) numberOfBombs = 5;
            if (size === 8) numberOfBombs = 16;
            if (size === 10) numberOfBombs = 20;
            break;
        default:
            // console.log("Default?");
            numberOfBombs = size;
    }
    // console.log("after switch, numberoFBOMBS. ", numberOfBombs);


    noBomb = size * size - numberOfBombs;
    // console.log("im Setup, noBomb:", noBomb);
    numberOfBombsLeft = numberOfBombs;
    // console.log("Bombs", numberOfBombs, "Size", size, "NoBombs", noBomb);
    // console.log("Schritt 2");
    gameBoard.style.width = size * 40 + "px";
    gameBoard.style.height = size * 40 + "px";
    // console.log("Schritt 3");
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
    // console.log("Schritt 4");
    //Select all buttons except the reset-button:
    var buttons = document.querySelectorAll("button:not(#reset)");
    //Give eventlistener to all buttons for first click:
    for (var button of buttons) {
        // console.log(button.classList);
        button.addEventListener("click", firstClick);
    }

    // console.log("Schritt 5");
    document.querySelector("#counter").textContent = numberOfBombsLeft;
    // console.log("Counter initialisiert", numberOfBombsLeft);
    //interval = setInterval(isWon, 1000);
    // console.dir("Reset nach Setup: ", resetButton);
    resetButton.classList.remove("uncovered"); //????


    document.addEventListener('keydown', hint);


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
        const allBombElements = document.querySelectorAll(".bomb");
        for (var b of allBombElements) {
            // console.dir(b);
            b.classList.add("exploded");
        }
        removeListeners();
        stopInterval();
    }

    else {
        button.classList.add('uncovered');
        // button.classList.remove('covered');
        // console.log("Uncovered", button.id);
        checkAround(button);
    }
}



function checkAround(button) {
    // console.log("checkaround");
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
    // console.log("checkaround fertig");
}




function isWon() {
    // console.log("isWon?");
    let allBombElements = document.querySelectorAll(".bomb");
    let numberOfAllUncovered = document.querySelectorAll(".uncovered").length; //number of uncovered buttons
    let allNormalButtons = document.querySelectorAll("button:not(#reset):not(.bomb)");
    // console.dir("Reset in iswon: ", resetButton);
    let numberOfNormalButtons = allNormalButtons.length;
    let numberOfBombs = allBombElements.length;
    console.log(numberOfBombs, "Bomben", numberOfNormalButtons, "andere");

    // console.log("number of uncovered buttons, nobombs", numberOfAllUncovered, noBomb);
    // console.log("length of bomb-list: ", allBombElements.length, "number of bombs", numberOfBombs);

    let counterWarnings = 0; //number of warnings on actual bombs
    for (let i = 0; i < numberOfBombs; i++) {
        if (allBombElements[i].classList.contains("warning")) {
            counterWarnings++;
        }
    }

    console.log("warnings, bombs", counterWarnings, numberOfBombs);
    console.log("alluncovered, nobombs", numberOfAllUncovered, noBomb);

    if (counterWarnings === numberOfBombs || numberOfAllUncovered === noBomb) {
        alert("GEWONNEN!");
        console.log("Win");


        // console.log("alle aufgedeckten: ");
        // console.dir(document.querySelectorAll(".uncovered"));


        //uncover all Buttons
        let allNormalButtons = document.querySelectorAll("button:not(.bomb):not(.reset)")//css-selector!
        for (var b of allNormalButtons) {
            b.classList.add("uncovered");
        }
        // console.log("Clear Interval! ");
        stopInterval();
        removeListeners();



    }

}



function removeListeners() {
    var buttons = document.querySelectorAll("button:not(#reset)");

    for (var button of buttons) {
        button.removeEventListener("click", uncover);
        button.removeEventListener("contextmenu", warning);
    }
    document.removeEventListener('keydown', hint);

}

function reset() {
    // console.log("Reset, stop Interval");
    stopInterval();
    setUpGameBoard(size, difficulty);
}

function startInterval() {
    interval = setInterval(isWon, 1000);
    // console.log("setnterval in function");

}

function stopInterval() {
    clearInterval(interval);
}


function hint(event) {
    if (event.key === 'h' || event.key === 'H') {
        let allButtons = document.querySelectorAll("button:not(#reset)");
        let allCovered = [];

        for (let b of allButtons) {
            if (b.classList.length === 0) {
                allCovered.push(b);
            }
        }

        // console.dir(allCovered);

        let randNr = Math.floor(Math.random() * allCovered.length - 1);
        // console.log("randNr", randNr);

        const hintButton = allCovered[randNr];
        hintButton.classList.add("uncovered");

        // After 500 milliseconds (0.5 seconds), remove the 'highlight' class
        setTimeout(function () {
            hintButton.classList.remove("uncovered");
        }, 500);


    }
}

