class copyconstructor
{
    String title;
    float price;
    copyconstructor(String title , float price)
    {
        this.title=title;
        this.price=price;
    }
    copyconstructor(copyconstructor b)
    {
        title=b.title;
        price=b.price;
    }
    void display()
    {
        System.out.println("title of book : " + title + ", price : " + price);
    }
    public static void main (String args[])
    {
        copyconstructor c1=new copyconstructor("book1" , 2000);
        c1.display();
        copyconstructor c2 =new copyconstructor(c1);
        c2.display();
    }
}