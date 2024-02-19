public class Buku20{
    String judul,pengarang;
    int halaman,stok,harga;

void tampilInformasi(){
    System.out.println("Judul " +judul);   
    System.out.println("Pengarang " +pengarang); 
    System.out.println("Halaman " +halaman); 
    System.out.println("Stok " +stok); 
    System.out.println("Harga " +harga); 
}

void terjual(int jml){
    if(stok>0){
        stok -= jml;
    }     
}

void restok(int jml){
    stok += jml;
}
void gantiHarga(int hrg){
    harga = hrg;
}
public Buku20(String jud, String pg, int hal, int stok, int har){
    judul= jud;
    pengarang = pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
}
}