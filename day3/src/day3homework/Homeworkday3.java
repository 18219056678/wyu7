package day3homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homeworkday3 {    
    public void copyFileTest() {
        long start = System.currentTimeMillis();
        String src = "C:/Users/Administrator/Desktop/myfile.txt";
        String dest = "C:/Users/Administrator/Desktop/myfile_cp2.txt";
        copyFile(src, dest);
        long end = System.currentTimeMillis();
        System.out.println("ºÄÊ±£º" + (end - start));
    }

    public static void copyFile(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            FileInputStream fis = new FileInputStream(src); 
            FileOutputStream fos = new FileOutputStream(dest);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] b = new byte[1024];
            int len = 0;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bos != null) {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bis != null) {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}