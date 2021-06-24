package algols;

public class Main {
    static int[] a = {11,14,23,56,26,34,65,21,41,31,5,3,1,98,29,14};
    public static void main(String[] args) {
        quickSort(a,0,a.length-1);
         for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void quickSort(int[] a,int start,int end)
    {
        if(start<end)
        {
            int pos=partition(a,start,end);
            quickSort(a,start,pos-1);
            quickSort(a,pos+1,end);
        }
    }
    
    public static int partition(int[] a,int start,int end)
    {
        int i = start;
        int j = end;
        while(i<j)
        {
            int pivot = a[start];
            
            while(a[i]<=pivot && i<a.length-1)
            {
                i++;
            }
            while(a[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                int temp = a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        int temp = a[start];
        a[start]=a[j];
        a[j]=temp;
        return j;
    }
}