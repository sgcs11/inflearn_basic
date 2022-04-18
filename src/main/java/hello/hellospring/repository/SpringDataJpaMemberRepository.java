package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL select m from Member m where m.name = ? 와 동일
    // 인터페이스 메소드명만으로 쿼리가 만들어짐
    @Override
    Optional<Member> findByName(String name);
}
