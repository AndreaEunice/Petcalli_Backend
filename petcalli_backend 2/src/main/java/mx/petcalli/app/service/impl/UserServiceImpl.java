UserServiceImpl.java
package mx.petcalli.app.service.Impl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.h2.mvstore.Page;
import org.springframework.stereotype.Service;

import mx.petcalli.app.model.User;
import mx.petcalli.app.repository.UserRepository;
import mx.petcalli.app.service.UserService;

@Service
public class UserServiceImpl implements UserService{
private final UserRepository userRepository;

public UserServiceImpl(UserRepository userRepository) {
this.userRepository = userRepository;
}
@Override
public User createUser(User user) {
Optional<User> optionalUser = userRepository.findByEmail(user.getEmail());
if( optionalUser.isPresent()) {
throw new IllegalStateException("User already exist with name" + user.getEmail())
}
// TODO Verificar si los atributos son válidos
user.setId(null);
user.setActive(true);
user.setCreateAt(LocalDateTime.now);
User newUser = userRepository.save(user);
return newUser;
}

@Override
public User getUserById(Long id) {
Optional<User> optionalCustomer = customerRepository.findById(id);
return existingUser;
}
@Override
public User getUserByEmail(String email) {
Optional<User>optionalUser = userRepository.findByEmail(Email);
if ( optionalUser.isEmpty()) {
throw new IllegalStateException("User does not exist with email" + email);
}
return optionalUser.get();
}
@Override
public Page<User> getAllUser(boolean isActive, int pageNumber, int pageSIze){
Page<User> user;
PageRequest pagueAndSize = PageRequest.of(pageNUmebr, pageSIze);
if (isActive) {
user = userRepository.findAllByActiveTrue(pageAndSize); 
}
else {
user = userRepository.findAllByActiveTrue(pageAndSize); 
}
return user;
}

@Override
public User updateUser(User user, Long id) {
User existingUser = getUserById(id);
existingUser.setName( User.getName() );
existingUser.setLastName( User.getLastName() );
existingUser.setEmail( User.getEmail() );
existingUser.setTelephone( User.getTelephone() );
existingUser.setPassword( User.getPassword() );
return userRepository.save(existingUser);
}
@Override
public void deleteUser(Long id) {
User existingUser = getUserById(id);
existingUser.setActive(false);
userRepository.save(existingUser);
}
}