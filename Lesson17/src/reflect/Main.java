package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.lang.model.element.Modifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		
		Class c = car.getClass();
		
//		try {
//			class0 = Class.forName("reflect.Car");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// получаем имя класса
		System.out.println("class name = " + Car.class.getSimpleName());
		System.out.println("class name = " + car.getClass().getName());
		
		// проверяем какие модификаторы установл у класса
		int mod = c.getModifiers();
		if (java.lang.reflect.Modifier.isPublic(mod)) {
			System.out.println("Car is public");	
		} else {
			System.out.println("Car is not public");
		}
		
		// получ инворм о супперклассе
		Class superC = c.getSuperclass();
		System.out.println("class name = " + superC.getSimpleName());
		
		// получ инворм о супперклассе об интерфейсе
		Class[] classInter = c.getInterfaces();
		for (Class infClass: classInter){
			System.out.println("intef = " + infClass.getSimpleName());
		}
		
		// получ инворм о public переменных
		Field[] fields = c.getFields();
		for (Field f: fields){
			System.out.println("field = " + f.getName());
			
			Class type = f.getType();
			System.out.println("field type = " + type.getName());
		}
		
		
		// получ инворм о private переменных
				fields = c.getDeclaredFields();
				
				for (Field f: fields){
					System.out.println("field D = " + f.getName());
					
					Class type = f.getType();
					System.out.println("field D type = " + type.getName());
				}
		
				
			/// получаем значение поля name
				try{
		Field f = c.getDeclaredField("name");
		f.setAccessible(true);
		String name = (String) f.get(car);
		System.out.println("field name = " + name);
				} catch (Exception e){
					System.out.println("e = " + e.getMessage());
				}
				
				// получ инворм о public методах
				Method[] methods = c.getMethods();
				for(Method m: methods){
					System.out.println("metod public name = " + m.getName());	
				}
				
				// получ инворм о private методах
				methods = c.getDeclaredMethods();
				for(Method m: methods){
					System.out.println("metod private name = " + m.getName());	
				}
				
			/// делаем вывод метода
			
	}
}
