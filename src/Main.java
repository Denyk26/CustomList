public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{4, 3, 6, 13, 6, 5, 2, 16});
        System.out.println(customList);
        customList.remove(6);
        System.out.println(customList);
        customList.shiftByIndex(3);
        System.out.println(customList);
        customList.removeByIndex(5);
        System.out.println(customList);
        customList.removeAllByIndex(4);
        System.out.println(customList);
    }
}