package hiding;

public class HideGet {
    public static void main(String[] args) {
        HideTest hideTest = new HideTest();
        System.out.println(hideTest.s3);
        Hide hide = new Hide();
        System.out.println(hide.name);
    }
}
