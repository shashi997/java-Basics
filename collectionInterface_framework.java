import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Iterable is a interface which implemented by collection interface.
// collection interface has implements List,Queue,Set interfaces which contains classes in each of them.
// List interface has ArrayList & LinkedList classes
// Queue interface has DeQueue classes.
// Set interface has HashSet & LinkedHashset & TreeSet classes 
// Map interface which not extends the collection interface but it is a concept of collection of collectionAPI/framework.
public class collectionInterface_framework {
    public static void main(String[] args) {
// By default Collection interface works with objects if we not specified type 
// with List interface we get more features(like index & values etc.. ) because ArrayList is class of List interface.
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);    // These values are objects.
        nums.add(8);
        nums.add(2);
        nums.add(6);    // we can add multiple same values in List(ArrayList). 

        System.out.println("Index : " + nums.get(2));

        System.out.println("Value : " + nums.indexOf(8));

        System.out.print("ArrayList : ");

        for(int n : nums)   // if we do not define type it gets error
        {
            System.out.print(n + " ");
        }

        System.out.println();

        Set<Integer> nums1 = new HashSet<Integer>();
        nums1.add(64);
        nums1.add(52);    
        nums1.add(81);
        nums1.add(27);
        nums1.add(64);   // we cannot have the same values in set(HashSet), it will print only once.

        // Set does not have get and indexof method.
        System.out.println();

        System.out.print("HashSet : ");

        for(int n : nums1)   // if we do not define type it gets error
        {
            System.out.print(n + " ");
        }

        
        System.out.println();

        // Treeset can be used with Set/Collection it gives sorted values.
        Collection<Integer> nums2 = new TreeSet<Integer>();
        nums2.add(72);
        nums2.add(43);    
        nums2.add(85);
        nums2.add(27);
        nums2.add(72);   // we cannot have the same values in set(TreeSet), it will print only once.

        // Set does not have get and indexof method.
        System.out.println();

        System.out.print("TreeSet : ");

        // we can also print using iterators.

        Iterator<Integer> values =  nums2.iterator();
        // next method gives only 1 element in values, so we use loop.
        while(values.hasNext())     // hasNext method tells do we have the next element(boolean) 
            System.out.print(values.next() + " ");

        // for(int n : nums2)
        // {
        //     System.out.print(n + " ");
        // }
    }
}
