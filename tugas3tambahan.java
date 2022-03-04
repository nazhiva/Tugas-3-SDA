import java.util.LinkedList;

public class tugas3tambahan {
    public static void main(String[] args) {

    //Buatlah sebuah LinkedList yang mana pada LinkedList 
    //tersebut dapat menambah data berupa Nama_Mahasiswa, No_BP, Alamat.

    LinkedList<String> Nama_Mahasiswa = new LinkedList<>();
    LinkedList<String> No_BP = new LinkedList<>();
    LinkedList<String> Alamat = new LinkedList<>();

    //tambahkan beberapa fungsi/operasi pada LinkedList

    //addFirst(), add(), addLast()

    Nama_Mahasiswa.addFirst("Nazhiva Darma Fitri");
    No_BP.addFirst("2111523004");
    Alamat.addFirst("MuaraBungo");

    Nama_Mahasiswa.add("Marco Efraim");
    No_BP.add("12121212");
    Alamat.add("Lost angeles");

    Nama_Mahasiswa.addLast("Vierra Renata");
    No_BP.addLast("21222002");
    Alamat.addLast("mexico");

    Nama_Mahasiswa.add("angredine varsya");
    No_BP.add("1010101010");
    Alamat.add("cappadocia");

    System.out.println(">>>>> Menambahkan Data Mahasiswa <<<<<");
    System.out.println("Nama Mahasiswa \t: " +Nama_Mahasiswa);
    System.out.println("NIM \t: " +No_BP);
    System.out.println("Alamat \t :" +Alamat);
    System.out.println("");

    //set()

    Nama_Mahasiswa.set(0, "Caitlin Halderman");
    No_BP.set(2, "43434343");
    Alamat.set(0, "Jakarta");

    Nama_Mahasiswa.set(3, "agatha chelsea");
    No_BP.set(1, "2111523005");
    Alamat.set(2, "Mumbai");

    System.out.println(">>>>> Menyisipkan Data Mahasiswa <<<<<");
    System.out.println("Nama Mahasiswa\t: " +Nama_Mahasiswa);
    System.out.println("NIM\t: " +No_BP);
    System.out.println("Alamat\t: " +Alamat);
    System.out.println("");

    //remove(), removeLast()

    Nama_Mahasiswa.remove(2);
    No_BP.remove(1);
    Alamat.removeLast();

    System.out.println(">>>>> Menghapus Data Mahasiswa <<<<<");
    System.out.println("Nama Mahasiswa\t: " +Nama_Mahasiswa);
    System.out.println("NIM\t: " +No_BP);
    System.out.println("Alamat\t: " +Alamat);
    System.out.println("");

    //get()

    System.out.println(">>>>> FUNGSI GET <<<<<");
    System.out.println("Fungsi get Nama Mahasiswa\t: " +Nama_Mahasiswa.get(1));
    System.out.println("Fungsi get NIM\t: " +No_BP.get(0));
    System.out.println("Fungsi get Alamat\t: " +Alamat.get(2));
    System.out.println("");

    //pop()

    Nama_Mahasiswa.pop();
    No_BP.pop();
    Alamat.pop();
    System.out.println(">>>>> DATA SETELAH FUNGSI POP <<<<<");
    System.out.println("Fungsi POP Nama Mahasiswa\t: "+Nama_Mahasiswa);
    System.out.println("Fungsi POP NIM\t: "+No_BP);
    System.out.println("Fungsi POP Alamat\t: "+Alamat);
    System.out.println("");

    //push()

    Nama_Mahasiswa.push("Kim Jennie");
    No_BP.push("7777777777");
    Alamat.push("Coachella");
    System.out.println(">>>>> DATA SETELAH FUNGSI PUSH <<<<<");
    System.out.println("Fungsi PUSH Nama Mahasiswa\t: "+Nama_Mahasiswa);
    System.out.println("Fungsi PUSH NIM\t: "+No_BP);
    System.out.println("Fungsi PUSH Alamat\t: "+Alamat);
    System.out.println("");

    //indexOf()

    System.out.println(">>>>> INDEX OF <<<<<"); 
    System.out.println("fungsi index of pada Nama Mahasiswa\t: "+Nama_Mahasiswa.indexOf("Brad Pitt"));
    System.out.println("fungsi index of pada NIM\t: "+No_BP.indexOf("7777777777"));
    System.out.println("fungsi index of oada Alamat\t: "+Alamat.indexOf("Coachella"));
    System.out.println("");

 
    }
}
