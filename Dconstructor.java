public class Dconstructor {
    
        String brand;
        int year;
        Dconstructor()
        {
            brand="tesla";
            year=2020;
        }
        void display()
        {
            System.out.println("Brand : " + brand + "  , year : " + year);
        } 
        public static void main(String[] args) {
         Dconstructor c1=new Dconstructor();
         c1.display();   
        }
    
}
