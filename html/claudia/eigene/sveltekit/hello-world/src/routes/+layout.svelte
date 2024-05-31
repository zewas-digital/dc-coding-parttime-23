<header class="layout-header">Header</header>
<slot /> <!--Jede einzelne Seite im Pfad wird anstelle von Slot gerendert!-->
<footer class="layout-footer">Footer</footer>

<style>
    .layout-header{
        background-color: black;
        color: orange;
        text-align: center
    }

    .layout-footer{
        background-color: orange;
        color: black;
        text-align: center
    }
</style>