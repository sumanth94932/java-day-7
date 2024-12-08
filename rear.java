import java.util.*;
class rear{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int s=n.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        arr[i]=n.nextInt();
        int l=0;
        int r=s-1;
        while(l<=r)
        {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}/*
ip:5
9
2
3
6
1
op:[1, 6, 3, 2, 9]       */ 