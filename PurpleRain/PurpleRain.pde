

Drop[] d = new Drop[2500]; ;
void setup() {
  size(750,540);
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
