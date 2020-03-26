
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adria
 */
public class MainFrame extends JFrame {

    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame() {
        super("My Drawing .Application");
        init();
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //create the components
        canvas = new DrawingPanel(this);
        configPanel=new ConfigPanel(this);
        controlPanel=new ControlPanel(this);
//arrange the components in the container (frame)
                //JFrame uses a BorderLayout by default
            add(canvas, CENTER); //this is BorderLayout.CENTER
            add(configPanel, NORTH);
            add(controlPanel, SOUTH);
            //invoke the layout manager
            pack();
}
}
