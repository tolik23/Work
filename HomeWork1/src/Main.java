import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "djkjnpokjpushgjyfsdu";
System.out.println(str.length());

String str1 = str.substring(0, str.length() / 2);
String str2 = str.substring(str.length() / 2);

System.out.println(str1);
System.out.println(str2);

////////////////

Random rand = new Random();

int a;
a = rand.nextInt();
System.out.println(a);
if (a % 10 ==7) {
	System.out.println("����");
}
else {
	System.out.println("�� ����");
}

/////////////////////

int b, c, r;
b = 4;
c = 3;
r = 3;

if (r*2 > Math.sqrt(b*b + c*c)) {
	System.out.println("�������");
}
else {
	System.out.println("�� �������");
}

/////////////


int smRub = rand.nextInt(10000);
String mz = "�";
String ja = "�";
String ej = "��";

str = Integer.toString(smRub);

char last = str.charAt(str.length() - 1);

switch (last) {
case '1':
	System.out.println(smRub + " ����" + mz);
	break;

case '0': case '5': case '6': case '7': case '8': case '9':
	System.out.println(smRub + " ����" + ej);
	break;
	
case '2': case '3': case '4':
	System.out.println(smRub + " ����" + ja);
	break;
}

//////////////////////

String stroka = "dfoij#k#?jnlk?k#bj?";

for(int i = 0; i < stroka.length(); i++) {
	
	stroka = stroka.replace("#", "");
	stroka = stroka.replace("?", "HELLO");
}
System.out.println(stroka);
  }
}



