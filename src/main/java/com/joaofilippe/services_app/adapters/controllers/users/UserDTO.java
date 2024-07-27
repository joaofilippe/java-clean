package com.joaofilippe.services_app.adapters.controllers.users;

import com.joaofilippe.services_app.adapters.controllers.users.requests.CreateUserRequest;
import com.joaofilippe.services_app.adapters.controllers.users.responses.CreateUserResponse;
import com.joaofilippe.services_app.adapters.controllers.users.responses.GetUserByIdResponse;
import com.joaofilippe.services_app.domain.models.User;

public class UserDTO {
    CreateUserResponse toCreateUserResponse(long id) {
        return new CreateUserResponse(id);
    }

    User toUserDomain(CreateUserRequest request) {
        return new User(request.username(), request.email(), request.password());
    }

    GetUserByIdResponse toGetUserByIdResponse(User user) {
        return new GetUserByIdResponse(user.getId(), user.getUsername(), user.getEmail());
    }
}
