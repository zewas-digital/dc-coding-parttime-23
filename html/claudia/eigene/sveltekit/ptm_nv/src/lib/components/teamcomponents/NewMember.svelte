

<!--
TODO: 
- Emailadressen angeben, welche boolean-Werte?
- wenn alle ausgefüllt: Button
- Unterscheiden, ob email schon existiert (dann nur Membership hinzufügen) oder nicht
- allen Emailadressen Infomail zusenden



<script lang="ts">
    let newEmail = "";
    let isAdmin: boolean;
    let isCoach: boolean;
    let isDriver: boolean;
</script>

<section>
    <h2>neue Mitglieder einladen:</h2>
    <input
        type="email"
        id="emailInput"
        placeholder="name@example.com"
        bind:value={newEmail}
    />
     <label for="emailInput" class="visually-hidden">neue Emailadresse!</label>
    <input type="checkbox" id="isAdmin" />
    <label for="isAdmin">Admin?</label>

    <input type="checkbox" id="isCoach" />
    <label for="isCoach">Coach?</label>

    <input type="checkbox" id="isDriver" />
    <label for="isDriver">Fahrer?</label>
</section>
-->

<script>
    import { onMount } from 'svelte';
  
    // Initialize the list with three empty email inputs
    let emails = ['', '', ''];
  
    // Function to handle adding a new email input if all are filled
    function checkAndAddEmail() {
      if (emails.every(email => email !== '')) {
        emails = [...emails, ''];
      }
    }
  
    // Function to handle form submission
    function handleSubmit() {
      console.log('Submitted emails:', emails);
      // Add your submission logic here, e.g., sending data to a server
    }
  </script>
  
  <div>
    {#each emails as email, index}
      <div>
        <input
          type="email"
          bind:value={emails[index]}
          on:input={checkAndAddEmail}
          placeholder="Enter email"
          required
        />
      </div>
    {/each}
  


    <button on:click={handleSubmit}>Submit</button>
  </div>
  
  <style>
    div {
      margin-bottom: 10px;
    }
  </style>
  



    <!-- /* .visually-hidden {
        position: absolute;
        width: 1px;
        height: 1px;
        margin: -1px;
        padding: 0;
        overflow: hidden;
        clip: rect(0, 0, 0, 0);
        border: 0;
    } */ -->


<!-- 
<script>
	export let emailAdresses;
</script>

<section>
	<h2>Liste der Emailadressen:</h2>
	{#each emailAdresses as email, index (email)}
		<p>{index + 1} {email}</p>
	{/each}
	
</section> -->
