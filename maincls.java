package tictoe;
import java.util.*;
public class maincls {
	static int checkcon(String mat[][]) {
		int temp=0;
		for(int i=0;i<8;i++) {
			String winner=null;
		switch (i) {
		case 0:
			winner=mat[0][0]+mat[0][1]+mat[0][2];
			break;
		case 1:
			winner=mat[1][0]+mat[1][1]+mat[1][2];
			break;
		case 2:
			winner=mat[2][0]+mat[2][1]+mat[2][2];
			break;
		case 3:
			winner=mat[0][0]+mat[1][0]+mat[2][0];
			break;
		case 4:
			winner=mat[0][1]+mat[1][1]+mat[2][1];
			break;
		case 5:
			winner=mat[0][2]+mat[1][2]+mat[2][2];
			break;
		case 6:
			winner=mat[0][0]+mat[1][1]+mat[2][2];
			break;
		case 7:
			winner=mat[0][2]+mat[1][1]+mat[2][0];
			break;
		}
		if(winner.equals("xxx")) {
			System.out.println("X is the winner");
			temp=1;
			break;
		}
		else if(winner.equals("yyy")) {
			System.out.println("Y is the winner");
			temp=1;
			break;
		}
		
		}
		return temp;
	}
	public static void main(String[] args) {
		String mat[][]= {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		int temp[]= {0,0,0,0,0,0,0,0,0};int checktemp=0;output obj=new output();int turn=2;String player="x";
		while(checkcon(mat)!=1) {
			obj.main(mat);
			 System.out.println("enter the number:");
				Scanner Sc=new Scanner(System.in);
				int num=Sc.nextInt();
				if(num<1&&num>9) {
					System.out.println("enter a valid number btw 1-9");
				}
				else {
					int temp2=0;
					for(int i=0;i<temp.length;i++) {
					if(temp[i]==num) {
						temp2=1;
					}
					}
					if(temp2==0) {
					temp[checktemp]=num;checktemp++;
					if(turn%2==0) {
						player="x";
					}
					else {
						player="o";
					}
					
					if(num==1) {
						mat[0][0]=player;turn++;
					}
					else if(num==2) {
						mat[0][1]=player;turn++;
					}
					else if(num==3) {
						mat[0][2]=player;turn++;
					}
					else if(num==4) {
						mat[1][0]=player;turn++;
					}
					else if(num==5) {
						mat[1][1]=player;turn++;
					}
					else if(num==6) {
						mat[1][2]=player;turn++;
					}
					else if(num==7) {
						mat[2][0]=player;turn++;
					}
					else if(num==8) {
						mat[2][1]=player;turn++;
					}
					else if(num==9) {
						mat[2][2]=player;turn++;
					
					}
					}
					else {
						System.out.println("dont repeat the same number.");
					}
				}
				
		}

	}

}
