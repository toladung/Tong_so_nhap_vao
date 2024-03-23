import java.util.ArrayList;
import java.util.Scanner;

public class Nhap_so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> so = new ArrayList<>();
        while (true){
            System.out.println("Nhập số bạn muốn thêm");
            double a = scanner.nextDouble();
            scanner.nextLine();
            so.add(a);
            System.out.println("Số phần tử bạn nhập là : "+ so);
            System.out.println("Bạn có muốn nhập thêm Y or N");
            String chon = scanner.nextLine();
            if(chon.equals("N")||chon.equals("n")){
            break;
            }
        }
        System.out.println("Tổng các giá trị là:");
        double sum =0;
        for (int i =0 ; i<so.size(); i++){
            sum+= so.get(i);}
            System.out.println(sum);



    }
}
