package shapecalc;

import javax.swing.*;

public abstract class AFrame extends JFrame {



    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public AFrame(String title) {

        super(title);


        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent e) {

                System.out.println(e);  // For illustration purpose only.

                System.exit(0);

            }

        });


        initialize();

    }


    protected abstract void initialize();

}