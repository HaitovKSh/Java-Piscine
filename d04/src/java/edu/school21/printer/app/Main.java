package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    private static char WHITE_PIXEL;
    private static char BLACK_PIXEL;
    private static BufferedImage image;

    public static void main(String[] args) {
        parseArgs(args);
        new Logic(WHITE_PIXEL, BLACK_PIXEL).printImage(image);
    }

    private static void parseArgs(String[] args)	{
        if (args.length < 3 || args[0].length() > 1 || args[1].length() > 1)	{
            System.err.println("Incorrect usage!\nUsage: program_name <char for white pixel> <char for black pixel> <full path to image>!");
            System.exit(-1);
        }
        WHITE_PIXEL = args[0].charAt(0);
        BLACK_PIXEL = args[1].charAt(0);
        try {
            image = ImageIO.read(new File(args[2]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
