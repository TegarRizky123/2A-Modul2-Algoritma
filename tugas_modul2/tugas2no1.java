package asd.tugas_modul2;
public class tugas2no1 {
    public static void main(String[] args){
        System.out.println("Nama : Tegar Risqy Y");
        System.out.println("Nim : 20090080");
        int[][] matriks = new int [3][3];
        matriks[0][0] = 34;
        matriks[0][1] = 56;
        matriks[0][2] = 41;
        matriks[1][0] = 45;
        matriks[1][1] = 36;
        matriks[1][2] = 37;
        matriks[2][0] = 51;
        matriks[2][1] = 32;
        matriks[2][2] = 46;       
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//tegarrisqyyuliansantoso