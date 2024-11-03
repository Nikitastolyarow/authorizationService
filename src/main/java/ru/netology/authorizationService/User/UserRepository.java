package ru.netology.authorizationService.User;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationService.Model.Authorities;

import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private final Map<String, String> userAndPassword = Map.of(
            "Nikita", "12345",
            "Anna", "67890",
            "John", "54321"
    );

    private final Map<String, List<Authorities>> userAuthorities = Map.of(
            "Nikita", List.of(Authorities.READ, Authorities.WRITE),
            "Anna", List.of(Authorities.READ, Authorities.WRITE),
            "John", List.of(Authorities.READ, Authorities.WRITE)
    );

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (userAndPassword.containsKey(user) && userAndPassword.get(user).equals(password)) {
            return userAuthorities.get(user);
        }
        return List.of();
    }
}
