package IO_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Client {

    // 文件的相对路径
    public static final String PATH = ".\\src\\resource\\read";
    public static final String PATH_OUT = ".\\src\\resource\\write\\PRODUCT.txt";

    public static void main(String[] args){
        Client client = new Client();
        client.mergeFiles(PATH, PATH_OUT); // merge files
        client.readFile(PATH_OUT); // read data from file
    }

    public void readFile(String path) {
        FileReader reader = null;
        try {
            reader = new FileReader(path);
            int data;

            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            // handle exception
            System.out.println("IOException");
        }
    }

    public void mergeFiles(String filesPath, String outPath) {
        File file = new File(filesPath);
        File[] files = file.listFiles();
        // System.out.println(Arrays.toString(files));  // 打印文件列表
        try {
            FileWriter fileWriter = new FileWriter(outPath);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            BufferedReader reader = null;
            String line = null;
            for (File curFile : files) {
                reader = new BufferedReader(new FileReader(curFile));
                // 读取文件内容并写入到输出文件中
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
                reader.close();
            }
            writer.close();
        } catch (IOException e) {
            // handle exception
            System.out.println("IOException");
        }
    }
}