package assesment;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] scores= new int[]{90,80,70};
        int[] array ={90,80,70};

        //ArrayList<String> scores = new ArrayList<String>();
       // scores.add(90-100,"A");
        //scores.add(80-89,"B");
        //scores.add(70-79,"C");

        Student s1 = new Student("Andrew ","Oluoch",scores);
        System.out.println(s1);

        for (int element: array){
            System.out.println(element);
        }

    }

}
