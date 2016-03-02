import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String a = null;
		
		while(true) {
			System.out.println("Введите эллемент/ # - выход");
			a = sc.nextLine();
			if(a.equals("#")) {
				break;
			} else {
				list.add(a);
			}
		}
		
		System.out.println(list);
	
	for (int i = 0; i < list.size(); i++) {
		a = list.get(i).replaceAll("a", "");
		list.set(i, a);
	}
	System.out.println(list);
	
	/////////    удаляем дубликаты ///////////////
	
	HashSet<String> hashSet = new HashSet<String>(list);
	
	list.clear();
	
	list.addAll(hashSet);
	
	System.out.println(list.toString());
	
	///////////////////
	
	ArrayList<Human> man = new ArrayList<Human>();
	ArrayList<Human> woman = new ArrayList<Human>();
	
	man.add(new Human("Люторович" , "Анатолий", "Сергеевич"));
	man.add(new Human("Иванов" , "Иван", "Иванович"));
	man.add(new Human("Петров" , "Петр", "Петрович"));
	woman.add(new Human("Сидорова" , "Ольга", "Сидоровна"));
	woman.add(new Human("Иванова" , "Анна", "Ивановна"));
	woman.add(new Human("Петрова" , "Инна", "Петровна"));
	
	Map<String, ArrayList<Human>> hashmap = new HashMap<String, ArrayList<Human>>();
	
	hashmap.put("man", man);
	hashmap.put("woman", woman);
	
	Random random = new Random();
	int key = 1;
	System.out.println("1 - man / 2 - woman");
	
		key = sc.nextInt();
	if (key == 1) {
		System.out.println(hashmap.get("man").get(random.nextInt(man.size())).toString());
	} else {
		System.out.println(hashmap.get("woman").get(random.nextInt(woman.size())).toString());
	}
	}

}
