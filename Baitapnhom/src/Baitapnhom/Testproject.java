package Baitapnhom;

import java.io.IOException;
import java.util.Scanner;
public class Testproject {
	public static void main(String[] args) throws IOException {
		 int bc;
         Scanner sc=new Scanner(System.in);
         PhoneBook list = new PhoneBook();
       do{
       System.out.println("\n1-Nhập thông tin danh bạ");
       System.out.println("2-Hiển thị toàn bộ danh bạ");
       System.out.println("3-Thay đổi phone number của một người");
       System.out.println("4-Xóa thông tin của một người");
       System.out.println("5-Tìm theo name");
       System.out.println("6-Tìm theo phone number");
       System.out.println("7-Sắp xếp theo name");
       System.out.println("0-Thoát chương trình");
       System.out.print("Bạn chọn: ");
       bc=Integer.parseInt(sc.nextLine());
       switch(bc)
       {
           case 1:{              
               list.nhap("Nhập thông tin danh bạ");
		break;
           }
           case 2: {
               list.toString("Hiển thị toàn bộ danh bạ");
               break;
           }
           case 3: {
               System.out.print("Nhập tên thuê bao cần thay đổi số điện thoại: ");
               String name = sc.nextLine();
               System.out.print("Nhập số điện thoại mới: ");
               String phone = sc.nextLine();
               list.changePhone(name,phone);
               list.toString("Hiển thị toàn bộ danh bạ");
               break;
           }
           case 4: {
               System.out.print("Nhập tên thuê bao cần xóa: ");
               String name = sc.nextLine();
               list.delete(name);
               list.toString("Hiển thị toàn bộ danh bạ");
               break;
           }
	    case 5: {
                System.out.print("Nhập tên bạn muốn tìm trong danh bạ: ");
       	 String name = sc.nextLine();
		 list.findName(name);
                break;
           }
           case 6: {
                System.out.print("Nhập số điện thoại muốn tìm trong danh bạ: ");
       	 String phone = sc.nextLine();
		 list.findPhone(phone);
                break;
           }
           case 7:
           {
               System.out.println("Sắp xếp theo tên");
               list.nameSort();
               break;
           }
       	 }
       }while(bc!=0);      
	}
}