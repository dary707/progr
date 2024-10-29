//Побитовые операции:& | >> >>> << ~

class pr006 {
	public static void main(String[] args) {
		//Сброс 6 - го бита кодировки символа (побитовая операция "И")
		char ch;
		for (int i=0; i<25; i++) {
			ch = (char) ('a' +i);
			System.out.print(ch);		
			ch = (char) ((int )ch & 65503);
			System.out.print(ch + " ");
		}
		System.out.println();

		//ОТображеие битового представления байта 

		System.out.println();

		byte val = 100;
		val = (byte) 'b';
		for (int t = 128; t > 0; t=t/2) {
			if((val&t) !=0) System.out.print("1 ");
			else System.out.print("0 ");
		}
		System.out.println();

		//Установления 6-ого бита в кодировке символа(побитовая операция "ИЛИ")

		System.out.println();

		for (int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);
			ch = (char) ((int) ch | 32);
			System.out.print(ch + " ");
		}
		System.out.println();

		//Примитивное шифрование (побитовая операция "исключающее ИЛИ")

		System.out.println();

		String msg = "исходная тестовая строка";
		String enmsg = "";
		String demsg = "";

		int key =88;
		System.out.println("Незашифрованное сообщение: " + msg);

		//Цифрование сообщения 
		
		for(int i = 0; i<msg.length(); i++)
			enmsg = enmsg + (char) (msg.charAt(i)^key);
		System.out.println("Зашифрованное сообщение: " + enmsg);

		//Дешифрование сообщения
		for(int i = 0; i < msg.length(); i++)
			demsg = demsg + (char) (enmsg.charAt(i)^key);
		System.out.println("Дешифрованное сообщение " + demsg);

		//операция побитового "НЕ"

		System.out.println();

		byte b = -34;

		for (int t=128; t > 0; t = t/2) {
			if ((b&t)!=0)
				System.out.print("1 ");
			else
				System.out.print("0 ");
		}
		System.out.println();
	}
}
