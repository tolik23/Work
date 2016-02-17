package les.work;

public class UI implements OnButtonClickListener {

	private Button button;

	public UI() {
		// создаем объект кнопки
		button = new Button();
		// передаем ссылку на текущий класс (UI) в объект Button (в виде
		// интерфейса)
		button.setOnClickListener(this);
	}

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
