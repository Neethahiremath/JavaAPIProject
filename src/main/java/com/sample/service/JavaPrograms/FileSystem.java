package com.sample.service.JavaPrograms;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;

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

            List<String> n = new ArrayList<>();


        }
    }

