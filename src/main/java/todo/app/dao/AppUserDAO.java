package todo.app.dao;

import todo.app.model.AppUser;

import java.util.List;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);
    AppUser findByUsername(String username);
    List<AppUser> findAll();
    void remove(String username);
}
