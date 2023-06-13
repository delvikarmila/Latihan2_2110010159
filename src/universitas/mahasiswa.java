
package universitas;


public class mahasiswa {
    String nama, prodi, npm;
   
public String getDetail() {
    return nama+npm+prodi;
} 
 public mahasiswa (String nama, String prodi, String npm){
     this.nama=nama;
     this.npm=npm;
     this.prodi=prodi;
 
 }    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }
 

    
}
