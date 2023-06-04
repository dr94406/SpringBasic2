package hello.core.member;

public interface MemberRepository {

    void save(Member member);

    void same(Member member);

    Member findById(Long memberId);
}
