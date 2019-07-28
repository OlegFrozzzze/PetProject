package Repository;

import domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findAllByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM Users WHERE email LIKE '%@gmail.com%'")
    List<Users> findWhereEmailIsGmail();

    @Query(value = "SELECT * FROM Users WHERE name LIKE '%Smith%'", nativeQuery = true)
    List<Users> findWehereNameStartsFromSmith();

}
