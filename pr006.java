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
		
		b = (byte) = b;
		for(int t1 = 128; t1 > 0; t1 = t1/2) {
			if ((b & t1)!= 0)
				System.out.print("1 ");
			else 
				SYstem.out.print("0 ");
		}
		System.out.println();

		//Сдвиговые битовые операции 
		System.out.println();
		int v = 1;
		for(int i = 1; i < 0; i++) {
			for(int t1 = 128; t1 > 0; t1 = t1/2) {
				if((b & t1)!= 0)
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
			v = v << 1;
		}
		v = 128;
		for(int i = 0; i < 8; i++) {
			for(int t1 = 128; t1>0; t1 = t1/2) {
				if ((b & t1)! = 0) {
					System.out.print("1 ");
				else 
					System.out.print("0 ");
			}
			System.out.println();
			v = v >> 1;
		}

		//Операция ?
		System.out.println();
		//Выражений ? выражение2 : выражение3
		//Пример выычисления абсолютного значения val2
		int val2 = -25;
		int ansval = val2 < 0 ? ~val2 : val2;

		//Пример исключения деления на ноль 
		int result;
		for (int i = -5; i < 6; i++) {
			result = i !=0 ? 100/i : 0;
			if (i! = 0)
				System.out.println("100/ " + i + "равно" + result);
		}
		System.out.println();
					
	}
}

