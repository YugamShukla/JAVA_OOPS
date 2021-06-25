/*
Incentives inherits Salary and Bonus inherits Salary
So,it is hierarchial inheritance
*/
class Salary {
  int base = 1000;
}
class Bonus extends Salary {
  int extra = 100;
}
class Incentives extends Bonus {
  int inc = 100;
}
class Main {
  public static void main(String args[]) {
    Incentives b = new Incentives();
    int total_salary = b.base +  b.inc;
    System.out.println(total_salary);
  }
}

//Output:-
//1100
//We cannot call two methods of the classes which 
//inherit from the same classes
