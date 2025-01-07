/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rental1;
import java.util.Scanner;
/**
 *
 * @author NURFAUZIYAH
 */
public class Rental1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        rental.pilihan();
        System.out.print("Transaksi lagi Ya=1, Tidak=2: ");
        int hari=input.nextInt();
        if(hari==1){
            rental.pilihan();
        }
    }  
}
