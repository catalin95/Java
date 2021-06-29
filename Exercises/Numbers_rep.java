class Numbers_rep{

  // return a number raised to power of 2
  public static int powerOf2(int power){

    if (power == 0)
      return 1;

    int base = 2, new_number = 1;

    for (int i = 0; i != power; i++)
      new_number *= base;

    return new_number;

 };

  // returns a number raised to power of 16
  public static int powerOf16(int power){

    if (power == 0)
      return 1;

    int base = 16, new_number = 1;

    for (int i = 0; i != power; i++)
      new_number *= base;

    return new_number;

  }

  // method for returning decimalRep of a number, works for a string provided as argument that contains a binary format of the number
  public static int decimalRep(String number){

    int last = number.length() - 1, new_number = 0, index = 0;
    char converted[] = new char[number.length()];

    // prelucrate input, convert string to array of char so can be used further
    for (int i = 0; i != number.length(); i++)
      converted[i] = number.charAt(i);

     while (last != -1){

      // iterate over the value and for each position increase the final number
      if (converted[last] == '0'){
        new_number += 0 * (powerOf2(index));
        index++;
        last--;
      }
      else{
        new_number += 1 * (powerOf2(index));
        index++;
        last--;
      }
    }
    return new_number;
  }

  public static int binaryRep(int number){

    if (number == 0)
      return 0;

    String output = "", output_string = "";
    String[] splited;
    int binary_number;

    while (number != 0){
      output += String.valueOf(number % 2);
      output += "/";
      number /= 2;
    }

    splited = output.split("/");

    for (int i = (output.length() / 2) - 1; i != -1; i--)
      output_string += splited[i];

    binary_number = Integer.parseInt(output_string);
    return binary_number;
  }

  public static String hexadecimalRep(int number){

    int result = 0, last;
    String remainder = "", new_number = "";

    for (int i = 0; i != number; i++){

      result += number % 16;

      if (result == 10){
        remainder += "A";
        result = 0;
      }
      else if (result == 11) {
        remainder += "B";
        result = 0;
      }
      else if (result == 12){
        remainder += "C";
        result = 0;
      }
      else if (result == 13){
        remainder += "D";
        result = 0;
      }
      else if (result == 14){
        remainder += "E";
        result = 0;
      }
      else if (result == 15){
        remainder += "F";
        result = 0;
      }
      else{
        remainder += String.valueOf(result);
        result = 0;
      }
      number /= 16;

      if (number == 0)
        break;
    }

    last = remainder.length() - 1;
    char converted[] = new char[remainder.length()];

    for (int i = 0; i != remainder.length(); i++)
      converted[i] = remainder.charAt(i);

    while (last != -1){
      new_number += converted[last];
      last--;
    }

    return new_number;

  }
}
