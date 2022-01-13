package online.classes.yoga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import online.classes.yoga.entity.YogaUser;

@Repository
public interface YogaUserRepo extends JpaRepository<YogaUser, Long>{

}
