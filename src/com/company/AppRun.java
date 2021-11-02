package com.company;

public class AppRun
{
    public static void main(String[] args)
    {
        FileCreate fileCreate = new FileCreate();
        fileCreate.fileCreate();
        FileOperation fileOperation = new FileOperation();
        fileOperation.fileOperatio();
        FileSize fileSize = new FileSize();
        long size = fileSize.getFileSize("greeting.txt");
        System.out.println("Filesize in bytes: " + size);

        if(size>100000){
            System.out.println("File size is greater then 1MB = 1000000 bytes");
        }
        else
        {
            System.out.println("File size is less then 1MB = 1000000 bytes");
        }
    }
}

