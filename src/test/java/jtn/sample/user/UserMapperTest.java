package jtn.sample.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    void オブジェクトをレコードに_レコードをオブジェクトにマッピングする() {
        User user = new User("高橋優樹", "1234", true);

        userMapper.insert(user);

        User insertedUser = userMapper.find("高橋優樹").orElseThrow();
        assertEquals("1234", insertedUser.password);
    }
}
