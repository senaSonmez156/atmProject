package atm;


	import java.util.Scanner;


		public class Main {
		    public static void main(String[] args) {
		        

		        Scanner input = new Scanner(System.in);
		        String userName, password;
		        int select;
		        int balance = 2000, price;
		        int right = 3;

		        while (right > 0) {
		            System.out.print("Kullanýcý Adýnýz : ");
		            userName = input.nextLine();
		            System.out.print("Parolanýz : ");
		            password = input.nextLine();


		            if (userName.equals("senasonmez") && password.equals("345461")) {
		                System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
		                do {
		                    System.out.println("Yapmak istediðiniz iþlemi giriniz\n"+
		                
		                    		"1-Para Yatýrma\n" +
		                            "2-Para Çekme\n" +
		                            "3-Bakiye Sorgula\n" +
		                            "4-Çýkýþ Yap");
		                    System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");

		                    select = input.nextInt();

		                    switch (select) {
		                        case 1:
		                            System.out.print("Para Miktarý : ");
		                            price = input.nextInt();
		                            balance += price;
		                            break;

		                        case 2:
		                            System.out.println("Para Miktarý : ");
		                            price = input.nextInt();
		                            if (price > balance) {
		                                System.out.println("Bakiyeniz Yetersiz!");
		                            } else {
		                                balance -= price;
		                                break;
		                            }

		                        case 3:
		                            System.out.println("Bakiyeniz: " + balance);
		                            break;

		                    }

		                } while (select != 4);
		                System.out.println("Tekrar Görüþmek Üzere . ");
		                break;

		            } else {
		                right--;
		                System.out.println("Hatalý Kullanýcý Adý veya Þifre . Tekrar Deneyiniz.");
		                if (right == 0) {
		                    System.out.println("Hesabýnýz Bloke olmuþtur lüften bankanýz ile iletiþime geçiniz.");
		                } else {
		                    System.out.println("Kalan Hakkýnýz : " + right);
		                }
		            }
		        }


		    }
		}



