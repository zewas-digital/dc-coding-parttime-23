export default class Task {
//Validierung in function, die von Button ausgelöst wird; erst wenn
//Daten ok, an Konstruktor übergeben
  constructor() {

   

    this.taskName = what;
    this.taskDate = when;



  }


  formatDate(inputDate) {
    // Parse the input date
    const parsedDate = new Date(inputDate);
    // Format the date into dd.mm.yyyy, template literal
    //                                  Tag            Monat (Januar = 0)                          Jahr
    const formattedDate = `${parsedDate.getDate()}.${parsedDate.getMonth() + 1}.${parsedDate.getFullYear()}`;
    return formattedDate;
  }

  isValidDate(dateString) {
    // Regular expression to validate date format (dd.mm.yyyy)
    const datePattern = /^(0?[1-9]|[12][0-9]|3[01])\.(0?[1-9]|1[012])\.\d{4}$/;
    return datePattern.test(dateString);
  }



}