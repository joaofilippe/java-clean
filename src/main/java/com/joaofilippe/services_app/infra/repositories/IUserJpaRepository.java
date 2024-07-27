package com.joaofilippe.services_app.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joaofilippe.services_app.infra.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public interface IUserJpaRepository extends JpaRepository<UserEntity, Long> {
}
