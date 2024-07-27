package com.joaofilippe.services_app.adapters.repositories;

import com.joaofilippe.services_app.domain.models.User;
import com.joaofilippe.services_app.infra.entities.UserEntity;

public class UserMapper {
     UserEntity toEntity(User user) {
        return new UserEntity(
                user.getId(),
                user.getUsername(),
                user.getEmail(),
                user.getPassword()
        );
    }

     User fromEntity(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getPassword()
        );
    }
}
