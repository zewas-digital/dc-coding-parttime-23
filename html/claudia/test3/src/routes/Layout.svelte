<!---->
<script>
  // import Navigation from "../components/Navigation.svelte";
  import Page1 from "./routes/Page1.svelte";
  import Page2 from "./routes/Page2.svelte";
  import Page3 from "./routes/Page3.svelte";

  let currentPage = "Page1";
</script>

<div>
  <!-- <Navigation /> -->

  {#if $currentPage === "Page1"}
    <Page1 />
  {:else if $currentPage === "Page2"}
    <Page2 />
    {:else }
    <Page3></Page3>
  {/if}
  <slot />
</div>

<!-- Make sure your Layout.svelte component contains a <slot /> to allow content to be injected into it:


Now, your Start or Login component will be wrapped by the Layout component, ensuring consistent layout across your application. -->


<style>
</style>
