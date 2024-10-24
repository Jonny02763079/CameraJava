package at.kos.projects.camera;

import java.util.Scanner;

public class GUI {

    public static void main(String[] args) {

        boolean stopWhile = true;
        Scanner scanner = new Scanner(System.in);

        Producer producer = new Producer("Krupp", "Deutschland");
        Objective objective = new Objective(2, producer);
        SDCard sdCard = new SDCard(32768);
        Camera camera = new Camera(2160, 200, "Black", sdCard, objective, producer);

        while (stopWhile) {

            System.out.println("Please select an option:");
            System.out.println("1 - Take a Photo");
            System.out.println("2 - Add or switch SDCard");
            System.out.println("3 - Add or switch Objective");
            System.out.println("4 - Show the free space");
            System.out.println("5 - Show the amount of files");
            System.out.println("6 - Show Systemcapazity");
            System.out.println("7 - Show file infos");
            System.out.println("8 - Shutdown");
            System.out.println("");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Please type in the Name: ");
                    String choiceForName = scanner.next();

                    System.out.println("Please Tab 1 for Low Resolution, 2 for Medium and 3 for High");
                    int choiceForResolution = scanner.nextInt();

                    switch (choiceForResolution) {

                        case 1:
                            camera.setResolution(1);
                            camera.takePicture(choiceForName, camera.getResolution());
                            System.out.println("Foto: " + choiceForName + " was created");
                            System.out.println("");
                            break;

                        case 2:
                            camera.setResolution(2);
                            camera.takePicture(choiceForName, camera.getResolution());
                            System.out.println("Foto: " + choiceForName + " was created");
                            System.out.println("");
                            break;

                        case 3:
                            camera.setResolution(3);
                            camera.takePicture(choiceForName, camera.getResolution());
                            System.out.println("Foto: " + choiceForName + " was created");
                            System.out.println("");
                            break;

                        default:
                            System.out.println("Invalid resolution choice.");
                            System.out.println("");
                            break;
                    }
                    break;

                case 2:
                    Scanner scannerForSDCard = new Scanner(System.in);
                    int choiceForSDCard = scannerForSDCard.nextInt();
                    System.out.println("Type in how much GB you want");
                    sdCard = new SDCard(choiceForSDCard);
                    camera.setSdCard(sdCard);
                    System.out.println("SD card switched! New Systemcapazity: ");
                    camera.getSystemCapazity();
                    System.out.println("");
                    break;

                case 3:
                    Scanner scannerForObjective = new Scanner(System.in);
                    int choiceForObjective = scannerForObjective.nextInt();
                    System.out.println("Type in how much focalLenght you need");
                    objective = new Objective(choiceForObjective, producer);
                    camera.setObjective(objective);
                    System.out.println("Objective switched! New focall lenght: " + objective.getFocalLength());
                    System.out.println("");
                    break;

                case 4:
                    camera.getFreeCapazity();
                    System.out.println("");
                    break;

                case 5:
                    camera.getAmountOfAllFiles();
                    System.out.println("");
                    break;

                case 6:
                    camera.getSystemCapazity();
                    System.out.println("");
                    break;

                case 7:
                    System.out.println("File infos: ");
                    camera.getAllFiles();
                    System.out.println("");
                    break;

                case 8:
                    System.out.println("Shutting down...");
                    System.out.println("");
                    stopWhile = false;
                    break;

                default:
                    System.out.println("Invalid choice, please select a valid option.");
                    System.out.println("");
                    break;
            }
        }

        scanner.close();
    }
}
