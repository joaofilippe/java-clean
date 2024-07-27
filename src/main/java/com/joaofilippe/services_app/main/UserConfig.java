package com.joaofilippe.services_app.main;

import com.joaofilippe.services_app.adapters.controllers.users.UserDTO;
import com.joaofilippe.services_app.adapters.repositories.UserMapper;
import com.joaofilippe.services_app.domain.usecases.CreateUserAction;
import com.joaofilippe.services_app.domain.usecases.GetUserByIdAction;
import com.joaofilippe.services_app.ports.repositories.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserAction createUserAction(IUserRepository iUserRepository){
        return new CreateUserAction(iUserRepository);
    }

    @Bean
    GetUserByIdAction getUserByIdAction(IUserRepository iUserRepository){
        return new GetUserByIdAction(iUserRepository);
    }

   @Bean
    UserMapper userMapper(){
        return new UserMapper();
    }

   @Bean
    UserDTO userDTO(){
        return new UserDTO();
    }
}
