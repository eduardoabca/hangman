package hangman.io;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.isNull;

public final class Output {
    private static final PrintWriter OUT = new PrintWriter(new OutputStreamWriter(System.out, UTF_8), true);

    private Output() {}

    public static void writeToConsole() {
        writeToConsole(null, true);
    }

    public static void writeToConsole(Object object) {
        writeToConsole(object, true);
    }

    public static void writeToConsole(Object object, boolean newLine) {
        if (isNull(object)) {
            OUT.println();
        } else if (newLine) {
            OUT.println(object);
        } else {
            OUT.format("%s", object);
        }
    }
}
