import java.util.*;  
class Main {

  public static void main(String[] args) {
    String[] names = {"Sam", "Finn", "Hannah", "Alanna", "Matt", "Isaac", "Rowan", "Lettie"};
    List<String> list = new ArrayList<String>();

    for (int i = 0; i < names.length; i++) {
      list.add(new String(names[i]));
    }

    Collections.shuffle(list);
    Collections.rotate(list, 1);

    /* for (int a = 0; a < 6; a++) {
      System.out.println(list.get(a));
    }
    System.out.println("\n"); 
    */

    boolean b = false;
    while (b != true) {
      for (int c = 0; c < names.length; c++) {
        if (names[c].equals(list.get(c))) {
          Collections.shuffle(list);
          Collections.rotate(list, 1);
          b = false;
          } else {
          b = true;
        }
      }
    }
    
    for (int i = 0; i < (names.length); i++) {
      System.out.println(names[i] + " is going to give to " + list.get(i));
    }
  }
}
