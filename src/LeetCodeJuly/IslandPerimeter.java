package LeetCodeJuly;

public class IslandPerimeter {
    public static void main(String[] args) {
int[][]nums={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
System.out.println(islandPerimeter(nums));
    }
    public static int islandPerimeter(int[][] grid) {
        if (grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }
        int perimeter=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if (grid[i][j]==1) {
                    perimeter =perimeter+ 4;
                    if (i>0&&grid[i-1][j]==1){
                        perimeter=perimeter-2;
                    }
                    if (j>0&&grid[i][j-1]==1){
                        perimeter=perimeter-2;
                    }
                }

            }
        }
        return perimeter;
    }
}
