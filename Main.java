//1/31/2021
import java.util.*;     //You have to import java.util.*; inorder to get this package.

class Main 
{
  public static void main(String[] args) 
  {
      Scanner scan = new Scanner(System.in);

      ArrayList <String> lastName = new ArrayList <String>();    //This is how you creat an arraylist
      lastName.add("Organa");       //This is the built in add method.
      lastName.add("Skywalker");
      lastName.add("Fett");
      System.out.println(lastName);
      lastName.add(1, "Solo");      //Adding name to position 1.
      System.out.println(lastName);
      System.out.println();
      System.out.println("Size of lastName: " + lastName.size());   //gives the length.
      System.out.println();
      System.out.println("String removed: " + lastName.remove(2));    //This removes items from the arraylist.
      System.out.println("Size of lastName with removed position: " + lastName.size());   //note that array list will fill the gap by sliding arrays down.
      lastName.set(3, "kenobi");    //This builtin method changes the contents of the position to something else.
      System.out.println(lastName);
      System.out.println("Size of lastName with changed item: " + lastName.size());
      //lastName.clear();
      System.out.println(lastName);
      System.out.println("Size of lastName after cleared: " + lastName.size());

      Integer one = new Integer(1);
      Double two = new Double(2.0);
      String three = "3";

      //lastName.add(one);
      //lastName.add(two);
      //lastName.add(three);

      ArrayList demo = new ArrayList();     //We tried removing the data type to see what happens when we add multiple different data types.
      demo.add(one);
      demo.add(two);
      demo.add(three);
      System.out.println(demo);   //this works for future reference if you want to store multiple data types.

      //Traverse starts here.

      for (int i =0; i<lastName.size(); i++)    //Using for loop to print each spot in the array.
      {
        System.out.println("Item " + (i+1) + ": " + lastName.get(i));
      }

      for (int i = lastName.size()-1; i >= 0; i--)      //Using a for loop to print each spot starting from the end of the array
      {
        System.out.println("Item " + (i+1) + ": " + lastName.get(i));
      }
      lastName.add("Grevous");    //adding two more names.
      lastName.add("Palpatine");

      for (String e: lastName)    //Printing from lowest index value to highest intex value
      {
        System.out.println(e);
      }

      ArrayList <String> letters = new ArrayList<String>();
      letters.add("A");
      letters.add("B");
      letters.add("C");
      letters.add("D");
      letters.add("E");
      letters.add("F");

      for (int i = 0; i<letters.size(); i++)
      {
        for (int j = 0; j<lastName.size(); j++)
        {
          if (letters.get(i).equals(lastName.get(j).substring(0, 1)))
          {
            System.out.println(lastName.get(j) + " Starts with " + letters.get(i));
          }
        }
      }
  }
}