package les.work;

public class UI implements OnButtonClickListener {

	private Button button;
	private Button button2;

	
	
     ///////// �������� ������  //////////////
	 
	private class InnerClass {
		private void innerTest() {
			
		}
	}
	
	public UI() {
		InnerClass ff = new InnerClass();
		ff.innerTest();
	
	
	
	
	
	
		// ������� ������ ������
		button = new Button();
		button2 = new Button();
		// �������� ������ �� ������� ����� (UI) � ������ Button (� ����
		// ����������)
		button.setOnClickListener(listener1);
		button2.setOnClickListener(listener2);
	}

	private OnButtonClickListener listener1 = new OnButtonClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("�������� ���� 1");
		}
	};
	
private OnButtonClickListener listener2 = new OnButtonClickListener() {
		
		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("�������� ���� 1");
		}
	};
	
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
