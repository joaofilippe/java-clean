package com.joaofilippe.services_app.ports.services;

import com.joaofilippe.services_app.adapters.controllers.users.requests.CreateUserRequest;
import com.joaofilippe.services_app.domain.models.User;

public interface IUserService {
    Long createUser(CreateUserRequest user);
    User getById(Long id) throws Exception;
}
