public class MaximumMinimum {
    public static void main(String[] args) {
        int[] a  = {54,56,4,24,8,2,6,4,246,2,4,825,456,5,52,8,5,5,6,5,5,6,4,8,5,6,2,55,6,5,5,65};
        int max = a[0], min=a[0];
        for(int i =0; i<a.length;i++){
            if(a[i]>max) max=a[i];
            if(a[i]<min) min=a[i];
        }

        System.out.println("Maximum Number:"+ max +" Minimum Number: "+ min );
    }
}
