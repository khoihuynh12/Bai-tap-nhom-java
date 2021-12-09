package Baitapnhom;

import java.util.Scanner ;
public class Person {
	private String name ;
    private String phoneNumber ;
    public Person(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Person() {
	}
	public void nhap(String tieude){
        System.out.println(tieude);
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên thuê bao: ");
        this.name = scan.nextLine() ;
        System.out.print("Nhập số thuê bao: ");
        this.phoneNumber = scan.nextLine() ;
    }
    public void xuat(){
        String str = String.format("  %s %s",this.name,this.phoneNumber);
        System.out.println(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber ;
    }
    public String toString(){
        String str = String.format("%s %s",this.name,this.phoneNumber)+"\n";
        return str;
    }
}