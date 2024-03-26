"use strict";


// function validate(){
//     var username = document.getElementById('username').value;

//     console.log('Username: ', username);
//     if (username.length <= 2){
//         alert('Wähl einen längeren Usernamen!');
//     }
// }

// function validate(eingabe) {
//     var wert = eingabe.value;
//     switch (wert.type) {
//         case "text":
//             console.log("Text");
//             break;
//         case "email":
//             console.log("Email");
//             break;
//         case "password":
//             console.log("Passwort");
//             break;
//         default:
//             console.log("Fehler!");
//     }
// }



function validate(form) {

    // var username, email, password;//???
    // console.dir(form);

    for (var i = 0; i < form.elements.length; i++) {
        var element = form.elements[i];
        console.log(element);
        switch (element.type) {
            case "text":
                console.log("Text");
                break;

            case "email":
                console.log("Email");
                break;
            case "password":
                console.log("Passwort");
                break;
                default:
                    break;


        }
    }

    // If everything is valid, submit the form
    // form.submit();
}

