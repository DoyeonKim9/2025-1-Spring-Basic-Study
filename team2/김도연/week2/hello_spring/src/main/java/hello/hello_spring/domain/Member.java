package hello.hello_spring.domain;

public class Member {

    private Long id; /// 아이디 식별자가 있어야함
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
