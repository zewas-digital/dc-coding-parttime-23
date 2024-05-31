<script>
    export let productid = 100;
</script>

<a href="/">Home</a>
<h1>Produktliste</h1>
<h1><a href="products/1">Produkt 1</a></h1>
<h2>Produkt 2</h2>
<h2>Produkt 3</h2>

<h2><a href={`/products/${productid}`}>Produkt {productid}</a></h2>
