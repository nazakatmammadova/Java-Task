package org.example.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
    public  static void writeIntofile(String filePath,String text) throws IOException {
        FileWriter fileWriter=new FileWriter(filePath,true);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
        bufferedWriter.close();
        System.out.println("Process success!");
    }
    public static String readIntoFile(String filePath) throws IOException {
        FileReader fileReader=new FileReader(filePath);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        StringBuilder result=new StringBuilder();
        while ((line=bufferedReader.readLine())!=null){
            result.append(line).append("\n");
        }
        return result.toString();
    }
    ///  file dan bytelarla yazma ve oxuma
    public static void writeIntoFileWithBytes(String filePath,byte[] bytes) throws IOException {
        File file=new File(filePath);
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(bytes);
        fileOutputStream.close();
        System.out.println("Process success!");
    }
    public static byte[] readWithBytes(String filePath) throws IOException {
        File file=new File(filePath);
        byte[] bytes=new byte[(int)file.length()];
        FileInputStream fileInputStream=new FileInputStream(file);
        fileInputStream.read(bytes);
        fileInputStream.close();
        return  bytes;
    }

    /// bytelarla yazma ve oxumagin daha qisa metodlari;
    public static void writeNio(String filePath,byte[] bytes) throws IOException {
        Path file= Paths.get(filePath);
        Files.write(file,bytes);
    }
    public  static byte[] readNio(String filePath) throws IOException {
        Path file= Paths.get(filePath);
        byte[] bytes=Files.readAllBytes(file);
        return bytes;
    }
    /// File-a object yazma ve oxuma
    public static void writeObject(String filePath, Serializable obj){
        try( FileOutputStream fileOutputStream=new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(obj);
///            objectOutputStream.close(); try blokunda qeyd ederek!
            System.out.println("process success!");
        }catch (Exception e){
            e.printStackTrace();
        }

//        FileOutputStream fileOutputStream=new FileOutputStream(filePath);
//        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(obj);
///        objectOutputStream.close(); /// bu metodu try-with-resources ile yazmaq
//        System.out.println("process success!");

    }
    public static User readObject(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(filePath);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        User user=(User)objectInputStream.readObject();
        return user;
    }
}
