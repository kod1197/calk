/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calk;
import java.io.*;

/**
 *
 * @author kod1197
 */
public class FileWorker {
public static String text = "This new text \nThis new text2\nThis new text3\nThis new text4\n";
public static String fileName = "D://a.txt";
    public static void main(String[] args)throws FileNotFoundException{
        
        //Запись в файл
    FileWorker.write(fileName, text);
} 
    public static void write(String fileName, String text) {
    //Определяем файл
    File file = new File(fileName);
 
    try {
        //проверяем, что если файл не существует то создаем его
        if(!file.exists()){
            file.createNewFile();
        }
 
        //PrintWriter обеспечит возможности записи в файл
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
 
        try {
            //Записываем текст у файл
            out.print(text);
        } finally {
            //После чего мы должны закрыть файл
            //Иначе файл не запишется
            out.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
    }
}
