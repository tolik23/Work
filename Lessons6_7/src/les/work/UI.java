package les.work;

public class UI implements OnButtonClickListener {

	private Button button;

	public UI() {
		// ������� ������ ������
		button = new Button();
		// �������� ������ �� ������� ����� (UI) � ������ Button (� ����
		// ����������)
		button.setOnClickListener(this);
	}

	// ����� ��� ��������� ����� �� ������, � ���������� ��� �� �����
	public void emulateClic() {
		button.emulateClick();

	}

	// ���������� ������ �� ����������
	@Override
	public void onClick() {
		System.out.println("�������� ����");

	}

}
