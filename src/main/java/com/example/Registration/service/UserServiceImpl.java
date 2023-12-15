package Implimentation;

import Respository.UserRepository;
import Service.UserService;
import com.example.Registration.dtos.request.UserRequest;
import com.example.Registration.dtos.response.UserResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.User;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserResponse register(UserRequest userRequest) {

//Todo
// extract registration details from the registration form(registerUserRequest)
        String name = userRequest.getName();
        String email = userRequest.getEmail();
        String password = userRequest.getPassword();
        int phoneNumber = userRequest.getPhoneNumber();

//        Todo
//         create a user profile with the registration details
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        userRequest.setPhoneNumber(phoneNumber);

//       Todo
//        save that users profile in the Database
        User savedUser =userRepository.


       return null;
    }
}
