function outputData(event) {
  event.preventDefault();
  console.log(event);
}

document
  .getElementById("test")
  .addEventListener("submit", (event) => outputData(event));

document.getElementById("test").addEventListener("submit", outputData);

function getData() {}

var getData = () => {};
