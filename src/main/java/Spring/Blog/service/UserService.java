package Spring.Blog.service;

import Spring.Blog.model.User;
import Spring.Blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void join(User user){

//        //save에서 오류가 나면 문제가 됨
//        try {
//            userRepository.save(user);
//            return 1;
//        } catch (Exception e){
//            e.printStackTrace();
//            System.out.println("UserService : 회원가입()" + e.getMessage());
//        }
//        return -1;

        userRepository.save(user);
    }
}
