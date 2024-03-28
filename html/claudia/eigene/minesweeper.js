
var size = 5;
let numberOfBombsLeft = size;

//Create all buttons:
for (var i = 0; i < size; i++) {
    for (var j = 0; j < size; j++) {
        document.write('<button id="' + i + j + '">' + 0 + '</button>');
    }
}

//Select all buttons:
var buttons = document.querySelectorAll("button");
//Give eventlistener to all buttons for first click:
for (var button of buttons) {
    // console.log(button.classList);
    button.addEventListener("click", firstClick);
}


document.getElementById("counter").textContent = numberOfBombsLeft;
console.log("Counter initialisiert", numberOfBombsLeft);

//what happens at first click?
function firstClick(event) {
    var numberOfBombs = size;
    var clickedID = event.target.id;
    console.log("geklickt", clickedID);
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
            button.textContent = "*";
            numberOfBombs--;
            // console.log("Bombe bei ", buttonId);
        }
    }

    // var buttons = document.querySelectorAll("button");
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
        // button.addEventListener("click", uncover); !!!!
        button.addEventListener("click", function (event) {
            if (event.button === 0) {
                uncover(event);
            }
        });

        button.addEventListener("contextmenu", function (event) {
            event.preventDefault();
            warning(event);
        });
    }
    //set clicked button to uncovered
    event.target.classList.add('uncovered');
    checkAround(event.target);

}


function warning(event) {
    var button = event.target;
    console.log("WARNING", button.classList);
    if (!button.classList.contains('uncovered')) {

        if (button.classList.contains('warning')) {
            button.classList.remove('warning');
            button.textContent = button.getAttribute('data-original-text');
            numberOfBombsLeft++;
        }
        else {
            // Store original text content in a data attribute
            button.setAttribute('data-original-text', button.textContent);
            button.classList.add('warning');
            button.textContent = "<!>";
            numberOfBombsLeft--;
        }
    }
    document.getElementById("counter").textContent = numberOfBombsLeft;
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
    console.log(button.classList);


    if (button.classList.contains("bomb")) {
        alert("VERLOREN!");
        var allBombs = document.querySelectorAll(".bomb");
        for (var b of allBombs) {
            console.dir(b);
            b.classList.add("exploded");
        }
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


const interval = setInterval(isWon, 1000);

function isWon() {
    if (numberOfBombsLeft === 0) {
        alert("GEWONNEN!");
        console.log("Win");
        clearInterval(interval);
        removeListeners();
    }
}


function removeListeners() {


    var buttons = document.querySelectorAll("button");
    //Give eventlistener to all buttons for first click:
    for (var button of buttons) {
        // console.dir(button);

        const listeners = button.cloneNode(true).listeners;
        console.dir(listeners);

        // Remove each listener one by one
        listeners.forEach(listener => {
            button.removeEventListener(listener.type, listener.listener);
            console.log('removed');
        });
    }
}


var dropdown = document.getElementById("dropdown");
var selectedValue = dropdown.value;

// You can now use the selectedValue in your JavaScript code
console.log("Selected value:", selectedValue);

/*
Größe auswählen
Schwierigkeit auswählen
Reset
"Gewonnen"-Nachricht
globale Variable möglich, Zugriff/Manipulation über mehrere Funktionen?
*/