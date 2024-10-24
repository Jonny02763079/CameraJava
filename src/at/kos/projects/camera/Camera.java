package at.kos.projects.camera;

import java.util.*;

import java.time.LocalDateTime;

public class Camera {

    private int pixel;

    private int weight;

    private String color;

    private SDCard sdCard;

    private Objective objective;

    private Producer producer;

    public enum Resolution {
        Low,
        Medium,
        High
    };

    private Resolution resolution;

    public Camera(int pixel, int weight, String color, SDCard sdCard, Objective objective, Producer producer) {
        this.resolution = Resolution.Low;
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.sdCard = sdCard;
        this.objective = objective;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public int getPixel() {
        return pixel;
    }

    public int getWeight() {
        return weight;
    }

    public void setResolution(int resolution) {
        switch (resolution) {
            case 1:
                this.resolution = Resolution.Low;
                break;

            case 2:
                this.resolution = Resolution.Medium;
                break;

            case 3:
                this.resolution = Resolution.High;
                break;

            default:
                this.resolution = Resolution.Low;
                break;
        }
    }

    public void takePicture(String name, Resolution resolution) {

        this.resolution = resolution;

        switch (resolution) {
            case Low:
                File photo = new File(name, LocalDateTime.now(), 480);
                this.sdCard.saveFile(photo);
                break;

            case Medium:
                File photo1 = new File(name, LocalDateTime.now(), 720);
                this.sdCard.saveFile(photo1);
                break;

            case High:
                File photo2 = new File(name, LocalDateTime.now(), 1080);
                this.sdCard.saveFile(photo2);
                break;

            default:
                System.out.println("Es wurde keine Auflösung ausgewählt");
                break;
        }
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void getAllFiles() {
        sdCard.getfiles();
    }

    public void getAmountOfAllFiles() {
        System.out.println(sdCard.getAmountofFiles());
    }

    public Objective getObjective() {
        return objective;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void getFreeCapazity() {
        System.out.println(sdCard.getFreeCapazity());
    }

    public void getSystemCapazity() {
        System.out.println(sdCard.getSystemCapazity());
    }

    public Producer getProducer() {
        return producer;
    }
}
