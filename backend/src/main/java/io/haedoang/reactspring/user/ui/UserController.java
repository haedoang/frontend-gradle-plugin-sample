package io.haedoang.reactspring.user.ui;

import io.haedoang.reactspring.user.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * packageName : io.haedoang.reactspring.user.ui
 * fileName : UserController
 * author : haedoang
 * date : 2022-03-28
 * description :
 */
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> users = Arrays.asList(
                new User("mike", 21),
                new User("peter", 32),
                new User("jane", 18)
        );

        return ResponseEntity.ok().body(users);
    }
}


