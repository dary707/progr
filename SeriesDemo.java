class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		for(int i = 0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее значение: " + ob.getPrevious());
		System.out.println("\nСброс последовательности к стартовому значению");
		ob.reset();
		for(int i=0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее значение: " + ob.getPrevious());
		System.out.println("\nУстанавливаем стартовое значение");
		ob.setStart(100);
		for(int i=0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Последнее предыдущее значение: " + ob.getPrevious());
		
		//Последовательность "через 3"
		System.out.println();
		System.out.println("\nНовая последовательность");
		for(int i=0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob3.getNext());
		//System.out.println("Последнее предыдущее значение: " + ob.getPrevious());

		System.out.println("\nСброс последовательности к статровому значению");
		ob3.reset();
		for(int i = 0; i< 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob3.getNext());
		//System.out.println("Последнее предыдущее значение: " + ob.getPrevious());
		
		System.out.println("\nУстанавливаем новое стартовое значене" );
		ob3.setStart(100);
		for(int i = 0; i < 5; i++)
			System.out.println("Следующее значение в последовательности: " + ob3.getNext());
		//System.out.println("Последнее предыдущее значение: " + ob.getPrevious());
		//
		//Демонстрация использования интерфейсной переменной
		Series obInt;

		for(int i = 0; i <5; i++) {
			obInt = ob;
			System.out.println("Следующее значение в последовательности ByTows: "+ obInt.getNext());
			obInt = ob3;
			System.out.println("Следующее значение в последовательности ByTows: "+ obInt.getNext());
		}	
	}
}
