/**
 * 动物的类
 * @author Chance
 *
 */

public class Animal {
	String name;//动物的名称
	int eye;//描述眼镜的个数
	int legs;//多少条腿
	/**
	 * 输出动物吃的食物
	 * @param food 食物
	 */
	public void eat(String food) {//string food这个叫方法的参数
		System.out.println("此种动物的食物是："+food);
	}
	/**
	 * 动物的移动方式
	 * @param moveType 移动方式 
	 */
	public void move(String moveType) {
//		int i=0;方法局部变量
		System.out.println("此种动物的移动方式："+moveType);
		
	}
}
