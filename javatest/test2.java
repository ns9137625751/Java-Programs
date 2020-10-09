class Test2
{
  public static void main(String[] argv)
  {
    sum(new int[]{10,20,30,40,50});
  }
  public static void sum(int[] arr)
  {
    int total=0;
    for(int x: arr)
    total+=x;
    System.out.println("the sum of array is: "+total);
  }
}
