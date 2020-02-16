public class MinValueOfArray {
    public static void main(String[] args) {
        int[][] array = {{1,-1,3},{4,5,6},{7,8,9}};
//        int a = 0,b = 0;
        int min = array[0][0];
        for(int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                if(min > array[i][j]){
//                    a = i;
//                    b = j;
                    min = array[i][j];
                }
            }
        }
        System.out.println("Min value in array: "+min);
    }
}