import Task from "Task.js";

export default class Tasklist {

    constructor(listOfTasks) {
        this.listOfTasks = listOfTasks;
    }

    addTaskToList(task) {
        const what = task.taskName;
        
        const when = task.date;

        //Annahme: Validierung bereits vorher

        console.log(toDoArray);
        buildList();
        arrayToLocalStorage(toDoArray);
    }
}

