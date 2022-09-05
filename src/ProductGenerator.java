import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ProductGenerator {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        String name;
        String description;
        double cost;

        String fileName = "";
        boolean more = true;
        Scanner fileNamein = new Scanner(System.in);


        ArrayList<Product> Items = new ArrayList<Product>();
        do {
            Scanner in = new Scanner(System.in);

            name = SafeInput.getNonZeroLenString(in, "Please enter product Name");
            description = SafeInput.getNonZeroLenString(in, "Please enter product description");
            cost = SafeInput.getDouble(in, "Please enter product cost");

            more = SafeInput.getYNConfirm(in, "Would you like to enter another Product");

            Product i = new Product(name, description, cost);
            Items.add(i);
            System.out.println(Items);

        } while (more);



        File workingDirectory = new File(System.getProperty("user.dir"));
        fileName = SafeInput.getNonZeroLenString(fileNamein, "Please enter file name");
        Path file = Paths.get(workingDirectory.getPath() + "//src//" + fileName + ".txt");


        try {

            OutputStream out =
                    new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer =
                    new BufferedWriter(new OutputStreamWriter(out));

            for (Product per : Items) {
                // writer.write(per, 0, per.length());
                writer.write(per.toCSVDataRecord());
                // writer.newLine();
            }

            writer.close();
            System.out.println("Data file written:" + fileName + ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
