/*
			����Լ� �̿��ؼ� DFS(Depth-First-Search)����
			����Լ� ; ��忡 �湮 ������ ��� - �ڽĵ��� ������� ��� ȣ��
			�ڽĵ��� ȣ������� ���������� �ڱ⸦ ����ϰ� �ڽĵ��� ���ȣ��
			��ȯ�ϱ����� �ڽĵ��� ���� ȣ���ϱ� ������ ���ȣ��� ���̿켱 �˻��� ����
			
			ȣ��Ǹ� �ڱ��ڽ��� ���� ����ϰ�
			dfsR(0)
				dfsR(1)
					dfsR(2)
						dfsR(4)
							dfsR(3)
								dfsR(5)
									dfsR(6)
										dfsR(8)
											dfsR(7) - ����
					
			���⼭ ���ð� �ٸ����� �ڽ��� �ϳ� �̻��� ��쿡 
			- ������ �װ� ���� ȣ���� �ϱ� ������ �ڽ��� �� �������� ���� �ְ� ���� ����� ������
			- ���ȣ���� ���������� ȣ���ϱ� ������ ���� ���� ��µȴ�.
 */
package programmers;

import java.util.LinkedList;

public class DFS_TargetNumber_43165 {
	public static void main(String[] args) {
		int[] numbers= {1,1,1,1,1};
		
		solution(numbers, 3);
			
	}

	public static int solution(int[] numbers, int target) {
		int answer = 0;
		
		int size = numbers.length;
		
		return answer;
	}
}



