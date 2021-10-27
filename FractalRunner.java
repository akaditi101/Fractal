//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class FractalRunner extends JFrame
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public FractalRunner()
    {
        super("Fractal Runner");

        setSize(WIDTH+50,HEIGHT+50);

        getContentPane().add(new Fractal());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String args[] )
    {
        FractalRunner run = new FractalRunner();
    }
}