import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;

public class JTabbedPaneFrame extends JFrame
{
  public JTabbedPaneFrame()
  {
    super("Steve's JTabbedPane Demo");

    //create the tabbed pane  hold tab formatting
    JTabbedPane tabPane = new JTabbedPane();

    //add first tab
    JLabel label1 =  new JLabel("This is the big area called panel one" , SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    panel1.add(label1);
    tabPane.addTab("Tab One", null, panel1, "FirstPanel");


    //add second tab
    JLabel label2 =  new JLabel("You can add other stuff to this tabbed panel" , SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    panel2.add(label2);
    tabPane.addTab("Tab Two", null, panel2, "SecondPanel");

    //add third tab
    JLabel label3 =  new JLabel("Let's do something new here", SwingConstants.CENTER);
    JPanel panel3 = new JPanel();
    panel3.add(label3);
    panel3.add(new JButton("North"));
    panel3.add(new JButton("South"));
    tabPane.addTab("Tab Three", null, panel3, "ThirdPanel");//keep the add below all the tab's formatting

    //keep this at the bottom
    add(tabPane);

  }//end defaults and only constructor
}//end class