package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개 생성한다.
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 사용할 수 있게 한다.
    public static SingletonService getInstance() {
        return instance;
    }
    private SingletonService(){

    }
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
