class pr002 {
        public static void main(String args[]) {
                byte b, bb, bbb; //8-битная переменная
                short s, ss, sss; //16-битная переменная
                int i, ii, I; //32-битная переменная
                long l, ll, L; //64-битная переменная
                b = 127;
                bb = (byte)130;
                s = 32000;
                ss = (short)33000;
                System.out.println("bb = " + bb + "\nss = " + ss);
                sss = 100;
                //bbb = sss; Автообразование типов запрещено, так как может привести к искажению значений
                bbb =(byte)sss;
                System.out.println("bbb = " + bbb + "\nsss = " + sss);

                //Пример использования различных целых типов
                ii = 700000; // длина сторона куба в мм
                int V = ii*ii*ii; // объем куба в кубических мм
                System.out.println("Объем куба: " + V);
                long VV = (long)ii*ii*ii;
                System.out.println("Правильно вычесленный объем куба: " + VV);

                double d, dd;
		d = b/2;
                System.out.println("d = " + d);
                dd = (double)b/2;
                System.out.println("dd = " + dd);

		//символьный тип данных
		System.out.println("Примеры использования символьного типа\n");
		char ch;
		ch = 'D';
		System.out.println("Значение ch: " + ch);
		ch++;
		System.out.println("Новое значение ch: " + ch);
                ch = 97;
                System.out.println("Новое значение ch с кодом 97: " + ch);
                I = (int)ch;
                System.out.println("Код ch: " + I);
                ch = 'A';
                for (i=0; i<63; i++) {
                        I = (int)ch;
                        System.out.print("Код символа " + ch + ": " + I + " \n");
                        ch++;
                }

		
                //Логический тип данных
                System.out.println("Примеры использования логического типа\n");
                boolean bool;
                bool = false;
                System.out.println("Значение bool: "+ bool);
                bool = true;
                System.out.println("Значение bool: "+ bool);
                if(bool)
                System.out.println("Выводим строку, если \"bool\" true");
                if(!bool)
                System.out.println("Выводим строку, если инверсия \"bool\" true");
                bool = ch=='я';
                if(bool)
                System.out.println("Символ ch равен \"я\"");  
	}
}
