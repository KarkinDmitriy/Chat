package ru.gb.core2.chat.chatserver.service;

import ru.gb.core2.chat.chatserver.model.User;

public interface UserService {
    void start();
    void stop();
    String authenticate(String login, String password);
    String changeNick(String login, String newNick);
    User createUser(String login, String password, String nick);
    void deleteUser(String login, String password);
    void changePassword(String login, String oldPassword, String newPassword);
}
