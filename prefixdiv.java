import java.util.*;
class prefixdiv{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    int p=0;
    for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
    for(int i=0;i<arr.length;i++){
        p+=arr[i];
        int res=p/(i+1);
        arr[i]=res;
    }
    System.out.println(Arrays.toString(arr));
  }
}/*
5
7
9
4
5
2
[7, 8, 6, 6, 5]      */