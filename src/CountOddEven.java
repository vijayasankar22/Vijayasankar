public class CountOddEven {
    public static void main(String[] args) {
        int[] arr = {25,456,58,6,4,96,2,9,4,5,9,1,6,12,3,5,2,6,23,56,2,65,2,65,2,65,2,65,2,5,62};
        int odd=0,even=0;
        for(int i: arr){
            if((i&1)==1) odd++;
            else even++;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
        System.out.println(arr.length);
    }
}
