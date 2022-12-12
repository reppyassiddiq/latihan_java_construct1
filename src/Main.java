package com.turorial;

//contruct adalah pemanggil pertama object dari seluruhan program
class Pemainbola{
    String nama;
    String nomorpunggung;
    String club;

    Pemainbola(String inputNama, String inputnomorpunggung, String inputclub){
        nama = inputNama;
        nomorpunggung = inputnomorpunggung;
        club = inputclub;

        System.out.println(nama);
        System.out.println(nomorpunggung);
        System.out.println(club);

    }

}
public class Main {
    public  static void main(String[] args) throws Exception {

        Pemainbola pemainbola1 = new Pemainbola("RONALDO","7","MANCHASTER UNITED");
        Pemainbola pemainbola2 = new Pemainbola("MESSI","10","PSG");
        Pemainbola pemainbola3 = new Pemainbola("NEYMAR","11","PSG");
    }

}