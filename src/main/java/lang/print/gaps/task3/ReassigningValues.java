package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first=1;
        int second=10;
        int third=100;
        Sytem.out.println(first);
        Sytem.out.println(second);
        Sytem.out.println(third);
        int linkToFirst=first;
        int linkToSecond=second;
        int linkToThird=third;
        first=15;
        second=6;
        third=4;
        Sytem.out.println(first);
        Sytem.out.println(second);
        Sytem.out.println(third);
        Sytem.out.println(linkToFirst);
        Sytem.out.println(linkToSecond);
        Sytem.out.println(linkToThird);
    }
}
