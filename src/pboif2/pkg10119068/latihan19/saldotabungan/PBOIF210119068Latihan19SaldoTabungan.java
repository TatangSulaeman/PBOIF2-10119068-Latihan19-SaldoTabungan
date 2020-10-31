/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan19.saldotabungan;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * NIM                  : 10119068
 * Kelas                : IF2
 * Deskripsi program    : Program menhtiung Saldo Tabungan
 */
public class PBOIF210119068Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols nRp = new DecimalFormatSymbols();
        
        nRp.setCurrencySymbol("Rp. ");
        nRp.setMonetaryDecimalSeparator(',');
        nRp.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(nRp);
        
        int lama,i;
        float bunga;
        double saldoAwal,saldoAkhir;
        
        System.out.print("Saldwo Awal : Rp. ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Bunga perBulan (%) :  ");
        bunga = keyboard.nextFloat();
        
        System.out.print("Lama (bulan) : ");
        lama = keyboard.nextInt();
        
        bunga =(float) (bunga/100);
        
        for (i=1;i<=lama;i++){
            saldoAkhir = (saldoAwal * 0.15) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i +" %s %n", mataUangIndonesia.format(saldoAkhir));
            saldoAwal = saldoAkhir;
        }
        System.out.println("PROGRAM INI DIBUAT OLEH TATANG SULAEMAN");
        
        
        
    }
    
}
