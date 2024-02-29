import java.util.*;

public class SubMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        System.out.println("enter marks of each subject");
        int phy, chem, eng;
        phy = sc.nextInt();
        chem = sc.nextInt();
        eng = sc.nextInt();
        System.out.println("phy:" + phy);
        System.out.println("chem:" + chem);
        System.out.println("eng:" + eng);
        double per = (phy + chem + eng) / 3;
        System.out.println("percentage is " + per + "%");

    }

}
