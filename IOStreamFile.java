import java.io.*;

class IOStreamFile {
    public static void main(String[] args) throws IOException {

        // Writing using IO stream
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("data.txt"));

        bw.write("Java IO Streams");
        bw.newLine();
        bw.write("File operations are easy.");
        bw.close();

        // Reading using IO stream
        BufferedReader br = new BufferedReader(
                new FileReader("data.txt"));

        String line;
        System.out.println("File Content:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}