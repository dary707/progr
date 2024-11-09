//Управление доступом к членам класса 
class Mod {
        private int alpha; //закрытая переменная 
                public int beta; // открытая переменная 
                int gamma; //переменная с доступом по умолчанию
                void setAlpha(int a) {
                        alpha = a;
                }
                int getAlpha() {
                        return alpha;
                } 
}
//Пример передачи объектов методам
class   Block {
          int a, b, c;
          int v;
  
        Block(int i, int j, int k) {
                a = i;
                b = j;
                c = k;
                V = a * b * c;
        }
        
        //Проверка эквивалентности двух параллепипедов
        boolean sameBlock(Block ob) {
                if((ob.a == a)& (ob.b == b) & (ob.c == c)) return true;
                else return false;
        }

        //Проверка равенства объемов 
        boolean sameV(block ob) {
                if(ob.V == V) return true;
                else return false;
        }
}
//Класс отказоустойчивого массива 
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
        }
        private boolean indexOK(int index) {
                if(index >= 0 & index < length)
                        return true;
                return false;
        }
}

                 
