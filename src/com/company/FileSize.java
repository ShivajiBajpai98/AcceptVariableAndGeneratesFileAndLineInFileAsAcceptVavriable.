package com.company;

import java.io.File;

public class FileSize
{
    public  long getFileSize(String filename)
    {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File doesn\'t exist");
            return -1;
        }
        return file.length();
    }
}
