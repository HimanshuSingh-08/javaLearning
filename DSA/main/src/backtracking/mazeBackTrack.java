package backtracking;

import java.util.Arrays;

public class mazeBackTrack {
    public static void main(String[] args) {
        boolean [][] maze = {{true,true,true},{true,true,true},{true,true,true}};
//        printAvailablePathsAllDirection("",maze,0,0);
        int [][] path = new int[3][3];
        printAvailablePathsAllDirection("",maze,0,0,0,path);
    }

    // Now till now we are moving
    public static void printAvailablePathsAllDirection(String p , boolean [][] maze, int row , int col){
        // when i have reached to a bottom in that case i have to print
        if(row == maze.length-1 && col == maze[0].length-1){
            //is case me we have to print as ham or age nahi ja sakte hai
            System.out.println(p);
            return ;
        }
        // now in case if we dont want to include specific cell in path then in that case we just have to
        // stop the recursion

        if(!maze[row][col]) return;

        // now we have to explore all the direction.
        maze[row][col] = false;

        //move down
        if(row < maze.length -1) printAvailablePathsAllDirection(p + "D", maze ,row +1, col);

        //move right
        if(col < maze[0].length -1) printAvailablePathsAllDirection(p + "R", maze ,row, col+1);

        //move up
        if(row >0) printAvailablePathsAllDirection(p+ "U", maze,row-1, col);

        //move back

        if(col > 0) printAvailablePathsAllDirection(p+"B",maze, row, col-1);

        // revert kar har us change ko jo tune kiya hai
        maze[row][col] = true;
    }

    // now as we are free to move in any direction we have to make it ensure ki we should not go
    // those cells again where we already been there we have to avoid those.
    // but in that case there are high chances ki jab ham dusre path try kare honge us kaise me ho sakta hai.
    // ki wo hamne false mark kardiya hai and there fore last recursive call hote waqt hame un changes ko revert karna hoga
    // this is why it is called as backtrack remove those changes while coming back to original function calls made.


    // now if we want to return the arrays to print the solution in that case

    public static void printAvailablePathsAllDirection(String p , boolean [][] maze, int row , int col, int steps,int[][] path){
        // when i have reached to a bottom in that case i have to print
        if(row == maze.length-1 && col == maze[0].length-1){
            //is case me we have to print as ham or age nahi ja sakte hai
            path[row][col] = steps;
            for(int [] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        // now in case if we dont want to include specific cell in path then in that case we just have to
        // stop the recursion

        if(!maze[row][col]) return;

        // now we have to explore all the direction.
        maze[row][col] = false;
        path[row][col] = steps;
        //move down
        if(row < maze.length -1) printAvailablePathsAllDirection(p + "D", maze ,row +1, col,steps +1, path);

        //move right
        if(col < maze[0].length -1) printAvailablePathsAllDirection(p + "R", maze ,row, col+1,steps +1, path);

        //move up
        if(row >0) printAvailablePathsAllDirection(p+ "U", maze,row-1, col,steps +1, path);

        //move back

        if(col > 0) printAvailablePathsAllDirection(p+"B",maze, row, col-1,steps +1, path);

        // revert kar har us change ko jo tune kiya hai
        maze[row][col] = true;
        path[row][col] = 0;
    }

}
