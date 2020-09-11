public class Print2DArray {
	
	public static void main(String[] args) {
			int n[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};//배열 생성
			
			
			for(int i=0;i<n.length;i++) {  //배열의 행
				for(int j=0;j<n[i].length;j++)  //배열의 열
					System.out.print(n[i][j]+"    ");//2차원 배열 출력
				System.out.println();
			}
		}
}
