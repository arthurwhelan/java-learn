package com.walking.lesson20.exceptions.task1_throws_exception.service;

import com.walking.lesson20.exceptions.task1_throws_exception.model.File;

import java.io.FileNotFoundException;

public class FileService {
    private final File[] files;

    public FileService(File[] files) {
        this.files = files;
    }

    public File findFiles(String fileName) throws FileNotFoundException {
        for (File file : files) {
            if(file.getFileName().equals(fileName)) {
                return file;
            }
        }

        throw new FileNotFoundException("File not found");
    }
}
