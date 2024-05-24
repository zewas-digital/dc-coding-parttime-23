<script>
    let email = '';
    let password = '';
    let message = '';
  
    async function handleSubmit(event) {
      event.preventDefault();
      message = '';
  
      const response = await fetch('http://localhost:${PORT}/Register', {
       method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({ email, password })
       });
  
      const result = await response.json();
  
      if (response.ok) {
        message = 'Registration successful';
      } else {
        message = result.message || 'Registration failed';
      }
    }
  </script>
  
  <main>
    <h1>Register</h1>
    <form on:submit={handleSubmit}>
      <div>
        <label for="email">Email:</label>
        <input type="email" id="email" bind:value={email} required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" bind:value={password} required />
      </div>
      {#if message}
        <p class={message === 'Registration successful' ? 'success' : 'error'}>{message}</p>
      {/if}
      <button type="submit">Register</button>
    </form>
  </main>
  
  <style>
    /* Add your CSS styling here, similar to Login.svelte */
    .success {
      color: green;
    }
    .error {
      color: red;
    }
  </style>