class Box
{
 private Float width,height,length;
 Box(Float wid,Float hei,Float len)
 {
   width=wid;
   height=hei;
   length=len;
 }
 Float volume()
 {
   return (width*height*length);
 }
}
class Wipro32
{
  public static void main(String args[])
  {
    Box box=new Box(10.0f,10.0f,10.0f);
    Float volume=box.volume();
    System.out.println("The volume of box is:"+volume);
  }
}
