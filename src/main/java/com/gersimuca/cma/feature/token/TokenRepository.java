package com.gersimuca.cma.feature.token;

import com.gersimuca.cma.feature.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Integer> {
    @Query(value = """
      select t from TokenEntity t inner join UserEntity u\s
      on t.user.id = u.id\s
      where u.id = :id and (t.expired = false or t.revoked = false)\s
      """)
    List<TokenEntity> findAllValidTokenByUser(Long id);

    Optional<TokenEntity> findByToken(String token);

    void deleteTokensByUser(UserEntity user);
}
