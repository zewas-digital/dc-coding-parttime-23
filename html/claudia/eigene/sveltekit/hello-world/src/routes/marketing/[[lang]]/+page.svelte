<script>
    import { page } from '$app/stores';
	console.log($page.params);
    
    const { lang = "de"} = $page.params; //möglich, mehrere Parameter herauszuziehen!
    //           ^^^^^^^ default: daher marketing/*** optional!
    // console.log("lang: ", lang);
    
    const greetings = {
        en: "Hello!",
        es: "Hola, che tal?",
        de: "Halloballo",
        fr: "Bonsoir."
    }
// console.log(greetings["en"], greetings.en);
    const greeting = greetings[lang];
</script>

<h1>{greeting}</h1>