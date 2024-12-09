//Очередь
class Queue {
	char[] q;
	int putloc, getloc; //Указатели на элементы очереди
	
	Queue (int size) {
		q = new char[size];
		putloc = getloc = 0;

	}

	//Метод для помещения символа в очередь
	void put(char ch) {
		if(putloc==q.length) {
			System.out.println("Невозможно вставить символ, так как очередь переполнена.");
			return;
		}
		q[putloc++] = ch;
	}
	
	//Метод для извлечения символа из очереди
	char get() {
		if(getloc == putloc) {
			System.out.println(" - невозможно извлечь символ, так как очередь пуста");
			return (char) 0;

		}
		return q[getloc++];
	}
		
}
class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Использование очереди bigQ для сохранения символов");
		for(i = 0; i < 26; i++)
			bigQ.put((char)('A' + i));

		//Извлекаем элементы из очереди bigQ
		System.out.print("Содержимое bigQ: ");
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char)0)
				System.out.print(ch);
		}
		System.out.println("\n");

		//Использование очереди smallQ
		for(i = 0; i < 5; i++) {
			System.out.print("Попытка сохранения " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		System.out.print("Содержимое smallQ: ");
		for(i = 0; i < 5; i++) {
			ch = smallQ.get();
			if(ch != (char) 0) 
				System.out.print(ch);
		}
		//bigq.q[3] = 'E'; Попытка измненеия значения у закрытой переменной класса Queue
		//bigq.putloc = 50; Попытка изменения закрытого указателя в классе Queue

		Queue q1 = new Queue(10);
		char[] name = {'I','v','a','n'};

		Queue q2 = new Queue(name);
		//char ch;
		System.out.println();
		int i2;
		for(i2=0; i2<10;i2++)
			q1.put((char) ('A' + i2));
		Queue q3 = new Queue(q1);

		System.out.print("Содержимое q1: ");
		for(i2 = 0; i2<10; i2++) {
			ch = q1.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		System.out.print("Содержимое q2 (на базе массива): ");
		for(i2 = 0; i2<4; i2++) {
			ch = q2.get();
			System.out.print(ch);
		}
		System.out.println("\n");
		System.out.print("Содержимое q3 (на базе очереди q1): ");
		for(i2 = 0; i2<10; i2++) {
			ch = q3.get();
			System.out.print(ch);
		}
		System.out.println("\n");
	}
}
