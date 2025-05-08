package org.example.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\Nazlı\\Desktop\\JavaLesson\\test.txt";
        User user1=new User();
        user1.username="Nazli";
        user1.password="1234567";
        FileUtil.writeObject(path,user1);

        user1=FileUtil.readObject(path);
        System.err.println(user1);

//        String imageSourcePath="C:\\Users\\Nazlı\\Pictures\\m.jpg";
//        String imageDestinationPath="C:\\Users\\Nazlı\\Desktop\\JavaLesson\\images-test\\test.jpg";
//
//        byte[] img=FileUtil.readWithBytes(imageSourcePath);
//        FileUtil.writeIntoFileWithBytes(imageDestinationPath,img);

        //String text="Hi Nazli \n How are you?";
       // byte[] bytes=text.getBytes();
        //FileUtil.writeIntoFileWithBytes(path,bytes);
        ///
      //  FileUtil.writeIntofile(path,text);
        //System.err.println( FileUtil.readIntoFile(path) );
    }

}
