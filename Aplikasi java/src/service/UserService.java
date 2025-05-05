package service;

import model.Person;

public interface UserService<T extends Person> {
    void tambahUser(T user);
    void tampilkanSemua();
}
