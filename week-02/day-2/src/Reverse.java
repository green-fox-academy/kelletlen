import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse {
  public static void main(String[] args) {
    String toBereversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    StringBuilder input1 = new StringBuilder();
    input1.append(toBereversed);
    input1 = input1.reverse();

    System.out.println(input1);
  }
}

