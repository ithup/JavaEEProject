package cn.ithuplion.dao;

public class Test {
	public static void main(String[] args) {
		int length = 3;
		
		for(int i=1;i<=length;i++){
			//打印出内容
			if(i==1){
				//第一行打印
				//打印0
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
				//打印*
				System.out.print("*");
				
				//打印0
				for(int j=0;j<length-1;j++){
					System.out.print(" ");
				}
				
			}else if(i==length){
//				最后一行
				
				for(int j=1;j<=(length*2-1);j++){
					if(j%2==1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				
			}else{
//				中间
				//打印0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for(int j=0;j<((i-1)*2-1);j++){
					System.out.print(" ");
				}
				
				
				
				System.out.print("*");
				
				//打印0
				for(int j=0;j<length-i;j++){
					System.out.print(" ");
				}
			}
			
			//换行
			System.out.println();
		}
	}
}
