package com.joaofilippe.services_app.adapters.controllers.users;

import com.joaofilippe.services_app.adapters.controllers.users.requests.CreateUserRequest;
import com.joaofilippe.services_app.domain.models.User;
import com.joaofilippe.services_app.domain.usecases.CreateUserAction;
import com.joaofilippe.services_app.domain.usecases.GetUserByIdAction;
import com.joaofilippe.services_app.ports.repositories.IUserRepository;
import com.joaofilippe.services_app.ports.services.IUserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
public class UserController implements IUserService {
    UserController(IUserRepository repository, UserDTO userDTO){
        this.createUser = new CreateUserAction(repository);
        this.getById = new GetUserByIdAction(repository);
        this.userDTO = userDTO;
    }

    //useCases
    private final CreateUserAction createUser;
    private final GetUserByIdAction getById;
    private final UserDTO userDTO;
    @PostMapping
    @Override
    public Long createUser(@RequestBody CreateUserRequest request) {
        return this.createUser.execute(userDTO.toUserDomain(request));
    }

    @GetMapping("/{id}")
    @Override
    public User getById(
           @PathVariable("id") Long id) {
        return this.getById.execute(id);
    }
}
