package cn.ithuplion.dao;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 5;
		
		for(int i=1;i<=length;i++){
//			第一行怎么打印
			if(i==1){
//				打印0
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
			}else if(i==length){
//				最后一行怎么打印
				for(int j=1;j<=length*2-1;j++){
					if(j%2==0){
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}
			}else{
//				打印中间部分
//				打印0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
				
//				打印*
				System.out.print("*");
				
//				打印0
				for(int j=0;j<(i-1)*2-1;j++){
					System.out.print(" ");
				}
				
//				打印*
				System.out.print("*");
				
//				打印0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
			}
						
			//换行
			System.out.println();
		}
	}

}
