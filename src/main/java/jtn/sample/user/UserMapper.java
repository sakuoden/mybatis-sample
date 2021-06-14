package jtn.sample.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserMapper {
    void insert(@Param("user") User user);

    Optional<User> find(@Param("username") String username);
}
