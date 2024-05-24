
'use strict'

export default class aufgabenClass {

  taskName: String;
  taskDate: Date;

  constructor(taskName: String, taskDate: Date) {
    this.taskName = taskName;
    this.taskDate = taskDate;
  }

  toString() {
    return this.taskName;
  }


  public setTaskName(newTaskName: String) {

    this.taskName = newTaskName;
  }




}