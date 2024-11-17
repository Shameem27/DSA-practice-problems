public class CheckEqualArr {
    public boolean checkArr(String[] arr1, String[] arr2){
        String s1 = String.join("",arr1);
        String s2 = String.join("",arr2);
        return s1.equals(s2);
    }
    public static void main(String[] args) {
        CheckEqualArr ca = new CheckEqualArr();
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        System.out.println(ca.checkArr(arr1, arr2));
    }
}
