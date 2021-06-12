import java.util.Locale;

public class Main {
        public static void main(String[]args){
                String namaDepan = "Muhammad";
                String namaTengah = "Topan";
                String namaBelakang = "Ramadona";

                int usia = 19;
                int targetTahunKuliah = 4;
                double ipk = 3.89764512;
                char nilaiAbjad = 'A';
                boolean tampan = true;

                System.out.println(namaDepan + namaTengah + namaBelakang);

                char[] uniskaChar = {'U','N','I','S','K','A'};
                String uniskaString = new String(uniskaChar);
                System.out.println(uniskaChar);
                System.out.println(uniskaString);

                String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;

                System.out.println(namaLengkap);
                System.out.println(namaLengkap.length());
                System.out.println(namaLengkap.indexOf("don"));
                System.out.println(namaLengkap.substring(15));
                System.out.println(namaLengkap.substring(15,20));
                System.out.println(namaLengkap.replace("Top","Erf"));
                System.out.println(namaLengkap.toLowerCase());
                System.out.println(namaLengkap.toUpperCase());
                System.out.println(namaLengkap.charAt(15));

                String[] namaArray = namaLengkap.split(" ");

                for(String nama : namaArray)
                        System.out.println(nama);
        }
}
