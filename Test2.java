public class Test2 {
	public static void main(String[] args) {
//		for(int i=0;i<150;i++) {
//			String str ="";
//			str +=i;
//			if(i%3==0) {
//				str +="foo";
//			}
//			if(i%5==0) {
//				str +="biz";
//			}
//			if(i%7==0) {
//				str +="baz";
//			}
//			System.out.println(str);
//		}
		
//		//奇数和
//	int j=0;	
//	for(int i=1;i<=100;i++) {
//		if(i%2!=0) {
//			j+=i;
//			}	
//		}
//	System.out.println("result="+j);
		
//		
//		//打印1~100之间所有是7的倍数的整数的个数及总和
//		int result=0;
//		int j=0;
//		for(int i=1;i<=100;i++) {
//			if(i%7==0) {
//				result+=i;
//				j+=1;
//				System.out.println(i);
//			}
//		}
//		System.out.println("一共有"+j+"个");
//		System.out.println("结果是"+result);
		
//		//水仙花数是一个三位数其各个位数的立方的和等于本身
//		for(int i=100;i<=999;i++) {
//			int x=i/100;
//			int y=(i-x*100)/10;
//			int z=(i-x*100-y*10);
//			int m=x*x*x+y*y*y+z*z*z;
//			if(m==i) {//判断是否为水仙花数
//				System.out.println(m);
//			}	
//		}
		
		
//		//while循环
//		int i=1;
//		while (i<=100) {
//			System.out.println(i);
//			i++;
//		}
//		
//		//do while 循环
//		int m=1;
//		do {
//			System.out.println(m);
//			m++;
//		}while(m<=100);
//		
//		//do while 循环
//		int m=1;
//		do {
//			System.out.println(m);
//			m++;
//		}while(m<=100);
		
		
		//循环嵌套九九乘法表
//		for(int i=1;i<=9;i++) {
//			for(int j =1;j<=i;j++) {
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//			System.out.println();
//		}
		
		
//		*
//		**
//		***
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		***
//		**
//		*
//		for(int i=3;i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<9;i++){
//			if(i%2==0) {
//				continue;//结束当前这次循环，直接到下一次循环
//			}
//			System.out.println(i);
//		}
		
		
//		for(int i = 0;i < 9;i++) {
//			if(i==7) {
//				return;//这里和使用break感觉一样，但是实际上啊return是把整个方法结束了，break只是终止了当前循环
//			}
//			System.out.println(i);
//		}
		
		
//		for(int i = 0; i < 2;i++) {
//			for(int j = 0;j < 2; j++) {
//				if(j ==1) {
////					return;这里和使用break感觉一样，但是实际上啊return是把整个方法结束了，break只是终止了当前循环
//					break;
//				}
//			}
//			System.out.println(i);
//		}
		/**
		 * break只能用于swich循环语句和循环语句中；
		 * continue只能用于循环语句中
		 * 二者功能类似，但continue是终止本次循环，break是终止本层循环
		 * break、continue之后不能有其他语句，应为程序永远不会执行其后的语句
		 */
		
		//存放多个数据的集合,即为数组
		//例如，存放多个int的类型数据,下面是两种定义方式；
//		int[] i;
//		int ii[];
//		//		动态初始化
//		int[]i1=new int[4];//声明一个能放4个int类型数据的数据
//		//		静态初始化
//		int[] i2=new int[] {1,2,4,3};//声明了一个存放了1、2、3、4这四个数的数组
		
		
//		String[] strs =new String[] {"a","b","c"};//数组内的元素都有1个应用的元素下标，这个的下标是个数字，数字是从左到右，从零开始的
//		
//		System.out.println(strs[2]);
//		
//		System.out.println("strs的数组长度是"+strs.length );//输出数组长度
//		
//		int[] i =new int [2];
//		i[0]=1;
//		System.out.println(i[0]);
//		System.out.println(i[1]);//使用动态初始化的时候，数组的元素会有默认值，数字的默认值是0，对象的默认值是null；
		
	}
}
