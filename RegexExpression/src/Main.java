import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi la: ");
        String str = sc.nextLine();
        countWord(str);
        List<String> emailList = checkEmail(sc);
        for(String s : emailList){
            System.out.println(s);
        }

    }

    public static void countWord(String str) {
        char[] chartoArray = str.toCharArray();
        int count = 0;
        for (char s : chartoArray) {
            if (s == 'a') {
                count++;
            }
        }
        System.out.println("So lan xuat hien ki tu a "+ count);
    }

    public static List<String> checkEmail(Scanner sc) {
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        List<String> strEmail = new ArrayList<>();
        System.out.println("Số email cần nhập là");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner sa = new Scanner(System.in);
            boolean isValid = false;
            do {
                System.out.println("Nhập email thứ " + (i + 1) + ": ");
                String email = sa.nextLine();

                if (Pattern.matches(EMAIL_PATTERN, email)) {
                    isValid = true;
                    strEmail.add(email);
                } else {
                    System.out.println("Nhập chuỗi không hợp lệ. Nhập lại");
                }
            }
            while (!isValid);
        }
       return strEmail;
    }
}
