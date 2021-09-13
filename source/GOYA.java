import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GOYA extends PApplet {


boolean controlPulsado = false;
boolean shiftPulsado = false; 
PImage goma;
PImage lapiz;
PImage nuevo;
PImage logo;
PImage grosor_5;
PImage grosor_10;
PImage grosor_15;
PImage grosor_20;
PImage grosor_5_gris;
PImage grosor_10_gris;
PImage grosor_15_gris;
PImage grosor_20_gris;
PImage goma_gris;
PImage lapiz_gris;
PImage guardar;
float r = 0;
float g = 0;
float b = 0;
float r_fondo = 255;
float g_fondo = 255;
float b_fondo = 255;
boolean grosorFondo5 = true;
boolean grosorFondo10 = false;
boolean grosorFondo15 = false;
boolean grosorFondo20 = false;
boolean lapizGris = true;
PImage mouseCursor;
boolean activar_goma = false;
int grosor = 5;
int nimg = 0;

int counter; 


Undo undo;
public void setup() {
mouseCursor = loadImage("images/lapiz.png");
 
background(r_fondo, g_fondo, b_fondo);

fill(255);
  undo = new Undo(10);
}
  





public void mouseReleased() {
  // Cada vez que se suelta el botón del ratón se añade una "captura" del estado del dibujo.
  undo.takeSnapshot();
}



public void draw() {

  if (grosorFondo10 == true){
    
  }

  if (grosorFondo15 == true){
    
  }

  if (grosorFondo20 == true){
    
  }

  if (mouseX<1100){
    cursor(mouseCursor, 0, 0); 
  }else{
    cursor(HAND);
  }
lapiz = loadImage("images/lapiz_simbolo.png");
goma = loadImage("images/goma_simbolo.png");
nuevo = loadImage("images/nuevo.png");
logo = loadImage("images/logo.jpg");
grosor_5 = loadImage("images/grosor_5.jpg");
grosor_10 = loadImage("images/grosor_10.jpg");
grosor_15 = loadImage("images/grosor_15.jpg");
grosor_20 = loadImage("images/grosor_20.jpg");
grosor_5_gris = loadImage("images/grosor_5_gris.jpg");
grosor_10_gris = loadImage("images/grosor_10_gris.jpg");
grosor_15_gris = loadImage("images/grosor_15_gris.jpg");
grosor_20_gris = loadImage("images/grosor_20_gris.jpg");
lapiz_gris = loadImage("images/lapiz_simbolo_gris.png");
goma_gris = loadImage("images/goma_simbolo_gris.png");
guardar = loadImage("images/guardar.png");
fill(0xffA0A0A0);  
noStroke();
rect(1098, 0, 84, 650); 

      
println(mouseX, mouseY);
  //Cursor//
  
  stroke(r,g,b);
  strokeWeight(grosor);
  if(mousePressed && (mouseButton == LEFT)) line(mouseX, mouseY, pmouseX, pmouseY);
  
  
//.........................................................................//  

//Selector de colores//
  pushStyle();
  strokeWeight(5);
  stroke(0);
 
  fill(0); //negro
  rect(1100, 200, 40, 40);
  if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 240) && (mouseY > 200)){
    if (activar_goma == true){
      stroke(255);
    }else{
    r = 0; g = 0; b = 0;  
    }
  }

  fill(255); //blanco
  rect(1100, 240, 40, 40);
  if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 280) && (mouseY > 240)){
        if (activar_goma == true){
          stroke(255);
        }else{
          r = 255; g = 255; b = 255; 
    }
  }

  fill(0xff0000ff); //azul
  rect(1100, 280, 40, 40);
  if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 320) && (mouseY > 280)){
    if (activar_goma == true){
      stroke(255);
    }else{    
      r = 0; g = 0; b = 255; 
    }
  } 

  fill(0xffff0000); //rojo
  rect(1100, 320, 40, 40);
    if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 360) && (mouseY > 320)){
      if (activar_goma == true){
        stroke(255);
      }else{      
        r = 255; g = 0; b = 0; 
      }
  }

  fill(0xffffe900); //amarillo
  rect(1100, 360, 40, 40);
    if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 400) && (mouseY > 360)){
        if (activar_goma == true){
          stroke(255);
    }else{  
      r = 255; g = 233; b = 0; 
    }
  }

  fill(0xffFF8000); //naranja
  rect(1100, 400, 40, 40);
  if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 440) && (mouseY > 400)){
     if (activar_goma == true){
      stroke(255);
    }else{
      r = 255; g = 128; b = 0; 
    }
  }

  fill(0xff008f39); //verde
  rect(1140, 200, 40, 40);
  if((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 240) && (mouseY > 200)){
    if (activar_goma == true){
      stroke(255);
    }else{
      r = 0; g = 153; b = 47; 
    }
  }

  fill(0xff572364); //morado
  rect(1140, 240, 40, 40);
  if((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 280) && (mouseY > 240)){
    if (activar_goma == true){
      stroke(255);
    }else{
      r = 87; g = 35; b = 100; 
    }
  }

  fill(0xffff007f); //rosa
  rect(1140, 280, 40, 40);
  if((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 320) && (mouseY > 280)){
    if (activar_goma == true){
      stroke(255);
    }else{
      r = 255; g = 0; b = 128; 
    }
  }

  fill(0xff80ff00); //verde claro
  rect(1140, 320, 40, 40);
  if((mousePressed) && (mouseButton == LEFT) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 360) && (mouseY > 320)){
    if (activar_goma == true){
      stroke(255);
    }else{
      r = 128; g = 255; b = 0; 
    }
  }

  fill(0xff00ffff); //azul claro
  rect(1140, 360, 40, 40);
  if((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 400) && (mouseY > 360)){
    if (activar_goma == true){
      stroke(255);
    }else{
      r = 51; g = 255; b = 255; 
    }
    
  }

  fill(0xff808080); //gris
  rect(1140, 400, 40, 40);
  if((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 440) && (mouseY > 400)){
    if (activar_goma == true){
      stroke(255);
    }else{
      r = 155; g = 155; b = 155; 
    }
  }

  fill(r, g, b);
  rect(1100, 440, 80, 40);


  //Botones varios//
  
  fill(255);                      //goma de borrar
  rect(1100, 160, 40, 40);
  image(goma, 1103, 163, 35, 35); 
  if((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 200) && (mouseY > 160)){
    r = r_fondo; g = g_fondo; b = b_fondo; 
    mouseCursor = loadImage("images/goma.png");
    activar_goma = true;
  }

  
  fill(255);                    //lápiz
  rect(1140, 160, 40, 40);
  image(lapiz, 1142, 162, 36, 36);
  if((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 200) && (mouseY > 160)){
    pushStyle();
    r = 0; g = 0; b = 0;
    activar_goma = false;
    lapizGris = true;
    mouseCursor = loadImage("images/lapiz.png");
    
  }
  

  fill(255);                    //nuevo
  rect(1100, 120, 40, 40);
  image(nuevo, 1104, 125, 30, 30);
  if ((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 160) && (mouseY > 120)){
    setup();
    

  }

  fill(255);                    //guardar
  rect(1140, 120, 40, 40);
  image(guardar, 1145, 125, 30, 30);
  if ((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 160) && (mouseY > 120)){
    PImage partialSave = get(0,0,1098,650);
    nimg++;
    partialSave.save("drawings/draw"+nimg+".jpg");

  }
  
 
  rect(1100, 484, 40, 40); //botón grosor 5
  image(grosor_5, 1100, 484, 40, 40);
  if ((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 520) && mouseY > 480){
    grosor = 5;
    grosorFondo5 = true;
    grosorFondo10 = false;
    grosorFondo15 = false;
    grosorFondo20 = false;
  }

  rect(1140, 484, 40, 40); //botón grosor 10
  image(grosor_10, 1140, 484, 40, 40);
  if ((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 520) && mouseY > 480){
    grosor = 10;
    grosorFondo5 = false;
    grosorFondo10 = true;
    grosorFondo15 = false;
    grosorFondo20 = false;
  }

  rect(1100, 524, 40, 40); //botón grosor 15
  image(grosor_15, 1100, 524, 40, 40);
  if ((mousePressed) && (mouseX < 1140) && (mouseX > 1100) && (mouseY < 564) && mouseY > 524){
    grosor = 15;
    grosorFondo5 = false;
    grosorFondo10 = false;
    grosorFondo15 = true;
    grosorFondo20 = false;
  }

  rect(1140, 524, 40, 40); //botón grosor 20
  image(grosor_20, 1140, 524, 40, 40);
  if ((mousePressed) && (mouseX < 1180) && (mouseX > 1140) && (mouseY < 564) && mouseY > 524){
    grosor = 20;
    grosorFondo5 = false;
    grosorFondo10 = false;
    grosorFondo15 = false;
    grosorFondo20 = true;
  }

  if (lapizGris == true){
    image(lapiz_gris, 1142, 162, 36, 36);

  }

  if (activar_goma == true){
    image(goma_gris, 1103, 163, 35, 35);
    lapizGris = false;
  }

  
  if (grosorFondo5 == true){
  image(grosor_5_gris, 1100, 484, 38, 38);

  }

  if (grosorFondo10 == true){
  image(grosor_10_gris, 1140, 484, 40, 38);

  }

  if (grosorFondo15 == true){
  image(grosor_15_gris, 1100, 524, 38, 40);

  }

  if (grosorFondo20 == true){
  image(grosor_20_gris, 1140, 524, 40, 40);

  }

  image(logo, 1100, 35, 80, 40);

  popStyle();
 

}
  



public void keyPressed() {
    if (keyCode == 78){
      setup(); 
    }


  if (key == CODED) {
    if (keyCode == CONTROL) 
      controlPulsado = true;
    if (keyCode == SHIFT)
      shiftPulsado = true;
    return;
  } 
  // Se comprueba si se pulsa Ctrl + Z, Ctrl + S o Ctrl + Shift + Z
  if (controlPulsado) {
    if (keyCode == 83) {  //83 es la S
      PImage partialSave = get(0,0,1098,650);
      nimg++;
      partialSave.save("drawings/draw"+nimg+".jpg");
    }
    if (keyCode == 90) { //90 es la Z
      if (shiftPulsado)
        undo.redo();
      else
        undo.undo();
    }
    return;
  }   
}    
    
public void keyReleased() {
  // Cuando se suelta Ctrl y Shift se actualiza el estado de las variables a false.
  if (key == CODED) {
    if (keyCode == CONTROL) 
      controlPulsado = false;
    if (keyCode == SHIFT)
      shiftPulsado = false;
  }
}

class Undo {
  // Número de pasos a hacer y dehacer. 
  int undoSteps=0, redoSteps=0;  
  CircImgCollection images;
  
  Undo(int levels) {
    images = new CircImgCollection(levels);
  }

  public void takeSnapshot() {
    undoSteps = min(undoSteps+1, images.amount-1);
    // Cada vez que se dibuja una línea se suma 1 a la variable de pasos a deshacer.
    redoSteps = 0;
    images.next();
    images.capture();
  }
  public void undo() { 
    if(undoSteps > 0) { //si hay pasos que se han deshecho, se suman a los que se pueden rehacer y se restan a lo que se puden deshacer pues ya se han desecho.
      undoSteps--;
      redoSteps++;
      images.prev(); //se carga la captura anterior
      images.show();
    }
  }
  public void redo() {
    if(redoSteps > 0) { //de la misma forma, si tenemos pasos que hemos rehecho, se restan de los que se pueden rehacer, y se suman a los que se pueden deshacer.
      undoSteps++;
      redoSteps--;
      images.next(); //se carga la captura deshecha anteriormente
      images.show();
    }
  }
}


class CircImgCollection {
  int amount, current;
  PImage[] img;
  CircImgCollection(int amountOfImages) {
    amount = amountOfImages;

    // Se inician todas las copias de las imágenes
    img = new PImage[amount];
    for (int i=0; i<amount; i++) {
      img[i] = createImage(width, height, RGB);
      img[i] = get();
    }
  }
  public void next() {
    current = (current + 1) % amount;
  }
  public void prev() {
    current = (current - 1 + amount) % amount;
  }
  public void capture() {
    img[current] = get();
  }
  public void show() {
    image(img[current], 0, 0);
  }
}
  
  
  

  
  
  
  public void settings() { 
size(1182, 650); 
smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GOYA" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
