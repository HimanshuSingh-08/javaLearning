package backtracking;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        int [][] maze = new int[3][3];
//        int ans = getAllPathsCount(maze.length-1, maze[0].length-1);
//        System.out.println(ans);
//        printAllPaths("",3,3);
        ArrayList<String> ans = getAllPathsUsingDiagonal("",3,3);
        System.out.println(ans);

    }

    // we need a function to get all the paths for a maze
    // here we are having the count of the paths that are there to be printed.

    public static int getAllPathsCount(int row , int col){

        // base case : jab bhi koi wall hit hogi to mujhe ek path mil chuka hoga
        if( row == 0 || col == 0) {
            return 1;
        }
        int count = 0;
        // now we have to explore firt all down and then all right
        count = count + getAllPathsCount(row -1 , col);
        count = count + getAllPathsCount(row , col-1);

        return count;
    }

    // now what if wanted to print all the possible paths.
    public static void printAllPaths(String p , int row, int col){
        // Here i have to go till the end
        if(row == 1 && col ==1 ){
            System.out.println(p);
            return;
        }
        if(row > 1)printAllPaths(p +"D",row-1,col);
        if(col > 1) printAllPaths(p+"R",row,col-1);
    }

    // Till now we have used only right and down approach.
    //now if consider the diagonal path two in that case we need a different approach.
    // Lets create a function to print allpaths using diagonal path too.

    public static void printAllPathsUsingDiagonal(String p ,int row , int col){
        // Here i have to go till the end
        if(row == 1 && col ==1 ){
            System.out.println(p);
            return;

        }
        if(row > 1)printAllPathsUsingDiagonal(p +"D",row-1,col);
        if(col > 1) printAllPathsUsingDiagonal(p+"R",row,col-1);
        if(row > 1 && col>1) printAllPathsUsingDiagonal(p+"x", row-1, col-1);
    }

    // if want ans in a array list.

    public static ArrayList<String> getAllPathsUsingDiagonal(String p , int row , int col){
        // Here i have to go till the end
        if(row == 1 && col ==1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        //local storage
        ArrayList<String> list = new ArrayList<>();
        if(row > 1)list.addAll(getAllPathsUsingDiagonal(p +"D",row-1,col));
        if(col > 1) list.addAll(getAllPathsUsingDiagonal(p+"R",row,col-1));
        if(row > 1 && col>1) list.addAll(getAllPathsUsingDiagonal(p+"x", row-1, col-1));

        return list;
    }
}
