public class Multidimarray {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int n[] : arr){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
