package cn.ithuplion.dao;

public class Test {
	public static void main(String[] args) {
		int length = 3;
		
		for(int i=1;i<=length;i++){
			//��ӡ������
			if(i==1){
				//��һ�д�ӡ
				//��ӡ0
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
				//��ӡ*
				System.out.print("*");
				
				//��ӡ0
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
				
			}else if(i==length){
//				���һ��
				
				for(int j=1;j<=(length*2-1);j++){
					if(j%2==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
			}else{
//				�м�
				//��ӡ0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int j=0;j<((i-1)*2-1);j++){
					System.out.print(" ");
				}
				
				
				
				System.out.print("*");
				
				//��ӡ0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
			}
			
			//����
			System.out.println();
		}
	}
}