
let size = 8;
let difficulty = "easy";
let numberOfBombs;
let numberOfBombsLeft;
let noBomb;
let interval1;
let interval2;
let counterInterval1 = 0; 
let counterInterval2 = 0;

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

//get highscore from localStorage:
// console.log("Aufbau der Seite... Highscore");

// const key = "Highscore_" + size + difficulty;
// console.log("Key?", key);
// const value = parseInt(localStorage.getItem(key));
// console.log("value", value);

// document.querySelector("#highscore").textContent = parseInt(value) > 0? parseInt(value): 0;


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
    updateScore(false);
    // console.log("first button set to unclicked");
    console.log("Start Interval in firstclick!");
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

    document.querySelector("#score").textContent = 0;

    const key = "Highscore_" + size + difficulty;
    const value = parseInt(localStorage.getItem(key));
    console.log ("setup, highscore aus speicher:", value);
    document.querySelector("#highscore").textContent = value > 0? value: 0;
    console.log(value, "Highscore zu Beginn geholt!");

    document.querySelector("#clearHighscore").addEventListener("click", clearHighscore);

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
        updateHighscore();
    }

    else {
        button.classList.add('uncovered');
        button.removeEventListener("click", uncover);
        button.removeEventListener("contextmenu", warning);
        updateScore(false);
        // button.classList.remove('covered');
        // console.log("Uncovered", button.id);
        checkAround(button);
    }
}

function updateScore(hint) {

    const scoreElement = document.querySelector("#score");
    const actualScore = scoreElement.textContent;
    console.log("Vorher updateScore, Score: ", actualScore);

    switch (difficulty) {
        case "easy":
            // console.log("easy");
            if (!hint) {
                scoreElement.textContent = parseInt(actualScore) + 1;
            }
            else scoreElement.textContent = parseInt(actualScore) - 1 >= 0 ? parseInt(actualScore) - 1 : 0;
            console.log(scoreElement.textContent, "aktuelle Punktzahl nach updateScore");
            break;
        case "middle":
            // console.log("middle");            
            if (!hint) {
                scoreElement.textContent = parseInt(actualScore) + 2;
            }
            else scoreElement.textContent = parseInt(actualScore) - 2 >= 0 ? parseInt(actualScore) - 2: 0;
            console.log(scoreElement.textContent, "aktuelle Punktzahl nach updateScore");
            break;
        case "difficult":
            // console.log("difficult");
            if (!hint) {
                scoreElement.textContent = parseInt(actualScore) + 3;
            }
            else scoreElement.textContent = parseInt(actualScore) - 3 >= 0 ? parseInt(actualScore) - 3 : 0;
            console.log(scoreElement.textContent, "aktuelle Punktzahl nach updateScore");
            break;
        default:
            console.log("Default?");
    }

}

function reduceScoreByTime() {
    const scoreElement = document.querySelector("#score");
    const actualScore = parseInt(scoreElement.textContent);
    console.log("Vor reduceScore, Score: ", actualScore);

    if (actualScore !== 0) {
        console.log("Reduktion!");
        switch (difficulty) {
            case "easy":
                console.log("easy");
                scoreElement.textContent = parseInt(actualScore) - 1;
                console.log(scoreElement.textContent, "aktuelle Punktzahl nach Reduktion");
                break;
            case "middle":
                console.log("middle");

                scoreElement.textContent = parseInt(actualScore) - 2;
                console.log(scoreElement.textContent, "aktuelle Punktzahl nach Reduktion");
                break;
            case "difficult":
                console.log("difficult");

                scoreElement.textContent = parseInt(actualScore) - 3;
                console.log(scoreElement.textContent, "aktuelle Punktzahl nach Reduktion");
                break;
            default:
                console.log("Default?");
        }
        document.querySelector("#score").classList.add("reducedScore");
        setTimeout(function () {
            
            document.querySelector("#score").classList.remove("reducedScore");
        }, 500);


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
    // console.log(numberOfBombs, "Bomben", numberOfNormalButtons, "andere");

    // console.log("number of uncovered buttons, nobombs", numberOfAllUncovered, noBomb);
    // console.log("length of bomb-list: ", allBombElements.length, "number of bombs", numberOfBombs);

    let counterWarnings = 0; //number of warnings on actual bombs
    for (let i = 0; i < numberOfBombs; i++) {
        if (allBombElements[i].classList.contains("warning")) {
            counterWarnings++;
        }
    }

    // console.log("warnings, bombs", counterWarnings, numberOfBombs);
    // console.log("alluncovered, nobombs", numberOfAllUncovered, noBomb);

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
        updateHighscore();


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
    updateHighscore();
    setUpGameBoard(size, difficulty);
}

function startInterval() {
    console.log("***************** START ********************");
    interval1 = setInterval(isWon, 1000);
    counterInterval1++;
    console.log(counterInterval1, "counterInterval1");
    interval2 = setInterval(reduceScoreByTime, 5000);
    counterInterval2++;
    console.log(counterInterval2, "counterInterval2");
    console.log("***************** START ENDE ********************");


}

function stopInterval() {
    console.log("***************** STop ********************");

    clearInterval(interval1);
    counterInterval1--;
    console.log(counterInterval1, "counterInterval1");
    clearInterval(interval2);
    counterInterval2--;
    console.log(counterInterval2, "counterInterval2");
    console.log("***************** STop Ende ********************");
}


function hint(event) {
    if (event.key === 'h' || event.key === 'H') {
        stopInterval(); //otherwise, isWon fires if hint gives last button
        let allButtons = document.querySelectorAll("button:not(#reset)");
        let allCovered = [];

        for (let b of allButtons) {
            if (b.classList.length === 0) {
                allCovered.push(b);
            }
        }
        // console.log("Hint, Anzahl der Möglichkeiten: ", allCovered.length);
        // console.dir(allCovered);

        let randNr = Math.floor(Math.random() * allCovered.length);
        // console.log("randNr", randNr);

        const hintButton = allCovered[randNr];

        hintButton.classList.add("uncovered");
        document.querySelector("#score").classList.add("reducedScore");

        // After 500 milliseconds (0.5 seconds), remove the 'highlight' class
        setTimeout(function () {
            hintButton.classList.remove("uncovered");
            document.querySelector("#score").classList.remove("reducedScore");
        }, 500);
        console.log("startInterval in Hint");
        startInterval();
        updateScore(true);
    }
}

function updateHighscore() {
    console.log("Highscore überprüfen.");
    const key = "Highscore_" + size + difficulty;
    console.log(key);

    const highscore = localStorage.getItem(key);
    const scoreElement = document.querySelector("#score");
    const actualScore = parseInt(scoreElement.textContent);
    const highscoreElement = document.querySelector("#highscore");


    if (actualScore > highscore) {
        localStorage.setItem(key, actualScore);
        console.log("Neuer Highscore erreicht! ", actualScore);
        highscoreElement.textContent = actualScore;
        highscoreElement.classList.add("newHighscore");
         // After 500 milliseconds (0.5 seconds), remove the "newHighscore" class
         setTimeout(function () {
            highscoreElement.classList.remove("newHighscore");
            
        }, 2000);
    }
}

function clearHighscore() {
    console.log("Highscore gelöscht!");
    localStorage.clear();
    document.querySelector("#highscore").textContent = 0;
}
