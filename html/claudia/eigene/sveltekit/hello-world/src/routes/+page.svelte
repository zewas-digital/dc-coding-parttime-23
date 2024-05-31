<script lang="ts">
    import { goto } from "$app/navigation";
    const handleClick = () => {
        console.log("Bestellung aufgeben!");
        goto("/products");
    }

</script>
<h1>Halloballo, Startseite!</h1>
 <a href="/blog">Zum Blog</a>
<a href="/products">Produkte</a>

<button on:click={handleClick}>Jetzt bestellen!</button>