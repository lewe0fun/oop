package view;

import data.User;

import java.util.List;

public abstract class UserView <U extends User>{
    public void showTheBest(List<U> userList) {
        System.out.println(findUser(userList));
    }

    public abstract U findUser(List<U> userList);
}
