package rvt;
    import java.util.*;
public class javamooc32 {
    public static void main(String[] args) {
        removeLast();
    }
    public static void onlythesenumbers() {
        Scanner reader = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(true) {
            int number = reader.nextInt();
            if(number == -1){
                break;
            }
            list.add(number);

        }
        System.out.print("From where? ");
        int start = reader.nextInt();
        System.out.print("To where? ");
        int end = reader.nextInt();
        for(int i = start; i <= end; i++) {
            System.out.println(list.get(i));
        }  
    }
    public static void listsize() {
        Scanner reader = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true) {
            String name = reader.nextLine();
            if(name == "") {
                break;
            }
            list.add(name);
        }
        System.out.println();
        System.out.println("In total: " + list.size());
    }
    public static void onthelist() {
        Scanner reader = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true) {
            String name = reader.nextLine();
            if(name == "") {
                break;
            }
            list.add(name);
        }
        System.out.println();
        System.out.print("Search for? ");
        String search = reader.nextLine();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(search)) {
                System.out.println(list.get(i) + " was found!");
            } 
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        if(!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }
    
    public static void removeLast(){
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);
        
        System.out.println(strings);

    }
        
    
}
