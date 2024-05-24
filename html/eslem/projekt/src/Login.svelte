<script>
    let email = '';
    let password = '';
    let error = '';
  
    async function handleSubmit(event) {
      event.preventDefault();
      error = '';
  
       const response = await fetch('http://localhost:${PORT}/Login', {
         method: 'POST',
        headers: {
           'Content-Type': 'application/json'
        },
      body: JSON.stringify({ email, password })
       });
       const result = await response.json();

        if (response.ok) {
        // Handle successful login (e.g., store token, redirect)
        console.log('Login successful', result);
        } else {
        error = result.message || 'Login failed';
        }
        }
        </script>
<main>
    <h1>Login</h1>
    <form on:submit={handleSubmit}>
      <div>
        <label for="email">Email:</label>
        <input type="email" id="email" bind:value={email} required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input type="password" id="password" bind:value={password} required />
      </div>
      {#if error}
        <p class="error">{error}</p>
      {/if}
      <button type="submit">Login</button>
    </form>
  </main>

  <style>
    main {
      max-width: 400px;
      margin: auto;
      padding: 1em;
      background: #f9f9f9;
      border-radius: 5px;
    }
    div {
      margin-bottom: 1em;
    }
    label {
      margin-bottom: .5em;
      color: #333333;
    }
    input {
      border: 1px solid #cccccc;
      padding: .5em;
      font-size: 1em;
      border-radius: 3px;
      width: 100%;
    }
    .error {
      color: red;
    }
    button {
      padding: 0.7em;
      color: #fff;
      background-color: #007BFF;
      border: none;
      border-radius: 3px;
      cursor: pointer;
    }
    button:hover {
      background-color: #0056b3;
    }
  </style>