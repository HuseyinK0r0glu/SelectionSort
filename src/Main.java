public class Main {
    public static void main(String[] args) {

        int[] a = {6,44,86,32,1};

        a = selectionSort(a);

        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public static int[] selectionSort(int[] a){

        exchange(a,1,2);

        int N = a.length;

        for(int i=0;i<N;i++){

            int min = i;

            for(int j=i;j<N;j++){
                if(less(a[j],a[i])){
                    min = j;
                }
            }

            exchange(a,min,i);
        }
        return a ;
    }

    public static int[] exchange(int[] a,int i,int j){

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        return a;
    }

    public static boolean less(int i,int j){

        if(i <= j){
            return true;
        }
        return false;
    }
}