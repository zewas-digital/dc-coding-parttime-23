 const canvas = document.querySelector('#gameCanvas');
 //returns an object with tools (properties and methods) for drawing:
 const ctx = canvas.getContext('2d');

 // Set initial position
 let x = canvas.width / 2;
 let y = canvas.height / 2;

 // Define movement speed
 const speed = 5;

 // Handle keyboard input
 document.addEventListener('keydown', function(event) {
     switch(event.key) {
         case 'ArrowLeft':
             x -= speed;
             break;
         case 'ArrowRight':
             x += speed;
             break;
         case 'ArrowUp':
             y -= speed;
             break;
         case 'ArrowDown':
             y += speed;
             break;
     }
     // Call draw function to update canvas
     draw();
 });

 // Draw function to update canvas
 function draw() {
     // Clear canvas
     ctx.clearRect(0, 0, canvas.width, canvas.height);

     // Draw player object
     ctx.beginPath();
    // arc(x, y, r, startangle, endangle) 
     ctx.arc(x, y, 10, 0, Math.PI * 2);
     ctx.fillStyle = 'blue';
     ctx.fill();
     ctx.closePath();
 }

 // Initial draw call
 draw();





//   // Zeichne das Gebäude (Rechteck)
//   ctx.fillStyle = "#FF0000"; // Rot
//   ctx.fillRect(100, 200, 200, 150); // x, y, width, height

//   // Zeichne das Dach (Dreieck)
//   ctx.beginPath();
//   ctx.moveTo(100, 200); // Startpunkt unten links
//   ctx.lineTo(200, 100); // Spitze des Dachs
//   ctx.lineTo(300, 200); // Endpunkt unten rechts
//   ctx.closePath();
//   ctx.fillStyle = "#008000"; // Grün
//   ctx.fill();

//   // Zeichne Fenster
//   ctx.fillStyle = "#0000FF"; // Blau
//   ctx.fillRect(130, 230, 40, 40); // Fenster links
//   ctx.fillRect(230, 230, 40, 40); // Fenster rechts

//   // Zeichne Tür
//   ctx.fillStyle = "#A52A2A"; // Braun
//   ctx.fillRect(190, 290, 40, 60); // Tür
//   ctx.clearRect(190, 290, 40, 60);      
//   */
          
//     ctx.fillStyle = "#FF69B4";
//   ctx.beginPath();
//   ctx.arc(200, 200, 50, 0, 2 * Math.PI, false);
//   ctx.fill();
                        
//   ctx.strokeStyle = "green";
//   ctx.beginPath();
//   ctx.moveTo(0,0);
//   ctx.lineTo(400,400);
  
//   ctx.stroke();
//   ctx.closePath();
  
//   ctx.strokeStyle = "cyan";
//   for (let i = 20; i < 400; i = i + 40){
//       ctx.beginPath();
//        ctx.moveTo(i, 0);
//     ctx.lineTo(i, 400);
//     ctx.closePath();
//     ctx.stroke();
//   }
               
//   ctx.fillStyle = "black";                   
//   for (let i = 0; i < 21; i++){
//       ctx.beginPath();
//       ctx.arc(20 * i, 200, 5, 0, 2 * Math.PI, true);
//     ctx.fill();
//   }
  
//  /*
//  ctx.strokeStyle = "black";                   
//   ctx.strokeRect(200, 200, 10, 10);
//   ctx.stroke();
//   ctx.closePath();
// */
  
//  ctx.strokeStyle = "red" 
//  for (let i = 0; i <= 400; i += 20){
//       ctx.beginPath();
//       ctx.strokeRect(i, i, 400 - 2 * i, 400 - 2 * i);
//     ctx.stroke();
//     ctx.closePath();
//   }