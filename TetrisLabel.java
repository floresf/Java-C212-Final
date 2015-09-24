import javax.swing.*;

class TetrisLabel extends JLabel {
  
  TetrisLabel(String text) {
    super(text);
  }
  
  void addValue(int val) {
    setText(Integer.toString((Integer.parseInt(getText())) + val));
  }
}
