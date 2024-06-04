<script>
    let username = '';
    let password = '';
    let error = '';
  
    const handleLogin = async () => {
      
      if (username =  document.getElementById('username').value, password = document.getElementById('password').value) {
        alert('Login erfolgreich!');
        error = '';
      } else {
        error = 'Ungültiger Nutzername oder Passwort! Bitte versuchen Sie es nochmal';
      }
    };
  </script>
  
  <style>
    .error {
      color: red;
    }
  </style>
  
  <div>
    <h2>Login</h2>
    <form on:submit|preventDefault={handleLogin}>
      <div>
        <label for="username">Nutzername:</label>
        <input type="text" id="username" bind:value={username} />
      </div>
      <div>
        <label for="password">Passwort:</label>
        <input type="password" id="password" bind:value={password} />
      </div>
      <button type="submit">Login</button>
    </form>
    {#if error}
      <p class="error">{error}</p>
    {/if}
  </div>
  