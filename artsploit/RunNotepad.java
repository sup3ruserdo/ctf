package artsploit;
import java.io.IOException;

public class RunNotepad {

    public static void main(String[] args) {
        try {
            // Open gedit text editor with a specific file
            Process process = new ProcessBuilder("gedit", "/etc/passwd").start();

            // Optional: Wait for the process to complete
            int exitCode = process.waitFor();
            System.out.println("Notepad process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
