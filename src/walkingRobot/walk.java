//package walkingRobot;



public class walk {
	static String currentPosition;
	static int x;
	static int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	System.out.println("enter command");
			//System.in.
			System.out.println("entered command "+ args[0]+" "+args[1]+" "+args[2]+" "+args[3]);
			
			currentPosition=args[2];
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			
			String walkCommand=args[3];
			int l=walkCommand.length();
			int i=0;
			char c; 
			int step;
			while(i<l)
			{	
				try {
					c=walkCommand.charAt(i);
					i++;
					if(walkCommand.charAt(i)=='W')
					i++;// for w
					else
					{
						System.out.print("print proper command, 'W' missing");
						break;
					}
					char s=walkCommand.charAt(i);
					
					step=Character.getNumericValue(s);
				
					if(currentPosition.equals("NORTH"))
					{
						if(c=='R')
						{
							x=x+step;	
							currentPosition="EAST";
							i++;
							continue;
						}
						if(c=='L')
						{	x=x-step;
						currentPosition="WEST";
						i++;
						continue;
						}
						
					}
					if(currentPosition.equals("SOUTH"))
					{
						if(c=='R')
						{
							x=x-step;	
							currentPosition="WEST";
							i++;
							continue;
						}
						if(c=='L')
						{	x=x+step;
						currentPosition="EAST";
						i++;
						continue;
						}
						
					}
					if(currentPosition.equals("EAST"))
					{
						if(c=='R')
						{
							y=y-step;	
							currentPosition="SOUTH";
							i++;
							continue;
						}
						if(c=='L')
						{	y=y+step;
						currentPosition="NORTH";
						i++;
						continue;
						}
						
					}
					if(currentPosition.equals("WEST"))
					{
						if(c=='R')
						{
							y=y+step;	
							currentPosition="NORTH";
							i++;
							continue;
						}
						if(c=='L')
						{	y=y-step;
						currentPosition="SOUTH";
						i++;
						continue;
						}
						
					}
					
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
				
			}
			System.out.println("output= "+x+" "+y+" "+currentPosition);
			
	}
	//public 

}
