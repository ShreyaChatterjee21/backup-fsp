/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection.framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author khush
 */
public class CollectionFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<String> arr = new ArrayList<String>();
       arr.add("C");
       arr.add("E");
       arr.add("H");
       arr.add("G");
       arr.add(3,"D");
       arr.add("B");
       arr.add("H");
       arr.set(6,"A");
       Collections.sort(arr);
      
       System.out.println(arr);
       System.out.println("B is available?"+arr.contains("x"));
       System.out.println("\n\nThis is the new List");
       ArrayList<String> mobiles = new ArrayList<>();
       mobiles.add("samsung");
       mobiles.add("nokia");
       mobiles.add("redmi");
       mobiles.add("realme");
       System.out.println(mobiles);
       arr.addAll(mobiles);
       System.out.println(arr);
       System.out.println("\n\nThis is the new List");
       ArrayList<String> places = new ArrayList<>();
       places.add("australia");
       places.add("germany");
       places.add("france");
       places.add("argentina");
       arr.addAll(places);
       System.out.println(arr);
       System.out.println(arr.containsAll(mobiles));
       
       ArrayList<String>allData = new ArrayList<>();
       allData = (ArrayList<String>)arr.clone();
       System.out.println("AllData:" +allData);
       //sublisting in an arraylist
       System.out.println("\n\nThis is the new List");
       List<String> MySubList = new ArrayList<>();
       MySubList = arr.subList(3,12);
       System.out.println("My Sub List:"+MySubList);
       System.out.println("This is arr Array List:"+arr);
       arr.removeAll(mobiles);
       System.out.println("This is arr Array List:"+arr);
       
            
    }
    
}
