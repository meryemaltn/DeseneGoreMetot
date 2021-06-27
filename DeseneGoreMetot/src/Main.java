import java.util.Scanner;
public class Main {
	public static void metotDeseni(int num, int tmp, boolean status) {

        if (num <= tmp) {
            System.out.println(num);
            if (num > 0 && !status) {
                metotDeseni(num-5,tmp,false);
            }else{
                metotDeseni(num+5,tmp,true);
            }
        }
    }

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Bir Sayý Giriniz: ");
	     int num = sc.nextInt();
	     int tmp = num;
	     metotDeseni(num,tmp,false);
}
}