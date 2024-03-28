let werte = ['A', 'B', 'C'];

for (var i = 0; i < werte.length; i++){
    document.write('<button>' + werte[i] + '</button>');
}

function dontClick(){
    document.write('WARUM!');
    console.log('WARUM?');
}

for(var button of buttons) {
    button.addEventListener("click", buttonClicked);
}


function buttonClicked(event) {
    var button = event.target;
    console.log("Button clicked", button.textContent);

    button.className = button.className == 'red' ? 'green' : 'red';
}
// var buttons = document.querySelectorAll("button");


// for(var i in buttons) {
//     console.log(i, buttons[i]);
//     buttons[i].addEventListener("click", buttonClicked);
// }
// for (var i = 0; i < buttons.length; i++) {
//     var button = buttons[i];
//     button.addEventListener("click", buttonClicked);
//     console.log(i, buttons[i]);
// }

// function buttonClicked(event) {
//     var button = event.target;
//     console.log("Button clicked", button.textContent);

//     button.className = button.className == 'red' ? 'green' : 'red';
// }

// for (var i = 9; i >=0; i--){
//     document.write('<button>Hallo</button>')
// }

// var ziffern = [7, 8, 9, 4, 5, 6, 1, 2, 3, 0, ','];
// for (var ziffer of ziffern) { // for each
//     document.write('<button>' + ziffer + '</button>');
// }