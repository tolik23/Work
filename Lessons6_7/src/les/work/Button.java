package les.work;

public class Button {
	private OnButtonClickListener listener;
	
	public void setOnClickListener(OnButtonClickListener listener){
		this.listener = listener;
	}
	
	//����� ��� ��������� ����� �� ������, � ���������� ��� �� �����
	public void emulateClick(){
		if (listener != null){
			listener.onClick();
		}
	}

}
