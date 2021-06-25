/*
Incentives ingherits Bomus and Bonus inherits salary
So,it is multilevel inheritance
*/
class Salary {
  int base=1000;
}
class Bonus extends Salary {
    int extra=100;
}
class Incentives extends Bonus{
    int inc= 100;
}
class Main {
  public static void main(String args[]) {
    Incentives b = new Incentives();
    int total_salary = b.base+ b.extra+b.inc;
    System.out.println(total_salary);
  }
}

//Output:-
//1100
