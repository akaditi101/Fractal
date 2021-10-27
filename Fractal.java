//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class Fractal extends Canvas implements Runnable
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public Fractal()
    {
        setBackground(Color.WHITE);
    }

    public void paint( Graphics window )
    {
        window.setColor(Color.WHITE);
        window.fillRect(0, 0, WIDTH, HEIGHT);
        Color c = randomColor();
        drawSquare(window, (WIDTH / 3), (HEIGHT / 3), (WIDTH / 3), (HEIGHT / 3), 0, c);
    }

    public void drawSquare(Graphics window, int x1, int y1, int w, int h, int where, Color c)
    {
        if (w < 2 || h < 2) return; //Base Case
        window.setColor(c);
        window.fillRect(x1, y1, w, h); //Take one step
        if (where != 4)
            drawSquare(window, x1 -w/2, y1-h/2, w/2, h/2, 1, randomColor());
        if (where != 3)
            drawSquare(window, x1 +w, y1-h/2, w/2, h/2, 2, randomColor());
        if (where != 2)
        drawSquare(window, x1 -w/2, y1+h, w/2, h/2, 3,randomColor());
        if (where !=1)
            drawSquare(window, x1 +w, y1+h, w/2, h/2, 4,randomColor());
    }

    public Color randomColor()
    {
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        return new Color(r,g,b);
    }

    public void run()
    {
        try{
            Thread.currentThread().sleep(3);
        }
        catch(Exception e)
        {
        }
    }
}