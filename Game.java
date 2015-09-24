import javax.swing.*;
import java.awt.*;

class Game extends JFrame {
  
  static TetrisLabel numScore = new TetrisLabel("0");
  
  Game() {
    World world = new World(); 
    this.add(world); 
    world.start(); 
    this.addKeyListener(world); 
    this.setSize(200, 400);
    this.setVisible(true); 
    this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    
    TetrisLabel scoreLabel = new TetrisLabel("Score: "); //Make a label
    
    
    JPanel scorePanel = new JPanel();
    scorePanel.add(scoreLabel);
    scorePanel.add(numScore);
    
    this.add(scorePanel);
    /*
    JPanel scorePanel = new JPanel(); // make a score panel (left aligned)
    scorePanel.add(scoreLabel);
    JPanel textPanel = new JPanel(new BorderLayout()); // the full panel
    textPanel.add(scorePanel, BorderLayout.WEST); 
    
    this.setContentPane(textPanel);
    */
    
    //this.add(panel); // add it to the frame(game)
    
    
    
    //JLabel scoreLabel = new JLabel();
    //panel.add(label);  // add the label to the panel (which is on the frame(Game)

  }
  
  public static void main(String[] args) {
    Game game = new Game();  
  }
  
  
  
}
