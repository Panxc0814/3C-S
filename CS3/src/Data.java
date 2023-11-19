


import java.util.ArrayList;

public class Data {

    private static ArrayList<User> users = new ArrayList<>();

    public static void init(){
        users.add(new User("潘兴成","18812345446","成都市"));
        users.add(new User("赵子龙","11561123120","常山"));
        users.add(new User("孙悟空","12345678912","花果山"));
        users.add(new User("猪八戒","12345688912","高老庄"));
    }


    public static ArrayList<User> getAllUser(){
        return users;
    }

    public static void deleteUserByName(String name){
        for (User user:users){
            if(user.getName().equals(name)){
                users.remove(user);
                break;
            }
        }
    }

    public static void addUser(User user){
        users.add(user);
    }
}
