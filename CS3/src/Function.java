




import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Scanner;

public class Function {

    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户的姓名");
        String userName = sc.next();
        System.out.println("请输入用户的电话号码");
        String phoneNumber = sc.next();
        System.out.println("请输入用户的地址");
        String address = sc.next();

        Data.addUser(new User(userName,phoneNumber,address));
    }

    public static void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的用户的姓名");
        String name = sc.next();
        Data.deleteUserByName(name);
    }

    public static void find() {
        ArrayList<User> result = Data.getAllUser();
        result.forEach(user->{
            System.out.println(user.toString());
        });
    }
}
