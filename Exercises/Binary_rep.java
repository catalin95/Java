public class Binary_rep{

  public static int binary(int x){
    if (x == 0)
      return 0;

    String output = "", output_string = "";
    String[] splited;
    int binary_number;

    while (x != 0){
      output += String.valueOf(x % 2);
      output += "/";
      x /= 2;
    }

    splited = output.split("/");

    for (int i = (output.length() / 2) - 1; i != -1; i--)
      output_string += splited[i];

    binary_number = Integer.parseInt(output_string);
    return binary_number;

  }

}
