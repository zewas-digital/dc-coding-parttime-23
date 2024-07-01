let showMessage: boolean = false; // To display message
const duration: number = 3000; // In milliseconds


function setShowMessage(value: boolean): void {
    showMessage = value;
}


export function showTemporaryMessage(setShowMessage: (value: boolean) => void, duration: number): void {
    setShowMessage(true);
    setTimeout(() => {
        setShowMessage(false);
    }, duration);
}


/*

# Projektstruktur kann diese sein:
├── src/
│   ├── assets/
│   ├── components/
│   ├── actions/
│   ├── stores/
│   ├── utils/
│   ├── App.svelte
## Komponenten wie besprochen noch organisieren:
src/components/
├── Button.svelte
├── Header.svelte
└── Todo/
    ├── TodoList.svelte
    └── TodoItem.svelte
## Actions für wiederverwendbare/mehrfach verwendete JS-Funktionen
src/actions/
└── clickOutside.js
## stores/ oder dann context/
für den globalen Speicher
## Utils für Hilfsfunktionen und -Scripts
src/utils/
└── dateFormatter.js
*/