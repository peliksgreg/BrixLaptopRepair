package apc.entjava.photogallery.businesslogic;

import apc.entjava.photogallery.model.User;

/**
 * Created by jacobcat on 12/2/2016.
 */
public interface UserService {
    void register(User newUser);
    User login(String userName, String password);
}
