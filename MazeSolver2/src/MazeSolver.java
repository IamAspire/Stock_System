import java.util.LinkedList;

public class MazeSolver {
	
	static int [][] Maze ={
						
			{1,1,1,1,0,1,0,1,0,1},
			{0,1,1,1,0,1,0,1,0,0},
			{0,1,1,2,0,1,1,1,0,0},
			{1,1,0,1,1,1,1,1,0,0},
			{1,1,0,1,1,1,1,1,0,0},
			{1,1,0,1,1,1,1,1,0,0}
			
			
		};
	
	
    static LinkedList <Position> path = new LinkedList< Position>();
	
	
	public static void main(String[] args) {
					
	
		solveMaze();
		
		Position p = new Position(0,8);
		path.push(p);
		
		
		
	    while( true) {
	    
	    int X = path.peek().X;
		int Y = path.peek().Y;
			
		Maze[X][Y] = 0;
	    	
		
		
		 //down 
		
		if(isVaild( X+1,Y ) ) {
			
			
		   
		    
		    if (Maze[X+1][Y] == 2 ) {
		    	
		    	System.out.println( " Moved down, you won");
		    	
		    	return;
		    	
		    } else if (Maze[X+1][Y] == 1 ) {
		    	
		    	System.out.println( "Moved down");
		    	
		    	path.push(new Position(X + 1 , Y));
		    	 
		    	continue;
		    	
		    }
			
			
		}
	    	
		
		   //left 
		
	    if ( isVaild(X, Y-1 )) {
	    	
	       
		    
	   if (Maze[X][Y-1] == 2 ) {
		    	
		    	System.out.println( " Moved left, you won");
		    	
		    	return;
		    	
		    } else if (Maze[X][Y-1] == 1 ) {
		    	
		    	System.out.println( "Moved left");
		    	
		    	path.push(new Position(X, Y -1));
		    	 
		    	continue;
		    	
		    }
	    	
	    
	   
	    }
	
	    
	    //up
	    
	    
   if ( isVaild(X -1 , Y )) {
	    
	   
   
   if (Maze[X-1][Y] == 2 ) {
   	
   	System.out.println( " Moved up, you won");
   	
   	return;
   	
   } else if (Maze[X-1][Y] == 1 ) {
   	
   	System.out.println( "Moved up");
   	
   	path.push(new Position(X - 1 , Y));
   	 
   	continue;
   	
   }
   
   }
   
   
 //right 
   
   
   if ( isVaild(X , Y + 1 )) {
   
   
   
   if (Maze[X][Y+1] == 2 ) {
   	
   	System.out.println( " moved right .you won");
   	
   	return;
   	
   } else if (Maze[X][Y+1] == 1 ) {
   	
   	System.out.println( "Moved right");
   	
   	path.push(new Position(X  , Y + 1));
   	 
   	continue;
   	
   }
   
   }
   
   path.pop();
   
   System.out.println( " Moved up ");
   
   if (path.size() <= 0) {
	   
	   System.out.println("No path");
	   
	   return;
	   
   }
	 
	    }
	    
	    
	} 
	
	private static void solveMaze() {
		// TODO Auto-generated method stub
		
	}

	public static boolean isVaild( int X, int Y) {
		
		
		if ( X < 0 ||
			 X >= Maze.length || 
			 Y < 0 ||
			 Y >= Maze[X].length 
		
		) {
			
			return false;
			
		}
		
		return true;
		
	}
	   
	}
    


