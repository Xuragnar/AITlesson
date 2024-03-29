package practice.io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputAppl {
    public static void main(String[] args) {
        try(FileOutputStream fout = new FileOutputStream("./dest/test.txt")){
            fout.write(65);// пишем в файл
            fout.write(66);//
            fout.write(27);//
            fout.write(257);//ESC
            fout.write(1);//
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
