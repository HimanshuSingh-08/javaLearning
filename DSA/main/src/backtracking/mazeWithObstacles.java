package backtracking;

public class mazeWithObstacles {
    public static void main(String[] args) {
        boolean [][] maze = {{true,true,true},{true,false,true},{true,true,true}};
        printAvailablePaths("",maze,0,0);

        //Function to print all paths
    }

    // now till now we have mostly iterated through a maze with certain condition.
    // what if we are not allowed to go through a specific cell

    public static void printAvailablePaths(String p , boolean [][] maze, int row , int col){
        // when i have reached to a bottom in that case i have to print
        if(row == maze.length-1 && col == maze[0].length-1){
            //is case me we have to print as ham or age nahi ja sakte hai
            System.out.println(p);
            return ;
        }

        // now we have to explore right and down and move forward
        if(row < maze.length) printAvailablePaths(p + "D", maze ,row +1, col);
        if(col < maze[0].length) printAvailablePaths(p + "R", maze ,row, col+1);

    }
}
