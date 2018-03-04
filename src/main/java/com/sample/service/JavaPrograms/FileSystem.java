package com.sample.service.JavaPrograms;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class FileSystem {

    public java.nio.file.Path GetFilePath() throws NullPointerException{
        ClassLoader classLoader = getClass().getClassLoader();
        return Paths.get( Objects.requireNonNull(classLoader.getResource("file.txt")).getPath());
    }
        public static void main(String[] args) throws IOException {

            FileStore fileStore = Files.getFileStore(new FileSystem().GetFilePath());

            long total = fileStore.getTotalSpace();
            long used =  fileStore.getTotalSpace() -  fileStore.getUnallocatedSpace();
            long available = fileStore.getUsableSpace();

            System.out.println(total);
            System.out.println(used);
            System.out.println(available);

        }
    }

