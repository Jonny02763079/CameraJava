package at.kos.projects.camera;

import java.util.*;

public class SDCard {

    private int freeCapazity;

    private int systemCapazity;

    private List<File> files;

    public SDCard(int systemCapazity) {
        this.systemCapazity = systemCapazity;
        this.files = new ArrayList<>();
        this.freeCapazity = systemCapazity;
    }

    public int getFreeCapazity() {
        return freeCapazity;
    }

    public int getSystemCapazity() {
        return systemCapazity;
    }

    public void setSystemCapazity(int systemCapazity) {
        this.systemCapazity = systemCapazity;
    }

    public void printFiles() {
        for (File file : this.files) {
            file.printInfo();
        }
    }

    public int getAmountofFiles() {
        int sum = 0;
        for (File file : files) {
            sum += 1;
        }
        return sum;
    }

    public void saveFile(File file) {

        this.freeCapazity = this.systemCapazity - file.getFileSize();

        try {
            if (file.getFileSize() <= this.freeCapazity) {
                this.files.add(file);
            }
        } catch (Exception e) {
            System.out.println("There is not enough capazity left, free space: " + this.freeCapazity);
        }
    }
}
