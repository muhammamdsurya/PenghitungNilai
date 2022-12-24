/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penghitung.nilai;
import java.util.ArrayList;
/**
 *
 * @author muham
 */
public class Input {
    ArrayList<Mahasiswa> nilaimahasiswa;
    
    public Input() { 
        nilaimahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat,  String matakuliah, String nilaiAkhir) { 
        Mahasiswa mhs = new Mahasiswa(nim,nama,alamat,matakuliah,nilaiAkhir);
        nilaimahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getAll(){
        return nilaimahasiswa;
    }
    public void deleteData(int index) {
        nilaimahasiswa.remove(index);
    }
}
