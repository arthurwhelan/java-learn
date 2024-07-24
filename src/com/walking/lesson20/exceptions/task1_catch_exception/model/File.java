package com.walking.lesson20.exceptions.task1_catch_exception.model;

public class File {
    private String fileName;
    private long fileSize;
    private MediaType mediaType;

    public File(String fileName, long fileSize, MediaType fileType) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.mediaType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public MediaType getFileType() {
        return mediaType;
    }

    public void setFileType(MediaType fileType) {
        this.mediaType = fileType;
    }

    @Override
    public String toString() {
        return """
                name: %s
                size: %d
                mediaType: %s
                """.formatted(
                fileName, fileSize, mediaType.name());
    }
}
