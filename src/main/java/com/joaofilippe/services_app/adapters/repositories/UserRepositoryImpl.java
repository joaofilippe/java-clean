package com.joaofilippe.services_app.adapters.repositories;

import com.joaofilippe.services_app.infra.entities.UserEntity;
import com.joaofilippe.services_app.infra.repositories.IUserJpaRepository;
import com.joaofilippe.services_app.domain.models.User;
import com.joaofilippe.services_app.ports.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryImpl implements IUserRepository {
    @Autowired
    private IUserJpaRepository userJpaDB;
    @Autowired
    private UserMapper userMapper;

    public UserRepositoryImpl(IUserJpaRepository userJpaDB, UserMapper userMapper) {
        this.userJpaDB = userJpaDB;
        this.userMapper = userMapper;
    }

    @Override
    public Long save(User user) {
        final UserEntity result = this.userJpaDB.save(userMapper.toEntity(user));
        return result.getId();
    }

    @Override
    public User findById(Long id) {
        final Optional<UserEntity> result = this.userJpaDB.findById(id);
        final UserEntity userDB =  result.orElse(null);

        assert userDB != null;
        return new User(userMapper.fromEntity(userDB));
    }
}
