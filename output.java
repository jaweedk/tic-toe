package tictoe;

public class output {

	int main(String[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.print(" "+ mat[i][j]+"|");
			}
			System.out.println();
			System.out.print("--|--|--|");
			System.out.println();
		
			
		}
		return 0;

	}

}
