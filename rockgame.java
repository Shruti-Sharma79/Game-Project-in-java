import java.util.*;

class rockgame{
	static int n,play=0,comp=0;
	static String s,ch;
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n\nEnter the number of rounds to play");
	n=sc.nextInt();
	
	for(int i=0;i<n;i++){
		Random r= new Random();
		System.out.println("\n\nPlease chose:::\n1.Rock\n2.Scissor\n3.Paper\n(Type your choice::)");
		
		ch=sc.next();
		
		int x=r.nextInt(3);
		if(x==0){
			s="Rock";}
		else if(x==1){
			s="Scissor";
			}
		else{
			s="Paper";
		}
			
		System.out.println("\n\nTHE PLAYER HAS CHOSEN "+ch+"\nTHE COMPUTER HAS CHOSEN "+s);
			
		if(ch.equals(s)){
			System.out.println("\nNo points given as both have "+s);
		}
		
		
		else if(ch.equals("Rock")){
			if(s.equals("Scissor")){
				play++;
			}
			else{
				comp++;
			}
			System.out.println("\n\nThe points of player are "+play+" and of computer are:: "+comp);
		}
		
		
		else if(ch.equals("Scissor")){
			if(s.equals("Paper")){
				play++;
			}
			else{
				comp++;
			}
			System.out.println("\n\nThe points of player are "+play+" and of computer are:: "+comp);
		}
		
		
		else{
			if(ch.equals("Paper")){
				if(s.equals("Rock")){
					play++;
				}
				else{
					comp++;
				}
			}
			System.out.println("\n\nThe points of player are "+play+" and of computer are:: "+comp);
		}
	
	}
	System.out.println("\n\nFINAL POINTS ARE::\nPLAYER== "+play+"\nCOMPUTER== "+comp);
	if(play>comp){
	System.out.println("\n\nPLAYER WON THE GAME !!!!!!!!!!!!!!\n\n");
	}
	else{
	System.out.println("\n\nCOMPUTER WON THE GAME!!!!!!!!!!!!!\n\n");
	}
}
}
