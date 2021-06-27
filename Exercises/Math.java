public class Math{

   static int logarithm(int base, int number){
    if (number < 0){
      System.out.println("Not a valid number entered, please provide positive numbers");
      return -1;
    }

    int initial = 1, counter = 0;

    while (number % base == 0){
      number /= base;
      counter++;
    }

    return counter;

  }

  static int exponent(int number, int power){
    int newNumber = number, counter = 1;
    if (power == 0)
      return 1;
    else{
      while (counter != power){
        newNumber *= number;
        counter += 1;
      }
    }

    return newNumber;
  }
