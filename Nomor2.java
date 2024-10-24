public class Nomor2{
    public static void main(String[] args){
    //input driver
        System.out.println("masukan nama driver:Beliau/Mereka/Kita ");
        String driver = scanner.nextLine();

        //input trip per kilometer
        System.out.println("jarak yang di tempuh: ");
        int jarak = input.nextInt();
        int jarak = 0;
        
        // menghitung jarak
        if (jarak <= 11) {
            jarak = jarak * 13000;
        } else {
            jarak = 1 * 13000;
        }

        //hasil
        System.out.println("driver: " + driver);
        System.out.println("total jarak: " + jarak);
    }
}
