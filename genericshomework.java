// Module 6 Generics Programming Project
// Glenney Tello 3/30/2022
//Part 1 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class GenericsHomework {
    
    public static void main(String[] args){
//array values with returns using print
       Integer level[]={2,4,6,8};
       System.out.println("Pokemon Level:");
       Printer<Integer> printer = new Printer<Integer>(4);
       printer.print();
//Double Example      
     System.out.println("Health:");
       Printer<Double> doublePrinter = new Printer<> (17.1);
       doublePrinter.print();
// String Example
     System.out.println("Pokemon:");
     ArrayList<String> pokemons = new ArrayList <>(Arrays.asList("Bulbasaur","Chamander", "Squirtle", "Pikachu", "Eevee",
        "Mew"));
//returns using ArrayList and get     
    System.out.println(pokemons.get(1));
//Integer Example     
     System.out.println("Attack:");
     ArrayList<Integer> pokemonsAttack = new ArrayList <>(Arrays.asList(5,10,15,20,25));
    System.out.println(pokemonsAttack.get(0));
//Double Example
    System.out.println("Defense:");
     ArrayList<Double> pokemonsDefense = new ArrayList <>(Arrays.asList(10.5,15.7,17.8,23.9));
    System.out.println(pokemonsDefense.get(3));

    }
}
//Q1: "what is the first index in a Java array?"- The first index in a Java array is 0
//Sources: https://www.youtube.com/watch?v=K1iu1kXkVoA
