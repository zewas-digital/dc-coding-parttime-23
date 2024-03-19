var buttonsContainer = document.getElementById('buttons');

console.log(buttonsContainer);
var count = 1;

function buttonDazu(){
    buttonsContainer.innerHTML +='<button onClick="buttonWeg(this)" class="minus">'+count+'</button>';
    console.log("Dazu");
    count++;
}

function buttonWeg(button){
    buttonsContainer.removeChild(button);
    console.log("Weg");
}