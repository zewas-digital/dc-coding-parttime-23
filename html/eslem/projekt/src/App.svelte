<script>
    import { Router, Link, Route } from 'svelte-routing';
    import Login from './Login.svelte';
    import Register from './Register.svelte';
  </script>
  
  <main>
    <nav>
      <Link to="/login">Login</Link>
      <Link to="/register">Register</Link>
    </nav> 
    <Router>
      <Route path="/login" component={Login} />
      <Route path="/register" component={Register} />
    </Router> 
    <Login></Login>
    <Register/>

    console.log(Login);
    console.log(Register);

    console.log(Route);
  </main>
  
    <style>
    nav {
      display: flex;
      justify-content: space-around;
      margin-bottom: 1em;
    }
    nav a {
      text-decoration: none;
      color: #007BFF;
    }
    nav a:hover {
      text-decoration: underline;
    }
  </style>
