import java.util.ArrayList;
import java.util.Scanner;

public class PartInput {
    private int catalogNum;

    public static void main(String[] args) {
        generateMenu();
    }

    private static void generateMenu(){
        int userSelection;
        System.out.println("|   Welcome to the OCP Catalogue System   |");
        System.out.println("| Enter an option:                 |");
        System.out.println("|        1. Add a new component product to the catalogue      |");
        System.out.println("|        2. Quit     |");

        System.out.println("// Enter your Selection");
        Scanner reader = new Scanner(System.in);
        userSelection = reader.nextInt();
    switch (userSelection){
        case 1:

            createitem();
        case 2:
            System.out.println("Shutting Down");
    }
    }
    private static void createitem() {
        Component Component = new Component();
        ArrayList<String> newComponent = new ArrayList<String>();
        ArrayList<String> options = new ArrayList<String>();
        options.add("1. CPU");
        options.add("2. GPU ");
        options.add("3. Memory");
        options.add("4. Storage");
        options.add("5. PSU");
        String response = "";
        while (!options.contains(response)) {
            System.out.println("|        Please Input the component Type      |");
            System.out.println("|        1. CPU         |");
            System.out.println("|        2. GPU         |");
            System.out.println("|        3. Memory      |");
            System.out.println("|        4. Storage     |");
            System.out.println("|        5. PSU         |");
            System.out.println("// Enter your Selection");
            Scanner reader = new Scanner(System.in);
            response = reader.next();
            newComponent.add(response);
        }
        System.out.println("// Interface type");
        Scanner reader = new Scanner(System.in);
        response = reader.next();
        newComponent.add(response);
        System.out.println("// Enter Manufacture Company name");
        response = reader.next();
        newComponent.add(response);
        System.out.println("// Enter Description");
        response = reader.next();
        newComponent.add(response);
        System.out.println("// Enter Price");
        response = reader.next();
        newComponent.add(response);

        System.out.println(newComponent);









    }

}
