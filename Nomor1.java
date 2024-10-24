public class Nomor1{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        //Meminta input dari pengguna
        System.out.println("masukan nama pegawai: ");
        String namaPegawai = input.nextLine();

        System.out.println("masukan jumlah jam lembur: ");
        int jamLembur = input.nextInt();
        int honor = 0;

        //Menghitung honor jam lembur
        if (jamLembur <= 16) {
            honor = jamLembur * 10000; 
        } else {
            int honorPertama = 16 * 10000;
            int sisaJam = jamLembur - 16;
            int honorSisa = sisaJam * 15000;
            honor = honorPertama + honorSisa;
        }
        //Hasil
        System.out.println("nama pegawai: " + namaPegawai);
        System.out.println("Total honor lembur: Rp" + honor );
    }
}
