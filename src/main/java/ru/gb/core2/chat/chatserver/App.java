package ru.gb.core2.chat.chatserver;

import ru.gb.core2.chat.chatserver.service.impl.InMemoryUserServiceImpl;

public class App {
    public static void main(String[] args) {
        new Server(new InMemoryUserServiceImpl()).start();
    }
}
