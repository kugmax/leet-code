package main.java.com.kugmax.learn.letcode.nested;

public class ObjWithStatic {
    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static class InnerSatic {
        private String secondName;

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void inaction() {
            secondName = "fdg";
        }
    }

    public void action() {

    }
}
