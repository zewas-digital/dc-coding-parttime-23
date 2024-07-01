<script>
    import { page } from "$app/stores";
    const teamname = $page.params.teamname;
</script>
<h1>Infos zu Team {teamname}</h1>


<a href="/">Home</a>



<h2><a href={`/myteams/${teamname}`}>Team {teamname}</a></h2>