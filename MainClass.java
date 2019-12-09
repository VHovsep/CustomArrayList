public class MainClass {

    public static void main(String argv[]){
        CustomArrayList<String> customArrayList = new CustomArrayList<>();
        customArrayList.add("Test1");
        customArrayList.add("Test2");
        customArrayList.add("Test3");
        String test1 = customArrayList.get(0);
        System.out.println("First item = " + test1);
    }
}
