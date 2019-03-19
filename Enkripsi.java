/**
 * @author Anang Ma'ruf Budiyanto
 * @author 18520244001
 */
import java.util.Scanner;

class Enkripsi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teksString = "";
        String teksEnkripsi = "";
        int pergeseranE = 0;
        try{
            System.out.print("Pesan Asli = ");
            teksString = scanner.nextLine().toLowerCase();
            System.out.print("Nilai Geser = ");
            pergeseranE = Integer.parseInt(scanner.nextLine());
            teksEnkripsi = encrypt(teksString, pergeseranE);
            System.out.println("Pesan Tersandi = " + teksEnkripsi);
        }catch(Exception e){
            e.printStackTrace();
        } // end catch
    }//end main

    /**
     * @param teksString
     * Teks original yang akan dienkripsi dengan pergeseran
     * @param pergeseranE
     * Nilai pergeseran tiap huruf
     */
    static String encrypt(String teksString, int pergeseranE){
        char[] karakterArray = teksString.toCharArray();
        for (int i = 0; i < karakterArray.length;i++) {
            if((int) karakterArray[i] >= 97 
            && (int) karakterArray[i] <= 122){
                int alfabetChar = (int) karakterArray[i] - 97;
                alfabetChar = (alfabetChar + pergeseranE) % 26;
                karakterArray[i] = (char) (alfabetChar + 97); 
            }//end if
        }//end for
        return String.valueOf(karakterArray);
    }//end encrypt
}//end class