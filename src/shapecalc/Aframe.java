package shapecalc;

import javax.swing.*;  // to use JFrame.

/**
 * Minimal reusable code to create a JFrame with a title and a window event
 * listener to call on System.exit() and force termination of the main
 * application that creates this JFrame.
 * @author D.X. Nguyen
 */
public abstract class AFrame extends JFrame {

    public AFrame(String title) {
        // Always call the superclass's constuctor:
        super(title);

        /**
        * Add an anonymous WindowAdapter event handler to call System.exit to
        * force termination of the main application when the Frame closes.
        * Without it, the main application will still be running even after
        * the frame is closed.
        * For illustration purpose, we use the full package name for
        * WindowAdpater and WindowEvent.
        * We could have imported java.awt.event.* and avoid using the full
        * package names.
        */
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.out.println(e);  // For illustration purpose only.
                System.exit(0);
            }
        });

        /**
        * Subclasses are to do whatever is necessary to initialize the frame.
        * CAVEAT: At run-time, when a concrete descendant class of AFrame is
        * created, only the (concrete) initialize() method of this descendant
        * class is called.
        */
        initialize();
    }

    /**
     * Relegates to subclasses the responsibility to initialize the system to
     * a well-defined state.
     */
    protected abstract void initialize();
}