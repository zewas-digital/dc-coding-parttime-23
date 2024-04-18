'use strict';
export default class aufgabenClass {
    constructor(taskName, taskDate) {
        this.taskName = taskName;
        this.taskDate = taskDate;
    }
    toString() {
        return this.taskName;
    }
    setTaskName(newTaskName) {
        this.taskName = newTaskName;
    }
}
