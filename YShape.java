import java.awt.*; 

class YShape extends Shape {
  YShape(int row, int column, World world) {
    super(row, column, world); 
    this.color = new Color(30, 170, 204);
    this.rotations = new int[][][] {
      { { 1, 0, 1}, 
        { 0, 1, 0}, 
        { 0, 1, 0}}, //-------------------
      { { 0, 0, 1}, 
        { 1, 1, 0}, 
        { 0, 0, 1}}, //-------------------
      { { 0, 1, 0}, 
        { 0, 1, 0}, 
        { 1, 0, 1}}, //-------------------
      { { 1, 0, 0}, 
        { 0, 1, 1}, 
        { 1, 0, 0}}  //------------------- 
    };
    this.squares = createMap(row, column); 
  }
  public String toString() {
    return this.squares + ": " + super.toString();  
  }
  
}
