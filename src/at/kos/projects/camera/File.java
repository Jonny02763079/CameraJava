package at.kos.projects.camera;

import java.time.LocalDateTime;

public class File {

    private String name;

    private LocalDateTime date;

    private int fileSize;

    public File(String name, LocalDateTime date, int fileSize) {
        this.name = name;
        this.date = date;
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void printInfo() {
        System.out.println("Name of file: " + this.name);
        System.out.println("Size of file: " + this.fileSize);
        System.out.println("Date of file: " + this.date);
    }

}
