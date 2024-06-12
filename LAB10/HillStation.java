package projectanudip;

import java.util.Scanner;

class HillStations {
    public void location() {
        System.out.println("Location of Hill Station");
    }
    public void famousFor() {
        System.out.println("Famous for something");
    }
}
class Manali extends HillStations {
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }
    public void famousFor() {
        System.out.println("Manali is famous for its scenic beauty and adventure sports");
    }
}
class Mussoorie extends HillStations {
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }
    public void famousFor() {
        System.out.println("Mussoorie is famous for its pleasant weather and beautiful landscapes");
    }
}
class Gulmarg extends HillStations {
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir");
    }
    public void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and winter sports");
    }
}
public class HillStation {
    public static void showHillStationInfo(HillStations hillStation) {
        hillStation.location();
        hillStation.famousFor();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a hill station (1: Manali, 2: Mussoorie, 3: Gulmarg):");
        int choice = sc.nextInt();
        HillStations hillStation;
        switch (choice) {
            case 1:
                hillStation = new Manali();
                break;
            case 2:
                hillStation = new Mussoorie();
                break;
            case 3:
                hillStation = new Gulmarg();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        showHillStationInfo(hillStation);
    }
}
