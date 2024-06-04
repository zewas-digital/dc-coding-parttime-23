<script lang="ts">
	import { goto } from "$app/navigation";


    
    function handleClick(): void{
       goto("/newteam");
    }
</script>

<button on:click={handleClick}>Neues Team anlegen!</button>
