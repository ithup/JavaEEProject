package cn.ithuplion.dao;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=1;i<=length;i++){
//			��һ����ô��ӡ
			if(i==1){
//				��ӡ0
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
			}else if(i==length){
//				���һ����ô��ӡ
				for(int j=1;j<=length*2-1;j++){
					if(j%2==0){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
			}else{
//				��ӡ�м䲿��
//				��ӡ0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
				
//				��ӡ*
				System.out.print("*");
				
//				��ӡ0
				for(int j=0;j<(i-1)*2-1;j++){
					System.out.print(" ");
				}
				
//				��ӡ*
				System.out.print("*");
				
//				��ӡ0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
			}
						
			//����
			System.out.println();
		}
	}

}