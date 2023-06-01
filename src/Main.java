import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        boolean tieptuc=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n = scanner.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap gia tri phan tu : " + i);
            array[i] = scanner.nextInt();
        }
        int chon;
        int tong = 0;
        do {
            System.out.println("1. tinh tong mang");
            System.out.println("2. xuat cac so le va chan trong mang");
            System.out.println("3.xuat cac so nguyen to trong mang");
            System.out.println("4. xuat cac so chinh phuong trong mang");
            System.out.println("5. xuat cac so o vi tri le");
            System.out.println("0. de ket thuc chuong trinh");
            System.out.println("nhap truong hop muon chon");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        tong = tong + array[i];
                    }
                    System.out.println("tong cua mang la : " + tong);
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        if (array[i] % 2 != 0) {
                            System.out.println("cac so le la : " + array[i]);
                        } else {
                            System.out.println("cac so chan la : " + array[i]);
                        }
                    }
                    break;
                case 3:
                    thucthi(array);
                    break;
                case 4 :
                    chayscp(array);
                    break;
                case 5:
                for (int i=0;i<n;i++){
                    if (i%2!=0){
                        System.out.println("cac so o vi tri le la "+array[i]);
                    }
                }
                break;
                case 0:
                    tieptuc=false;
                    System.out.println("ket thuc chuong trinh");
                    break;
            }
        }while (tieptuc);
    }
        public static boolean isprimes ( int p){
            if (p <= 1) {
                return false;
            }
            for (int i =2; i < p; i++) {
                if (p%i == 0) {
                    return false;
                }
            }
            return true;
        }
        public  static boolean scp(float i){
        double j=Math.sqrt(i);
        if (i==Math.pow(j,2)){
            return true;
        }
        return false;
        }
        public static void thucthi(int array[]){
        for (int i=0;i< array.length;i++){
            if (isprimes(array[i])){
                System.out.println("cac so nguyen to la : "+array[i]);
            }
        }
        }
        public static void chayscp(int array[]){
        for (int i=0;i< array.length;i++){
            if (scp((float) array[i])){
                System.out.println("cac so chinh phuong la : "+array[i]);
            }
        }
        }
}