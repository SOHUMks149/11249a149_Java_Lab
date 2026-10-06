import java.io.*;

class FileOperations {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        // Open and write
        FileWriter fw = new FileWriter(file);
        fw.write("Hello, Java File Operations!");
        fw.close();

        // Open and read
        FileReader fr = new FileReader(file);
        int ch;

        System.out.println("File Content:");
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}