/*Bonus inherits Salary 
Bonus--->Salary
*/
class Salary {
  int base() {
    return 1000;
  }
}
class Bonus extends Salary {
  int extra() {
    return 100;
  }
}
class Main {
  public static void main(String args[]) {
    Bonus b = new Bonus();
    int total_salary = b.base() + b.extra();
    System.out.println(total_salary);
  }
}

//Output:-
//1100

class Salary {
  int base=1000;
}
class Bonus extends Salary {
    int extra=100;
}
class Main {
  public static void main(String args[]) {
    Bonus b = new Bonus();
    int total_salary = b.base+ b.extra;
    System.out.println(total_salary);
  }
}

//Output:-
//1100
