package lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Div extends Thread {

    String dstFolder ="./dst";
    File[] files;
    public Div(File[] files)
    {
        this.files=files;
    }
    @Override
    public void run(){
        try

    {
        if (!Files.exists(Paths.get(dstFolder))) {
            Files.createDirectories(Paths.get(dstFolder));
        }

        for (File file : files) {
            if(file.getName().equals("n.txt"))
                continue;
            BufferedImage image = ImageIO.read(file);
            if (image == null) {
                continue;
            }

            int newWidth = image.getWidth() / 2;
            if(newWidth ==0)
                continue;
            int newHeight = (int) Math.round(
                    image.getHeight() / (image.getWidth() / (double) newWidth)
            );
            BufferedImage newImage = new BufferedImage(
                    newWidth, newHeight, BufferedImage.TYPE_INT_RGB
            );

            int widthStep = image.getWidth() / newWidth;
            int heightStep = image.getHeight() / newHeight;

            for (int x = 0; x < newWidth; x++) {
                for (int y = 0; y < newHeight; y++) {
                    int rgb = image.getRGB(x * widthStep, y * heightStep);
                    newImage.setRGB(x, y, rgb);
                }
            }

            File newFile = new File(dstFolder + "/" + file.getName());
            ImageIO.write(newImage, "jpg", newFile);
        }
    }
        catch(
    Exception ex)

    {
        ex.printStackTrace();
    }
    }
}
