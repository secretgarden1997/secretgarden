package com.mycompany.assignmenty1y2g5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
            new Ship("Cargo Ship", 2000000),
            new Ship("Tranquility", 3000),
            new Plane("Boeing 777", 18000),
            new Plane("Air Force One", 80000)
        };

        
        for (Transport transport : transports) {
            System.out.println(transport);
            transport.move();
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTransport Menu:");
            for (int i = 0; i < transports.length; i++) {
                System.out.println((i + 1) + ". " + transports[i].name);
            }
            System.out.print("Enter Selection (0 to exit): ");
            String selectionInput = scanner.nextLine();

            if (selectionInput.equals("0")) {
                System.out.println("Thank you for using the system.");
                break;
            }

            int selection;
            try {
                selection = Integer.parseInt(selectionInput);
                if (selection < 1 || selection > transports.length) {
                    System.out.println("Invalid input.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            Transport selectedTransport = transports[selection - 1];

            while (true) {
                System.out.println("\nAction Menu:");
                System.out.println("1. Load");
                System.out.println("2. Unload");
                System.out.println("3. Current Load");
                System.out.print("Enter Selection (0 to cancel): ");
                String actionInput = scanner.nextLine();

                if (actionInput.equals("0")) {
                    break;
                }

                int action;
                try {
                    action = Integer.parseInt(actionInput);
                    if (action < 1 || action > 3) {
                        System.out.println("Invalid input.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                    continue;
                }

                switch (action) {
                    case 1:
                        System.out.print("Enter load weight in kg: ");
                        try {
                            int weight = Integer.parseInt(scanner.nextLine());
                            selectedTransport.load(weight);
                            System.out.printf("The current load of %s is %d kg.%n", selectedTransport.name, selectedTransport.currentLoad);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid weight. Loading cancelled.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter weight in kg to unload: ");
                        try {
                            int weight = Integer.parseInt(scanner.nextLine());
                            selectedTransport.unload(weight);
                            System.out.printf("The current load of %s is %d kg.%n", selectedTransport.name, selectedTransport.currentLoad);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid weight. Unloading cancelled.");
                        }
                        break;

                    case 3:
                        System.out.printf("The current load of %s is %d kg.%n", selectedTransport.name, selectedTransport.currentLoad);
                        break;
                }
            }
        }

        scanner.close();
    }
}

