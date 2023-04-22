package Spring.Blog.repository;

import Spring.Blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//DAO와 같은 역할
//자동으로 bean으로 등록이 됨 즉, @Repository가 생략 가능함
public interface UserRepository extends JpaRepository<User, Integer> {

}
