public class BukuMain20{
    public static void main(String[] args) {
        Buku20 bk1 = new Buku20(null, null, 0, 0, 0);
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        
        bk1.tampilInformasi();
        bk1.terjual(5); 
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku20 bk2 = new Buku20("Self Reward","Maheera Ayesha",160,29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku20 bk3 = new Buku20("Psychology of Money", "Morgan Housel", 256, 24, 90000);
        bk3.terjual(21);
        bk3.tampilInformasi();
    }
}