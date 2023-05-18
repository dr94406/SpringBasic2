package hello.core.member;

public interface MemberRepository {

    void same(Member member);

    Member findById(Long memberId);
}
