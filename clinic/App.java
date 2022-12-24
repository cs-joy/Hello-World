package org.neutral_networks.oop_challange;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // object declaration
        Patient patient = new Patient("Mike", 28,
                new Eye("Left Eye", "Short sighted", "Blue", true),
                new Eye("Right Eye", "Normal", "Skyblue", true),
                new Heart("Heart", "Normal", 65),
                new Stomach("Stomach", "PUD", false),
                new Skin("Skin", "Burned", "White", 40));


        // create the logic

        System.out.println("Name: " + patient.getName());  // patient name
        System.out.println("Age: " + patient.getAge()); // patient age

        // get use input
        Scanner scanner = new Scanner(System.in);

        boolean shouldFinished = false;

        while (!shouldFinished) {
            System.out.println("Choose an Organ:"+
                    "\n\t1. Left Eye"+
                    "\n\t2. Right Eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Stomach"+
                    "\n\t5. Skin"+
                    "\n\t6. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }

                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                        if(scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter the new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1) {
                        patient.getStomach().Digest();
                    } else {
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinished = true;
                    break;

            }
        }

    }
}
