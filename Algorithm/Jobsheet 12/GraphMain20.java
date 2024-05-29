import java.util.Scanner;
public class GraphMain20{
    public static void main(String[] args) throws Exception {
        Graph20 gedung = new Graph20(6);
        GraphMatriks20 gdg = new GraphMatriks20(6);
        Scanner input20 = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Sistem Graph");
            System.out.println("----------MENU----------");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu : ");
            choice = input20.nextInt();
            switch (choice) {
            case 1:
                System.out.print("Masukkan Gedung asal : ");
                int asal1 = input20.nextInt();
                System.out.print("Masukkan Gedung tujuan : ");
                int tujuan1 = input20.nextInt();
                System.out.print("Masukkan Jarak Gedung : ");
                int jarak1 = input20.nextInt();
                gedung.addEdge(asal1, tujuan1, jarak1);
                break;
            case 2:
                System.out.print("Masukkan Gedung asal : ");
                int asal2 = input20.nextInt();
                System.out.print("Masukkan Gedung tujuan : ");
                int tujuan2 = input20.nextInt();
                gedung.removeEdge(asal2, tujuan2);
                break;
            case 3:
                System.out.print("Masukkan Gedung asal : ");
                int asal3 = input20.nextInt();
                gedung.degree(asal3);
                break;
            case 4:
                gedung.printGraph();
                break;
            case 5:
                System.out.print("Masukkan Gedung asal : ");
                int asal5 = input20.nextInt();
                System.out.print("Masukkan Gedung tujuan : ");
                int tujuan5 = input20.nextInt();
    
                boolean isDirect = gedung.isDirectlyConnected(asal5, tujuan5);
                if (isDirect) {
                System.out.println("Gedung " + (char) ('A' + asal5) + " dan Gedung " + (char) ('A' + tujuan5) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal5) + " dan Gedung " + (char) ('A' + tujuan5) + " tidak bertetangga");
            }
                break;
            case 6:
                System.exit(0);
                break;
            default:
                break;
        }
    } while (choice !=-1);
        

    }
}