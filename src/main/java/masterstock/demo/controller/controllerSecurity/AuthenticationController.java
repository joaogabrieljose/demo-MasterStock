package masterstock.demo.controller.controllerSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import masterstock.demo.dto.dtoSecurity.Authentication;
import masterstock.demo.dto.dtoSecurity.RegisterDTO;
import masterstock.demo.entity.user.User;
import masterstock.demo.repository.UserRepository;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired 
    private UserRepository userRepository;



    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid Authentication dto){
        
        var usernamePassword = new UsernamePasswordAuthenticationToken(dto.login(), dto.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterDTO dto){

        if (this.userRepository.findByLogin(dto.login()) != null) return ResponseEntity.badRequest().build();
        
        String encryptedPassword = new BCryptPasswordEncoder().encode(dto.password());
        
        User novo = new User(dto.login(), encryptedPassword, dto.role());
        this.userRepository.save(novo);

        return ResponseEntity.ok().build();
    }
    
}
