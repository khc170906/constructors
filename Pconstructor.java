public class Pconstructor {
  //
     String brand;
     int year;
     Pconstructor(String n,int m)
     {
         brand=n;
         year=m;
     }
     void display()
     {
      System.out.println("Brand : " + brand + " , year : " + year);
     }
     public static void main(String[] args) {
       Pconstructor p= new Pconstructor("ford" , 2024);
       p.display();  
     }
}
