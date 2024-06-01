package springboot.demo;

import springboot.demo.repository.MemoryMemberRepository;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

//    @AfterEach
//    void clear(){
//        repository.clearStore();
//    }
//    @Test
//    void save() {
//        Member member = new Member();
//        member.setName("홍길동");
//
//        repository.save(member);
//
//
//        Member result = repository.findById(member.getId()).get();
//
//        assertEquals(member, result);
//    }
//
//    @Test
//    void findById() {
//        Member member1 = new Member();
//        member1.setName("홍길동");
//
//        Member member2 = new Member();
//        member2.setName("김철수");
//
//        repository.save(member1);
//        repository.save(member2);
//
//        Member result = repository.findById(member2.getId()).get();
//
//        assertEquals(member2, result);
//    }
//
//    @Test
//    void findByName() {
//        Member member1 = new Member();
//        member1.setName("홍길동");
//
//        Member member2 = new Member();
//        member2.setName("김철수");
//
//        repository.save(member1);
//        repository.save(member2);
//
//        Member result = repository.findByName(member2.getName()).get();
//
//        assertEquals(member2, result);
//    }
//
//    @Test
//    void findAll() {
//        Member member1 = new Member();
//        member1.setName("홍길동");
//
//        Member member2 = new Member();
//        member2.setName("김철수");
//
//        repository.save(member1);
//        repository.save(member2);
//
//        List<Member> result = repository.findAll();
//
//        assertEquals(2, result.size());
//    }
}