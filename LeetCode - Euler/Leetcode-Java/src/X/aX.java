/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package X;

/**
 *
 * @author erens
 */
public class aX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = ("]]][[[");
        String parantez1 = "[";
        String parantez2 = "]";

        int sLength = s.length();
        String parantezler1[] = null;
        String parantezler2[] = null;

        for (int i = 0; i < sLength; i++) {
            String lazım = String.valueOf(s.charAt(i));
            if (lazım == parantez1) {
                int a = 0;
                parantezler1[a] = lazım;
                a++;
            }
            if (lazım == parantez2) {
                int b = 0;
                parantezler2[b] = lazım;
                b++;
            }
        }
        int haraket = 0;
        int haraket2 = 0;
        String sonuc = "";
        int yarım = sLength / 2;

        for (int i = 0; i < yarım; i++) {

            if (i % 2 != 0) {
                sonuc = sonuc + parantez1;
                haraket++;
            }
            if (i % 2 == 0) {
                sonuc = sonuc + parantez2;
                haraket++;
            }
            if (i == 0) {
                sonuc = sonuc.substring(0, sonuc.length() - 1);
                sonuc = sonuc + parantez1;
                haraket++;
            }
        }
        for (int i = yarım; i < sLength; i++) {
            if (i % 2 != 0) {
                sonuc = sonuc + parantez1;
                haraket++;
            }
            if (i % 2 == 0) {
                sonuc = sonuc + parantez2;
                haraket++;
            }
            if (i == sLength - 1) {
                sonuc = sonuc.substring(0, sonuc.length() - 1);
                sonuc = sonuc + parantez2;
                haraket++;
            }

        }

        System.out.println(s);
        System.out.println(sonuc);

        for (int i = 0; i < sLength; i++) {
            String sHarf = String.valueOf(s.charAt(i));
            String sonucHarf = String.valueOf(sonuc.charAt(i));
            boolean atla = false;
            if (i == sLength / 2 - 1) {
                atla = true;
            }
            if (atla = false) {

                if (!sHarf.equals(sonucHarf)) {
                    sonuc = sonuc.substring(0, sonuc.length() - 1) + sHarf;
                    sonuc = sonucHarf + sonuc.substring(1);
                    haraket2++;
                }

            }

        }

        System.out.println(sLength / 2);
        System.out.println("Değişim sayısı: " + haraket2);

    }

}
