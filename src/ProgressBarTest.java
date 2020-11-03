import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

/* This program demonstrates the use of a progress bar to monitor the
   progress of a SwingWorker activity. */

public class ProgressBarTest
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new ProgressBarFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

/* A frame that contains a button to launch a simulated activity, a
   progress bar, and a text area for the activity output. */



