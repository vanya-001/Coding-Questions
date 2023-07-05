/*
    A warehouse manager neeeds to create a shipment to file a truck. ALl of the products in the warehouse are in boxes of the same size. Each product is packed in some number of units per box. Given the number of boxes the truck can hold, determine the maximum number of units of any mix of products that can be shipped.

    Example:-
    boxes =[1,2,3]
    unitsPerBox = [3,2,1]
    truckSize = 3

    Max number of units that can be shipped is 3+2+2 = 7units.
*/

package JPMorgan;

import java.util.*;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array");
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println("Number of boxes");
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        System.out.println("Quantity of boxes");
        for(int i=0; i<n; i++){
            b.add(sc.nextInt());
        }
        System.out.println("Enter the size of truck");
        int size = sc.nextInt();
        System.out.println("After sorting");
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i=0; i<n; i++){
            temp.put(b.get(i), a.get(i));
        }
        TreeMap<Integer, Integer> tm = new TreeMap<Integer,Integer>(temp);
        Iterator itr = tm.descendingKeySet().iterator();
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println(key + " " + temp.get(key));
        }

        int sum=0;
        for(Map.Entry<Integer, Integer> entry : temp.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            // if(size > 0){
            //     int units = Math.min(size, value);
            //     sum += units * key;
            //     size -= units;
            // }
            if(size >= value){
                sum += (key*value);
                size -= value;
            }
            else if(size < value){
                sum += (key*size);
                size=0;
            }
            
            if(size <= 0){
                break;
            }
        } 
        
        System.out.println("Max. Sum: " + sum);
        sc.close();        
    }
}
