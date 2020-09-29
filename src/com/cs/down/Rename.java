package com.cs.down;

import java.io.File;

public class Rename {
    public static void main(String[] args) {
        renameFiles("C:\\Users\\cs\\Desktop\\work\\倾情守护\\背景","img_");
        System.out.println("执行完成");
    }

    /**
     * 批量重命名
     * 将传入路径中的所有文件,重命名为前缀+序号+文件后缀名的形式
     * @param dirPath
     *
     */
    public static void renameFiles(String dirPath,String prefix){
        File file=new File(dirPath);
        if(!file.isDirectory()){
            return;
        }
        File files[]=file.listFiles();
        int index=1;

        for(File f:files){
            File newFile=new File(dirPath,prefix+String.valueOf(index++)+".jpg");
            f.renameTo(newFile);
        }
    }
}
