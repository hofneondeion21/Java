class Drop {
  float x = random(width), y = random(-200,-100), yspeed = random(0,20),z = random(0,20), length = map(z, 0, 20, 4,10);
  void fall() {
    
    y = y +yspeed;
    //yspeed = yspeed + 0.2;
    
    if (y > height) {
      y = random(-200,-100);
      yspeed = map(z,0,20,4,10);
      
    } // endae IF
    
  } // endae fall
  
  
  void show() {
    float thick = map(z,0,20,1,3);
    strokeWeight(thick);
    stroke(0,255,255);
    line(x,y,x,y+length);
    
    
} // endae show

} // endae CLASS
