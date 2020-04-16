/**
* 人
 * @author Chance
 *
 */
public class Person {
	//属性，成员变量，类的成员变量可以先声明，不用初始化，类成员变量是有默认值的
		String name;//姓名，String的默认值是null
		int age;//年龄，int的默认值是0
		
		//行为，方法，也叫函数
		/**
		 * 打印名字
		 */
		public void showName() {//方法名称如果事多个单词，首个单词的首字母大写，这样就像驼峰一样，所以叫驼峰命名法
			System.out.println("姓名：" + name);
			
		}
		/**
		 * 获取年龄
		 * @return
		 */
		public int getAge() {//如果事一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据，使用的是return关键字，返回的数据类型与方法一致
			return age;//方法上定义的int是返回值的类型，return后面跟的是方法的返回值
		}
}
