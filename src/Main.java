public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        String str = list.toString();
        System.out.println(str);
        int remove = list.remove(2);
        System.out.println("removeElement "+ remove);
        list.add(2,6);
        System.out.println("list add " + list.add(9));
        System.out.println(list);
        System.out.println("getElement " + list.get(1));
        System.out.println("size list " + list.size());

        list.add(1,11);
        System.out.println(list);
        list.add(5,17);
        System.out.println(list);
        list.add(5,20);
        System.out.println(list);
        list.add(5,21);
        System.out.println(list);
        list.add(5,22);
        System.out.println(list);
        list.add(5,23);
        System.out.println(list);
        list.add(5,24);
        System.out.println(list);
        list.add(5,25);
        System.out.println(list);
        list.add(5,26);
        System.out.println(list);
        list.add(1,1);
        System.out.println(list);
        list.add(1,2);
        System.out.println(list);
        list.add(1,3);
        System.out.println(list);
        list.add(1,4);
        System.out.println(list);
        list.add(1,5);
        System.out.println(list);
        list.add(1,6);
        System.out.println(list);
        list.add(1,7);
        System.out.println(list);
        list.add(1,8);
        System.out.println(list);
        list.add(1,9);
        System.out.println(list);
        list.add(1,10);
        System.out.println(list);
        list.add(1,11);
        System.out.println(list);

        System.out.println("size list " + list.size());


        LinkedList<String> listStr = new LinkedList<>();
        listStr.add("String");
        listStr.add("Integer");
        listStr.add("Array");
        System.out.println("list String " + listStr.toString());
        System.out.println("listStr get 1 " + listStr.get(1));
        System.out.println("listStr size " +listStr.size());
    }
}
