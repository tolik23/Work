package les.work;

public class UI implements OnButtonClickListener {

	private Button button;
	private Button button2;

	
	
     ///////// ¬ложеные классы  //////////////
	 
	private class InnerClass {
		private void innerTest() {
			
		}
	}
	
	public UI() {
		InnerClass ff = new InnerClass();
		ff.innerTest();
	
	
	
	
	
	
		// создаем объект кнопки
		button = new Button();
		button2 = new Button();
		// передаем ссылку на текущий класс (UI) в объект Button (в виде
		// интерфейса)
		button.setOnClickListener(listener1);
		button2.setOnClickListener(listener2);
	}

	private OnButtonClickListener listener1 = new OnButtonClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("—работал клик 1");
		}
	};
	
private OnButtonClickListener listener2 = new OnButtonClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("—работал клик 1");
		}
	};
	
	// метод дл€ симул€ции клика на кнопку, в реальности его не будет
	public void emulateClic() {
		button.emulateClick();

	}

	// реализаци€ метода из интерфейса
	@Override
	public void onClick() {
		System.out.println("—работал клик");

	}

}
