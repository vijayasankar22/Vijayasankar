public class Frequency {
    public static void main(String[] args) {
        int[] arr = {25,-456,-58,6,44,942,44,6,65,5,459,1,1526,12,2423,5,242,62,2423,561,2,65,2,65,2,65,2,65,2,5,62};
        boolean[] vis = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(vis[i]) continue;
            int count=1;
            for (int j = i+1; j <arr.length ; j++) {
              if (arr[i]==arr[j]) {
                  count++;
                  vis[j]=true;
              }
            }
            System.out.println(arr[i] +" has appeared "+count +" times");
        }
    }
}
