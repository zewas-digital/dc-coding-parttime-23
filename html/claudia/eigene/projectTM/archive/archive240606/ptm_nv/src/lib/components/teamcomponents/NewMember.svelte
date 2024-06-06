<script lang="ts">
    let newEmail = "";
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
    <label for="isAdmin">Adminrechte?</label>
</section>

<style>
    .visually-hidden {
        position: absolute;
        width: 1px;
        height: 1px;
        margin: -1px;
        padding: 0;
        overflow: hidden;
        clip: rect(0, 0, 0, 0);
        border: 0;
    }
</style>
