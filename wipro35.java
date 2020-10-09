class Author
{
  String authorName,authorEmailId;
  char authorGender;
  Author(String name,String email,char gender)
  {
    authorName=name;
    authorEmailId=email;
    authorGender=gender;
  }
}
class Book extends Author
{
  String bookName;
  float bookPrice;
  int bookStock;
  Book(String bName,String aName,String aEmail,float price,int stock,char aGender)
  {
    super(aName,aEmail,aGender);
    bookName=bName;
    bookPrice=price;
    bookStock=stock;
  }
  void display()
  {
    System.out.println("Book name: "+bookName);
    System.out.println("Author name: "+authorName);
    System.out.println("Author email: "+authorEmailId);
    System.out.println("Author gender: "+authorGender);
    System.out.println("Book price: "+bookPrice);
    System.out.println("Book stock: "+bookStock);
  }
}
class Wipro35
{
  public static void main(String args[])
  {
    Book book=new Book("mistry_of_my_life","Gopal_jain","jaingopal09@gmail.com",119.0f,10,'M');
     book.display();
  }
}
