package io.haedoang.reactspring.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * packageName : io.haedoang.reactspring.user.domain
 * fileName : User
 * author : haedoang
 * date : 2022-03-28
 * description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private int age;
}
