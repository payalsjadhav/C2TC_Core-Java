package Day55;

import java.util.ArrayList;

class main {
  public static void main(String[] args) {

    // hashCode() with String
    String str = new String();
    System.out.println(str.hashCode());  // 0

    ArrayList<Integer> list = new ArrayList<>();
    System.out.println(list.hashCode());  // 1
  }
}
