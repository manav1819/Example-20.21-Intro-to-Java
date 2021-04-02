package test1;

import java.util.Comparator;

public class manav{

    public static void main(String args[]){
        
        GeometricObject[] list = {new Circle(5), new Rectangle(4,5),
            new Circle(5.5), new Rectangle(2.4,5), new Circle(0.5),
            new Rectangle(4,65), new Circle(4.5), new Rectangle(4.4,1),
            new Circle(6.5), new Rectangle(4,5)};

        System.out.println(list[0]);
    }

    public static <E> void selectionSort (E[] list, Comparator<? super E> comparator){
    
        for(int i=0; i<list.length; i++){
            int minInd= i;
            for(int ind = i +1; ind<=list.length; ind++){
                if(comparator.compare(list[ind],list[minInd])>0){
                    minInd=ind;
                }    
            }
            E temp = list[i];
            list[i] = list[minInd];
            list[minInd] = temp;
        }
    }
}