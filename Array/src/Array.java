
public class Array {
    public static void main(String[] args) {
        int[] num = new int[]{2,3,4,5,6,7,8};
        for(int i:num)
        {
            System.out.print(i+"\t");
        }
        System.out.print("""


                """);
        int[][] arr = new int[8][8];
        int[][][] jagged = new int[2][][];
        jagged[0]=new int[1][];
        jagged[1]=new int[2][];;
        jagged[0][0]=new int[2];
        jagged[1][0]=new int[1];
        jagged[1][1]=new int[5];
        for(int i = 0;i< arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int[] i:arr)
        {
            for (int j:i)
            {
                System.out.print(j+"\t");
            }
            System.out.print('\n');
        }
        for(int[] i:jagged)
        {
            for (int[] j:i)
            {
                for (int k:j)
                {
                    System.out.println(k);
                }
            }
        }

    }
}
