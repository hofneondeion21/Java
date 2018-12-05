

Drop[] d = new Drop[10000]; ;
void setup() {
  size(1080,750);
  for (int i = 0; i<d.length; i++) {
    d[i] = new Drop();
  } // endae FOR
} // ednae setup


void draw() {
    background(0,0,0);
    for (int i = 0; i<d.length; i++) { 
      d[i].fall();
      d[i].show();
    }
  
} // endae draw
