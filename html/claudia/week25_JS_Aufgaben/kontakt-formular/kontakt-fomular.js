var kontakt = {};

function verarbeiten(){
    // console.log("TEST!");
    kontakt.name = document.getElementById('name');
    console.log('eingegebener Name: ', kontakt.name.value);
    kontakt.email = document.getElementById('email');
    console.log('eingegebene Mail: ', kontakt.email.value);
    kontakt.nachricht = document.getElementById('nachricht');
    console.log('eingegebener Text: ', kontakt.nachricht.value);

    console.dir(kontakt);
    
    return false;
}


