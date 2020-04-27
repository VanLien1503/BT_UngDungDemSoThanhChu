import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Số Cần Đọc : ");
        int number=scanner.nextInt();
        String result;
        if (number<10){
            switch (number){
                case 1:
                    result="One";
                    break;
                case 2:
                    result="Two";
                    break;
                case 3:
                    result="Three";
                    break;
                case 4:
                    result="For";
                    break;
                case 5:
                    result="Firve";
                    break;
                case 6:
                    result="sex";
                    break;
                case 7:
                    result="seven";
                    break;
                case 8:
                    result="eig";
                    break;
                case 9:
                    result="nice";
                    break;
                default:
                    result="out of ability";
                    break;
            }
            System.out.println(result);
        }else if (number<100||number>10){
            float dozens=number%10;
            System.out.println(dozens);
        }
    }
}
