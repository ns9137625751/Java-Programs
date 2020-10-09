public class largest
{
public static void main(String args[])
{
//initialize the value of arrar

int arr1[]={25,11,7,75,56};
int max=arr1[0];
System.out.println("The max. value of array is="+arr1[0]);

//Loop through array
for(int i=0;i<arr1.length;i++)
{
if(arr1[i]>max)
max=arr1[i];
}
System.out.println("The largest value of array is"+max);
}//close main
}//close class
 