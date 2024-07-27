package com.joaofilippe.services_app.ports.repositories;

import com.joaofilippe.services_app.domain.models.User;

public interface IUserRepository {
    Long save(User user);
    User findById(Long id);
}
