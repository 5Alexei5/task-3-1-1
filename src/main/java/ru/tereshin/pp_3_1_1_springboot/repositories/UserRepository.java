package ru.tereshin.pp_3_1_1_springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.tereshin.pp_3_1_1_springboot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
