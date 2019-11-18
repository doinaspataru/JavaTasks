import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class CharList {
    private String s;

    private static ArrayList <Character> container;

    CharList() {
        container = new ArrayList<>();
    }

   public CharList(String a) {
        char[]chars = a.toCharArray();
        container=new ArrayList<>();
        for(int i = 0; i< chars.length;i++)
        {
            container.add(chars[i]);
        }
       System.out.println(container);
    }

    public CharList(ArrayList<Character> str)
    {
        this.container=str;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(container.size());
        for (char s : container) {
            sb.append(s);
        }
        String list1 = sb.toString();
        return list1;
      
    }

    public static int length(CharList list){
        return container.size();

    }

    public static char charAtIndex(int index){
         return container.get(index);
    }

    public static int indexOf (char x ) {
       return container.indexOf(x);
    }

    public static String subString (int start, int end){
        CharList list = new CharList(container);
        return list.toString().substring(start, end);
    }

   static CharList removeDuplicates() {

        LinkedHashSet hs=new LinkedHashSet(container); 
        ArrayList <Character> list1 = new ArrayList <> (hs);
       CharList list3 = new CharList(list1);
       return (list3);
    }
    static CharList removeAll (char x){
       
        container.removeAll(Arrays.asList(x));
      
        CharList list = new CharList(container);
        return list;
       
    }

    static CharList removeFirst ( char x ){
        int index = container.indexOf(x);
        container.remove(index);
        CharList remove_first = new CharList( container);
        return remove_first;
    }

    static boolean isEmpty () {
        return container.isEmpty();
    }

    static boolean contains (char k) {
        return container.contains(k);
    }

    CharList sortList () {
        Collections.sort(container);
        CharList a = new CharList(container);
        return a;

    }

    CharList reverseList () {
        Collections.reverse(container);
        CharList a = new CharList(container);
        return a;

    }

    CharList mixedList () {
        Collections.shuffle(container);
        CharList a = new CharList(container);
        return a;
    }

    static CharList clearList (){
       container.clear();
        CharList remove_first = new CharList( container);
        return remove_first;

    }

    public static void main(String[] args) {
        ArrayList <Character> listfinal= new ArrayList<> ();
        listfinal.add('d');
        listfinal.add('o');
        listfinal.add('i');
        listfinal.add ('i');
        listfinal.add ('n');
        listfinal.add ('a');
        listfinal.add ('i');
        CharList listfinal2 = new CharList(listfinal);
        System.out.println("CharList is: "+ listfinal2);
        System.out.println("toString is: "+ listfinal2.toString());
        System.out.println("The length is: "+ length(listfinal2));
        System.out.println("The char on the index "+ 3 + "is: " + listfinal2.charAtIndex(3));
        System.out.println("The index of o is: "+ listfinal2.indexOf('o'));
        System.out.println("The subString is: "+ listfinal2.subString(2, 4));
        System.out.println("Remove Dublicates: " + listfinal2.removeDuplicates());
        System.out.println("Remove all i: " + listfinal2.removeAll('i'));
        System.out.println("Remove first o: "+listfinal2.removeFirst('o'));
        System.out.println("isEmpty? : "+listfinal2.isEmpty());
        System.out.println("Contains i?: "+ listfinal2.contains('i'));
        System.out.println("Sorted list: " + listfinal2.sortList());
        System.out.println("Reversed list: " + listfinal2.reverseList());
        System.out.println("Mixed List: " + listfinal2.mixedList());
        System.out.println("ClearList: " + listfinal2.clearList());
        System.out.println("isEmpty?: " + listfinal2.isEmpty());

// Hi all,
// As promised sending you all the presentation(you can find it in attachments) and your homework
// Implement CharList class (like String using ArrayList as value).
// Don`t use String objects in CharList class.
// All methods excluding constructors and toString should be implemented without "for" expression.
// Look at Collections, Lists methods and use them at maximum.
// Implement:
// CharList()
// CharList(String s)
// private CharList(ArrayList<Character> list) - it will help you to implement other methods.
// methods:
// String toString()
// int length() - returns CharList length.
// char charAt(int index) - returns char value for the particular index
// int indexOf(char c) - returns the specified char value index.
// CharList subString(int start, int end) - returns substring for given begin index.
// CharList removeDuplicates() - remove duplicates symbols using collections.
// CharList replaceFirst(Character c) - remove first occurrences of the specified char value.
// CharList removeAll(Character c) - remove all occurrences of the specified char value.
// boolean isEmpty() - returns true is CharList is empty.
// boolean contains(Character c) - returns true is CharList contains the specified char value.
// CharList clearList() - returns cleared CharList.
// CharList sortList() - returns sorted CharList.
// CharList reverseList() - returns reversed CharList.
// CharList mixedList() - returns CharList with mixed elements.

    }



}
