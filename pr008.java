//Рекурсия 
class Factorial { 
  int factR(int n) { 
    int result; 
 
    if(n==1) return 1; 
    result = factR(n-1) * n; 
    return result; 
  } 
  int factI(int n) { 
    int t, result; 
    result = 1; 
    for(t=1; t<=n; t++) 
      result *= t; 
    return result; 
  } 
} 
//Статические переменные 
class StaticDemo { 
  int x; 
  static int y; 
 
  int sum() { 
    return x + y; 
  } 
} 
class StaticBlock { 
  static double rootof2; 
  static double rootof3; 
  static { 
    System.out.println("Внутри статического блока"); 
    rootof2 = Math.sqrt(2.0); 
    rootof3 = Math.sqrt(3.0);     
  } 
  StaticBlock(String msg) { 
    System.out.println(msg); 
  } 
} 
class Outer { 
  int[] nums; 
  Outer(int[] n) { 
    nums = n; 
  } 
 
  void analyze() { 
    Inner inOb = new Inner(); 
    System.out.println("Минимальное значение: " + inOb.min()); 
    System.out.println("Максимальное значение: " + inOb.max()); 
    System.out.println("Среднее значение: " + inOb.avg()); 
  } 
 
  //Внутренний класс 
  class Inner { 
    int min() { 
      int m = nums[0]; 
      for(int i=1; i<nums.length; i++) 
        if(nums[i] < m) m = nums[i]; 
      return m; 
    } 
    int max() { 
      int m = nums[0]; 
      for(int i=1; i<nums.length; i++) 
        if(nums[i] > m) m = nums[i]; 
      return m; 
    } 
    int avg() { 
      int a = 0; 
      for(int i=0; i<nums.length; i++) 
        a += nums[i]; 
      return a/nums.length; 
    } 
  } 
} 
class VarArgs { 
  static void vaTest(int ... v) { 
    System.out.println("Количество аргументов: " + v.length); 
    System.out.println("Содержимое массива аргументов: "); 
    for(int i =0; i<v.length; i++) 
      System.out.println(" аргумент " + i + ": " + v[i]); 
    System.out.println(); 
  } 
  static void vaTest2(String msg, int ... v) { 
    System.out.println(msg + v.length); 
    System.out.println("Содержимое массива аргументов: "); 
    for(int i =0; i<v.length; i++) 
      System.out.println(" аргумент " + i + ": " + v[i]); 
    System.out.println(); 
  } 
  static void vaTest3(int ... v) { 
    System.out.println("vaTest3(int ...)" + "Количество аргументов: " + v.length); 
    System.out.println("Содержимое массива аргументов: "); 
    for(int i =0; i<v.length; i++) 
      System.out.println(" аргумент " + i + ": " + v[i]); 
    System.out.println(); 
  } 
  static void vaTest3(boolean ... v) { 
    System.out.println("vaTest3(boolean ...)" + "Количество аргументов: " + v.length); 
    System.out.println("Содержимое массива аргументов: "); 
    for(int i =0; i<v.length; i++) 
      System.out.println(" аргумент " + i + ": " + v[i]); 
    System.out.println(); 
  } 
  static void vaTest3(String msg, int ... v) { 
    System.out.println("vaTest3(String, int ...)" + "Количество аргументов: "msg + v.length); 
    System.out.println("Содержимое массива аргументов: "); 
    for(int i =0; i<v.length; i++) 
      System.out.println(" аргумент " + i + ": " + v[i]); 
    System.out.println(); 
  } 
} 
