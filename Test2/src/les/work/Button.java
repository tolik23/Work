package les.work;

public class Button {
	private OnButtonClickListener listener;
	
	public void setOnClickListener(OnButtonClickListener listener){
		this.listener = listener;
	}
	
	//метод дл€ симул€ции клика на кнопку, в реальности его не будет
	public void emulateClick(){
		if (listener != null){
			listener.onClick();
		}
	}

}
