package jb3;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1=new Anggota("iwan","jl. mawar");
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        
        anggota1.setNama("Iwan setiawan");
        anggota1.setAlamat("Jl. Suhat no.10");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        
        anggota1.pinjam(5000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp."+anggota1.getSimpanan());
        
    }

}
