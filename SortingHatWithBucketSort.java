import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// @author Overlord121312 on Github

public class SortingHatWithBucketSort {

    public static void main(String[] args) {
        
        //🇪🇸 leemos los datos y almacenamos todos en un arreglo, de forma tal que el nombre esté sucedido por la casa que corresponde
        
        //🇺🇸 we read the data and we storage it in an array, in such a way that the name is succeeded by the corresponding house
        
        Scanner lectura = new Scanner(System.in);
        int amount = lectura.nextInt();
        int limit = amount * 2;
        String[] names = new String[limit];
        names[0] = lectura.nextLine();
        for (int i = 0; i < limit; i++) {
            names[i] = lectura.nextLine();
        }
        
        //🇪🇸 creamos cuatro 'buckets', uno para cada casa en Hogwarts
        
        //🇺🇸 we create four 'buckets', one for each house in Hogwarts
        
        List<String> Slytherin = new ArrayList<>();
        List<String> Gryffindor = new ArrayList<>();
        List<String> Hupplepuff = new ArrayList<>();
        List<String> Ravenclaw = new ArrayList<>();
        
        //🇪🇸 buscamos los nombres de las casas en el arreglo, y como el arreglo está estructurado de la forma: 'nombre', 'casa', sabemos que al encontrar una casa, el elemento anterior es el nombre que va en el 'bucket' correpondiente
        
        //🇺🇸 we search the array looking for the name of the houses, and because the array in  structured in the form: 'name', 'house', we know that when we find a house, the previous element is the name that goes in the corresponding 'bucket'
        
        for (int i = 0; i < limit; i++) {
            if ("Slytherin".equals(names[i])) {
                Slytherin.add(names[i - 1]);
            } else if ("Gryffindor".equals(names[i])) {
                Gryffindor.add(names[i - 1]);
            } else if ("Hupplepuff".equals(names[i])) {
                Hupplepuff.add(names[i - 1]);
            } else if ("Ravenclaw".equals(names[i])) {
                Ravenclaw.add(names[i - 1]);
            }
        }
        System.out.println("\n");
        System.out.println("Slytherin:");
        for (int i = 0; i < Slytherin.size(); i++) {
            System.out.println(Slytherin.get(i));
        }
        System.out.println("\n");
        System.out.println("Gryffindor:");
        for (int i = 0; i < Gryffindor.size(); i++) {
            System.out.println(Gryffindor.get(i));
        }
        System.out.println("\n");
        System.out.println("Hupplepuff:");
        for (int i = 0; i < Hupplepuff.size(); i++) {
            System.out.println(Hupplepuff.get(i));
        }   
        System.out.println("\n");
        System.out.println("Ravenclaw:");
        for (int i = 0; i < Ravenclaw.size(); i++) {
            System.out.println(Ravenclaw.get(i));
        }
    }

}
