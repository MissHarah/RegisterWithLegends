package Service;

import com.example.Registration.dtos.request.UserRequest;
import com.example.Registration.dtos.response.UserResponse;

public interface UserService {
    UserResponse register (UserRequest userRequest);
}
