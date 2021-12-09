package Baitapnhom;

import java.util.Scanner;
public class PhoneBook {
	private Person [] arr ;
    private int index;
    private int n;
    public PhoneBook(){
        this.arr = null ;
    }
    public void nhap(String tieude){
        System.out.println(tieude);
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Nhập số lượng danh bạ: ");
        n = scan.nextInt() ;
        this.arr = new Person[n] ;
        for(int i=0;i<n;i++){
            this.arr[i] = new Person() ;
            this.arr[i].nhap("Nhập thông tin thuê bao thứ:"+i);
        }
    }
    public void toString(String tieude){
        System.out.println(tieude);
        System.out.println("Tên thuê bao "+"|"+" Số điện thoại \n");
        for(int i=0;i<this.arr.length;i++){
            this.arr[i].xuat();
        }
    }

    public Person[] getArr() {
        return arr;
    }
    
    private int search(String name){
        boolean found= false;
        int result= -1;
        int i = 0;
        while(!found && i< n){
            if (this.arr[i].getName().equals(name)){
		found= true;
		result= i;
            }
            else{ i++;
		}
        } 
        return  result;
    }
    public void changePhone(String name, String phone) {
        int i= search(name);
        boolean cond= (i!= -1);
        if (!cond) {
            System.out.println("Không tìm thấy thuê bao trong danh bạ!");
            return;
        }
    	
	this.arr[i].setPhoneNumber(phone);
        toString("Thông tin trong danh sách sau khi sửa đổi.");
    }
    public void delete(String name){
        int index= search(name);
        boolean cond= (index!= -1);
        if (!cond) {
            System.out.println("Không tìm thấy thuê bao trong danh bạ!");
            return;
        }
    	
        Person[] s = new Person[this.arr.length-1] ;
        for(int i=0;i<this.arr.length-1;i++){	
            if(i < index)
                s[i] = this.arr[i] ;
            else
                s[i] = this.arr[i+1] ;
        }
        this.arr = new Person[this.arr.length-1] ;
        this.arr = s ;
        toString("Thông tin danh bạ sau khi xóa một thuê bao");
    }
    public void findName(String name){
        int i= search(name);
        boolean cond= (i!= -1);
        if (!cond) {
            System.out.println("Không tìm thấy tên thuê bao trong danh bạ!");
            return;
        }
    
	System.out.println("Tên thuê bao "+"|"+" Số điện thoại \n");
	this.arr[i].xuat();
    }
    public void findPhone(String phone){
        int dem = 0 ;
        for(int i=0;i<this.arr.length;i++){
            if(this.arr[i].getPhoneNumber().equals(phone)==true){
                this.arr[i].xuat();
                dem++ ;
            }
        }
        if(dem==0)
            System.out.println("Số điện thoại bạn vừa nhập không có trong danh bạ.");
    }
    public void nameSort(){
        int Min ;
        for(int i=0;i<this.arr.length-1;i++){
            Min = i ;
            for(int j=i+1;j<this.arr.length;j++)
                if(this.arr[j].getName().compareTo(this.arr[Min].getName())<0)
                    Min = j ;
                Person tam = this.arr[i] ;
                this.arr[i] = this.arr[Min] ;
                this.arr[Min] = tam ;
        }
        toString("Danh sách khi sắp xếp là.") ;
    }
	public void setArr(Person[] mangtam) {
	        this.arr = mangtam;
	    }
}