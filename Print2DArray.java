public class Print2DArray {
	
	public static void main(String[] args) {
			int n[][]= {{1},{1,2,3},{1},{1,2,3,4},{1,2}};//�迭 ����
			
			
			for(int i=0;i<n.length;i++) {  //�迭�� ��
				for(int j=0;j<n[i].length;j++)  //�迭�� ��
					System.out.print(n[i][j]+"    ");//2���� �迭 ���
				System.out.println();
			}
		}
}
