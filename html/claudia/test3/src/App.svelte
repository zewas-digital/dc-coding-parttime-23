<script>
    import ChildComponent from "./ChildComponent.svelte";

    export let name = "duasfada";
    let count = 0;

    $: tripled = count * 3;


    function increment(){
        count += 1;
    }
    $: console.log("Tripled", {tripled});
</script>

<style>
    h1 {
        color: blue;
        font-family: "Comic Sans MS"
    }
</style>

<h1>Hallo {name.toUpperCase()}!</h1>
<button on:click={increment}>
    Clicked {count}{count === 1 ? " Mal" : " Male"}
</button>   
<p>
        {count} * 3 ist {tripled}
</p>
<ChildComponent/>