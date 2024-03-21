document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Verhindert die tatsächliche Formularübermittlung
  
    // Fehlermeldungen zurücksetzen
    document.getElementById('nameError').textContent = '';
    document.getElementById('emailError').textContent = '';
    document.getElementById('passwordError').textContent = '';
  
    // Eingaben validieren
    let hasError = false;
  
    // Name Validierung
    if(document.getElementById('name').value.trim() === '') {
      document.getElementById('nameError').textContent = 'Bitte geben Sie Ihren Namen ein.';
      hasError = true;
    }
  
    // E-Mail Validierung mit RegEx
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(!emailRegex.test(document.getElementById('email').value)) {
      document.getElementById('emailError').textContent = 'Bitte geben Sie eine gültige E-Mail-Adresse ein.';
      hasError = true;
    }
  
    // Passwort Validierung auf Länge und Zeichen
    const passwordValue = document.getElementById('password').value;
    const passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$/; // Mindestens 8 Zeichen, 1 Großbuchstabe, 1 Kleinbuchstabe, 1 Zahl
    if(!passwordRegex.test(passwordValue)) {
      document.getElementById('passwordError').textContent = 'Das Passwort muss mindestens 8 Zeichen lang sein und mindestens einen Großbuchstaben, einen Kleinbuchstaben und eine Zahl enthalten.';
      hasError = true;
    }
  
    // Wenn keine Fehler vorliegen, Formulardaten verarbeiten
    if(!hasError) {
      console.log('Formulardaten sind gültig und können verarbeitet werden.');
      // Hier könnte Code stehen, um die Daten zu verarbeiten oder an einen Server zu senden
    }
  });
  