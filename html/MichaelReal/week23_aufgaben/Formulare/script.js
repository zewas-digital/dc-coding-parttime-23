document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Fehlermeldungen zurücksetzten
    document.getElementById('nameError').textContent = '';
    document.getElementById('emailError').textContent = '';
    document.getElementById('passwordError').textContent = '';

     // Eingaben validieren
  let hasError = false;
  if(document.getElementById('name').value.trim() === '') {
    document.getElementById('nameError').textContent = 'Bitte geben Sie Ihren Namen ein.';
    hasError = true;
  }
  if(!document.getElementById('email').value.includes('@')) {
    document.getElementById('emailError').textContent = 'Bitte geben Sie eine gültige E-Mail-Adresse ein.';
    hasError = true;
  }
  if(document.getElementById('password').value.length < 6) {
    document.getElementById('passwordError').textContent = 'Das Passwort muss mindestens 6 Zeichen lang sein.';
    hasError = true;
  }

  // Wenn keine Fehler vorliegen, Formulardaten verarbeiten
  if(!hasError) {
    console.log('Formulardaten sind gültig und können verarbeitet werden.');
    // Hier könnte Code stehen, um die Daten zu verarbeiten oder an einen Server zu senden
  }
});