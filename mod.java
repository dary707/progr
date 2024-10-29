//Управление доступом к членам класса 
class Mod {
	private int alpha; //закрытая переменная 
	public int beta;  //открытая переменная
	int gamma; //переменная с доступом по умолчанию
	void setAlpha(int a) {
		alpha = a;
	}
	int getAlpha() {
		return alpha;
	}
	
}
class FailSoftArray {
	private int[] a;
	private int errval;
	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return errval;
	}
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}
}
class pr007 {
	public static void main(String[] args) {
		Mod ob = new Mod();
		//Изменение и просмотр значения закрытой переменной осуществляется через методы, задания внутри класса Mod)
		ob.setAlpha(77);
		System.out.println("Значение ob.alpha: " + ob.getAlpha());

		//Прямой доступ к переменной запрещен ob.alpha = 100;
		ob.beta = 242;
		ob.gamma = 34;

		//Пример использования работы класса оказоустойчивого поведения массива 
		System.out.println();
		FailSoftArray fs = new FailSoftArray(5, -999);
		int x;

		//Пример работы класса без вывода сообщений о неправильных идексах

		System.out.println("Скрытая от пользования обработка ошибок: ");
		for(int i = 0; i <(fs.length * 2); i++)
			fs.put(i, i*10);
		for(int i = 0; i <(fs.length * 2); i++)
			x = fs.gett(i);
			if(x != -999) SYstem.out.print(x + " ");
		}
		System.out.println();

		//Пример работы класса с выводом сообщений об ошибках
		
		for(int i = 0; i<(fs.length * 2); i++)
			if (!fs.put 
	}
}
