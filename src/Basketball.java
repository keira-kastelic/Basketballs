import org.w3c.dom.ls.LSOutput;

/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan and Claire
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/

public class Basketball {
    public static void main(String[] args) {
        boolean mensFit; // establishes that mensFit is a true of false statement
        boolean womensFit; // establishes that womensFit is a true or false statement
        double diameterMens = 23.95; // the diameter of the mens basketball
        double diameterWomens = 23.04; // the diameter of the women's basketball
        double diameterHoop = 45.72; // the diameter of the basketball hoop
        System.out.println("Will the womens basketball fit through the hoop?"); // prints out the question
        System.out.println(diameterWomens * 2 <= diameterHoop); // prints out if the women's basketball will fit though the hoop
        System.out.println("Centimeters to spare:"); // prints out the header
        System.out.println(diameterHoop - diameterWomens * 2 ); // print out the centimeter's to spare
        System.out.println("Will the mens basketball fit through the hoop?"); // prints out the question
        System.out.println(diameterMens * 2 <= diameterHoop); // prints out if the mens basketball will fit through the hoop
        System.out.println("Centimeters to spare: "); // prints out the header
        System.out.println(diameterHoop - diameterMens * 2 ); // prints out the centimeters to spare



    }



}



