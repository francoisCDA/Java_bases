import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

class Scratch {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Hello Word");
        System.out.println(asciiArt);
    }
}