import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import data.Goods;
import data.Root;

public class Pub {

	Root root;
	List<Goods> goodsPub;
	
	public final String LINK_XML = "http://kiparo.ru/t/pub.xml";
	public final String LINK_JSON = "http://kiparo.ru/t/pub.json";
	
	// меню выбора файла и парсера
	public void mainMenu() {

		while (true) {
			String mainMenu = "1 - Загрузить файл xml.\n2 - Загрузить файл json, использовать парсер Gson.\n3 - Загрузить файл json, использовать парсер JACKSON.\n0 - выход. ";
			System.out.println(mainMenu);
			switch (scan()) {
			case 1:
				Menu2();
//				fileXml();
				break;
			case 2:
				Menu2();
//				fileJsonGson();
				break;
			case 3:
				Menu2();
//				fileJsonJexon();
				break;
			case 0:
				return;
			}
		}
	}
	
	
	// меню работы со списком пива
	public void Menu2() {

		while (true) {
			String Menu2 = "1 - Информация о Pub.\n2 - Пивная карта Goods.\n3 - Найти по номеру.\n4 - Найти по названию.\n5 - Сортировать по названию.\n6 - Сортировать по цене.\n3 - Сортировать по стране производителю.\n0 - выход. ";
			System.out.println(Menu2);
			switch (scan()) {
			case 1:
				PubInformation();
				break;
			case 2:
				System.out.println(goodsPub.toString());
				break;
			case 3:
				System.out.println("Введите намер пива.");
				find(scan());
				break;
			case 4:
				System.out.println("Введите название пива.");
				Scanner sc = new Scanner(System.in);
				find(sc.nextLine());
				break;
			case 5:
				sortByName();
				break;
			case 6:
				sortByPrice();
				break;
			case 7:
				sortByCountry();
				break;
			case 0:
				return;
			}
		}
	}
	
	
	// информация о пабе
	public void PubInformation() {
		System.out.println("\n" + root.getName() + "\n" + root.getLocation()
				+ "\n" + "Emails: " + root.getEmails().toString());
	}
	
	// поиск по id
	public void find(int id) {
		for (int i = 0; i < goodsPub.size(); i++) {
			if (goodsPub.get(i).getId() == id) {
				System.out.println(goodsPub.get(i).toString());
				return;
			}
		}
		System.out.println("Пиво с таким № отсутствует.");
	}
	
	// поиск по названию
	public void find(String name) {
		for (int i = 0; i < goodsPub.size(); i++) {
			if (goodsPub.get(i).getName().equals(name)) {
				System.out.println(goodsPub.get(i).toString());
				return;
			}
		}
		System.out.println("Пиво с таким названием отсутствует.");
	}
	
	// сортировка по названию
	private void sortByName() { 
		goodsPub.sort(new SortByName());
		System.out.println(goodsPub.toString());
	}
	
	// сортировка по стране
	private void sortByCountry() { 
		goodsPub.sort(new SortByName());
		System.out.println(goodsPub.toString());
	}
	
	// сортировка по цене
	private void sortByPrice() { 
		goodsPub.sort(new SortByPrice());
		System.out.println(goodsPub.toString());
	}
	
	
	
	// компаратор для сортировки по имени
	class SortByName implements Comparator<Goods> {

		public int compare(Goods obj1, Goods obj2) {

			String str1 = obj1.getName();
			String str2 = obj2.getName();

			return str1.compareTo(str2);
		}
	}
	
	
	// компаратор для сортировки по стране
	class SortByCountry implements Comparator<Goods> {

		public int compare(Goods obj1, Goods obj2) {

			String str1 = obj1.getCountry();
			String str2 = obj2.getCountry();

			return str1.compareTo(str2);
		}
	}
		
	// компаратор для сортировки по цене	
	class SortByPrice implements Comparator<Goods> { 

		public int compare(Goods obj1, Goods obj2) {

			int price1 = obj1.getPrice();
			int price2 = obj2.getPrice();

			if (price1 > price2) {
				return 1;
			} else if (price1 < price2) {
				return -1;
			} else {
				return 0;
			}
		}
	}
		
	
	
	
	// сканер общий
	private int scan() {

		int key;
		Scanner sc = new Scanner(System.in);

		while (true) {
			if (sc.hasNextInt()) {
				key = sc.nextInt();
				break;
			} else {
				System.out.println("Неверное значение.");
			}
		}
		return key;

	}
}
	

