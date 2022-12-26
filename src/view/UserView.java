package view;

import data.User;

import java.util.List;

public abstract class UserView {
    public void showTheBest(List<User> userList)
    {
        System.out.println(findUser(userList));
    }
public abstract User findUser(List<User> userList);
}
