import App from './App.svelte';

const app = new App({
	target: document.body,
	props: {
		appName: 'projectTM'
	}
});

export default app;