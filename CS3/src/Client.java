
import java.util.Scanner;

public class Client {
    public void start(){
        Scanner sc = new Scanner(System.in);

        boolean isExit = false;
        while(!isExit){
            System.out.println("1.查询联系人");
            System.out.println("2.删除联系人");
            System.out.println("3.添加联系人");
            System.out.println("4.退出");

            int select = sc.nextInt();

            switch (select){
                case 1:{
                    Function.find();
                    break;
                }
                case 2:{
                    Function.delete();
                    break;
                }
                case 3:{
                    Function.add();
                    break;
                }
                case 4:{
                    isExit = true;
                    break;
                }
            }
        }
    }
}
